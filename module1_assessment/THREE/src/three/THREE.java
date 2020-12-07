/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three;

/**
 *
 * @author Administrator
 */
public class THREE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                       int[] example = {81, 80,83,89,85};
                       int sum = 0;
                       int aver = 0;
                       
                       
                       for(int z = 0; z < example.length; z++){
                           sum += example[z];
                       }  
                        aver = sum/example.length;
                        System.out.println("FINAL AVERAGE : "+aver);
    }
    
}
