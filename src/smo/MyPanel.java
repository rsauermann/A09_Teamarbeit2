package smo;

import java.awt.BorderLayout;
import java.util.Date;

import javax.swing.*;

/**
 * Ist die Panel Klasse des GUI , sie beinhaltet alle JPanel und Inhalte (zB.
 * JButtons,JTextFields,..)
 * 
 * @author Özer Angelo
 * @version 14.12.2015
 *
 */
public class MyPanel extends JFrame {
	private JPanel all;//gesamt Panel
	private JPanel north;//panel für den neuen game Button
	private JPanel buttons;//hier kommen die 25 Buttons rein
	
	private JButton []buttonArray;
	
	private JButton newGame;//Generiert das Spielfeld neu
	
	public MyPanel(){
		this.setTitle("A07: Wenn wieder einmal Schnee fällt...");
		this.setLocationRelativeTo(null);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		all = new JPanel();
		north = new JPanel();
		newGame = new JButton("New Game");
		all.setLayout(new BorderLayout());
		this.add(north, BorderLayout.NORTH);//hier wird das north Panel .NORTH hinzugefügt
		north.add(newGame);
		
		buttonArray = new JButton[25];
		this.setVisible(true);
	}

	public void repaint(){
		
	}
}

