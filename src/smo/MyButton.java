package smo;

import java.awt.Color;

import javax.swing.JButton;
/**
 * Erweitert die Klasse JButton f�r die Farb�nderung
 * @author Raphael Sauermann
 *
 */
public class MyButton extends JButton {
	private boolean isOn;
	public MyButton (){
		super();
		isOn=false;
		this.setBackground(Color.BLACK);
	}
}
