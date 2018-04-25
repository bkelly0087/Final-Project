/**
 * 
 * Class that holds a point value with an x and y coordinate
 * 
 * @author Matt Charno
 * @author Cyrus Johannes
 * @author Brad Kelly
 * @version 2018.04.24
 *
 */
public class Point {
    // Instance/Static fields...
    // x and y values:
    private int x;
    private int y;
    
    /**
     * Constructor for Point objects
     * @param x - x value for coordinate
     * @param y - y value for coordinate
     */
    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    /**
     * Getter for x
     * @return - current x value
     */
    public int getX() {
        return x;
    }
    
    /**
     * toString method for Point objects
     * @return - String in form of "(x, y)"
     */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Setter for x
     * @param x - new x value
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter for y
     * @return - current y value
     */
    public int getY() {
        return y;
    }

    /**
     * Setter for y
     * @param y - new y value
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * overridden equals method 
     * @param o is the object to be compared
     */
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o instanceof Point) {
            return this.getX() == ((Point) o).getX() || 
                    this.getY() == ((Point)o).getY();
        }
        else {
            return false;
        }
    }
}
