package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductController {
    private ArrayList<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1L, "Laptop", 999.99));
        products.add(new Product(2L, "Phone", 699.99));

    }
    @GetMapping("/products")
    public ArrayList<Product> getProducts() {
        return products;
    }
}
