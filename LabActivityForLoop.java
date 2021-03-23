import java.util.Scanner;

public class LabActivityForLoop
{
  public static void main(String[] arg)
  {
    
    //CONSTANTS
    
    //VARIABLES
    String rocketName;
    int timeUntilLaunch; //Seconds
    
    //OBJECTS
    Scanner keyboardInput = new Scanner(System.in);
    
    //SOLUTION
    CS170.information("Cole Mooney", "Lab Activity", "For Loop");
       
    //KEYBOARD INPUT
    System.out.println("Enter the Rocket's Name: ");

        rocketName = keyboardInput.nextLine();
    
    System.out.println("Enter Time Until Launch (seconds): ");
    
        timeUntilLaunch = keyboardInput.nextInt();
        
    //Summary Information
    System.out.println(rocketName + " Scheduled to blast off in " + timeUntilLaunch + " Seconds");
    
    //Countdown
    for (int a = timeUntilLaunch; a >= 0; a-- )
    {
        System.out.printf("%10d %n", a);
    }
    
    //Launch Rocket
    System.out.println("BLAST OFF!");
    
    keyboardInput.close();
    
    }
}
