/**
 * Created by Lizzi on 29.11.2016.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public int[] getXY() {
        int[] xy = new int[]{this.x, this.y};
        return xy;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "myPoint{x=" + this.x + ", y=" + this.y + '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof MyPoint)) {
            return false;
        } else {
            MyPoint myPoint = (MyPoint) o;
            return this.x != myPoint.x ? false : this.y == myPoint.y;
        }
    }

    public int hashCode() {
        int result = this.x;
        result = 31 * result + this.y;
        return result;
    }

    public double distance() {
        return Math.sqrt(Math.pow((double) this.x, 2.0D) + Math.pow((double) this.y, 2.0D));
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((double) (this.x - x), 2.0D) + Math.pow((double) (this.y - y), 2.0D));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow((double) (this.x - another.getX()), 2.0D) + Math.pow((double) (this.y - another.getY()), 2.0D));
    }
}
