import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class StudentLogin extends JFrame {

	private JPanel contentPane;
	private JTextField usn;
	private JLabel lblBmsFacultyLogin;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentLogin frame = new StudentLogin();
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
	public StudentLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 672);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usn = new JTextField();
		usn.setColumns(10);
		usn.setBounds(71, 381, 281, 32);
		contentPane.add(usn);
		
		JLabel lblNewLabel_1 = new JLabel("USN");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_1.setBackground(new Color(95, 158, 160));
		lblNewLabel_1.setBounds(71, 361, 111, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_2.setBackground(new Color(95, 158, 160));
		lblNewLabel_2.setBounds(71, 462, 154, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("StudentLogin.png"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(425, 10, 528, 615);
		contentPane.add(lblNewLabel);
		
		lblBmsFacultyLogin = new JLabel("BMS Student Login");
		lblBmsFacultyLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblBmsFacultyLogin.setForeground(Color.DARK_GRAY);
		lblBmsFacultyLogin.setFont(new Font("Bookman Old Style", Font.PLAIN, 23));
		lblBmsFacultyLogin.setBackground(Color.DARK_GRAY);
		lblBmsFacultyLogin.setBounds(10, 215, 356, 25);
		contentPane.add(lblBmsFacultyLogin);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				FrontPage fr = new FrontPage();
				fr.setVisible(true);
			}
		});
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		btnHome.setBackground(new Color(0, 0, 128));
		btnHome.setBounds(10, 10, 95, 35);
		contentPane.add(btnHome);
		
		JButton btnNewButton = new JButton("Sign-in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectJava","root","");
					Statement stmt=con.createStatement();
					
					String sql = "select * from student_login where usn='"+ usn.getText()+"' and Password='"+ pass.getText().toString() +"' ";
					
					
					
					ResultSet rs = stmt.executeQuery(sql);
					
					if(rs.next())
					{
						String str = usn.getText();
						dispose();
						StudentFront std = new StudentFront();
						std.setVisible(true);
						std.mai_update(str);
					
					}	           
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect username or password..");
					}
						
						
							
				}
				catch(Exception e1) {System.out.println(e1);}
			}
		});
		btnNewButton.setForeground(new Color(245, 255, 250));
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(0, 0, 205));
		btnNewButton.setBounds(110, 553, 180, 32);
		contentPane.add(btnNewButton);
		
		pass = new JPasswordField();
		pass.setBounds(71, 481, 281, 32);
		contentPane.add(pass);
		
		JLabel lblNewLabel_3 = new JLabel("Forgot password");
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setBounds(71, 511, 111, 21);
		contentPane.add(lblNewLabel_3);
		
		
//		JLabel lblNewLabel = new JLabel("");
//		ImageIcon img = new ImageIcon(this.getClass().getResource("image1.png"));
//		lblNewLabel.setIcon(img);
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setBounds(385, 29, 208, 118);
//		contentPane.add(lblNewLabel);
	}
}
