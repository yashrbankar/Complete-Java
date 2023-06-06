@SuppressWarnings("unchecked")
class Data<t>
{
    //! able to store the objects 
    t A[]=(t[]) new Object[10];

    int length=0;
    void setData(t d)
    {
        A[length]=d;
        length++;
    }
    void display()
    {
        for(int i=0;i<length;i++)
        {
            t temp=A[i];
            System.out.println(temp);
        }
    }
}
public class Example2
{
    public static void main(String args[])
    {
        Data<String> obj=new Data<>();
        obj.setData("hello");
        obj.setData("hello");
        obj.setData("hello");
        obj.display();
    }
}
