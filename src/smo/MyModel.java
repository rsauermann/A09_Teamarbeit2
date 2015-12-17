package smo;

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

	public void buttonPushed(String cords) {
		String[] cordsSplit = cords.split("#");
		int x = Integer.parseInt(cordsSplit[0]);
		int y = Integer.parseInt(cordsSplit[1]);
	}
}
