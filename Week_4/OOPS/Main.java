class Outer{
    void display(){
        System.out.println("This is the Outer class");
    }
    class Inner{
    void display(){
        System.out.println("This is the Inner class");
    }
}
}
public class Main {
    public static void main(String[] args) {
        Outer out=new Outer();
        out.display();

        Outer.Inner in=out.new Inner();
        in.display();
    }
}
