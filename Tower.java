package ProjectWhiteboard;

import java.util.ArrayList;

public class Tower extends Entity{

	int timer;
	public boolean timeToFire() {
		if(timer>=speed)
			return true;
		else
			return false;
	}

	public void fire(ArrayList <BadGuy> bglist) {
		//find target and decrement its health and reset timer
		//different for most towers
	}

	public void incrementTime() {
		timer++;
	}
	
	

}
