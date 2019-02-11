import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CheckBoxPractice {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(300,200,500, 250);
		myFrame.setLayout(null);
		
		JLabel hourlyRate = new JLabel("Hourly Rate: ");
		hourlyRate.setBounds(50, 50, 100, 25);
		myFrame.add(hourlyRate);
		
		JLabel hoursPerWeek = new JLabel("Hours/Week: ");
		hoursPerWeek.setBounds(50, 75, 100, 25);
		myFrame.add(hoursPerWeek);
		
		JTextField hourlyText = new JTextField();
		hourlyText.setBounds(150, 50, 100, 25);
		myFrame.add(hourlyText);
		
		JTextField weekText = new JTextField();
		weekText.setBounds(150,75, 100, 25);
		myFrame.add(weekText);
		
		JLabel fin = new JLabel();
		fin.setBounds(200, 150, 200, 30);
		myFrame.add(fin);
		
		JCheckBox box = new JCheckBox("Full time");
		box.setBounds(50, 100, 150, 30);
		box.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e) 
				{
					double fullTime = Double.parseDouble(hourlyText.getText()) * 40 * 52;
					
					fin.setText("Full Time Wage $" + fullTime);
				}});
				
			
		
		myFrame.add(box);
		
		JButton button = new JButton("Calculate");
		button.setBounds(50, 150, 150, 30);
		
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				double calculation = Double.parseDouble(weekText.getText())*Double.parseDouble(hourlyText.getText()) * 52;
				
				fin.setText("Annual Rate: $" + calculation  );
				
			}
		});
		
		myFrame.add(button);
		
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
