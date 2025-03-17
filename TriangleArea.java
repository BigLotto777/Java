import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {

      // create scanner object for user inputs
      Scanner input = new Scanner(System.in);

      // ask user for base and height of triangle
      System.out.println("Enter the base of the triangle: ");
      double base = input.nextDouble();

      System.out.println("Enter the height of the triangle: ");
      double height = input.nextDouble();

      // calculate area of triangle
      double area = 0.5 * base * height;

      // print the area of the triangle
      System.out.println("The area of the triangle is: " + area);
   }
}