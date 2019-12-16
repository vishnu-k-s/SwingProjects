package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class temp {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temp window = new temp();
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
	public temp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDegrees = new JLabel("Degrees");
		lblDegrees.setBounds(26, 51, 46, 14);
		frame.getContentPane().add(lblDegrees);
		
		textField = new JTextField();
		textField.setBounds(86, 45, 313, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel label = new JLabel("");
		label.setBounds(86, 113, 313, 14);
		frame.getContentPane().add(label);
		
		JButton btnToC = new JButton("To c");
		btnToC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String a=textField.getText();				
				float number=Float.valueOf(a);
				float c=(number-32)*5/9;
				String b=String.valueOf(c);
				label.setText("Result ="+b);
			
			}
		});
		
		btnToC.setBounds(26, 170, 89, 23);
		frame.getContentPane().add(btnToC);
		
		JButton btnToF = new JButton("To f");
		btnToF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String a=textField.getText();				
				float number=Float.valueOf(a);
				float c=(number*1.8f)+32;
				String b=String.valueOf(c);
				label.setText("Result ="+b);
			
			}
		});
		btnToF.setBounds(240, 170, 89, 23);
		frame.getContentPane().add(btnToF);
		
		
	}

}
