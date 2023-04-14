package interfacess;

import model.Product;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
