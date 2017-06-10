/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

/**
 *
 * @author Jefferson
 */
public class CalculadoraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Soma sm;
       sm = new Soma();
    
       sm.A = 2;
       sm.B = 2;
       
       sm.total = sm.A + sm.B;
       
        System.out.println(sm.total);
    }
    
}
