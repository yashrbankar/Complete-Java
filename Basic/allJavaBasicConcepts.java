import java.util.*;

class allJavaBasicConcepts
{
    public static void main(String args[])
    {
        // input class Scanner object creating
        Scanner sc=new Scanner(System.in);
        
        String str1=new String("this is printing");
        String str2="hello";
        // f is reqired for litterals
        float a=2f;
        // printing;
        System.out.println(str1+str2+a);

        // it valid to take lower data types input using next in higher data types
         //taking input this is valid
        // a=sc.nextInt();
        
        /* error  trying to assign higher data type into small datatype
        int b=10l;
        */
        // typecasting
        char b=(int)98.9f;
        //98.9->98 lossy conversion
        System.out.println(b);
        
        // Valid conversion
       int p=10;
       long q=p;
       // we can convert integer datatype to long data type 
       // invalid conversion
       /*
         1. int c=b;
         2. bool to int or int to bool
       */
       
        // same for input
        // error
        // int x=sc.nextlong();
        // valid
        //long in=sc.nextInt(); 
        
        // type promotion (arthmetic operations)
        char x='a';
        char y='z';

        //! note that 
        //! during math opertion 
        //! char byte , float , short is promated into the int
        //! int <long < double is converted according to precident

        // the type is promated into the higher datatypes
        System.out.println(y-x);
        //! bool -> boolean
        boolean check =true;
        if(check) System.out.println("code tested");
        
        // array
        int arr[]={1,3,2,5,4};
        int arr2[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[3]=3;
        arr[4]=4;
        arr[2]=3;
        Arrays.sort(arr);
        
        System.out.println(isEqual(arr,arr2,5));
        
        // matrix declartion
        int mat[][]=new int[3][3];
        int n=mat.length;
        int m=mat[0].length;
        
        // !String :
        // Note that string in java are immutable 
        String palindrome="madam";
        int slength=palindrome.length();
        System.out.println(checkPanlindrome(palindrome));
        //s1.equals(s3) less strict
        
        // StringBuilder
        // because normal string in java are immutable
        StringBuilder sb=new StringBuilder("hello this is string builder");
        
        //invalid
        //StringBuilder sb2;
        StringBuilder sb2=new StringBuilder("");
        String str4="";
        for(int i=0;i<sb.length();i++)
        {
            System.out.print(sb.charAt(i));
            // invalid
            //sb2+=sb.charAt(i);
            
            
            sb2.append(sb.charAt(i));
            
        }
        
        // conversion to normal string 
        String str3=sb.toString();
        System.out.print(str3);
        
    }
    static boolean isEqual(int arr[],int arr2[],int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean checkPanlindrome(String str)
    {
       int i=0,j=str.length()-1;
       while(i!=j)
       {
           
           if(str.charAt(i)!=str.charAt(j))
           {
               return false;
           }
           i++;
           j--;
       }
       return true;
   }
    
};


