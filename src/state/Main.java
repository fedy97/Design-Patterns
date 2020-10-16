package state;

public class Main {
    public static void main(String[] args) {
        var directionService = new DirectionService();

        directionService.setTravelMode(new DrivingState());
        directionService.getDirection();

        directionService.setTravelMode(new BicyclingState());
        directionService.getEta();
    }
}
