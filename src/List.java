/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;

/**
 *
 * @author cogid4775
 */
public class List {
    
    private ArrayList<String> list;
    
    public List() {
        list = new ArrayList<String>();
    }
    
    public void addItem(String s) {
        list.add(s);
    }
    
    public String getItem(int n) {
        try {
            list.get(n);
            return list.get(n);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
    
    public int getSize() {
        return list.size();
    }
    
}
