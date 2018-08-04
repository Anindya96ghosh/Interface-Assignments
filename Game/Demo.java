//Test class
public class Demo{
	 public static void perform(Game game)
		{
			game.play();
			
		}
 public static void main(String args[])
 {
	 
	 Game game[]=new Game[3];//an array of object is created of reference type Game
	 game[0]=new Cricket();
	 game[1]=new Football();
	 game[2]=new Tennis();
	 
	 for(int i=0;i<3;i++)
	 {
		perform(game[i]);
	 }
 }
	
}
