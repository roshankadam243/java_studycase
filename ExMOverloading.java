/*class ExMOverloading
{
    public void display(int a)
    {
        System.out.println(a);
    }
    public void display(int a, int b)
    {
        System.out.println(a);
    }

    public static void main(String arg[])
    {
        ExMOverloading obj = new ExMOverloading();
        obj.display(23);
        obj.display(32,53);
    }
}*/
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

class ExMOverloading
{
    public static void display(int a)
    {
        System.out.println("Got the integer value");
    }
    public static void display(String a)
    {
        System.out.println("Got the string value");
    }

    public static void main(String args[])
    {
        ExMOverloading obj = new ExMOverloading();
        obj.display(32);
        obj.display("Hello");    
    }
}

/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */

/*class ExMOverloading
{
    public String formatnumber(int value)
    {
        return String.format("%d", value);
    }
    public String formatnumber(double value)
    {
        return String.format("%.3f",value);
    }
    public String formatnumber(String value)
    {
        return String.format("%.3f",Double.parseDouble(value));
       // return value;
       //return String.format(value);
    }

    public static void main(String arg[])
    {
        ExMOverloading obj = new ExMOverloading();
        System.out.println(obj.formatnumber(12));
        System.out.println(obj.formatnumber(49.2132));
        System.out.println(obj.formatnumber("Allen"));

    }
}*/