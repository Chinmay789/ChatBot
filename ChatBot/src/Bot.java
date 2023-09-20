import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame{
	private JTextArea Chatarea=new JTextArea();
	private JTextField chatbot= new JTextField();
	
	
	public Bot() {
	JFrame frame=new JFrame();
	frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setLayout(null);
	frame.setSize(600, 600);
	frame.setTitle("ChatBot");
	frame.add(Chatarea);
	frame.add(chatbot);
	// for textarea
	
	Chatarea.setSize(500,400);
	Chatarea.setLocation(2,2);
	
	//for TextField
	
	chatbot.setSize(540,30);
	chatbot.setLocation(2,500);
	
	chatbot.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String gtext = chatbot.getText().toLowerCase();
			Chatarea.append("YOU ->"+ gtext+"\n");
			chatbot.setText("");
			if(gtext.contains("hi")) {
				bot("Welcome");
			}else {
				int rand=(int)(Math.random()*3+1);
				if(rand==1) {
					bot("I DONT UNDERSTAND YOU");
				}else if(rand==2) {
					bot("I DONT UNDERSTAND YOU BRO");
				}else if(rand==3) {
					bot("Please Come Again");
				}
				
			}
			if(gtext.contains("how")) {
				bot("Welcome");
			}else {
				int rand=(int)(Math.random()*3+1);
				if(rand==1) {
					bot("I CANNOT ANSWER YOUR QUESTION");
				}else if(rand==2) {
					bot("SORRY! I DONT KNOW THE ANSWER");
				}else if(rand==3) {
					bot("Please Come Again");
				}
				
			}
		}
		
	});
	}
	
	private void bot(String string) {
		Chatarea.append("BOT->"+string+"\n");
	}
	
	
public static void main(String args[]) {
	new Bot();
}
}
