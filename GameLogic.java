package ProjectWhiteboard;

import java.util.ArrayList;

public class GameLogic {
	ArrayList <BadGuy> BGlist=  new ArrayList<BadGuy>();
	ArrayList <Tower> Tlist = new ArrayList<Tower>();
	
	Map map;
	
	public GameLogic(Map m){
		map = m;
	}
	
	public void step(){
		int i;
		for(i=0;i<Tlist.size();i++){
			if(Tlist.get(i).timeToFire())
				Tlist.get(i).fire(BGlist);
			else
				Tlist.get(i).incrementTime();
		}
		for(i=0;i<BGlist.size();i++){
			if(BGlist.get(i).getHealth() < 0){
				BGlist.remove(i);
				i--;
			}else{
				BGlist.get(i).move(map);
			}
		}
		
	}
}
