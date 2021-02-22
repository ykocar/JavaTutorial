import java.util.Scanner; // Scanner is in the java.util package

public class AverageSpeed {
  public static void main(String[] args) {
	  double kilometers = 24.0;
	  double miles = kilometers / 1.6;

	  // Prompt the user to enter three numbers
    double formula = (100 * 60.0 + 35.0) / (60.0 * 60.0);
    double milesPerHour = miles / formula;

    System.out.println(milesPerHour);
  } 
}