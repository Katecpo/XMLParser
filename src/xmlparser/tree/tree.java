/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparser.tree;

/**
 * Classe d'un arbre
 * 
 * @author rm792745
 * @author tj868158
 */
public class tree {
    
    private node racine;
    
    /**
     * Constructeur de l'arbre avec pas de racine
     */
    public tree(){
          racine = null;
    }
    
    /**
     * 
     * @param racine de type node
     * 
     * Set la racine de l'arbre
     */
    public void setRacine(node racine){
        this.racine = racine;
    }
    
    /**
     * 
     * @return la racine de l'arbre
     */
    public node getRacine(){
        return this.racine;
    }
}
