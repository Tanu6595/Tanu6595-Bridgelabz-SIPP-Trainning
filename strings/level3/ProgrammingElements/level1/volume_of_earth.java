 package level1;

public class volume_of_earth {
    public static void main(String[] args) {
        double r = 6378; // Radius in kilometers
        double vol = (4.0 / 3.0) * Math.PI * Math.pow(r, 3); // Volume formula
        System.out.println("Volume of Earth in cubic kilometers: " + vol);
        System.out.println("Volume in cubic miles: " + (vol * 1.6));
    }
}