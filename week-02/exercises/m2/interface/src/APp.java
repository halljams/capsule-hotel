public class APp
{
    public static void main(String[] args) {
        Vehicle truck = new Truck();
       // truck.accelerate();

        Vehicle spaceship = new Spaceship();
        for (int i = 0; i <7; i++) {
            truck.accelerate();
            spaceship.accelerate();
        }
        /*
       spaceship.accelerate();
        spaceship.accelerate();
        spaceship.accelerate();
        */


        System.out.println("truck: " + truck.getVelocityMessage());
        System.out.println("spaceship: " + spaceship.getVelocityMessage());
    }
}