import java.util.ArrayList;
import student.TestCase;

/**
 * @author cyrusj
 * @author Matt Charno
 * @author Brad Kelly
 * @version 04.16.18
 */
public class NodeTest extends TestCase {
    private Node<String> n1;
    private Node<String> n2;
    
    /**
     * setUp the instances
     */
    public void setUp() {
        n1 = new Node<String>(getName(), null);
        n2 = new Node<String>(getName(), null);
    }
    
    /**
     * test getElement method
     */
    public void testGetElement() {
        Node<String> n3 = new Node<String>("b", null);
        n3.setElement("new");
        assertEquals("new", n3.getElement());
    } 
    
    /**
     * test setElement method
     */
    public void testSetElement() {
        n2.setElement("new");
        assertEquals(n2.getElement(), "new");
    }
    
    /**
     * test getList method
     */
    public void testGetList() {
        ArrayList<String> l1 = new ArrayList<String>();
        n1.setList(l1);
        assertEquals(n1.getList(), l1);
    }
    
    /**
     * test setList method
     */
    public void testSetList() {
        ArrayList<String> l1 = new ArrayList<String>();
        n1.setList(l1);
        assertEquals(n1.getList(), l1);
    }
    
    /**
     * test toString method
     */
    public void testToString() {
        n2.setList(null);
        assertEquals(n2.toString(), "null");
        
    }
    
}