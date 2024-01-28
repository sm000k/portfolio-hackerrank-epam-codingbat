package com.epam.learn.main;

public class Primitives {
    public static void main(String[] arg) {
        byte h = 0x0_0_____1_0;
        byte a = 0b0001_1110;
//        short s = 46_;
//        int i = _78;
        int m = 0b1010;
        int n = 0x1010;
        System.out.println(m==n?1:0);
        System.out.println(m);
        System.out.println(n);
        long l = 99;
        int j = 1 << l;
        System.out.println(j);
        System.out.println(010 | 4);
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println(12345 + 5432l);
        char uniChar = '\u03A9';
        System.out.println(uniChar);

//        extracted();
        extracted1();
    }

//    private static void extracted() {
//        //        short s = 304111;               // line 2
//        int i = 3;
//        byte b = 1;
//        byte b1 = 1 + 2;                // line 1
//        short s = 304111;               // line 2
//        short s1 = (short) 304111;      // line 3
//        b = b1 + 1;                     // line 4
//        b = (byte)  (b1 + 1);           // line 5
//        b = -b;                         // line 6
//        b = (byte) -b;                  // line 7
//        b1 *= 2;                        // line 8
//        b = i;                          // line 9
//        b = (byte)  i;
//        b += i++;
//        float f = 1.1f;
//        b /= f;
////        float e = 1.45;
//
//    }

    private static void extracted1() {
        float f = 1 / 2;
        int i = 1 / 3;
        float g = 1.45f;
        double d = 555d;
        System.out.println(f);
        System.out.println(i);
        System.out.println(d);;
    }
    String s =null;

}
