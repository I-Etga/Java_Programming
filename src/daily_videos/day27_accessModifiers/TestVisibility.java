package daily_videos.day27_accessModifiers;

public class TestVisibility {

    public static void main(String[] args) {
        System.out.println(AccessModifier.publicData); // It's public.It's always accessible in the same package. So I can access through class name.
        System.out.println(AccessModifier.protectedData); // protected is  accessible in the same package
        System.out.println(AccessModifier.defaultData); // default is accessible in the same package.
        //System.out.println(AccessModifier.privateData); // private is only accesible in the same class !! NOT EVEN IN SAME PACKAGE

        new AccessModifier();

        AccessModifier.publicMethod();
        AccessModifier.protectedMethod();
        AccessModifier.defaultMethod();
        //AccessModifier.privateMethod(); // only private is NOT accessible in the same package.

    }
}
