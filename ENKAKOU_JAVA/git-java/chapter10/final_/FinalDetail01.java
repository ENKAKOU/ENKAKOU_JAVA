package chapter10.final_;

public class FinalDetail01 {

    public static void main(String[] args) {
        CC cc = new CC();

        new EE().cal();
    }
}

class AA {

    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2 ;
    public final double TAX_RATE3 ;

    public AA() {
        TAX_RATE2 = 1.1;
    }

    {
        TAX_RATE3 = 8.8;
    }
}

class BB {

    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2 ;

    static {
        TAX_RATE2 = 3.3;
    }
}

final class CC { }


class DD {
    public final void cal() {
        System.out.println("cal()方法");
    }
}

class EE extends DD {

}
