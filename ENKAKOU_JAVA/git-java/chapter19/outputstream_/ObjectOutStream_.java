package chapter19.outputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutStream_ {

    public static void main(String[] args) throws Exception {

        String filePath = "e:\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));


        oos.writeInt(100);   // int -> Integer (实现了 Serializable)
        oos.writeBoolean(true);   // boolean -> Boolean (实现了 Serializable)
        oos.writeChar('a');   // char -> Character (实现了 Serializable)
        oos.writeDouble(9.5);   // double -> Double (实现了 Serializable)
        oos.writeUTF("韩顺平教育");   //String
        //保存一个dog对象
        oos.writeObject(new Dog("旺财", 10, "日本", "白色"));
        oos.close();
        System.out.println("数据保存完毕(序列化形式)");


    }
}

