package com.zf.java.codefights;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * misc.Solution for CodeFights weekly challenges
 * https://codefights.com/challenge/mMdsrajm7T9H87Noc/main
 * 你是参加一个机器人的机器人锦标赛试图找到迷宫的出路。
 * 通常发现最快的(即最短)的机器人路径在最短的时间内获胜,
 * 但今年的规则是不同的。这次表演的大小来判断所谓的“控制序列”,
 * 即L的序列,R, U, D命令(分别为左、右、上下方向),
 * 机器人将逃离迷宫。注意,机器人执行控制序列的周期性,
 * 即一旦机器人执行最后一个命令,它会回到第一个,
 * 如果它到达了一个“墙”(占据细胞或边境)
 * 在这个过程中,它完全停止。你不准备这样一个改变的规则所以你决定快速想出一个计划来测试你目前的算法。
 * 给定一个迷宫(与一些自由和不可逾越的一个矩形细胞),
 * 以及最初的细胞开始的坐标和目标细胞dest,找到最短的长度控制序列”后,机器人从一开始就将达到目标细胞。
 *
 * TODO: check the list below
 * - Improve command solution by using adjacency matrices / list (avoid brute-force)
 * - Improve quick tests
 * - Clean up code
 * @author Nhan Nguyen.
 */
public class LabyrinthNavigation {

    public int labyrinthNavigation(String[] labyrinth, int[] start, int[] dest) {
        return new BFScout(labyrinth, start, dest).minimalSequence();
    }

    private static class BFScout {
        private static final int[] zero = {0, 0};
        private final int rowNum;
        private final int colNum;
        private final int rowDelta;
        private final int colDelta;
        private String[] matrix;
        private int[] start;
        private int[] dest;
        private Queue<String> bfsQueue = new LinkedList<>();

        private BFScout(String[] labyrinth, int[] start, int[] dest) {
            this.start = start;
            this.dest = dest;
            this.matrix = labyrinth;
            this.rowNum = matrix.length;
            this.colNum = matrix[0].length();
            this.rowDelta = dest[0] - start[0];
            this.colDelta = dest[1] - start[1];
        }


        private int minimalSequence() {
            bfsQueue.add("U");
            bfsQueue.add("L");
            bfsQueue.add("D");
            bfsQueue.add("R");
            while (!bfsQueue.isEmpty()) {
                String seq = bfsQueue.remove();
                if (testSeq(seq)) {
                    System.out.println(seq);
                    return seq.length();
                }
            }
            //timeout
            return -1;
        }

        private boolean testSeq(String seq) {
            Result rs = quickEval(seq);
            if (rs.isBlock()) {
                return false;
            }
            if (rs.isInvalid()) {
                generateSeq(seq);
                return false;
            }
            // run the cycle command once to check if it hit

            int[] pos = Arrays.copyOf(start, start.length);

            // run until hitting the boundaries or blocked cell
            int idx = 0;
            while ((0 <= pos[0] && pos[0] < rowNum) && (0 <= pos[1] && pos[1] < colNum)) {

                if (isBlocked(pos)) {
                    generateSeq(seq);
                    return false;
                }

                if (Arrays.equals(pos, dest)) {
                    return true;
                }

                move(String.valueOf(seq.charAt(idx)), pos);

                idx = (++idx == seq.length()) ? 0 : idx;
            }

            generateSeq(seq);
            return false;
        }

        private int[] move(String seq, int[] pos) {
            for (char i : seq.toCharArray()) {
                switch (i) {
                    case 'U':
                        pos[0]--;
                        break;
                    case 'D':
                        pos[0]++;
                        break;
                    case 'L':
                        pos[1]--;
                        break;
                    case 'R':
                        pos[1]++;
                        break;
                }
            }
            return pos;
        }

        private Result quickEval(String seq) {
            int[] pos = Arrays.copyOf(start, start.length);
            int[] cycle = cycleEval(seq);

            if (Math.abs(cycle[0]) >= matrix.length || Math.abs(cycle[1]) >= matrix[0].length()) {
                return Result.BLOCKED;
            }

            for (char c : seq.toCharArray()) {

                move(String.valueOf(c), pos);

                if (!((0 <= pos[0] && pos[0] < rowNum) && (0 <= pos[1] && pos[1] < colNum))) {
                    return Result.BLOCKED;
                }

                if (isBlocked(pos)) {
                    return Result.BLOCKED;
                }

                if (Arrays.equals(pos, dest)) {
                    return Result.OK;
                }
            }


            return !Arrays.equals(cycle, zero)
                    && !((rowDelta * cycle[0] <= 0) && (colDelta * cycle[1] <= 0)) ? Result.OK : Result.INVALID;
        }

        private boolean isBlocked(int[] location) {
            return matrix[location[0]].charAt(location[1]) == '*';
        }

        private int[] cycleEval(String seq) {
            int[] rs = {0, 0};
            return move(seq, rs);
        }

        private void generateSeq(String seq) {
            bfsQueue.add(seq.concat("U"));
            bfsQueue.add(seq.concat("L"));
            bfsQueue.add(seq.concat("R"));
            bfsQueue.add(seq.concat("D"));
        }

        private enum Result {
            OK,
            INVALID,
            BLOCKED;

            boolean isBlock() {
                return this == BLOCKED;
            }

            boolean isInvalid() {
                return this == INVALID;
            }
        }
    }
}
