package smo;

import java.awt.BorderLayout;
import java.util.Date;

import javax.swing.*;

/**
 * Ist die Panel Klasse des GUI , sie beinhaltet alle JPanel und Inhalte (zB.
 * JButtons,JTextFields,..)
 * 
 * @author Raphael Sauermann
 * @version 27.11.2015
 *
 */
public class MyPanel extends JPanel {

	private MyModel Model;
	private MyController myController;

	// die Panels die in das Finale kommen
	JPanel buttonPanel;
	// Der Inhalt des Panels

	// Die Buttons

	// Die JLabel

	// Eingabe für die cm von Schnee
	private JTextField schneeLage = new JTextField(5);

	/**
	 * Der Konstruktor beinhaltet die deklaration des JPanels und dem gesamten
	 * Inhalt
	 * 
	 * @param bildModel
	 * @param myController
	 */
	public MyPanel(MyModel Model, MyController myController) {
		// initialisiert die inhalte
		buttonPanel = new JPanel();

		// setzt das Layout
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		// fügt die inneren Layouts hinzu

		// setzt das Layout von den inneren Panels

		// fügt den Inhalt den inneren Panels hinzu

		// fügt den inhalt den ganz inneren panels hinzu

		// fügt den inhalt zu den dropdownlisten hinzu

		// setzt die actioncommands und listener

	}

}