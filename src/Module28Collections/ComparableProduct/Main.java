package Module28Collections.ComparableProduct;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Product> productSet = new TreeSet<>();

        productSet.add(new Product("SuperBrand", "Sausage", 3435425245L, LocalDateTime.now()));
        productSet.add(new Product("BestBrand", "Bread", 434323434L, LocalDateTime.now()));
        productSet.add(new Product("GoodBrand", "Cheese", 4343111111L, LocalDateTime.now()));

        for (Product product : productSet) {
            System.out.println(product.getBrand());
        }

        Set<Product> productsName = new TreeSet<>(new NameComparator());

        productsName.add(new Product("SuperBrand", "Pasta", 1L, LocalDateTime.now()));
        productsName.add(new Product("BestBrand", "Butter", 2L, LocalDateTime.now()));

        for (Product product: productsName){
            System.out.println(product.getName());
        }

        Set<Product> productsSerial = new TreeSet<>(new SerialNumberComparator().reversed());
        productsSerial.add(new Product("SuperBrand", "Oil", 1L, LocalDateTime.now()));
        productsSerial.add(new Product("BestBrand", "Milk", 2L, LocalDateTime.now()));

        for (Product product : productsSerial) {
            System.out.println(product.getSerialNumber());
        }
    }
}
