package smo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ist die Controller Klasser des GUI , sie beinhaltet den ActionListener und
 * die main Methode
 * 
 * @author Raphael Sauermann
 * @version 06.11.2015
 *
 */
public class MyController implements ActionListener {
	private MyFrame mf;
	private MyPanel gui;
	private MyModel model;

	/**
	 * der Konstruktor
	 */
	public MyController() {
		model = new MyModel();
		gui = new MyPanel(model, this);
		mf = new MyFrame(gui, "Lotto");
	}

	@Override
	/**
	 * hier wird geschaut ob die buttons bet�tigt werden
	 * wenn ein button gedr�ckt wird , wird die gefragte methode entweder in "model" und "gui" aufgerufen
	 */
	public void actionPerformed(ActionEvent e) {
		model.buttonPushed(e.getActionCommand());
	}

	/**
	 * Die main Methode die zum start der applikation dient
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new MyController();
	}

}
