package model;

import javax.swing.JFrame;
import javax.swing.JLabel;

import studentManager.Promotion;

public class PromoWindow extends JFrame {
	public PromoWindow(Promotion promo) {
		this.setSize(600,300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JLabel test = new JLabel(promo.getName());
		this.getContentPane().add(test);
		this.setVisible(true);
	}
}
