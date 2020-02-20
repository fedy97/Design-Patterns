package factory_method;

public class TigerFactory extends AnimalFactory {
    public Animal createAnimal()
    {
        //Creating a Tiger
        return new Tiger();
    }
}
