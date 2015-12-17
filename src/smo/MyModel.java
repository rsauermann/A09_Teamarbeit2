package smo;

import java.awt.Point;

public class MyModel {
	//private boolean[][] buttonStatus;

	public MyModel() {
		//buttonStatus = new boolean[5][5];
		double random = (Math.random()*3)+4;
		int randomInt= (int)random;
		for (int i=0;i<randomInt;i++){
			addLight();
		}
	}
	public void addLight(){
		double dx=Math.random()*5;
		double dy=Math.random()*5;
		
	}

	public Point[] buttonPushed(String cords) {
		Point[]ps1=new Point[5];
		int [][] ret = new int[5][2];
		String[] cordsSplit = cords.split("#");
		int x = Integer.parseInt(cordsSplit[0]);
		int y = Integer.parseInt(cordsSplit[1]);
		ps1[0]=new Point(x,y);
		ps1[1]=new Point(x+1,y);
		ps1[2]=new Point(x-1,y);
		ps1[3]=new Point(x,y+1);
		ps1[4]=new Point(x,y-1);
		return ps1;
	}
	public boolean hatGewonnen(int[][]mb){
		for (int i=0;i<5;i++){
			for (int j=0;j<5;j++){
				
			}
		}
		return false;
	}
}
