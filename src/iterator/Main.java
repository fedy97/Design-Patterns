package iterator;

public class Main {
    public static void main(String[] args) {
        var productsCollection = new ProductCollection();
        productsCollection.add(new Product(1,"lol1"));
        productsCollection.add(new Product(2,"lol2"));

        Iterator<Product> iter = productsCollection.createIterator();

        while (iter.hasNext()) {
            System.out.println(iter.current().toString());
            iter.next();
        }
    }
}
