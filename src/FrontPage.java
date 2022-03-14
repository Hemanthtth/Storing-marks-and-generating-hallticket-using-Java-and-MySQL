import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrontPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontPage frame = new FrontPage();
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
	public FrontPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 659);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Image img = new ImageIcon(this.getClass().getResource("bmsce.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 55, 963, 241);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BMS COLLAGE OF ENGINEERING , BENGALURU ");
		lblNewLabel_1.setForeground(new Color(240, 255, 240));
		lblNewLabel_1.setBackground(new Color(32, 178, 170));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 963, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CAMPUS PORTAL");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(233, 150, 122));
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.PLAIN, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 378, 173, 35);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(189, 183, 107));
		panel.setBounds(10, 547, 963, 65);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Student Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StudentLogin st = new StudentLogin();
				st.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		btnNewButton.setBounds(166, 459, 187, 35);
		contentPane.add(btnNewButton);
		
		JButton btnFacultyLogin = new JButton("Faculty Login");
		btnFacultyLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Login li = new Login();
				li.setVisible(true);
				
			}
		});
		btnFacultyLogin.setForeground(Color.WHITE);
		btnFacultyLogin.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		btnFacultyLogin.setBackground(new Color(0, 0, 128));
		btnFacultyLogin.setBounds(474, 459, 187, 35);
		contentPane.add(btnFacultyLogin);
		
		

	}

}
