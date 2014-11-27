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
        
         JButton   game= new JButton("Start Game");
        game.setBounds(200,250,120,40);
	   //button.addActionListener(this);
        cPane.add(game);
		
		 JButton   highScores = new JButton("High Scores");
        highScores.setBounds(200,300,120,40);
	   //highScores.addActionListener(this);
        cPane.add(highScores);
		
		 JButton   quit= new JButton("Quit");
        quit.setBounds(200,350,120,40);
	   //quit.addActionListener(this);
        cPane.add(quit);
		
	}// ends slapsGame Method
	 
	public actionPerformed(ActionEvent e ){
		
	}
	
}// ends slapsGame class