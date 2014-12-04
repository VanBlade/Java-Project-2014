
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PlayerGame extends JFrame implements ActionListener{
	
	int slapDelay= 3000;
	int reactDelay= 2000;
	JButton move;
	Timer reactTimer;
	Timer slapTimer;
	boolean dodgeStatus= false;	
	ImageIcon handsImage;
	ImageIcon hitImage;
	ImageIcon attackImage;
	JLabel imageLabel;
		
	public PlayerGame(){

		Container cPane;
        
        cPane = getContentPane();
        cPane.setLayout(null);
        
		setSize(500,300);
		setResizable(false);
        setLocation(250,200);
        setTitle("Game Start");
        
        handsImage = new ImageIcon("DefaultHands.png");
      	hitImage = new ImageIcon("HitHands.png");
      	attackImage = new ImageIcon("AttackHands.png");
       		 
     
        JLabel imageLabel = new JLabel(handsImage);
        imageLabel.setBounds(0,50,500,200);
        cPane.add(imageLabel);
        
        move= new JButton("Ready?");
        move.setBounds(200,200,120,40);
        move.addActionListener(this);
        
 		cPane.add(move);
 		
 		slapTimer = new Timer(slapDelay,this);
        reactTimer = new Timer(reactDelay,this);
		slapTimer.start();
		


	}
	
	public void actionPerformed(ActionEvent e){

		if(e.getSource()==slapTimer){
		dodgeStatus =true;
		move.setText("DODGE!!");
		reactTimer.start();
		slapTimer.stop();
	   	imageLabel.setIcon(attackImage);
		
		}// ends if
		
		if(e.getSource()==reactTimer){
		 move.setText("Game Over");
		 reactTimer.stop();
		 slapTimer.stop();
		 move.removeActionListener(this);
		 imageLabel.setIcon(hitImage);
		
		}//ends if
		
	   	if(e.getSource()==move){
	 	  	if(dodgeStatus ==true ){
			slapTimer.restart();
			reactTimer.stop();
			move.setText("Ready?");
			dodgeStatus =false;	
			imageLabel.setIcon(handsImage);
		
	 	  	}
			else{
			 move.setText("Game Over");
			 reactTimer.stop();
		 	 slapTimer.stop();
		 	 move.removeActionListener(this);
		 	  	imageLabel.setIcon(hitImage);
			}
	   	
	   	}// ends if 
	   	 
	}// ends ActionPerformed 
	
	
}// ends Class