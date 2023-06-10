package chapter10.innerclass;

public class InnerClassExercise02 {

    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();

//    Bell bell = new Bell() {
//    public void ring() {
//         System.out.println("懒猪起床了");
//
//    }
//}
        cellPhone.alarmClock(new Bell() {

    public void ring() {
        System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {

    public void ring() {
        System.out.println("小伙伴上课了");
            }
        });
    }
}

interface Bell{
    void ring();
}

class CellPhone{
    public void alarmClock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();


    }
}
