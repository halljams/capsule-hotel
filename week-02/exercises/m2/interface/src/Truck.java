public class Truck implements Vehicle { // 1. Implement keyword

    private static final int max_km_per_hour = 195;
    private int kilometersPerHour = 0;

    @Override
    public void accelerate() { // 2. matches the interface
        kilometersPerHour = Math.min(kilometersPerHour + 10, max_km_per_hour);
         }
     //new code - added velocity
     @Override
    public String getVelocityMessage() {
        return String.format("%s km/hr", kilometersPerHour);
     }
}
