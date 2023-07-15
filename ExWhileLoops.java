import java.util.Scanner;

class ExWhileLoops
{
    public static void main(String args[])
    {
        /*int i = 1;
        int n =5;
        
        while(i<=n)
        {
            System.out.println(i);
            i++;
            
        }*/

        int sum = 0;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        while(number>=0)
        {
            sum +=number;
            System.out.println("Enter a number:");
            number = input.nextInt();
        }

        System.out.println("Sum of the entered numbers are:" + sum);
        input.close();
        
    }
}