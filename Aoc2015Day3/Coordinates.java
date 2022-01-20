package Aoc2015Day3;

import java.util.Objects;

public class Coordinates {

    public final int x,y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Coordinates coor = (Coordinates) o;
        return y == coor.y && Objects.equals(x, coor.x);
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }

}
