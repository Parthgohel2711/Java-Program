class Point implements Cloneable {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Default shallow copy
    }
}

public class objclonning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point original = new Point(10, 20);
        Point clone = (Point) original.clone();
        Point A = (Point) original.clone();

        System.out.println("Original: " + original.x + ", " + original.y);
        System.out.println("Clone: " + clone.x + ", " + clone.y);
        System.out.println("Clone: " + A.x + ", " + A.y);
    }
}