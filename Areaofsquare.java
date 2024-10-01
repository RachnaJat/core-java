import java.util.Scanner;

public class Areaofsquare 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
            System.out.println("Enter side to find area of square");
             int side= obj.nextInt();
            int res=side*side;
      System.out.println("Area of Square = "+res);
        

    }
    
}
