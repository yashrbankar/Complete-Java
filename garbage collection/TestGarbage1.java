public class TestGarbage1{
    int count=0;
    public void finalize()
    {
        System.out.println("this is garbage collection");
    }
   
    public static void main(String args[]){
     TestGarbage1 s1=new TestGarbage1();
     TestGarbage1 s2=new TestGarbage1();
     TestGarbage1 s3=new TestGarbage1();
     TestGarbage1 s4=new TestGarbage1();
     new TestGarbage1();
     new TestGarbage1();
     s1=null;
     s2=null;
     s3=s4;
     System.gc();
    }
   }
   