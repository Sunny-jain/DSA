class Test{
    Object show(){
        Test obj = new Test();
        System.out.println("output from test");
        return obj;
    }
}
class Test2 extends Test{
    String show(){
        System.out.println("output from test2");
        return "dafsdf";
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println("sdfsdf");
        Test2 t2 = new Test2();
        System.out.println(t2.show());
    }
}
