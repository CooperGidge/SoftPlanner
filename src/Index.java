/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cogid4775
 */
public class Index {
    public int a;
    
    public Index(int x) {
        a = x;
    }
    
    public void addThree() {
        a += 3;
    }
    
    public void subtractThree() {
        a -= 3;
    }
    
    public int value() {
        return a;
    }
}
