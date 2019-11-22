/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparser.exceptions;

import javax.swing.JOptionPane;

/**
 * Neasted tag exception
 * @author bd062554
 */
public class ExceptionNeastedTag extends Exception {
    
    /**
     * Create a neasted tag error
     * @param tag Tag
     */
    public ExceptionNeastedTag(String tag) {
        super("Neasted tag: " + tag);
        JOptionPane.showMessageDialog(null, "Neasted tag: " + tag, "Error" , JOptionPane.ERROR_MESSAGE);
    }
}
