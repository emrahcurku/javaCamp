package YouTubeVideos33_45.PolymorphismDemo;

public class DatabaseLogger extends BaseLogger {
    public  void log(String message)
    {
        System.out.println("Logged to database : "+message);
    }
}
