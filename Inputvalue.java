import java.util.Scanner;

public class Inputvalue {
   
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);


        System.out.println("what is your name");
        String name=obj.nextLine();
    

        System.out.println("how old are you");
        int age =obj.nextInt();
       

 
        System.out.println("hello "+name);
        System.out.println("Your are "+age+" years old");





    }
    
}
