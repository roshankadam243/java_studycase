/*Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte*/

class Typeconcast
{
    public static void main(String args[])
    {
        byte b = 127;
        //int a = b; //this will also work
        int a = 256;
        //b = a; will not work as byte has now big range to store int value which is 256
        a = b; //conversion (implicit conversion)
        System.out.println(a);
        System.out.println(b);

        byte c = 127;
        int d = 12;
        c = (byte) d ; // casting (explicitly)
        //c = d; error
        System.out.println(c);
        System.out.println(d);

        float f = 5.6f;
        int x = (int) f;
        System.out.println(x);

        byte k = 10;
        byte m = 30;
        //byte result = k * m; //error
        int result = k * m;//can be called as type promotion
        System.out.println(result);

        //modular operator
        byte p = 127;
        int q = 257;
        p = (byte) q;
        System.out.println(p);

    }
}