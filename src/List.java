/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Imports
import java.util.ArrayList;

/**
 * Class to create a list and edit it
 * @author cogid4775
 */
public class List {
    
    // The ArrayList to hold the list
    private final ArrayList<String> list;
    // The location of where to save the list (saving is not done in this class)
    private final String location;
    
    /**
     * Initializes a new list
     * @param loc the location of the list
     */
    public List(String loc) {
        list = new ArrayList<String>();
        location = loc;
    }
    
    /**
     * Gets the file location of the list
     * @return the file location of the list
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Adds an item to the end of the list
     * @param s content to add
     */
    public void addItem(String s) {
        list.add(s);
    }
    
    /**
     * Adds an item to the given position in the list
     * @param n index position to add the item to
     * @param s content to add
     */
    public void addItem(int n, String s) {
        list.add(n, s);
    }
    
    /**
     * Removes an item from the list
     * @param n index of the item to remove
     */
    public void removeItem(int n) {
        list.remove(n);
    }
    
    /**
     * Replaces an item in the list
     * @param n index of the item to replace
     * @param s content to replace the item with
     */
    public void replaceItem(int n, String s) {
        list.set(n, s);
    }
    
    /**
     * Gets an item from the list
     * @param n index of the item to get
     * @return the contents of the item, or null if the item doesn't exist
     */
    public String getItem(int n) {
        // Try to get the item. If the item doesn't exist, catch the error and return null.
        try {
            list.get(n);
            return list.get(n);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
    
    /**
     * Gets the size (number of items) in the list
     * @return the size of the list
     */
    public int getSize() {
        return list.size();
    }
    
    /**
     * Clears all items from the list
     */
    public void clearList() {
        list.clear();
    }
    
    /**
     * Converts the list to a String for saving (saving is not done in this class)
     * @return a String representation of the list
     */
    @Override public String toString() {
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            s += list.get(i) + "\n";
        }
        return s;
    }
    
}
