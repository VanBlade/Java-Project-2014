//This class Rolls a hand for a Player 
//import java.util.Random;
public class RollHand{
	private int dice1;
	private int dice2;
	private int dice3;
	private int dice4;
	private int dice5;
	
	public RollHand(){
		this(0,0,0,0,0);
	}
		
	public RollHand(int dice1,int dice2,int dice3,int dice4,int dice5)
	{
	}
	public int getDice1(){return dice1;}
	public int getDice2(){return dice2;}
	public int getDice3(){return dice3;}
	public int getDice4(){return dice4;}
	public int getDice5(){return dice5;}
	
	public void createHand(){
	Random random = new Random();
	dice1=random.nextInt(5);
	dice2=random.nextInt(5);
	dice3=random.nextInt(5);
	dice4=random.nextInt(5);
	dice5=random.nextInt(5);	
	}
		
	}// ends RollHandClass
