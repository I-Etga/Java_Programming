package daily_videos.day31_InheritanceContinue.tasks.browserTask;

public class TestBrowserObjects {

    public static void main(String[] args) {
        CromeBrowser crome = new CromeBrowser();
        crome.openBrowser();
        crome.closeBrowser();

        Firefox firefox = new Firefox();
        firefox.openBrowser();
        firefox.closeBrowser();

        Opera opera = new Opera();
        opera.openBrowser();
        opera.closeBrowser();

    }
}
