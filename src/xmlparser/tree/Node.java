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
public class Node {
    private String nom = "";
    private String contenu = "";
    private ArrayList<Node> fils = new ArrayList<>();
    private Node parent = null;

    /**
     * 
     * @return 
     */
    public String getNom() {
        return nom;
    }

    /**
     * 
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * 
     * @return 
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * 
     * @param contenu 
     */
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    
    /**
     * Crée un nouveau noeud
     * @param parent Parent de cette balise
     */
    public Node(Node parent){
        this.parent = parent;
    }
    
    /**
     * 
     * @param fils ajouter un fils a la ArrayList
     */
    public void addFils(Node fils){
        this.fils.add(fils);
    }
    
    /**
     * 
     * @param parent definir le parent a sélectionner
     */
    public void setParent(Node parent){
        this.parent = parent;
    }
    
    /**
     * 
     * @return l'ArrayList des fils
     */
    public ArrayList<Node> getFils(){
        return this.fils;
    }
    
    /**
     * 
     * @return le parent
     */
    public Node getParent(){
        return this.parent;
    }
    
    
}
