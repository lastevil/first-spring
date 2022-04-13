package ru.myproject.less1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.myproject.less1.repositorys.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Scope("prototype")
public class Cart {
    private final List<Product> productList;

    @Autowired
    private ProductRepository productRepository;

    public Cart() {
        productList = new ArrayList<>();
    }

    public void add(Integer id) {
        productList.add(productRepository.getProductById(id));
    }

    public void delete(Integer id) {
        productList.stream()
                .filter(product -> product.getId().equals(id)).findFirst().
                ifPresent(productList::remove);
    }

    public void deleteAllById(Integer id) {
        productList.removeAll(productList.stream()
                .filter(product -> product.getId().equals(id))
                .collect(Collectors.toList()));
    }

    public List<Product> showCart() {
        return productList;
    }
}
