
class Phone
{
   void calling()
   {
        System.out.println("calling feature");
   }
   void messaging()
   {
       System.out.println("messageing feature"); 
   }
}

interface MusicPlayer
{
    public void playMusic();
}

interface Camera
{
   void clickPic();
   void recordVideos();
}


// multiple inheritance using the interfaces in java
// it is combintion of Camera , music , phone


/*note that:
When implementing interface methods, you need to use the same or a broader access modifier. In this case, the interface methods have public access, so the implementing methods in the SmartPhone class should also be public. 
*/


class SmartPhone extends Phone implements MusicPlayer, Camera
{
    public void playMusic()
    {
        System.out.println("smartphone having feature of music player");
    }
    public void clickPic()
    {
        System.out.println("smartphone can click the pic");
    }
    
    public void recordVideos()
    {
        System.out.println("smartphone can record the videos");
    }
}





class Interfaces
{
  public static void main(String Args[])
  {
       SmartPhone poco = new SmartPhone();
       poco.calling();
       poco.playMusic();
       poco.recordVideos();
  }
}
