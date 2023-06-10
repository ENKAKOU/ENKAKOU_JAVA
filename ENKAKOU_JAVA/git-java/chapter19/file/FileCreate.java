package chapter19.file;

import java.io.*;

public class FileCreate {

    public static void main(String[] args) {

    }

    //方式1 new File(String pathname)
    public void create01() {
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //方式2 new File(File parent,String child) //根据父目录文件+子路径构建
    //e:\\news2.txt
    public  void create02() {
        File parentFile = new File("e:\\");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3 new File(String parent,String child) //根据父目录+子路径构建
    public void create03() {
        //String parentPath = "e:\\";
        String parentPath = "e:\\";
        String fileName = "news4.txt";
        File file = new File(parentPath, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
