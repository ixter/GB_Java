package hw03.interfacess;

import hw03.model.Product;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
