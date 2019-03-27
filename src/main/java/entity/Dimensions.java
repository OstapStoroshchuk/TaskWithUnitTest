package entity;

import java.util.Objects;

public abstract class Dimensions {

    private final Double sizeX;

    private final Double sizeY;

    private final Double sizeZ;

    public Dimensions(Double sizeX, Double sizeY, Double sizeZ) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
    }
    @Override
    public String toString() {
        return "Dimensions{" +
                "sizeX=" + sizeX +
                ", sizeY=" + sizeY +
                ", sizeZ=" + sizeZ +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dimensions that = (Dimensions) o;
        return Objects.equals(sizeX, that.sizeX) &&
                Objects.equals(sizeY, that.sizeY) &&
                Objects.equals(sizeZ, that.sizeZ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sizeX, sizeY, sizeZ);
    }

    public Double getSizeX() {
        return sizeX;
    }

    public Double getSizeY() {
        return sizeY;
    }

    public Double getSizeZ() {
        return sizeZ;
    }
}
