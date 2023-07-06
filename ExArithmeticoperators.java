class ExArithmeticoperators
{
    public static void main(String args[])
    {
        int num1 = 77;
        int num2 = 4;
        int addi= num1 + num2;
        int subs = num1 - num2;
        int multi = num1 * num2;
        int divi = num1 / num2;
        int mod = num1 % num2;

        System.out.println(addi);
        System.out.println(subs);
        System.out.println(multi);
        System.out.println(divi);
        System.out.println(mod);

//same can use for sub n multi
        int a = 8;
        int b = 8;
        int c = 8;
        int d = 8;
        a = a + 2;
        b +=2;
        c++;//incrementing(post increment)
        ++d;//incrementing(pre)
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
//increment examples post n pre

    int pq = 7;
    int rs = 7;

    int result1 = pq++;
    int result2 = ++rs;

    System.out.println(result1);
    System.out.println(result2);


    
    
    }
}