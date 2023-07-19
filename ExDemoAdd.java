class ExDemoAdd
{
    public int add(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    void add1()
    {
        int  p = 13;
        int q = 14;
        System.out.println(p);
    
    }
    public static void main(String a [])
    {
        int num1 = 15;
        int num2 = 16;

        ExDemoAdd obj = new ExDemoAdd();
        int result = obj.add(num1, num2);
        System.out.println(result);
        ExDemoAdd obj2 = new ExDemoAdd();
        obj2.add1();
        
    }

}