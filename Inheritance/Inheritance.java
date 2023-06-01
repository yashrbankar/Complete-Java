

class Vehicle
{
   Vehicle()
   {
       System.out.println("I am Vehicle class Constructor");
   }
   Vehicle(int val)
   {
       System.out.println("I am Vehicle class Constructor"+val);
   }
   void show()
    {
         System.out.println("this is show function of Vehicle");
    }
}


class Car extends Vehicle 
{
    Car(int val)
    {
        super(val);
        System.out.println("I am Car class Constructor");
    }
    
    void show()
    {
         System.out.println("this is show function of Car");
    }  
    void test()
    {
         System.out.println("this is show function of car");
    }
}



public class Inheritance
{
    public static void main(String args[])
    {
        //Car c= new Car(5);
        // dynamic method dispatch
        Vehicle v=new Car(10);
        v.show();
        // v.test();
    }
    
}
