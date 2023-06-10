package chapter07;//import javax.xml.ws.soap.MTOM;

public class OperatorDemo {

    public static void main(String[] args){
       
        int i = 10;
        char c = 'A'; 
        c = 'a'; 
        c = '0'; 
        System.out.println(i + c);
	    
        int j = i + c;
        System.out.println(j);

       // int k = 10 + 10.14; 
        double d = 10 + 10.14;

        System.out.println("it" + "java");
        System.out.println("it"+666); 
        System.out.println(666 + "it");
        System.out.println("it" + 666 + "java");
        System.out.println(1+ 99 + "java"); 

    }
}
