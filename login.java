package swing;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

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

	public login() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 189, 434, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUser = new JLabel("user");
		lblUser.setBounds(33, 52, 46, 14);
		frame.getContentPane().add(lblUser);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(33, 108, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(142, 49, 101, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
				
		passwordField = new JPasswordField();
		passwordField.setBounds(142, 105, 101, 20);
		frame.getContentPane().add(passwordField);
				
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String a=textField.getText();
				@SuppressWarnings("deprecation")
				String b=passwordField.getText();
				
				if(a.equals("vishnu") && b.equals("1234")) {
					
					lblNewLabel.setText("successfull");
				}
				else
				{
					lblNewLabel.setText("not successfull");
				}			
			}
		});
		btnNewButton.setBounds(79, 155, 89, 23);
		frame.getContentPane().add(btnNewButton);		
	}
}
