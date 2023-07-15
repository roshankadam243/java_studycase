class ExConditionalStmnts
{
    public static void main(String args[])
    {
        int x = 89;
        int y = 8;
        
        if (x>10 && y<8)
        {
        System.out.println("Hello");
        }
        else
        {
            System.out.println("Hello Ark");
        }
        
        int a = 9;
        int b = 10;

        if (a<b)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(a);
        }

    //greatest of below 3
        int p = 9;
        int q = 77;
        int r = 666;

        if(p>q && p>r)
        {
            System.out.println(p);
        }
        else if (q>r)            //else if(q>p && q>r)
        {
            System.out.println(q);
        }
        else 
        {
            System.out.println(r);
        }
    }
}