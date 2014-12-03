
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayerGame extends JFrame implements ActionListener{
	
	int slapDelay= 3000;
	int reactDelay= 2000;
	JButton move;
	Timer reactTimer;
	Timer slapTimer;
	public PlayerGame(){
		
		Container cPane;
        
        cPane = getContentPane();
        cPane.setLayout(null);
        
		setSize(500,300);
		setResizable(false);
        setLocation(250,200);
        setTitle("Game Start");
        
        move= new JButton("Ready?");
        move.setBounds(200,200,120,40);
        move.addActionListener(this);
        
 		cPane.add(move);
 		
 		slapTimer = new Timer(slapDelay,this);
        reactTimer = new Timer(reactDelay,this);
		slapTimer.start();

	}// ends constructor
	
	public void actionPerformed(ActionEvent e){
  		String  buttonName;
        buttonName = e.getActionCommand(); 
		if(e.getSource()==slapTimer){
		move.setText("DODGE!!");
		reactTimer.start();
		slapTimer.stop();
		}
		
		if(e.getSource()==reactTimer){
		 move.setText("Game Over");
		 reactTimer.stop();
		 slapTimer.stop();
		}
		
	   	if(e.getSource()==move){	
		slapTimer.restart();
		reactTimer.stop();
		move.setText("Ready?");
		
	   	}
	   	
	   	 if(buttonName.equals("Ready?")){
		 move.setText("Game Over");
		 reactTimer.stop();
		 slapTimer.stop();
		}
	}
	
	
}// ends Class