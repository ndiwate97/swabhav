package com.techlab.frame;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistrationForm {

	public JPanel getRegistrationForm() {
		
		JPanel panel = new JPanel();
		JLabel headLabel = new JLabel("Registration Form");
		
		JLabel fName = new JLabel("Enter First Name : ");
		JTextField fNameInfo = new JTextField(5);
		
		JLabel lName = new JLabel("Enter Last Name :");
		JTextField lNameInfo = new JTextField(5);
		
		JLabel profileLabel = new JLabel("Profile");
		String profiles[] = { "Sw developer", "Tester", "Analyst" }; 
		JComboBox profile = new JComboBox(profiles);
		
		JButton submit = new JButton("Submit");
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new welcomeDialogue(fNameInfo.getText()+" "+lNameInfo.getText());
			}
		});
		
		
		panel.add(headLabel);
		panel.add(fName);
		panel.add(fNameInfo);
		panel.add(lName);
		panel.add(lNameInfo);
		panel.add(profileLabel);
		panel.add(profile);
		panel.add(submit);
		
		return panel;
	}

}
