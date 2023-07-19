/*class Lamp
{
    boolean isOn;
    
    void turnOn()
    {
    isOn = true;
    System.out.println("Light is On?" +isOn);
    }
}
class ExClassLamp
{
    public static void main(String args[])
    {
        Lamp ledlight = new Lamp();
        ledlight.turnOn();
    }
}*/

class Student{  
 int id;  
 String name;  
}  
//Creating another class TestStudent1 which contains the main method  
class ExClassLamp{  
 public static void main(String args[]){  
  Student s1=new Student();  
  System.out.println(s1.id);  
  System.out.println(s1.name);  
 }  
}  