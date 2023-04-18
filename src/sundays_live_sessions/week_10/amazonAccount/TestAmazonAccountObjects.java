package sundays_live_sessions.week_10.amazonAccount;

public class TestAmazonAccountObjects {
    public static void main(String[] args) {

        AmazonAccount obj1 = new AmazonAccount("IbrahimA","ibrahimA@icloud.com",false);

        //obj1.email = "ibrA@gmail.com"; --> does not work. It's private and only way to access and write it getter and setter !![thanks to encapsulation]

        obj1.setEmail("ibrA@gmail.com"); // It works !!


    }
}
