import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUILogIn {
	public static void main(String args[])
	{
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setLayout(null); //something with rows and colums
		
		JLabel label = new JLabel("User:");
		label.setBounds(10, 20, 80, 25); //x, y position and then, width, height
		panel.add(label);
		
	}
}
