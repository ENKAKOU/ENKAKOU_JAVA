package chapter23.reflection.class_;

import chapter23.Car;
import java.lang.reflect.Field;

public class Class02 {

    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException, NoSuchFieldException {

        String classAllPath = "chapter23.Car";
        Class<?> cls = Class.forName(classAllPath);       //<?> 表示不确定的Java类型

        System.out.println(cls); //输出cls,显示cls对象, 是哪个类的Class对象 com.hspedu.Car
        System.out.println(cls.getClass());//输出cls运行类型 java.lang.Class

        System.out.println(cls.getPackage().getName());//包名
        System.out.println(cls.getName());    //得到全类名

        Car car = (Car) cls.newInstance();
        System.out.println(car);//car.toString()

        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));

        brand.set(car, "奔驰");
        System.out.println(brand.get(car));

        System.out.println("=======所有的字段属性====");
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

    }
}
