package chapter12.try_;

public class TryCatchExercise02 {

}

class Exception02 {
    public static int method() {
        int i = 1;

        try {
            i++;
            String[] names = new String[3];
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;    //i = 3
        } finally {
            return ++i;    //i = 4
        }
    }

    public static void main(String[] args) {
        System.out.println(method());

    }
}