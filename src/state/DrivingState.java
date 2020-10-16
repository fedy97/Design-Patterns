package state;

public class DrivingState implements TravelMode {
    @Override
    public Object getDirection() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object getEta() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
