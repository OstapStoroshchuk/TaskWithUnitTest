package entity;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CaseTest {

    @Test
    public void caseVolume() throws Exception {
        Case c = new Case(1d, 1d, 1d);
        Double expected = 1d;
        Double res = c.caseVolume();
        assertEquals(expected, res);
    }

    @Test
    public void checkTheOrders() throws Exception {
        Case c = new Case(6d, 6d, 6d);
        List<Orderline> list = new ArrayList<>();
        list.add(new Orderline(2, new Product(1d, 1d, 1d)));
        list.add(new Orderline(5, new Product(1d, 1d, 1d)));
        list.add(new Orderline(7, new Product(1d, 1d, 1d)));

        List<Orderline> expected = new ArrayList<>();
        expected.add(new Orderline(2, new Product(1d, 1d, 1d)));
        expected.add(new Orderline(5, new Product(1d, 1d, 1d)));

        List<Orderline> actual = c.checkTheOrders(list);
        assertEquals(actual,expected);
    }
}
