package ru.myproject.less1.repositorys;

import org.springframework.stereotype.Repository;
import ru.myproject.less1.beans.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1, "Milk", 28.01),
                new Product(2, "Chocolate", 10.2),
                new Product(3, "Bread", 5.1),
                new Product(4, "Banana", 17.6),
                new Product(5, "Apple", 16.9)
        ));
    }

    public List<Product> getProductList() {
        return products;
    }

    public Product getProductById(Integer id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst().orElseThrow(RuntimeException::new);
    }
}
