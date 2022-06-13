/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class to create and manipulate an index for paginating purposes
 * @author cogid4775
 */
public class Index {
    
    // int to hold the current value of the index
    public int a;
    
    /**
     * Initializes the value of the index
     * @param x the starting value of the index
     */
    public Index(int x) {
        a = x;
    }
    
    /**
     * Adds three to the value of the index, because a page is three items long
     */
    public void addThree() {
        a += 3;
    }
    
    /**
     * Adds two to the value of the index, because a page is three items long
     */
    public void subtractThree() {
        a -= 3;
    }
    
    /**
     * Gets the value of the index
     * @return the value of the index
     */
    public int value() {
        return a;
    }
}
