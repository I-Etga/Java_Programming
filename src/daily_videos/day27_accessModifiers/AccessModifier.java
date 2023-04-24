package daily_videos.day27_accessModifiers;

public class AccessModifier {
    public static int publicData = 200;


    protected static int protectedData = 300;

    static int defaultData = 400; // default modifier comes default. So we don't write it. (does not any keyword)

    private static int privateData = 500;

    public AccessModifier() { // same principle -> public -> protected -> default(so specifier) -> private

    }

    public String toString(){
        return getClass().getSimpleName();
    }
    public static void publicMethod(){
        System.out.println("Public Method");
    }
    protected static void protectedMethod(){
        System.out.println("Protected Method");
    }

    static void defaultMethod(){
         System.out.println("default Method");
    }
    private static void privateMethod(){
        System.out.println("private Method ");
    }

    private static String privateSt(String str){
        return str;
    }
    public static void main(String[] args) {
        System.out.println(publicData); // public is accessible within same class.
        System.out.println(protectedData); // protected is accessible within same class.
        System.out.println(defaultData); // default is accessible within same class.
        System.out.println(privateData); // private is accessible withing same class.

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();

    }

}

