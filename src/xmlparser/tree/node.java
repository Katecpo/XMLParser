/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xmlparser.tree;

import java.util.ArrayList;
/**
 * Représente un noeud d'un arbre
 * 
 * @author rm792745
 * @author tj868158
 */
public class node {
    private String nom;
    private String contenu;
    
    private ArrayList<node> fils;
    private node parent;
    
    /**
     * 
     * @param nom obtenir le nom de la balise
     * @param contenu obtenir le contenu de la balise
     */
    public node(String nom, String contenu){
        this.nom = nom;
        this.contenu = contenu;
    }
    
    /**
     * 
     * @param fils ajouter un fils a la ArrayList
     */
    public void addFils(node fils){
        this.fils.add(fils);
    }
    
    /**
     * 
     * @param parent definir le parent a sélectionner
     */
    public void setPere(node parent){
        this.parent = parent;
    }
    
    /**
     * 
     * @return l'ArrayList des fils
     */
    public ArrayList<node> getFils(){
        return this.fils;
    }
    
    /**
     * 
     * @return le parent
     */
    public node getParent(){
        return this.parent;
    }
}
