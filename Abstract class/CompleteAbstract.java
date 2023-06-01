

abstract class Vehicle
{
    String color;
    int speed;
    void functionality()
    {
       System.out.println("basic functionality of every");
       // window
       // wheels
       //...
    }
    
    abstract void displaySpeed();
}

class Audi extends Vehicle
{
     void displaySpeed(){};
}
class CompleteAbstract
{
    public static void main(String A[])
    {
        //Vehicle v=new Vehicle();
        //Audi a8 = new Audi();
        //v.functionality();
    }
}




