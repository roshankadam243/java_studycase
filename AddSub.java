class AddSub
{
    public static void main(String a[])
    {
        int x = 3;
        int y = 5;
        int z = 10;
        int result = ++z+y-y+z+x++;
        System.out.println(result);
        System.out.println(++z);
        System.out.println(x++);
    }
}