package smo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.*;

/**
 * Ist die Panel Klasse des GUI , sie beinhaltet alle JPanel und Inhalte (zB.
 * JButtons,JTextFields,..)
 * 
 * @author �zer Angelo
 * @version 14.12.2015
 *
 */
public class MyPanel extends JPanel {
	private JPanel all;//gesamt Panel
	private JPanel north;//panel f�r den neuen game Button
	private JPanel buttonsP;//hier kommen die 25 Buttons rein
	private MyModel model;
	private MyController controller;
	
	private MyButton [][]buttonArray;
	
	private JButton newGame;//Generiert das Spielfeld neu
	/**
	 * Eine simple Getter-Methode
	 * @return den Button newGame
	 */
	public JButton getNewGame() {
		return newGame;
	}
	/**
	 * Ermittelt die Postion der Buttons um die Farbe zu �ndern
	 * @param x - Koordinate des Buttons
	 * @param y - Koordinate des Buttons
	 */
	public void changeColor(int x , int y){
		buttonArray[x][y].changeColor();
	}
	/**
	 * Das ist der Konstruktor der Klasse MyPanel 
	 * @param model ein Objekt der Klasse MyModel
	 * @param controller ein Objekt der Klasse MyController
	 */
	public MyPanel(MyModel model,MyController controller){
		
		this.model=model;
		this.controller=controller;
		
		all = new JPanel();
		newGame = new JButton("New Game");
		all.setLayout(new BorderLayout());
		this.add(newGame, BorderLayout.NORTH);//hier wird der newGame Button zu .NORTH hinzugef�gt
		
		buttonArray = new MyButton[5][5];
		buttonsP = new JPanel();
		buttonsP.setLayout(new GridLayout(5 , 5));
		buttonsP.setPreferredSize(new Dimension(450,450));
		this.add(buttonsP, BorderLayout.CENTER);
		for(int x = 0 ; x < 5 ; x++){
			for(int y = 0; y < 5;y++){
				buttonArray[x][y]=new MyButton();
				buttonArray[x][y].setActionCommand(x+"#"+y);
				buttonArray[x][y].addActionListener(controller);
				buttonsP.add(buttonArray[x][y]);
			}
		}
		this.setVisible(true);
	}
	public void repaint(){
		}
}

