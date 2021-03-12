/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testobserver;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;

/**
 *
 * @author michel
 */
public class Interface extends javax.swing.JFrame implements Observer{

    private CounterJob counterJob;
    private Thread thread;
    
    
    private int compteur =0;
    
    
    public Interface() {
        initComponents();
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    public static void main(String args[]) {
       
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
   */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
       
        this.getjLabel1().setText((String) arg);
        
    }

    public CounterJob getCounterJob() {
      
        if (this.counterJob == null) {
	this.counterJob = new CounterJob();
        this.counterJob.addObserver(this.compteur);
	
	}
	return this.counterJob;
    }

    public void setCounterJob(CounterJob counterJob) {
        this.counterJob = counterJob;
    }

    public int getCompteur() {
        return compteur;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public Thread getThread() {
        
        if (this.thread == null) {
		this.setThread(new Thread(this.getCounterJob()));
	}
	return thread;
      
    }

    private void setThread(Thread thread) {
       
        this.thread = thread;
    }
    
    

}
