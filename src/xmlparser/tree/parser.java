/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparser.tree;

/**
 *
 * @author rm792745
 */
public class parser {
    private Node baliseCourante = null;
    private Tree arbre = null;
    
    public void createXMLtree(String fileContent)
    {
        arbre = new Tree();
        String tmp = "";
        
        for(int i = 0; i< fileContent.length();i++){
            switch(fileContent.charAt(i)){
                case '<' : 
                    if(fileContent.charAt(i+1) == '/'){
                        baliseCourante = baliseCourante.getParent();
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
                break;
                case '>':
                    if (baliseCourante.getNom().equals("")) {
                        baliseCourante.setNom(tmp);
                        tmp = "";
                    } else if (baliseCourante.getContenu().equals("")) {
                            baliseCourante.setContenu(tmp);
                            tmp = "";
                    } else {
                        baliseCourante = baliseCourante.getParent();
                    }
                break;
                default :
                    tmp += (fileContent.charAt(i-1) != '<' && fileContent.charAt(i) == '/') ? "" : fileContent.charAt(i);
                break;
            }
        }
        System.out.println("finished");
        tmp = "";
    }
}
