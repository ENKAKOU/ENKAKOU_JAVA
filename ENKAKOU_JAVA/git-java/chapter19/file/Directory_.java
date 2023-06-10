package chapter19.file;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

public class Directory_ {

    public static void main(String[] args) {

    }

    public void m1() {

        String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该文件不存在...");
        }

    }

    public void m2() {

        String filePath = "D:\\demo02";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该目录不存在...");
        }

    }

    public void m3() {

        String directoryPath = "D:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + "存在..");
        } else {
            if (file.mkdirs()) {
                System.out.println(directoryPath + "创建成功..");
            } else {
                System.out.println(directoryPath + "创建失败...");
            }
        }

    }
}
