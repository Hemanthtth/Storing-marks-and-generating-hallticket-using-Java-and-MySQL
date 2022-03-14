import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class StudentPage extends JFrame {

	private JPanel contentPane;
	private JLabel dept;
	private JLabel name_1;
	private JLabel usn_1;
	private JLabel email_1;
	private JLabel gender_1;
	private JLabel l1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentPage frame = new StudentPage();
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
	
    public void mai_update(String str) {
    	
        l1.setText(str);
    }
    
    public void profile(String name , String usn , String email , String gender)
    {
    	name_1.setText(name);
    	usn_1.setText(usn);
    	email_1.setText(email);
    	gender_1.setText(gender);
    }

	
	public StudentPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 654);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		l1 = new JLabel(" ");
		l1.setForeground(Color.RED);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		l1.setBounds(59, 2, 133, 30);
		contentPane.add(l1);
		
		JLabel lblNewLabel_3 = new JLabel(".BMSCE");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_3.setBounds(832, 10, 119, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Campus");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(720, 4, 112, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblUsn = new JLabel("USN :");
		lblUsn.setFont(new Font("Bradley Hand ITC", Font.BOLD, 15));
		lblUsn.setBounds(10, 10, 68, 19);
		contentPane.add(lblUsn);
		

		
		JLabel lblNewLabel_1 = new JLabel("Department of Information Science and Engineering");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		lblNewLabel_1.setBackground(new Color(102, 204, 0));
		lblNewLabel_1.setBounds(10, 31, 309, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				StudentLogin li = new StudentLogin();
				li.setVisible(true);
				
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		btnLogout.setBackground(Color.BLACK);
		btnLogout.setBounds(20, 55, 85, 21);
		contentPane.add(btnLogout);
		
		dept = new JLabel("Department of Information Science And Engineering");
		dept.setForeground(Color.WHITE);
		dept.setOpaque(true);
		dept.setBackground(new Color(128, 0, 128));
		dept.setHorizontalAlignment(SwingConstants.CENTER);
		dept.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		dept.setBounds(251, 133, 475, 52);
		contentPane.add(dept);
		
		JLabel lblNewLabel = new JLabel("Name : ");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblNewLabel.setBounds(133, 278, 85, 29);
		contentPane.add(lblNewLabel);
		
		name_1 = new JLabel("hey");
		name_1.setForeground(Color.BLUE);
		name_1.setHorizontalAlignment(SwingConstants.CENTER);
		name_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		name_1.setBounds(228, 278, 264, 29);
		contentPane.add(name_1);
		
		JLabel lblUsn_1 = new JLabel("USN :");
		lblUsn_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblUsn_1.setBounds(133, 362, 85, 29);
		contentPane.add(lblUsn_1);
		
		usn_1 = new JLabel("hey");
		usn_1.setForeground(Color.BLUE);
		usn_1.setHorizontalAlignment(SwingConstants.CENTER);
		usn_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		usn_1.setBounds(228, 362, 264, 29);
		contentPane.add(usn_1);
		
		JLabel lblEmail = new JLabel("EMAIL :");
		lblEmail.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblEmail.setBounds(133, 441, 85, 29);
		contentPane.add(lblEmail);
		
		email_1 = new JLabel("hey");
		email_1.setForeground(Color.BLUE);
		email_1.setHorizontalAlignment(SwingConstants.CENTER);
		email_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		email_1.setBounds(228, 441, 334, 29);
		contentPane.add(email_1);
		
		JLabel lblGender = new JLabel("GENDER :");
		lblGender.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblGender.setBounds(129, 519, 112, 29);
		contentPane.add(lblGender);
		
		gender_1 = new JLabel("hey");
		gender_1.setForeground(Color.BLUE);
		gender_1.setHorizontalAlignment(SwingConstants.CENTER);
		gender_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		gender_1.setBounds(251, 519, 225, 29);
		contentPane.add(gender_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String str = l1.getText();
				StudentFront fr = new StudentFront();
				fr.setVisible(true);
				fr.mai_update(str);
				
				
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(133, 54, 85, 21);
		contentPane.add(btnBack);
		
		JButton btnAcedemicDetails = new JButton("Acedemic Details");
		btnAcedemicDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String usnid = l1.getText();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectJava","root","");
					
					String sql = "SELECT * FROM academic WHERE USN = '"+ usnid + "';";
					Statement stmt=con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					
					if (rs.next())
					{
						 
						 String usn_id = rs.getString(1);
						 String lia_m = rs.getString(2);
						 String lia_a = rs.getString(3);
						 String java_m = rs.getString(4);
						 String java_a = rs.getString(5);
						 String dbms_m = rs.getString(6);
						 String dbms_a = rs.getString(7);
						 String ada_m = rs.getString(8);
						 String ada_a = rs.getString(9);
						 String unix_m = rs.getString(10);
						 String unix_a = rs.getString(11);
						 
						 
						 
						 StudentAce ac = new StudentAce();
						 
						 dispose();
						 
						 String str = usnid;
						 
						 ac.setVisible(true);
						 ac.academics(usn_id, lia_m, lia_a, java_m, java_a, dbms_m, dbms_a, ada_m, ada_a, unix_m, unix_a);
						 ac.mai_update(str);
						 
			
						 
						 
					}
					
					
					
				}
				catch(Exception e1) {System.out.println(e1);}
				
			}
		});
		btnAcedemicDetails.setForeground(Color.WHITE);
		btnAcedemicDetails.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		btnAcedemicDetails.setBackground(Color.BLACK);
		btnAcedemicDetails.setBounds(792, 543, 133, 30);
		contentPane.add(btnAcedemicDetails);
	}
}
