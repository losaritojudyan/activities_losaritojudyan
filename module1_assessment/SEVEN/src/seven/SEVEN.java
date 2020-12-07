/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven;

import java.io.File;

/**
 *
 * @author Administrator
 */
public class SEVEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                                                File ownFiles = new File ("C://Users//Administrator//");
                                                 String[] Files = ownFiles.list();
                          
                                                    for (String directory : Files) {
                                                    System.out.println(directory );
                                                }
              
                                          }
    
                    }