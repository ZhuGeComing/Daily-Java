package com.zf.s10;
import java.io.File;
import java.io.IOException;
/**
 * @author Henry
 * @date 2019/12/12
 */
public class TextCreateFileDir {
    public static boolean createFile(String filePath){
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("目标文件已存在"+filePath);
            return false;
        }
        if(filePath.endsWith(File.separator)){
            System.out.println("目标文件不能是目录"+filePath);
            return false;
        }
        if(!file.getParentFile().exists()){
            System.out.println("目标所在目录不存在，请创建");
            if(!file.getParentFile().mkdirs()){
                System.out.println("创建目标文件所在目录失败！");
                return false;
            }
        }

        try {
            if(file.createNewFile()){
                System.out.println("创建成功");
                return true;
            } else {
                System.out.println("关联文件失败");
                return false;
            }
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("创建文件失败"+e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        boolean t = createFile("./123.txt");
    }
}
