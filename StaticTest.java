public class StaticTest{
    public static String string="li";
    public static void main(String[]args){
        System.out.println(StaticTest.string);
        StaticTest staticTest=new StaticTest();
        System.out.println(staticTest.string);
    }
}