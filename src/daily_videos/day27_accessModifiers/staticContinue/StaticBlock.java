package daily_videos.day27_accessModifiers.staticContinue;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) { // first static block , then main block get executed !!
        System.out.println("Main Method");

        new   StaticBlock();
        new   StaticBlock();
        new   StaticBlock();
    }


    static {
        System.out.println("Static Block");
    }
}

