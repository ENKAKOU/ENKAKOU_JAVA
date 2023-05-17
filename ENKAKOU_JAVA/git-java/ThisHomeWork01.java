public class ThisHomeWork01 {
    public static void main(String[] args) {
        A01 a01= new A01();
        double[] arr = {1.0, 4.7, 1.8};
        Double res = a01.max(arr);
        if (Double.valueOf(res).equals(Double.NaN)) {
            System.out.println("arr的输入有误");
        } else {
            System.out.println("arr的最大值=" + res);
        }
    }
}

class A01 {
    public Double max(double[] arr) {
        if (arr.length > 0) {
            //保证arr至少有一个元素
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;   // double 
        } else {
            return Double.NaN;
        }
    }
}
