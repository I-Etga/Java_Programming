package daily_videos.day31_InheritanceContinue.tasks.browserTask;

public class CromeBrowser extends Browser {

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }
}
