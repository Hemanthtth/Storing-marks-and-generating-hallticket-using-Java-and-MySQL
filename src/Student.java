import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BMS Student Login");
		lblNewLabel.setBackground(UIManager.getColor("Button.focus"));
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(10, 10, 195, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student USN");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(153, 81, 105, 25);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(121, 116, 181, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.setForeground(new Color(245, 255, 250));
		btnNewButton_2.setBackground(new Color(0, 0, 205));
		btnNewButton_2.setBounds(173, 186, 85, 32);
		contentPane.add(btnNewButton_2);
		
		JButton btnFaculty = new JButton("Faculty Login");
		btnFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login li = new Login();
				li.setVisible(true);
			}
		});
		btnFaculty.setFont(new Font("Bahnschrift", Font.PLAIN, 8));
		btnFaculty.setForeground(Color.WHITE);
		btnFaculty.setBackground(Color.BLACK);
		btnFaculty.setBounds(330, 22, 85, 32);
		contentPane.add(btnFaculty);
	}
}
