class Exception
{
    public static void main(String args[])
    {
        int a=10,b=0;
        System.out.println("this is start");
        try
        {
            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("b is not zero"+e);
        }
        finally{
            b=1;
            System.out.println("if works always");
        }
        System.out.println("this is end");
    }
}
