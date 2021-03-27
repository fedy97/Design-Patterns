package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator<Product> createIterator() {
        return new ListIterator(this);
    }

    static class ListIterator implements Iterator<Product> {
        private final ProductCollection productCollection;
        private int index = 0;
        public ListIterator(ProductCollection products) {
            this.productCollection = products;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Product current() {
            return productCollection.products.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < productCollection.products.size();
        }
    }

}
