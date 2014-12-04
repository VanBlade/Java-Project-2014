import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class slapsGame extends JFrame implements ActionListener{

	public static void main (String arg[]){
	 slapsGame menu = new slapsGame();
	 menu.setVisible(true);

	}// ends main 
	public slapsGame(){ 
		Container cPane;
		
		setSize(500,500);
		setTitle("Main Menu");
		setResizable(false);
		setLocation(650,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cPane = getContentPane();
        cPane.setLayout(null);
        

        JLabel	imageLabel = new JLabel(new ImageIcon("TitleImage.png"));
        imageLabel.setBounds(0,50,500,200);
        cPane.add(imageLabel);
        
         JButton   game= new JButton("Start Game");
        game.setBounds(200,250,120,40);
	   game.addActionListener(this);
        cPane.add(game);
		
		 JButton   highScores = new JButton("High Scores");
        highScores.setBounds(200,300,120,40);
	   highScores.addActionListener(this);
        cPane.add(highScores);
		
		 JButton   quit= new JButton("Quit");
        quit.setBounds(200,350,120,40);
	   quit.addActionListener(this);
        cPane.add(quit);
       /* JLabel gameTitle= new JLabel("AJAOPAPO");
        gameTitle.setBounds(200,100,100,40);
        cPane.add(gameTitle);*/
        
       
		
	}// ends slapsGame Method
	 
	public void actionPerformed(ActionEvent e ){
	
	String  buttonName;
    buttonName = e.getActionCommand();
    
    if (buttonName.equals("Quit")) {
           System.exit(0);
    }else if(buttonName.equals("High Scores" )){
    	displayHighScore();	
    }else if (buttonName.equals("Start Game")){
    playGame();
    }// ends if else statements
		
	}// ends actionPerformed method
	public void displayHighScore()
	{
		
	}
	public void playGame(){
		PlayerGame game = new PlayerGame();
    	game.setVisible(true);
	}
}// ends slapsGame class