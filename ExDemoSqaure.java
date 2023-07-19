class ExDemoSqaure
{
    public static int sqaure(int a)
    {
        return a*a;
    }

    public static void main(String args[])
    {
        /*int result;
        //ExDemoSqaure obj = new ExDemoSqaure(); //no need to create object as method is square mothod is static
        result = sqaure(3);
        //System.out.println(a);
        System.out.println("Sqaure:" + result);*/

        int result;

        for (int i=0;i<5;i++)
        {
            System.out.println("Sqaure of " + i + "=" + sqaure(i));
        }
    }
}