interface Test{
    int square(int x);
}
class Arithmetic implements Test{
    public int square(int x){
        return x*x;
    }
}
public class ToTestInt{
    public static void main(String[] args) {
        Arithmetic obj=new Arithmetic();
        System.out.println(obj.square(5));;
    }
}