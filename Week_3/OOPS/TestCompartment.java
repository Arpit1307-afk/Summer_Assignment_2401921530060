import java.util.*;
abstract class Comparment{
    public abstract String notice();
}

class FirstClass extends Comparment{
    @Override
    public String notice(){
        return "First Class : Enjoy premium travel facilities";
    }
}
class Ladies extends Comparment{
    @Override
    public String notice(){
        return "Ladies Compartment : Reserved for female passengers";
    }
}
class General extends Comparment{
    @Override
    public String notice(){
        return "General Compartment : open for all passengers";
    }
}
class Luggage extends Comparment{
    @Override
    public String notice(){
        return "Luggage Compartment : For goods and luggage";
    }
}

public class TestCompartment{
    public static void main(String[] args) {
        Comparment[] arr=new Comparment[10];
        Random random=new Random();
        for(int i=0;i<10;i++){
            int choice=random.nextInt(4)+1;
            switch (choice) {
                case 1:
                    arr[i]=new FirstClass();
                    break;
                case 2:
                    arr[i]=new Ladies();
                    break;
                case 3:
                    arr[i]=new General();
                    break;
                case 4:
                    arr[i]=new Luggage();
                    break;
            }
            System.out.println("Comparment"+(i+1)+":"+arr[i].notice());
        }
    }
}