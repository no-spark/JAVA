public class People{
    double height;
    int age;
    int sex;

    void cry(){
        System.out.println("哭起来");
    }
    void laugh(){
        System.out.println("笑起来");
    }
    void printBaseMes(){
        System.out.println("身高:"+height);
        System.out.println("年龄:"+age);
        if(this.sex==0){
            System.out.println("男");
        }else{
            System.out.println("女");
        }
    }

    // public static void main(String[]args){
    //     People lili=new People();

    //     lili.height=170;
    //     lili.age=20;
    //     lili.sex=1;

    //     lili.printBaseMes();
    // }
}