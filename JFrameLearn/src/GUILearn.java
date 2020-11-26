import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUILearn implements ActionListener {
	
	int count = 0;
	JLabel label;
	
	public GUILearn()
	{
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Click Me");
		
		button.addActionListener(this);
		
		label = new JLabel("Number of Clicks: 0");
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 0)); //height, length, left, right
		panel.setLayout(new GridLayout(0, 1)); //rows and colums
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("USER INTERFACE");
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String args[])
	{
		new GUILearn();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label.setText("Number of Clicks: " + count);
		
		
	}
}
