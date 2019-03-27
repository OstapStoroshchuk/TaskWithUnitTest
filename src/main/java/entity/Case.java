package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Case extends Dimensions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Case(Double sizeX, Double sizeY, Double sizeZ) {
        super(sizeX, sizeY, sizeZ);
    }

    public List<Orderline> checkTheOrders(List<Orderline> list) {
        List<Orderline> acceptable = new ArrayList<>();
        for (Orderline o : list) {
            if (o.getProduct().getSizeX() * o.getCount() <= this.getSizeX() &&
                    o.getProduct().getSizeY() * o.getCount() <= this.getSizeY() &&
                    o.getProduct().getSizeZ() * o.getCount() <= this.getSizeZ()) {
                acceptable.add(o);
            }
        }
        return acceptable;
    }

    public Orderline theMostOptimalOrder(List<Orderline> list) {
        Orderline bestOrderline = list.get(0);
        for (Orderline o : checkTheOrders(list)) {
            if (freeSpace(bestOrderline) > freeSpace(o)) {
                bestOrderline = o;
            }
        }
        return bestOrderline;
    }

    public Double freeSpace(Orderline o) {
        return caseVolume() - o.getProduct().volume();
    }

    public Double caseVolume() {
        return getSizeX() * getSizeY() * getSizeZ();
    }

    @Override
    public String toString() {
        return "Case" +
                " " + super.toString();
    }
}
