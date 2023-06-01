import mypack1.demo;
import mypack1.demo2;
import mypack1.inner.demo3;

class TestPackage{
    public static void main(String agrs[])
    {
        demo d1=new demo();
        d1.display();
        demo2 d2=new demo2();
        d2.display();
        demo3 d3=new demo3();
        d3.display();
    }
}
