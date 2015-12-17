package smo;

import java.awt.Color;

import javax.swing.JButton;

/**
 * Erweitert die Klasse JButton für die Farbänderung
 * @version 17.12.2015
 * @author Raphael Sauermann
 *
 */
public class MyButton extends JButton {
	private boolean isOn;
	
	/**
	 * Das ist der Konstruktor der Klasse MyButton sie setzt die buttons auf schwarz
	 * @since 17.12.2015
	 */
	public MyButton() {
		super();
		isOn = false;
		this.setBackground(Color.BLACK);
	}
	
	/**
	 * Ein getter um zu überprüfen ob das licht ein oder aus ist
	 * @since 17.12.2015
	 * @return isON --> true gelb ; fasle --> schwarz
	 */
	public boolean isOn() {
		return isOn;
	}
	/**
	 * die Methode changColor ist dazu da um die Farb der Buttons beim click zu verändern
	 * @since 17.12.2015
	 */
	public void changeColor() {
		isOn = !isOn;
		if (isOn) {
			this.setBackground(Color.YELLOW);
		} else {
			this.setBackground(Color.BLACK);
		}
	}
	/**
	 * Die Methode changeOff überprüft wieder die Farben und setzt die nötigen Buttons auf schwarz
	 *  @since 17.12.2015
	 */
	public void changeOff(){
		isOn=false;
		this.setBackground(Color.BLACK);
	}

}
