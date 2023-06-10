package chapter19.inputstream_;

import chapter19.outputstream_.Dog;

import java.io.*;

public class ObjectInputStream_ {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //指定反序列化的文件
        String filePath = "e:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());

        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());

        //dog 的编译类型是 Object , dog 的运行类型是 Dog
        Object dog = ois.readObject();
        System.out.println("运行类型=" + dog.getClass());
        System.out.println("dog信息=" + dog);   //底层 Object -> Dog

        Dog dog2 = (Dog)dog;
        System.out.println(dog2.getName());    //旺财..

        //关闭流, 关闭外层流即可，底层会关闭 FileInputStream 流
        ois.close();

    }
}

