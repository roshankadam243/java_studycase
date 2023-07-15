import java.util.Scanner;

class ExDoWhile
{
    public static void main(String args[])
    {
       /* int i = 0;
        int n = 5;

        do
        {
            System.out.println(i);
            i++;
        }
        while(i<=n);*/

        int sum = 0;
        int number = 0;
        
        Scanner input = new Scanner(System.in);
        

        do
        {
            sum += number;
            System.out.println("Enter a number:");
            number = input.nextInt();
        }
        while(number>=0);
        System.out.print("Sum of the numbers:" + sum);
        input.close();



    }
}
