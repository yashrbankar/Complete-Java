package Generics;
class Data<t>
{
    private t data;
    Data(t data)
    {
        this.data=data;
    } 
    t getData()
    {
        return data;
    }
}
public class Example1 
{
    public static void main(String args[])
    {
        Data<Integer> val=new Data<>(10);
        Integer number=val.getData();
        System.out.println(number);

    }
}
