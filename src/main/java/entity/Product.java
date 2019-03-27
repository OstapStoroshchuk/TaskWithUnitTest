package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product extends Dimensions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;

    public Product(Double sizeX, Double sizeY, Double sizeZ) {
        super(sizeX, sizeY, sizeZ);
    }

    public Double volume(){
        return getSizeX()*getSizeY()*getSizeZ();
    }

    @Override
    public String toString() {
        return "Product " + super.toString();
    }
}
