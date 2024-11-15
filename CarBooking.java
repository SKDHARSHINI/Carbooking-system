
import java.util.ArrayList;

public class CarBooking 
{
 
    private static ArrayList <Car> carList = new ArrayList<>(); 
    private static int carLimit = 4, idGenerator = 1;
    private static ArrayList <Car> carBookedHistory = new ArrayList();
    
    public static String Booking (char pickupLoc, char dropLoc, int pickupTime) throws CloneNotSupportedException
    {
        if (carList.size() < carLimit)
        {
            carList.add(new Car());
        }

       ; 
        Car carReady = null;

        for ( Car c : carList)
        {
            if (c.getDropTime() <= pickupTime)
            {
                carReady = c;
            }
           
        }

        if (carReady != null )
        {
            carReady.setCustomerId(idGenerator++);
            carReady.setPickupLoc(pickupLoc);
            carReady.setDropLoc(dropLoc);
            carReady.setPickupTime(pickupTime);
            carReady.setCurrentLoc(dropLoc);
            carReady.setDropTime(pickupTime + Math.abs(dropLoc - pickupLoc));
            carReady.setCarId(carList.indexOf(carReady)+1);
            carBookedHistory.add((Car)carReady.clone());
        }

        return carReady!=null?"Car number : "+ carReady.getCarId() +" is booked" : " Car is not available";
    }

    public static void displayDetails()
    {
        System.out.println("--------------------------------------");
        for ( Car car : carBookedHistory)
        {
            System.out.println(car.toString());
            System.out.println("--------------------------------------");
        }
    }
}
