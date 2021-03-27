package behavioral.state;

public class BicyclingState implements TravelMode {
    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }

    @Override
    public Object getEta() {
        System.out.println("Calculating Eta (bicycling)");
        return 2;
    }
}
