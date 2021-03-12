/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobserver;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;

/**
 *
 * @author michel
 */
public class CounterJob extends Observable implements Runnable {
    
        private int count;
    
	public CounterJob() {
		super();
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
	this.count = count;
	this.setChanged();
	this.notifyObservers(this.getCount());
        }

    @Override
    public void run() {
        
        try {
		while (this.getCount() < 1000) {
			this.setCount(this.getCount() + 1);
                        System.out.println("Valeur compteur: " + this.getCount());
			Thread.sleep(1500);
		}
	} catch (InterruptedException e) {
	}
        
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); //To change body of generated methods, choose Tools | Templates.
    }
    
    

   
      
    
    
}
