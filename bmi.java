package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class bmi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmi window = new bmi();
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
	public bmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setForeground(Color.GREEN);
		panel.setBounds(10, 11, 597, 46);
		frame.getContentPane().add(panel);
		
		JLabel lblBodyMassIndex = new JLabel("Body Mass Index");
		lblBodyMassIndex.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblBodyMassIndex.setForeground(Color.RED);
		panel.add(lblBodyMassIndex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setForeground(Color.YELLOW);
		panel_1.setBounds(8, 68, 599, 229);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(215, 56, 243, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 107, 243, 20);
		textField_1.setColumns(10);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Height(m)");
		lblNewLabel.setBounds(49, 59, 130, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Weight(kg)");
		lblNewLabel_1.setBounds(49, 113, 117, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(387, 161, 182, 14);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			float a=Float.parseFloat(textField.getText());
			float b=Float.parseFloat(textField_1.getText());
			float bmi=b/(a*a);
			String st=String.valueOf((bmi));
			textField_2.setText(st);
			String r=" ";
			
			if(bmi<=18.5f)
			{
				r="under weight";
			}
			else if(bmi>18.5f && bmi<=25f)
			{
				
				r="NOrmal weight";
			}
			else if(bmi>25f && bmi<=29f)
			{
				
				r="over weight";
			}	
			else
			{
				r="obese";
			}
			
			lblNewLabel_3.setText(r);
			
			}
			
		});
		btnNewButton.setBounds(265, 198, 89, 20);
		panel_1.add(btnNewButton);
		
		
		JLabel lblNewLabel_2 = new JLabel("BMI");
		lblNewLabel_2.setBounds(130, 161, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				lblNewLabel_3.setText(" ");
				
			}
		});
		btnNewButton_1.setBounds(369, 198, 89, 20);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBounds(480, 198, 89, 20);
		panel_1.add(btnNewButton_2);
		
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(238, 158, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(10, 308, 597, 83);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBounds(298, 5, 0, 0);
		panel_2.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(201, 34, 1, 1);
		panel_2.add(table_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Underweight", "Normal weight", "Overweight", "Obese"},
				{"<18.5", "18.5to 24.9", "25to29.9 ", ">30"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table_2.setBounds(10, 16, 564, 32);
		panel_2.add(table_2);
	}
}
