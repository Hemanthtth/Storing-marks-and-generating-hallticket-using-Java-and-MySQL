import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class AccessGenera extends JFrame {

	private JPanel contentPane;
	private JLabel l1;
	private JTextField usnT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccessGenera frame = new AccessGenera();
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
	public AccessGenera() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 959, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		l1 = new JLabel("BMSCE");
		l1.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		l1.setForeground(Color.BLUE);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(73, 4, 81, 28);
		contentPane.add(l1);
		
		JLabel lblNewLabel_3 = new JLabel(".BMSCE");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_3.setBounds(826, 10, 119, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Campus");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(714, 4, 112, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("Faculty :");
		lblNewLabel.setFont(new Font("Bradley Hand ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 10, 68, 19);
		contentPane.add(lblNewLabel);
		

		
		JLabel lblNewLabel_1 = new JLabel("Department of Information Science and Engineering");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		lblNewLabel_1.setBackground(new Color(102, 204, 0));
		lblNewLabel_1.setBounds(10, 31, 309, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				RegMenu rg = new RegMenu();
				String str = l1.getText();
				rg.setVisible(true);
				rg.my_update(str);
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(10, 58, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Login li = new Login();
				li.setVisible(true);
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		btnLogout.setBackground(Color.BLACK);
		btnLogout.setBounds(126, 58, 85, 21);
		contentPane.add(btnLogout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(66, 176, 818, 403);
		contentPane.add(panel);
		panel.setLayout(null);
		
		usnT = new JTextField();
		usnT.setBounds(89, 10, 145, 26);
		panel.add(usnT);
		usnT.setHorizontalAlignment(SwingConstants.CENTER);
		usnT.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("USN");
		lblNewLabel_2.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(34, 17, 45, 19);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 263, 51);
		panel.add(panel_1);
		
		JLabel lblNewLabel_5 = new JLabel("Student Name");
		lblNewLabel_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(43, 163, 139, 26);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Email ");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_1.setBackground(Color.WHITE);
		lblNewLabel_5_1.setBounds(43, 237, 139, 26);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Gender");
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_5_1_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_1_1.setBackground(Color.WHITE);
		lblNewLabel_5_1_1.setBounds(43, 316, 139, 26);
		panel.add(lblNewLabel_5_1_1);
		
		JLabel name = new JLabel("");
		name.setOpaque(true);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		name.setBackground(new Color(95, 158, 160));
		name.setBounds(277, 163, 139, 26);
		panel.add(name);
		
		JLabel email = new JLabel("");
		email.setOpaque(true);
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setForeground(Color.WHITE);
		email.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		email.setBackground(new Color(95, 158, 160));
		email.setBounds(277, 237, 263, 26);
		panel.add(email);
		
		JLabel gender = new JLabel("");
		gender.setOpaque(true);
		gender.setHorizontalAlignment(SwingConstants.CENTER);
		gender.setForeground(Color.WHITE);
		gender.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		gender.setBackground(new Color(95, 158, 160));
		gender.setBounds(277, 316, 139, 26);
		panel.add(gender);
		
		JLabel lblNewLabel_5_2 = new JLabel("USN");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2.setBackground(Color.WHITE);
		lblNewLabel_5_2.setBounds(43, 91, 139, 26);
		panel.add(lblNewLabel_5_2);
		
		JLabel usnidh = new JLabel("");
		usnidh.setOpaque(true);
		usnidh.setHorizontalAlignment(SwingConstants.CENTER);
		usnidh.setForeground(Color.WHITE);
		usnidh.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		usnidh.setBackground(new Color(95, 158, 160));
		usnidh.setBounds(277, 91, 139, 26);
		panel.add(usnidh);
		
		JButton btnNewButton_1 = new JButton("Go");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String usnid = usnT.getText();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectJava","root","");
					
					if (usnid.length() == 10)
					{

						
						String sql = "SELECT * FROM student WHERE USN = '"+ usnid + "';";
						Statement stmt=con.createStatement();
						ResultSet rs = stmt.executeQuery(sql);
						
						if (rs.next())
						{
							String st_name = rs.getString(1); 
							String usn_id = rs.getString(2);
							 String st_email = rs.getString(3);
							 String st_gender = rs.getString(4);
							 //String mbl_no = rs.getString(5);
							 
							 usnidh.setText(usn_id);
							 name.setText(st_name);
							 email.setText(st_email);
							 gender.setText(st_gender);
							// mblno.setText(mbl_no);
							 

									 
							 
							 
							 
						}
						else {
							JOptionPane.showMessageDialog(null,"  USN not registered ");
							
							usnT.setText("");
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"  Invalid USN  ");
					}
					
				}
				catch(Exception e1) {System.out.println(e1);}

				

				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		btnNewButton_1.setBounds(293, 12, 67, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Academic Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String str = l1.getText();
				String myusn = usnT.getText();
				AccAce ac = new AccAce();
				ac.setVisible(true);
				ac.mai_update(str);
				ac.mai_usn(myusn);
				
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		btnNewButton_2.setBounds(616, 367, 145, 26);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("RESET");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usnT.setText("");
				usnidh.setText(" ");
				name.setText("");
				email.setText("");
				gender.setText("");
			}
		});
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		btnNewButton_2_1.setBackground(Color.BLUE);
		btnNewButton_2_1.setBounds(502, 367, 81, 26);
		panel.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Department of Information Science And Engineering");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel_3_1.setBounds(242, 120, 475, 52);
		contentPane.add(lblNewLabel_3_1);
	}
}
