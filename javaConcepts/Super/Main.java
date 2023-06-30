class A{
    int a = 50;
}
class B extends A{
    int a = 20;
    public void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}

class Main{
    public static void main(String[] args) {
        B b = new B();
        b.show(10);
    }
}