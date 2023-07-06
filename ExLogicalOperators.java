class ExLogicalOperators
{
    public static void main(String args[])
    {
        int x = 7;
        int y = 5;

        int a = 5;
        int b = 9;

        int p = 3;
        int q = 4;

        boolean result1 = x > y ;
        System.out.println(result1);

        boolean result2 = x > y && a > b ;
        System.out.println(result2);

        boolean result3 = x > y && a < b;
        System.out.println(result3);

        boolean result4 = x > y || a > b;
        System.out.println(result4);

        boolean result5 = x > y || a > b || a < b;
        System.out.println(result5);

        boolean result6 = x < y || a > b || p > q;
        System.out.println(result6);

        boolean result7 = a > b;
        System.out.println(!result7);

        boolean result8 = a != b;
        System.out.println(result8);

    }
}