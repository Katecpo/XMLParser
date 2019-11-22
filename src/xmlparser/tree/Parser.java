package xmlparser.tree;

import java.util.ArrayList;
import xmlparser.exceptions.ExceptionNeastedTag;

/**
 *
 * @author rm792745
 * @author bd062554
 */
public class Parser {
    private Node baliseCourante = null;
    private Tree arbre = null;
    
    public Tree createXMLtree(String fileContent) throws ExceptionNeastedTag
    {
        arbre = new Tree();
        String tmp = "";
        
        for(int i = 0; i< fileContent.length();i++) {
            switch(fileContent.charAt(i)){
                case '<' : 
                    if(fileContent.charAt(i+1) == '/'){
                        if (baliseCourante != null) {
                            if (baliseCourante.getContenu().equals("")) {
                                baliseCourante.setContenu(tmp);
                                
                                String sbs = fileContent.substring(i+2);
                                sbs = sbs.substring(0,sbs.indexOf(">"));
                                if (!sbs.equals(baliseCourante.getNom())) {
                                    throw new ExceptionNeastedTag(baliseCourante.getNom());
                                }
                            }
                            
                            baliseCourante = baliseCourante.getParent();
                        }
                    }
                    else if(arbre.getRacine() == null){
                        baliseCourante = new Node(null);
                        arbre.setRacine(baliseCourante);
                    }
                    else
                    {
                        Node newBalise = new Node(baliseCourante);
                        baliseCourante.addFils(newBalise);
                        Node oldBalise = baliseCourante;
                        baliseCourante = newBalise;
                        baliseCourante.setParent(oldBalise);
                    }
                    
                    tmp = "";
                break;
                case '>':
                    if (baliseCourante != null) {
                        if (baliseCourante.getNom().equals("")) {
                            baliseCourante.setNom(tmp);
                        }
                        tmp = "";
                    }
                break;
                default :
                    tmp += (fileContent.charAt(i-1) != '<' && fileContent.charAt(i) == '/') ? "" : fileContent.charAt(i);
                break;
            }
        }
        tmp = "";
        System.out.println("XML file read.");
        
        return arbre;
    }
    
    public String formatTreeOutput(Tree tree) {
        String ret = "";
        
        Node racine = tree.getRacine();
        ret += racine.getInfo(ret);
        
        return ret;
    }
}
