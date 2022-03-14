import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	public JTextField user;
	private JPasswordField pass;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 665);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user = new JTextField();
		user.setHorizontalAlignment(SwingConstants.CENTER);
		user.setBounds(85, 337, 281, 32);
		contentPane.add(user);
		user.setColumns(10);
		
		
		pass = new JPasswordField();
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setBounds(85, 417, 281, 32);
		contentPane.add(pass);
		
		JButton btnNewButton = new JButton("Sign-in");
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(0, 0, 205));
		btnNewButton.setForeground(new Color(245, 255, 250));
		btnNewButton.setBounds(113, 504, 180, 32);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
               // String str=user.getText();  read the JTextFeild t1 data
               // Second obj= new Second();// obj created for class Second()
               // obj.my_update(str);  Execute the method my_update to pass str
				
				try {
					RegMenu re = new RegMenu();
					//Insert in  = new Insert();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectJava","root","");
					Statement stmt=con.createStatement();
					
					String sql="select * from tblogin where Username='"+user.getText()+"' and Password='"+ pass.getText().toString()+"'  ";
					
					ResultSet rs = stmt.executeQuery(sql);
					
					if(rs.next())
					{
						dispose();
						String str=user.getText(); // read the JTextFeild t1 data
						re.my_update(str);
						//in.my_update(str);
						//in.setVisible(true);
						re.setVisible(true);
					}	           
					else
						JOptionPane.showMessageDialog(null,"Incorrect username or password..");
						
					con.close();

				}catch(Exception e1) {System.out.println(e1);}
				

			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblBmsFacultyLogin = new JLabel("BMS Faculty Login");
		lblBmsFacultyLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblBmsFacultyLogin.setForeground(Color.DARK_GRAY);
		lblBmsFacultyLogin.setFont(new Font("Bookman Old Style", Font.PLAIN, 23));
		lblBmsFacultyLogin.setBackground(Color.DARK_GRAY);
		lblBmsFacultyLogin.setBounds(41, 166, 356, 25);
		contentPane.add(lblBmsFacultyLogin);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("imageFront.jpg"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(384, 10, 514, 608);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Passcode");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		lblNewLabel_2.setBackground(new Color(95, 158, 160));
		lblNewLabel_2.setBounds(85, 397, 111, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_1.setBackground(new Color(95, 158, 160));
		lblNewLabel_1.setBounds(85, 316, 111, 21);
		contentPane.add(lblNewLabel_1);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FrontPage fp = new FrontPage();
				fp.setVisible(true);
			}
		});
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		btnHome.setBackground(new Color(0, 0, 128));
		btnHome.setBounds(9, 10, 95, 35);
		contentPane.add(btnHome);
		
		
//		JLabel lblNewLabel = new JLabel("");
//		ImageIcon img = new ImageIcon(this.getClass().getResource("image1.png"));
//		lblNewLabel.setIcon(img);
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setBounds(385, 29, 208, 118);
//		contentPane.add(lblNewLabel);
		
	}
}
