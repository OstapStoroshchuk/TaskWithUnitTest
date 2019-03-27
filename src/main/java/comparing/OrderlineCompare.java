package comparing;

import entity.Orderline;


import java.util.Comparator;

public class OrderlineCompare implements Comparator<Orderline> {
    @Override
    public int compare(Orderline o1, Orderline o2) {
        if (o1.getCount() == o2.getCount()) {
            if (o1.getProduct().equals(o2.getProduct())) {
                return 0;
            } else return -1;
        } else return -1;
    }
}
