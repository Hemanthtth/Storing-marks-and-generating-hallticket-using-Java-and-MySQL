import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class StudentFront extends JFrame {

	private JPanel contentPane;
	private JLabel l1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentFront frame = new StudentFront();
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
	
	public StudentFront() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 645);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		l1 = new JLabel(" ");
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		l1.setForeground(Color.RED);
		l1.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		l1.setBounds(63, 4, 133, 30);
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
		lblNewLabel_4.setBounds(721, 4, 112, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblUsn = new JLabel("USN :");
		lblUsn.setFont(new Font("Bradley Hand ITC", Font.BOLD, 15));
		lblUsn.setBounds(10, 10, 55, 19);
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
				StudentLogin li = new StudentLogin();
				dispose();
				li.setVisible(true);
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		btnLogout.setBackground(Color.BLACK);
		btnLogout.setBounds(20, 60, 85, 21);
		contentPane.add(btnLogout);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String usn = l1.getText();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectJava","root","");
					
					String sql = "SELECT * FROM student WHERE USN ='"+ usn +"';";
					Statement stmt=con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					
					if (rs.next())
					{
						String st_name = rs.getString(1); 
						String usn_id = rs.getString(2);
						 String st_email = rs.getString(3);
						 String st_gender = rs.getString(4);
						 //String mbl_no = rs.getString(5);
						 
						 

						 StudentPage std = new StudentPage();
						 dispose();
						 std.setVisible(true);
						 std.profile(st_name, usn_id, st_email, st_gender); 
						 std.mai_update(usn_id);
						 
						 
						 
					}
					 
					
					
				}
				catch(Exception e1) {System.out.println(e1);}
			}
		});
		btnProfile.setForeground(Color.WHITE);
		btnProfile.setFont(new Font("Book Antiqua", Font.PLAIN, 15));
		btnProfile.setBackground(Color.BLACK);
		btnProfile.setBounds(133, 49, 119, 40);
		contentPane.add(btnProfile);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(20, 147, 920, 202);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("bmccollage.jpg"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 920, 202);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3_1 = new JLabel("Department of Information Science And Engineering");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel_3_1.setBounds(228, 94, 475, 52);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnNewButton = new JButton("Download Hallticket");
		btnNewButton.addActionListener(new ActionListener() {
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
						 
						 
						 
						 Integer lm = Integer.valueOf(lia_m);
						 Integer la = Integer.valueOf(lia_a);
						 Integer jm = Integer.valueOf(java_m);
						 Integer ja = Integer.valueOf(java_a);
						 Integer dm = Integer.valueOf(dbms_m);
						 Integer da = Integer.valueOf(dbms_a);
						 Integer am = Integer.valueOf(ada_m);
						 Integer aa = Integer.valueOf(ada_a);
						 Integer um = Integer.valueOf(unix_m);
						 Integer ua = Integer.valueOf(unix_a);
						 
						 
						 
						 halltic hc = new halltic();
						 dispose(); 
						 String str = usn_id;
						 hc.setVisible(true);
						 hc.mai_update(str);
						 hc.eligible(lm, la, jm, ja, dm, da, am, aa, um, ua);
						 
			
						 
						 
					}
					
					
					
				}
				catch(Exception e1) {System.out.println(e1);}
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(52, 408, 170, 40);
		contentPane.add(btnNewButton);
		
		

	}

}
