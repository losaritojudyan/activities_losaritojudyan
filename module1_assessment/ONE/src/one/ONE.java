/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

import static java.lang.System.arraycopy;

/**
 *
 * @author Administrator
 */
public class ONE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                             int[] array3 = new int [5];
                             int [] array4 = new int [11];
                        
                             array3[0] = 1;
                             array3[1] = 6;
                            
                             
                             array4[0] = 7;
                             array4[1] = 7;
                             
                             
                             arraycopy(array3, 1, array4, 2,3);
                             
                             for (int z =0; z < array4.length; z++){
                                 System.out.println("Array "+z+" : " + array4[z]);
                             }
                             
                             
    }
                                   public static void arraycopy(int[] from,int fromstart, int[] to, int tostart, int count){
                                    for (int z = 0; z < count; z++){
                                        to[tostart + z] = from[fromstart + z];
                                    }
                             }
    
    }
    

 