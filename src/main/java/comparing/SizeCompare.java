package comparing;

import entity.Dimensions;

import java.util.Comparator;

public class SizeCompare implements Comparator<Dimensions> {
    @Override
    public int compare(Dimensions o1, Dimensions o2) {
        if (o1.getSizeX() == o2.getSizeX()) {
            if (o1.getSizeY() == o2.getSizeY()) {
                if (o1.getSizeZ() == o2.getSizeZ()) {
                    return 0;
                } else return -1;
            } else return -1;
        } else return -1;

    }
}
