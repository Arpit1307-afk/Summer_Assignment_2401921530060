interface LibraryUser{
    void registerAccount();
    void requestBook();
}
class KidUser implements LibraryUser{
    int age;
    String BookType;
    public void registerAccount(){
        if(age<12) System.out.println("You have succesfully registered under a Kids account");
        else System.out.println("Sorry, age must be less than 12 to register as a kid");
    }
    public void requestBook(){
        if(BookType.equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
class AdultUser implements LibraryUser{
    int age;
    String BookType;
    public void registerAccount(){
        if(age>=12) System.out.println("You have succesfully registered under an Adult account");
        else System.out.println("Sorry, age must be greater than 12 to register as an adult");
    }
    public void requestBook(){
        if(BookType.equals("Fiction")) {
            System.out.println("Book issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult fiction books");
        }
    }
}
public class LibraryInterface{
    public static void main(String[] args) {
        KidUser kid=new KidUser();
        kid.age=10;
        kid.registerAccount();

        kid.age=18;
        kid.registerAccount();

        kid.BookType="Kids";
        kid.requestBook();

        kid.BookType="Fiction";
        kid.requestBook();

        System.out.println();

        AdultUser adult=new AdultUser();
        adult.age=5;
        adult.registerAccount();

        adult.age=23;
        adult.registerAccount();

        adult.BookType="Kids";
        adult.requestBook();

        adult.BookType="Fiction";
        adult.requestBook();
    }
}