package com.hspedu.try_;

import com.hspedu.homework.Person009;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TryCatchDetail02 {

    public static void main(String[] args) {
        try {
            Person010 person = new Person010();
            //person009 = null;
            System.out.println(person010.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("空指针异常=" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算术异常=" + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }


    }
}

class Person010 {
    private String name = "jack";

    public String getName() {
        return name;
    }
}

