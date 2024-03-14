package employee;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 128, 128));
		frame.getContentPane().setBackground(new Color(255, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(181, 22, 77, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(87, 74, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(87, 159, 93, 0);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_3.setBounds(56, 134, 77, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(172, 71, 127, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String password=p1.getText();
				//JOptionPane.showMessageDialog(btnNewButton,"name "+name+"\n password "+password  );
				if(name.equals("anu")&& password.equals("227"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "valid user");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "invalid user");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setForeground(new Color(0, 0, 64));
		btnNewButton.setBounds(172, 193, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		p1 = new JPasswordField();
		p1.setBounds(172, 128, 127, 20);
		frame.getContentPane().add(p1);
	}
}
