/**
 * 
 * Quad class
 * 
 * @author Matt Charno
 * @author Cyrus Johannes
 * @author Brad Kelly
 * @version 2018.04.24
 *
 */
public class Quad {
   
    private Point topLeft;
    private Point botRight;
    
    private Node data;
    
    private Quad topLeftTree;
    private Quad topRightTree;
    private Quad botLeftTree;
    private Quad botRightTree;
    
    /**
     * Constructor for Quad
     * @param topLeft Point var
     * @param botRight Point var
     */
    public Quad(Point topLeft, Point botRight) {
        this.botRight = botRight;
        this.topLeft = topLeft;
    }
    /**
     * 
     * @param x x cordinate of point
     * @param y y cordinate of point
     * @param description of location
     */
    public void insert(int x, int y, String description) {
        data = new Node(x, y, description);
        insert(data);
    }
    /**
     *  insert
     * @param newNode to insert 
     */
    public void insert(Node<Point> newNode) {
        if (newNode == null) {
            return;
        }
        if (newNode.getX() ) {
            
        }
        
     
        
    }
    
}
