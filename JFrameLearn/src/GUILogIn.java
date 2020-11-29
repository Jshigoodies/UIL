import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/*
 * thing to take note is abstract is to make empty methods for a class so when a child class extends the parent class, they have to fill in that method
 * another thing to take note is implements is where a class has methods but they are all empty, so you have to fill them out regardless
 */

public class GUILogIn implements ActionListener{
	
	private static JPanel panel;
	private static JFrame frame;
	private static JLabel userLabel;
	private static JLabel passwordLabel;    //global variables
	private static JTextField userText;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	public static void main(String args[])
	{
		panel = new JPanel(); //i think it's an empty box to work in
		frame = new JFrame(); //literally like a picture frame for the empty box
		frame.setSize(350, 200); //sets the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);
		
		panel.setLayout(null); //something with rows and colums
		
		userLabel = new JLabel("User:");
		userLabel.setBounds(10, 20, 80, 25); //x, y position and then, width, height
		panel.add(userLabel);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 50, 80, 25); //x, y position and then, width, height
		panel.add(passwordLabel);
		
		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25); //x, y position and then, width, height
		panel.add(userText);
		
		passwordText = new JPasswordField(); //it puts ******* instead of actual characters
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		panel.add(button);
		
		button.addActionListener(new GUILogIn()); //new class object that goes to the actionPerformed method
		
		
		//When I log in successfully
		
		success = new JLabel("");
		success.setBounds(10, 110, 200, 25);
		panel.add(success);
		
		
		
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String user = userText.getText();
		String password = passwordText.getText(); //it gets crossed out becase java doesn't use this anymore or some other reason, but it still works
		
		System.out.println(user + ", " + password);
		//System.out.println("hi");
		
		if(user.equals("Jshi") && password.equals("123")) 
		{
			success.setText("LOGIN SUCCESSFUL");		
		}
		else
		{
			success.setText("");
		}
	}
}
