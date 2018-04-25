import java.util.ArrayList;
/**
 * 
 * @author Brad Kelly 
 * @version 2018.04.24
 * @param <T>
 */
public class Node<T> {

    private T element;
    private ArrayList<String> list;
    
    /**
     * constructor for the node
     * @param l element for node
     * @param A Arraylist
     */
    public Node(T l, ArrayList<String> A) {
        list = new ArrayList<String>();
        element = l;
    }
    
    /**
     * getter for the element
     * @return element
     */
    public T getElement() {
        return element;
    }
    
    /**
     * setter for the element
     * @param value value to set
     */
    public void setElement(T value) {
        element = value;
    }
    
    /**
     * Getter of the array list
     * @return ArrayList 
     */
    public ArrayList<String> getList(){
        return list;
    }
    
    /**
     * setter for the array list
     * @param l sets equal to list
     */
    public void setList(ArrayList<String> l) {
        list = l;
    }
    
    /**
     * Returns the node as a string
     * @return the string
     */
    public String toString() {
        if (this.list == null) { // beware of null!
            return "null";
        }
        return this.list.toString();
    }
}
