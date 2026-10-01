package fundamentosjavaloops;
/**
 * imagine the following scenario:
 * In a game, a intelligent monster
 * need to launch an attack depending on 
 * the distance between the player 
 * and itself,
 * and also its heath state.
 * 
 * 
 * @author sergio
 *25 sept 2026
 */
public class WhileLoop1{
	
	public static void main(String[] args) {
		int distance = 20;
		int hp = 400;
		final int MAX_HP= 1000;
		boolean isRunning = true;
		while(isRunning) {
			if(distance < 20) {
				if(hp > MAX_HP / 2) {
					System.out.println("attack");
//					continue;
				}
				else {
					System.out.println("Have a break");
				}
			}
			else {// si no, o sea "distance >= 20"
				System.out.println("I am going to sleep");
			}
			break;
		}
	}
}
