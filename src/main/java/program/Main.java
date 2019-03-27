package program;

import entity.Case;
import entity.Dimensions;
import entity.Orderline;
import entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Case palet = new Case(2d, 2d, 2d);

        Orderline orderline = new Orderline(4, new Product(0.3, 0.4, 0.5));
        Orderline orderline1 = new Orderline(4, new Product(0.3, 0.5, 0.5));
        List<Orderline> orderlines = new ArrayList<>();
        orderlines.add(orderline);
        orderlines.add(orderline1);
        System.out.println(palet.checkTheOrders(orderlines));
        System.out.println(palet.theMostOptimalOrder(orderlines));

//        Case c = new Case(2d, 2d, 3d);
//        Case c2 = new Case(2d, 5d, 3d);
//        System.out.println(c.equals(c2));
//
//        Product product = new Product(2.5,2.6,0.5);
//        Product product1 = new Product(2.8,2.6,0.5);
//
//        System.out.println(product.equals(product1));
//        Orderline orderline2 = new Orderline(2,product);
//        Orderline orderline3 = new Orderline(2,product1);
//        System.out.println(orderline2.equals(orderline3));
    }}
