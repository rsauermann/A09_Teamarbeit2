package smo;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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
		mf = new MyFrame(gui, "Lights off");
	}

	@Override
	/**
	 * hier wird geschaut ob die buttons betätigt werden
	 * wenn ein button gedrückt wird , wird die gefragte methode entweder in "model" und "gui" aufgerufen
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "new") {
			gui.newG();
			return;
		} else {
			Point[] ps1 = model.buttonPushed(e.getActionCommand());
			for (int i = 0; i < 5; i++) {
				if ((int) ps1[i].x == -1 || (int) ps1[i].x == 5
						|| (int) ps1[i].y == -1 || (int) ps1[i].y == 5) {
					continue;
				}
				gui.changeColor((int) ps1[i].x, (int) ps1[i].y);
			}
			if(model.hatGewonnen(gui.getButtonArray())){
				System.out.println("bin da");
				JOptionPane.showMessageDialog(null, "Sie haben gewonnen! :)");
				gui.newG();
			}
		}
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
