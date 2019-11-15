package xmlparser.tree;

import java.util.ArrayList;

/**
 *
 * @author rm792745
 * @author bd062554
 */
public class Parser {
    private Node baliseCourante = null;
    private Tree arbre = null;
    
    public Tree createXMLtree(String fileContent)
    {
        arbre = new Tree();
        String tmp = "";
        
        for(int i = 0; i< fileContent.length();i++){
            switch(fileContent.charAt(i)){
                case '<' : 
                    if(fileContent.charAt(i+1) == '/'){
                        if (baliseCourante != null) {
                            if (baliseCourante.getContenu().equals("")) {
                                baliseCourante.setContenu(tmp);
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
                        }/* else {
                            baliseCourante = baliseCourante.getParent();
                            tmp = "";
                        } */
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
        
        Node baliseCourante = tree.getRacine();
        ret += baliseCourante.getInfo(ret);
        
        return ret;
    }
}
