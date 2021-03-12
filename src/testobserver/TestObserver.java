/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobserver;

/**
 *
 * @author michel
 */
public class TestObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*
       Thread thread = new Thread(new CounterJob());
       thread.start();
       */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
        
    }
    
}
