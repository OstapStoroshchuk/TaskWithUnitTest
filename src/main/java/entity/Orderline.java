package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

public class Orderline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer count;

    private Product product;

    public Orderline(Integer count, Product product) {
        this.count = count;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Orderline{" +
                "count=" + count +
                ", product=" + product +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orderline orderline = (Orderline) o;
        return Objects.equals(id, orderline.id) &&
                Objects.equals(count, orderline.count) &&
                Objects.equals(product, orderline.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, count, product);
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
