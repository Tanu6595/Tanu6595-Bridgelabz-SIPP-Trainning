package level2;
public class UnitConverter {
 private static final double KM_TO_MILES = 0.621371;
	    private static final double MILES_TO_KM = 1.60934;
	    private static final double METERS_TO_FEET = 3.28084;
	    private static final double FEET_TO_METERS = 0.3;
 
	    public static double convertKmToMiles(double km) {
	        return km * KM_TO_MILES;
	    }
 
	    public static double convertMilesToKm(double miles) {
	        return miles * MILES_TO_KM;
	    } 
	    public static double convertMetersToFeet(double meters) {
	        return meters * METERS_TO_FEET;
	    }
 	    public static double convertFeetToMeters(double feet) {
	        return feet * FEET_TO_METERS;
	    } 
	    public static void main(String[] args) {
	         
	        System.out.println("10 km to miles: " + convertKmToMiles(10));
	        System.out.println("5 miles to km: " + convertMilesToKm(5));
	        System.out.println("3 meters to feet: " + convertMetersToFeet(3));
	        System.out.println("8 feet to meters: " + convertFeetToMeters(8));
	    }
	}

