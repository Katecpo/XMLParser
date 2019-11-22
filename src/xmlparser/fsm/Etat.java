/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparser.fsm;

/**
 *
 * @author rm792745
 */
public abstract class Etat {
    
    private Parseur parseur;
    
    public Etat(Parseur parseur){
        this.parseur = parseur;
    }
    
    public Etat transition(){
        return this;
    }
}
