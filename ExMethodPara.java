class ExMethodPara
{
    public void display()
    {
        String name = "Allen";
        System.out.println("Hello " + name +"!");
    }
    public void display1(int age)
        {
            System.out.println("He is around "+age+ " years of age.");
        }

    public static void main(String args[])
    {
        ExMethodPara obj = new ExMethodPara();
        obj.display();
        obj.display1(23);
    }
    
}