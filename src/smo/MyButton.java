package smo;

import java.awt.Color;

import javax.swing.JButton;

/**
 * Erweitert die Klasse JButton für die Farbänderung
 * 
 * @author Raphael Sauermann
 *
 */
public class MyButton extends JButton {
	private boolean isOn;

	public MyButton() {
		super();
		isOn = false;
		this.setBackground(Color.BLACK);
	}

	public void changeColor() {
		isOn = !isOn;
		if (isOn) {
			this.setBackground(Color.YELLOW);
		} else {
			this.setBackground(Color.BLACK);
		}

	}

}
