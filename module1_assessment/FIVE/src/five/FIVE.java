/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package five;

/**
 *
 * @author Administrator
 */
public class FIVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                             String texts = " the quik brown fox";
        
                             for(int z = 0; z < texts.length(); z++ ) {
                             if(texts.charAt(z) != ' '
                                && texts.charAt(z) !='q'
                                && texts.charAt(z) !='u'
                                && texts.charAt(z) !='e'
                                && texts.charAt(z) !='e'
                                && texts.charAt(z) !='n') {
             
                                System.out.println(texts.charAt(z));
            }
             
        }
    }
    
    
    
}

