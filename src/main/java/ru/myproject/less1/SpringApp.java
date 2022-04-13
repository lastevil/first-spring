package ru.myproject.less1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.myproject.less1.beans.Cart;

public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart1 = context.getBean(Cart.class);
        cart1.add(1);
        cart1.add(3);
        System.out.println(cart1.showCart());
        cart1.delete(1);
        System.out.println(cart1.showCart());
        Cart cart2 = context.getBean(Cart.class);
        cart2.add(4);
        cart2.add(4);
        cart2.add(5);
        cart2.deleteAllById(4);
        System.out.println(cart2.showCart());
    }
}
