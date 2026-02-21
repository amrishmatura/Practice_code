package Basics;

import java.math.BigDecimal;
import java.math.BigInteger;

public class bigtypes {
    public static void main(String[] args) {
        // Biginteger uses DS behind the scene
        BigInteger b = new BigInteger("4588489448941");
        BigInteger b2 = new BigInteger("646465465189754");

        // direct airthemetic operttion cannot do because of object creation

        BigInteger b3 = b.add(b2);  // predefine method

        System.out.println(b3);

        BigDecimal b4 = new BigDecimal("48588578877.255");
        BigDecimal b5 = new BigDecimal("66555665656.255");
        BigDecimal b6 = b4.subtract(b5);
        System.out.println(b4);
        }
    
}
