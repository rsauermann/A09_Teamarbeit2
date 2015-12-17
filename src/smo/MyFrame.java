package smo;

import java.awt.*;
import javax.swing.*;
/**
 * Ist die Frame Klasse des GUI ,sie beinhaltet das Frame
 * @author smo
 * @version 2015-09-11
 */
public class MyFrame extends JFrame {
	private MyPanel myPanel;
	
	/**
	 * der Konstruktor erstellt ein frame das als Inhalt einen Parameter und als Titel auch einen Parameter hat
	 * @param gui der Inhalt
	 * @param title der Titel
	 */
	public MyFrame(MyPanel gui, String title) {
		this.myPanel = gui;
		this.setTitle("LightsOff");
		this.setPreferredSize(new Dimension(470,525));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(BorderLayout.CENTER, this.myPanel);
		this.setContentPane(myPanel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
