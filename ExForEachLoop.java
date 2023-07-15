class ExForEachLoop
{
    public static void main(String args[])
    {
        /*int[] numbers = {2,3,9,4,-2};

        for(int number:numbers)
        {
            System.out.println(number);
        }*/

        int [] numbers = {3,4,3,2,-2,5};
        int sum = 0;

        for(int number:numbers)
        {
            if (number>=0)
                sum += number;
        }
        System.out.print(sum);
    }
}