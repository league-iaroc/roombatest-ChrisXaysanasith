package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

void goStraight(int howLong){
	driveDirect(500, 500);
	sleep(howLong);
}
void turnRight(int howLong){
	driveDirect(500, 0);
	sleep(howLong);
}
void turnLeft(int howLong){
	driveDirect(0,500 );
	sleep(howLong);
}




	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	
		goStraight(2500);
	turnLeft(500);
	goStraight(1750);
	turnRight(500);
	goStraight(2000);
	turnLeft(500);
	goStraight(1700);
	turnRight(400);
	goStraight(1000);
	
	}

	public void loop() {
	
	}
}
