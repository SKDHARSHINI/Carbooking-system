import java.util.Scanner;

public class CarMain
{

    public static void main(String[] args) throws CloneNotSupportedException 
    {
        Scanner scanner = new Scanner(System.in);
        
        boolean value = true;

        while(value)
        {
            System.out.println("1. Book a car\n2. Display booked history\n3. Exit");
            int response = scanner.nextInt();

            switch (response)
            {
                case 1: 
                    System.out.println("Enter the pick-up location : ");
                    char pickupLoc = scanner.next().charAt(0);

                    System.out.println("Enter the drop location : ");
                    char dropLoc = scanner.next().charAt(0);

                    System.out.println("Enter the pick-up time (24hrs - Railway time) : ");
                    int pickupTime = scanner.nextInt();

                    System.out.println(CarBooking.Booking(pickupLoc, dropLoc, pickupTime));
                
                break;

                case 2: 
                    CarBooking.displayDetails();
                break;

                case 3:
                    value = false;
                    System.out.println("Thank you for visiting us :)");
                    scanner.close();
                break;

                default: 
                    System.out.println("Invalid request");
                break;
            }
        }

    }
    
}
