class ExArray
{
    public static void main(String args[])
    {
        /*int a [] = {2,3,2,1,3};

        System.out.println("++++++++++++++++++Accessing array elements through indexing++++++++++++++++++");
        System.out.println("First element:"+ a[0]);
        System.out.println("Second element:"+ a[1]);
        System.out.println("Third element:"+ a[2]);
        System.out.println("Fouth element:"+ a[3]);
        System.out.println("Fifth element:"+ a[4]);

        System.out.println("++++++++++++++++++Accessing array elements through for loop++++++++++++++++++");
        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("++++++++++++++++++Accessing array elements through for each++++++++++++++++++");
        for (int b : a) 
        {
            System.out.println(b);
        }*/

        double arr[] = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        double sum = 0;

        for (int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum:" + sum);
        double result = sum/arr.length;
        System.out.println("Average:" +result);

    }
}
