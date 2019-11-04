/**
 * @author Henry
 * @date 2019/9/15
 */
import java.util.Scanner;
public class Three {
    static int max(int[] a, int i, int j) {
        int sum = 0;
        while (i <= j) {
            sum += a[i];
            i++;
        }
        return act(a, sum, 0, a.length - 1);
    }

    private static int act(int[] a, int sum, int l, int r) {
        int lmax, rmax;
        if (r - l > 1) {
            // 意思是先选一个，然后求剩下数组对方先选获得的最大值，用sum减去对方获得的最大值，即是自己的最大值
            // 然后比较选头还是尾更好
            lmax = sum - act(a, sum - a[l], l + 1, r);
            rmax = sum - act(a, sum - a[r], l, r - 1);
            return lmax > rmax ? lmax : rmax;
        } else {//剩下2个
            return a[l] > a[r] ? a[l] : a[r];
        }

    }

    public static void main(String[] args) {
//        int v[] = { -1,0,100, 2 };
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sn = Integer.parseInt(s);

        String inputString = sc.nextLine();
        String stringArray[] = inputString.split(" ");
        int v[] = new int[sn];
        for (int i = 0; i < sn; i++) {
            v[i] = Integer.parseInt(stringArray[i]);
        }
        int n = max(v, 0, v.length - 1);
        System.out.println(n);
    }
}
