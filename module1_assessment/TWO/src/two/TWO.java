/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two;

/**
 *
 * @author Administrator
 */
public class TWO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                        String[][] stringArray = new String[10][10];
                       
                        for (int z = 0; z <stringArray.length; z++){
                        for(int u =0; u<stringArray[z].length; u++){
                        stringArray[z][u] = " 0 ";
            
        }
                      
            
    }        
                        
                        for(int z=0; z< stringArray.length; z++){
                        for (int u=0; u<stringArray[z].length; u++){
                        System.out.print(stringArray[z][u]);
                        
                   }
                           System.out.println(" \t ");
               }
    }
}
          
