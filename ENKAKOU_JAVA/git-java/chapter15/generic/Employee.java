package chapter15.generic;

public class Employee {
    private String name;
    private double sal;
    private chapter15.generic.MyDate birthday;

    public Employee(String name, double sal, chapter15.generic.MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public chapter15.generic.MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(chapter15.generic.MyDate birthday) {
        this.birthday = birthday;
    }

    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';

    }
}
