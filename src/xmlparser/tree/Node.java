package xmlparser.tree;

import java.util.ArrayList;
/**
 * Représente un noeud d'un arbre
 * 
 * @author rm792745
 * @author tj868158
 * @author bd062554
 */
public class Node {
    private String nom;
    private String contenu;
    
    private ArrayList<Node> fils;
    private Node parent;
    
    /**
     * 
     * @param nom obtenir le nom de la balise
     * @param contenu obtenir le contenu de la balise
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
    
    /**
     * 
     * @param parent definir le parent a sélectionner
     */
    public void setParent(Node parent){
        this.parent = parent;
    }

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
     * 
     * @param str
     * @return 
     */
    public String getInfo(String str) {
        String info = str;
        
        info += this.getNom() + ": " + this.getContenu();
        for (int i = 0; i < fils.size(); i++) {
            info += fils.get(i).getInfo(info);
        }
        
        return info;
    }
}