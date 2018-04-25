import java.util.ArrayList;
/**
 * 
 * @author Matt Charno
 * @author Cyrus Johannes
 * @author Brad Kelly
 * @version 2018.04.24
 *
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
    
    public String toString() {
        String result = " ";
        for (int i = 0; i< this.list.size(); i++) {
            result += " " + this.list.get(i);
        }
        return result;
    }
    
}
