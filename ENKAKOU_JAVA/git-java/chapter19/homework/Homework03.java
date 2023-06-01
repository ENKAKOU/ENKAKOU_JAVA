package chapter19.homework;

import java.io.*;
import java.util.Properties;

public class Homework03 {

    public static void main(String[] args) throws IOException {
        String filePath = "src:\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        String name = properties.get("name") +"";
        int age = Integer.parseInt(properties.get("age") + "");
        String color = properties.get("color") + "";

        Dog dog = new Dog(name, age, color);
        System.out.println("===dog对象信息===");
        System.out.println(dog);

        //将创建的Dog 对象 ，序列化到 文件 dog.dat 文件
        String serFilePath = "e:\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);

        //关闭流
        oos.close();
        System.out.println("dog对象，序列化完成...");
    }

    public void m1() throws IOException, ClassNotFoundException {
        String serFilePath = "e:\\dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog = (Dog)ois.readObject();

        System.out.println("===反序列化后 dog====");
        System.out.println(dog);

        ois.close();

    }
}


class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}