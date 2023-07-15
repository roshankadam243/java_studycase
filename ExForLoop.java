import java.util.*;

class ExForLoop
{
    public static void main(String args[])
    {
        /*int i;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();

        
        for(i=0;i<=n;i++) //for(i=0;i<=n;++i)
        {
            System.out.println(i);
        }*/

        int n = 0;
        int sum = 1000;

        for(int i=0;i<=sum;i++)
        {
            n += i;
        }
        
        System.out.println(n);
    }
}
