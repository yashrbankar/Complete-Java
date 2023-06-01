import java.util.*;
class Student{
    private int roll_no;
    Student()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the roll number");
       int number=sc.nextInt();
       this.roll_no=number;
    }
    public int getRollNo()
    {
         System.out.println("Roll-No:"+this.roll_no);
         return this.roll_no;
    }
    
    

};

public class classObj
{
    public static void main(String args[])
    {
    	// creating the object
    	Student st=new Student();
    	st.getRollNo();
    	// creating the reference
    	Student st2;
    	// error only reference not object
    	//st2.getRollNo();
    }
};
