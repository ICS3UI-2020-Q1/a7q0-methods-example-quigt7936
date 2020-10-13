import java.util.Scanner;
/**
 * An example of methods
 * @author Thomas Quigley
 */
public class Main {
  // takes the width and length to calculate the area of a rectangle
  public static double areaRectangle(double width, double length) {
    double area = width * length;
    return area;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ask what measurements they want
    System.out.println("What length do you want?");
    double width = input.nextDouble();
    System.out.println("What width do you want?");
    double length = input.nextDouble();

    // get the answer
    double answer = areaRectangle(width, length);
    System.out.println("The area of your rectangle is " + answer);
    
    
  }
}
