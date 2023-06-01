

class Test
{
     Test()
     {
         System.out.println("this is default constructor");
     }
     Test(int val)
     {
         System.out.println("this is parameterised constructor"+val);
     }
     void display()
     {
     	System.out.println("this is display of Test");
     }
}

class Child extends Test
{
     void display(int val)
     {
         System.out.println("this is display of Child class");
     }
}

class Polyphism
{
    public static void main(String arg[])
    {
         // overloading 
         Test t =new Test();
         Test t2 =new Test(1);
         // overidding 
         Child c= new Child();
         c.display(1);
         c.display();
    }
}
