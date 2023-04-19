package daily_videos.day31_moreInheritance;


class A{

    public  int a = 100;

}
public class FieldHiding extends  A{

    public int a = 300; // value of variables can not be duplicated. So value of a(100) won't get inherited !

}
