package Basics;

public class wrappertypes {
    public static void main(String[] args) {
        int x = 10;    // hold pure value
        Integer y =20;   //create object with add and y point to it
        Integer z = 20;   //size should under 1 byte
        Integer w=250;   //boxing
        System.out.println(x==y);
        System.out.println(z==y);
        System.out.println(z==w);

        w++;

        System.out.println(w);      //auto boxing object to number and vice versa

        System.out.println(w.toString());
        System.out.println(w.floatValue());
        System.out.println(w.byteValue());
        System.out.println(w.longValue());
    }
}
