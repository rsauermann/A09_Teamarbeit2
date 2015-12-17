package smo;

import java.awt.Point;
import java.util.Arrays;

public class MyModel {
	// private boolean[][] buttonStatus;

	public MyModel() {
	}

	public Point[] addLight() {

		double random = (Math.random() * 4) + 5;
		int randomInt = (int) random;
		Point[] ps1 = new Point[randomInt];
		for (int i = 0; i < randomInt; i++) {
			while (true) {
				double d1 = (Math.random() * 5);
				double d2 = (Math.random() * 5);
				if (!Arrays.asList(ps1).contains(new Point((int) d1, (int) d2))) {
					ps1[i]=new Point((int) d1, (int) d2);
					break;
				}
			}
		}
		return ps1;
	}

	public Point[] buttonPushed(String cords) {
		Point[] ps1 = new Point[5];
		int[][] ret = new int[5][2];
		String[] cordsSplit = cords.split("#");
		int x = Integer.parseInt(cordsSplit[0]);
		int y = Integer.parseInt(cordsSplit[1]);
		ps1[0] = new Point(x, y);
		ps1[1] = new Point(x + 1, y);
		ps1[2] = new Point(x - 1, y);
		ps1[3] = new Point(x, y + 1);
		ps1[4] = new Point(x, y - 1);
		return ps1;
	}

	public boolean hatGewonnen(MyButton[][] mb) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(mb[i][j].isOn())
					return false;
			}
		}
		return false;
	}
}
