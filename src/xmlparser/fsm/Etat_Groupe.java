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
public class Etat_Groupe extends Etat{
    public Etat_Groupe(Parseur parseur){
        super(parseur);
    }
    
    @Override
    public Etat transition(){
        return this;
    }
}
