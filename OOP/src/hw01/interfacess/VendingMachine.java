package hw01.interfacess;

import hw01.model.Product;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
