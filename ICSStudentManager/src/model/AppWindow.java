package model;

import javax.swing.JFrame;

import studentManager.Learner;
import studentManager.Promotion;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;

public class AppWindow extends JFrame {
	public AppWindow(ArrayList<Promotion> listePromo) {
		
		this.setSize(600,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel label = new JLabel("Bienvenue sur GestionPromo");
		label.setFont(new Font("Calibri",Font.BOLD, 35));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		this.getContentPane().add(label,BorderLayout.NORTH);// ne pas oublier d'ajouter les éléments crées 
		
		JPanel panel = new JPanel (new GridLayout(2,2));
		JComboBox promoBox = new JComboBox(new Vector(listePromo));
		panel.add(promoBox);
		JButton  promoButton = new JButton("Afficher Promo");
		panel.add(promoButton);
		promoButton.addActionListener((e)-> {new PromoWindow((Promotion)promoBox.getSelectedItem());});
		Vector<Learner> learnerList = new Vector<Learner>();
		//Pour chaque promo: on ajoute les apprenants de sa liste au vecteur learnerList
		for (Promotion p : listePromo) {
			learnerList.addAll(p.getListLearner());
		}
		JComboBox learnerBox = new JComboBox(learnerList);
		panel.add(learnerBox);
		JButton learnerButton = new JButton("Afficher Apprenant");
		panel.add(learnerButton);
		this.getContentPane().add(panel);
		
		
	}

}
