package daily_videos.day28_encapsulation.tasks.credentials;

public class TestCredentialsObjects {
    public static void main(String[] args) {
        Credentials credentials1 = new Credentials("Cydeo School", "Abc123&_");

        System.out.println(credentials1); // Strong password. It's set ! Password should have at least one letter,one digits,one special character and no space!

        credentials1.setPassword("Abc&123_");

        System.out.println(credentials1);


        Credentials credentials2 = new Credentials("Cydeo College","BceA&+= ");

        System.out.println(credentials2); // Weak Password. Password should have at least one letter,one digits,one special character and no space!

    }


}

