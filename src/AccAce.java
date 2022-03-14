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
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AccAce extends JFrame {

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
					AccAce frame = new AccAce();
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
    public void mai_usn(String str)
    {
    	usnT.setText(str);
    }
	
	public AccAce() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 987, 734);
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
		lblNewLabel_3.setBounds(854, 10, 119, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Campus");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(743, 4, 112, 40);
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
				String str = l1.getText();
				RegMenu rg = new RegMenu();
				rg.setVisible(true);
				rg.my_update(str);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(10, 60, 85, 21);
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
		btnLogout.setBounds(116, 60, 85, 21);
		contentPane.add(btnLogout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(87, 174, 796, 496);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 263, 51);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		usnT = new JTextField();
		usnT.setHorizontalAlignment(SwingConstants.CENTER);
		usnT.setBounds(82, 10, 160, 31);
		panel_1.add(usnT);
		usnT.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("USN");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(28, 17, 45, 24);
		panel_1.add(lblNewLabel_2);
		
		
		JLabel usnidh = new JLabel("");
		usnidh.setOpaque(true);
		usnidh.setHorizontalAlignment(SwingConstants.CENTER);
		usnidh.setForeground(Color.WHITE);
		usnidh.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		usnidh.setBackground(new Color(95, 158, 160));
		usnidh.setBounds(601, 10, 139, 26);
		panel.add(usnidh);
		
		JLabel lblNewLabel_5_2 = new JLabel("USN");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2.setBackground(Color.WHITE);
		lblNewLabel_5_2.setBounds(450, 10, 139, 26);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("LIA Marks");
		lblNewLabel_5_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2_1.setForeground(Color.WHITE);
		lblNewLabel_5_2_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2_1.setBackground(Color.WHITE);
		lblNewLabel_5_2_1.setBounds(30, 106, 139, 26);
		panel.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_2_2 = new JLabel("LIA Attendance");
		lblNewLabel_5_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2_2.setForeground(Color.WHITE);
		lblNewLabel_5_2_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2_2.setBackground(Color.WHITE);
		lblNewLabel_5_2_2.setBounds(450, 106, 139, 26);
		panel.add(lblNewLabel_5_2_2);
		
		JLabel lblNewLabel_5_2_3 = new JLabel("JAVA Marks");
		lblNewLabel_5_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2_3.setForeground(Color.WHITE);
		lblNewLabel_5_2_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2_3.setBackground(Color.WHITE);
		lblNewLabel_5_2_3.setBounds(30, 162, 139, 26);
		panel.add(lblNewLabel_5_2_3);
		
		JLabel lblNewLabel_5_2_4 = new JLabel("JAVA Attendance");
		lblNewLabel_5_2_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2_4.setForeground(Color.WHITE);
		lblNewLabel_5_2_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2_4.setBackground(Color.WHITE);
		lblNewLabel_5_2_4.setBounds(450, 162, 139, 26);
		panel.add(lblNewLabel_5_2_4);
		
		JLabel lblNewLabel_5_2_5 = new JLabel("DBMS Marks");
		lblNewLabel_5_2_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2_5.setForeground(Color.WHITE);
		lblNewLabel_5_2_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2_5.setBackground(Color.WHITE);
		lblNewLabel_5_2_5.setBounds(30, 216, 139, 26);
		panel.add(lblNewLabel_5_2_5);
		
		JLabel lblNewLabel_5_2_6 = new JLabel("DBMS Attendance");
		lblNewLabel_5_2_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2_6.setForeground(Color.WHITE);
		lblNewLabel_5_2_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2_6.setBackground(Color.WHITE);
		lblNewLabel_5_2_6.setBounds(450, 216, 139, 26);
		panel.add(lblNewLabel_5_2_6);
		
		JLabel lblNewLabel_5_2_7 = new JLabel("ADA Marks");
		lblNewLabel_5_2_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2_7.setForeground(Color.WHITE);
		lblNewLabel_5_2_7.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2_7.setBackground(Color.WHITE);
		lblNewLabel_5_2_7.setBounds(30, 280, 139, 26);
		panel.add(lblNewLabel_5_2_7);
		
		JLabel lblNewLabel_5_2_8 = new JLabel("ADA Attendance");
		lblNewLabel_5_2_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2_8.setForeground(Color.WHITE);
		lblNewLabel_5_2_8.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2_8.setBackground(Color.WHITE);
		lblNewLabel_5_2_8.setBounds(450, 280, 139, 26);
		panel.add(lblNewLabel_5_2_8);
		
		JLabel lblNewLabel_5_2_9 = new JLabel("UNIX Marks");
		lblNewLabel_5_2_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2_9.setForeground(Color.WHITE);
		lblNewLabel_5_2_9.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2_9.setBackground(Color.WHITE);
		lblNewLabel_5_2_9.setBounds(30, 345, 139, 26);
		panel.add(lblNewLabel_5_2_9);
		
		JLabel lblNewLabel_5_2_10 = new JLabel("UNIX Attendance");
		lblNewLabel_5_2_10.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_2_10.setForeground(Color.WHITE);
		lblNewLabel_5_2_10.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		lblNewLabel_5_2_10.setBackground(Color.WHITE);
		lblNewLabel_5_2_10.setBounds(450, 345, 139, 26);
		panel.add(lblNewLabel_5_2_10);
		


		
		JLabel liam = new JLabel("");
		liam.setOpaque(true);
		liam.setHorizontalAlignment(SwingConstants.CENTER);
		liam.setForeground(Color.WHITE);
		liam.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		liam.setBackground(new Color(95, 158, 160));
		liam.setBounds(169, 106, 139, 26);
		panel.add(liam);
		
		JLabel javam = new JLabel("");
		javam.setOpaque(true);
		javam.setHorizontalAlignment(SwingConstants.CENTER);
		javam.setForeground(Color.WHITE);
		javam.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		javam.setBackground(new Color(95, 158, 160));
		javam.setBounds(169, 162, 139, 26);
		panel.add(javam);
		
		JLabel dbmsm = new JLabel("");
		dbmsm.setOpaque(true);
		dbmsm.setHorizontalAlignment(SwingConstants.CENTER);
		dbmsm.setForeground(Color.WHITE);
		dbmsm.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		dbmsm.setBackground(new Color(95, 158, 160));
		dbmsm.setBounds(169, 216, 139, 26);
		panel.add(dbmsm);
		
		JLabel adam = new JLabel("");
		adam.setOpaque(true);
		adam.setHorizontalAlignment(SwingConstants.CENTER);
		adam.setForeground(Color.WHITE);
		adam.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		adam.setBackground(new Color(95, 158, 160));
		adam.setBounds(169, 280, 139, 26);
		panel.add(adam);
		
		JLabel unixm = new JLabel("");
		unixm.setOpaque(true);
		unixm.setHorizontalAlignment(SwingConstants.CENTER);
		unixm.setForeground(Color.WHITE);
		unixm.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		unixm.setBackground(new Color(95, 158, 160));
		unixm.setBounds(169, 345, 139, 26);
		panel.add(unixm);
		
		JLabel liaa = new JLabel("");
		liaa.setOpaque(true);
		liaa.setHorizontalAlignment(SwingConstants.CENTER);
		liaa.setForeground(Color.WHITE);
		liaa.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		liaa.setBackground(new Color(95, 158, 160));
		liaa.setBounds(620, 106, 139, 26);
		panel.add(liaa);
		
		JLabel javaa = new JLabel("");
		javaa.setOpaque(true);
		javaa.setHorizontalAlignment(SwingConstants.CENTER);
		javaa.setForeground(Color.WHITE);
		javaa.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		javaa.setBackground(new Color(95, 158, 160));
		javaa.setBounds(620, 162, 139, 26);
		panel.add(javaa);
		
		JLabel dbmsa = new JLabel("");
		dbmsa.setOpaque(true);
		dbmsa.setHorizontalAlignment(SwingConstants.CENTER);
		dbmsa.setForeground(Color.WHITE);
		dbmsa.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		dbmsa.setBackground(new Color(95, 158, 160));
		dbmsa.setBounds(620, 216, 139, 26);
		panel.add(dbmsa);
		
		JLabel adaa = new JLabel("");
		adaa.setOpaque(true);
		adaa.setHorizontalAlignment(SwingConstants.CENTER);
		adaa.setForeground(Color.WHITE);
		adaa.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		adaa.setBackground(new Color(95, 158, 160));
		adaa.setBounds(620, 280, 139, 26);
		panel.add(adaa);
		
		JLabel unixa = new JLabel("");
		unixa.setOpaque(true);
		unixa.setHorizontalAlignment(SwingConstants.CENTER);
		unixa.setForeground(Color.WHITE);
		unixa.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		unixa.setBackground(new Color(95, 158, 160));
		unixa.setBounds(620, 345, 139, 26);
		panel.add(unixa);
		
		
		JButton btnNewButton_1 = new JButton("Go");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String usnid = usnT.getText();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectJava","root","");
					
					if (usnid.length() == 10)
					{

						
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
							 
							 
							 
							 usnidh.setText(usn_id);
							 liam.setText(lia_m);
							 liaa.setText(lia_a);
							 javam.setText(java_m);
							 javaa.setText(java_a);
							 dbmsm.setText(dbms_m);
							 dbmsa.setText(dbms_a);
							 adam.setText(ada_m);
							 adaa.setText(ada_a);
							 unixm.setText(unix_m);
							 unixa.setText(unix_a);
							 
							 
				
							 
							 
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
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(286, 10, 67, 21);
		panel.add(btnNewButton_1);
		
		
		JButton btnNewButton_2_1 = new JButton("Clear");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usnT.setText("");
				usnidh.setText("");
				liam.setText("");
				liaa.setText("");
				dbmsm.setText("");
				dbmsa.setText("");
				javam.setText("");
				javaa.setText("");
				adam.setText("");
				adaa.setText("");
				unixm.setText("");
				unixa.setText("");
				
			}
		});
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		btnNewButton_2_1.setBackground(Color.BLUE);
		btnNewButton_2_1.setBounds(538, 460, 81, 26);
		panel.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Department of Information Science And Engineering");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel_3_1.setBounds(238, 112, 475, 52);
		contentPane.add(lblNewLabel_3_1);
	}
}
