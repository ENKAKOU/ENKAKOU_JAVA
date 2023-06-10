package java;

public class Puppy {

        int PuppyAge;
        public Puppy(String name){
            System.out.println("С��������" + name);
    }
    public void setAge( int age){
            PuppyAge = age;

    }
    public  int getAge(){
            System.out.println("С��������" + PuppyAge);
            return PuppyAge;
    }
    public static void main(String[] args){
            Puppy myPuppy = new Puppy("tommy");
            myPuppy.setAge(2);
            myPuppy.getAge();
            System.out.println("����ֵ" + myPuppy.PuppyAge);

    }
}

