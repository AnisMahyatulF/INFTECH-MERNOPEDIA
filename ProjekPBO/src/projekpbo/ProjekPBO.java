/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo;

/**
 *
 * @author sn10.7.08.20
 */
public class ProjekPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Register rg = new Register();
        //tampilkan frame regis
        rg.setVisible(true);
        rg.pack();
        //saat run, program menuju ke regis frame
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
    }
    
}
