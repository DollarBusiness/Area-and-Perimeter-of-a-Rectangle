package areaperimeterrect;
import java.util.Scanner;

public class AreaPerimeterRect {

    public static void main(String[] args) {
        double area;
        double perimeter;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("*** AREA & PERIMETER FINDER ***\n");
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        
        //ALGORITHM
        area = width * height;
        perimeter = width * height;
        
        //PRINT OUT INFO. GATHERED
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
     
    }
    
}
