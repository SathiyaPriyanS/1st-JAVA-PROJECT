package view.HR;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;

import javax.swing.*;

import controller.UserController;



public class ViewUser{
	JFrame frame = new JFrame("VIEW USER");
	UserController usercontroller;

	ViewUser() throws ClassNotFoundException, SQLException {
		
		JTextField tUserId = new JTextField("ENTER USER ID");
		tUserId.setBounds(100, 30, 200, 30);
		frame.add(tUserId);
		tUserId.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if(tUserId.getText().equals("ENTER USER ID")) {
					tUserId.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(tUserId.getText().equals("")) {
					tUserId.setText("ENTER USER ID");
				}
			}

	    });


		
		JButton bSubmit = new JButton("VIEW USER");
		bSubmit.setBounds(100, 70, 200, 30);
		frame.add(bSubmit);
		usercontroller = new UserController();
		bSubmit.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int EID;
				EID =Integer.parseInt(tUserId.getText());
				usercontroller.viewUser(EID);
			}
		});
		
		JButton bCancel = new JButton("CANCEL");
		bCancel.setBounds(100,110, 200, 30);
		frame.add(bCancel);
		bCancel.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent e) {
				 frame.dispose();
			 }
				 	 });
		
		
		frame.setBounds(440,200,450,200);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
	}
}
