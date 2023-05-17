public class PropertiesDetail{

    public static void main(String[] args){

        Person p1 = new Person();

        System.out.println("\n 当前这个人的信息");
        System.out.println("age=" + p1.age + " name=" + p1.name + " sal=" +
                p1.sal + " isPass=" + p1.isPass) ;

    }
}

class Person {
    int age;
    String name;
    double sal;
    boolean isPass;

}

