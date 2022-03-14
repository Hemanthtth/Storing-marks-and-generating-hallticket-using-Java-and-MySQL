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

public class StudentAce extends JFrame {

	private JPanel contentPane;
	private JLabel l1;
	private JLabel usn;
	private JLabel liam;
	private JLabel liaa;
	private JLabel javam;
	private JLabel javaa;
	private JLabel dbmsm;
	private JLabel dbmsa;
	private JLabel adam;
	private JLabel adaa;
	private JLabel unixm;
	private JLabel unixa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentAce frame = new StudentAce();
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
    
    public void academics(String US , String Lm, String La, String Jm , String Ja, String Am , String Aa , String Dm , String Da , String Um , String Ua   )
    {
    	usn.setText(US);
    	liam.setText(Lm);
    	liaa.setText(La);
    	javam.setText(Jm);
    	javaa.setText(Ja);
    	dbmsm.setText(Dm);
    	dbmsa.setText(Da);
    	adam.setText(Am);
    	adaa.setText(Aa);
    	unixm.setText(Um);
    	unixa.setText(Ua);
    	
    	
    }
    
	
	public StudentAce() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 975, 743);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		l1 = new JLabel("hey");
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		l1.setForeground(Color.RED);
		l1.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		l1.setBounds(72, 9, 133, 30);
		contentPane.add(l1);
		
		JLabel lblNewLabel_3 = new JLabel(".BMSCE");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_3.setBounds(842, 10, 119, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Campus");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(731, 4, 112, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblUsn = new JLabel("USN :");
		lblUsn.setFont(new Font("Bradley Hand ITC", Font.BOLD, 15));
		lblUsn.setBounds(10, 17, 55, 19);
		contentPane.add(lblUsn);
		
		JLabel lblNewLabel_1 = new JLabel("Department of Information Science and Engineering");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		lblNewLabel_1.setBackground(new Color(102, 204, 0));
		lblNewLabel_1.setBounds(10, 45, 309, 13);
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
		btnLogout.setBounds(10, 69, 85, 21);
		contentPane.add(btnLogout);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(46, 160, 868, 509);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel.setBounds(45, 24, 67, 28);
		panel.add(lblNewLabel);
		
		JLabel lblLiaMarks = new JLabel("LIA Marks");
		lblLiaMarks.setHorizontalAlignment(SwingConstants.LEFT);
		lblLiaMarks.setForeground(Color.WHITE);
		lblLiaMarks.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblLiaMarks.setBounds(45, 117, 108, 28);
		panel.add(lblLiaMarks);
		
		JLabel lblJavaMarks = new JLabel("JAVA Marks");
		lblJavaMarks.setHorizontalAlignment(SwingConstants.LEFT);
		lblJavaMarks.setForeground(Color.WHITE);
		lblJavaMarks.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblJavaMarks.setBounds(45, 192, 108, 28);
		panel.add(lblJavaMarks);
		
		JLabel lblDbmsMarks = new JLabel("DBMS Marks");
		lblDbmsMarks.setHorizontalAlignment(SwingConstants.LEFT);
		lblDbmsMarks.setForeground(Color.WHITE);
		lblDbmsMarks.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblDbmsMarks.setBounds(45, 266, 108, 28);
		panel.add(lblDbmsMarks);
		
		JLabel lblAdaMarks = new JLabel("ADA Marks");
		lblAdaMarks.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdaMarks.setForeground(Color.WHITE);
		lblAdaMarks.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblAdaMarks.setBounds(45, 348, 108, 28);
		panel.add(lblAdaMarks);
		
		JLabel lblUnixMarks = new JLabel("UNIX Marks");
		lblUnixMarks.setHorizontalAlignment(SwingConstants.LEFT);
		lblUnixMarks.setForeground(Color.WHITE);
		lblUnixMarks.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblUnixMarks.setBounds(45, 431, 108, 28);
		panel.add(lblUnixMarks);
		
		liam = new JLabel("usn");
		liam.setOpaque(true);
		liam.setHorizontalAlignment(SwingConstants.CENTER);
		liam.setForeground(new Color(0, 128, 0));
		liam.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		liam.setBackground(new Color(230, 230, 250));
		liam.setBounds(227, 114, 173, 34);
		panel.add(liam);
		
		usn = new JLabel("usn");
		usn.setOpaque(true);
		usn.setHorizontalAlignment(SwingConstants.CENTER);
		usn.setForeground(new Color(0, 128, 0));
		usn.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		usn.setBackground(new Color(230, 230, 250));
		usn.setBounds(151, 24, 173, 34);
		panel.add(usn);
		
		javam = new JLabel("usn");
		javam.setOpaque(true);
		javam.setHorizontalAlignment(SwingConstants.CENTER);
		javam.setForeground(new Color(0, 128, 0));
		javam.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		javam.setBackground(new Color(230, 230, 250));
		javam.setBounds(227, 189, 173, 34);
		panel.add(javam);
		
		dbmsm = new JLabel("usn");
		dbmsm.setOpaque(true);
		dbmsm.setHorizontalAlignment(SwingConstants.CENTER);
		dbmsm.setForeground(new Color(0, 128, 0));
		dbmsm.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		dbmsm.setBackground(new Color(230, 230, 250));
		dbmsm.setBounds(227, 263, 173, 34);
		panel.add(dbmsm);
		
		adam = new JLabel("usn");
		adam.setOpaque(true);
		adam.setHorizontalAlignment(SwingConstants.CENTER);
		adam.setForeground(new Color(0, 128, 0));
		adam.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		adam.setBackground(new Color(230, 230, 250));
		adam.setBounds(227, 345, 173, 34);
		panel.add(adam);
		
		unixm = new JLabel("usn");
		unixm.setOpaque(true);
		unixm.setHorizontalAlignment(SwingConstants.CENTER);
		unixm.setForeground(new Color(0, 128, 0));
		unixm.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		unixm.setBackground(new Color(230, 230, 250));
		unixm.setBounds(227, 428, 173, 34);
		panel.add(unixm);
		
		JLabel lblLiaAttendance = new JLabel("LIA Attendance");
		lblLiaAttendance.setHorizontalAlignment(SwingConstants.LEFT);
		lblLiaAttendance.setForeground(Color.WHITE);
		lblLiaAttendance.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblLiaAttendance.setBounds(492, 117, 136, 28);
		panel.add(lblLiaAttendance);
		
		JLabel lblJavaAttendance = new JLabel("JAVA Attendance");
		lblJavaAttendance.setHorizontalAlignment(SwingConstants.LEFT);
		lblJavaAttendance.setForeground(Color.WHITE);
		lblJavaAttendance.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblJavaAttendance.setBounds(492, 192, 154, 28);
		panel.add(lblJavaAttendance);
		
		JLabel lblDbmsAttendance = new JLabel("DBMS Attendance");
		lblDbmsAttendance.setHorizontalAlignment(SwingConstants.LEFT);
		lblDbmsAttendance.setForeground(Color.WHITE);
		lblDbmsAttendance.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblDbmsAttendance.setBounds(492, 266, 154, 28);
		panel.add(lblDbmsAttendance);
		
		JLabel lblAdaAttendance = new JLabel("ADA Attendance");
		lblAdaAttendance.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdaAttendance.setForeground(Color.WHITE);
		lblAdaAttendance.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblAdaAttendance.setBounds(492, 348, 136, 28);
		panel.add(lblAdaAttendance);
		
		JLabel lblUnixAttendance = new JLabel("UNIX Attendance");
		lblUnixAttendance.setHorizontalAlignment(SwingConstants.LEFT);
		lblUnixAttendance.setForeground(Color.WHITE);
		lblUnixAttendance.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblUnixAttendance.setBounds(492, 431, 136, 28);
		panel.add(lblUnixAttendance);
		
		liaa = new JLabel("usn");
		liaa.setOpaque(true);
		liaa.setHorizontalAlignment(SwingConstants.CENTER);
		liaa.setForeground(new Color(0, 128, 0));
		liaa.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		liaa.setBackground(new Color(230, 230, 250));
		liaa.setBounds(664, 114, 173, 34);
		panel.add(liaa);
		
		javaa = new JLabel("usn");
		javaa.setOpaque(true);
		javaa.setHorizontalAlignment(SwingConstants.CENTER);
		javaa.setForeground(new Color(0, 128, 0));
		javaa.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		javaa.setBackground(new Color(230, 230, 250));
		javaa.setBounds(664, 189, 173, 34);
		panel.add(javaa);
		
		dbmsa = new JLabel("usn");
		dbmsa.setOpaque(true);
		dbmsa.setHorizontalAlignment(SwingConstants.CENTER);
		dbmsa.setForeground(new Color(0, 128, 0));
		dbmsa.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		dbmsa.setBackground(new Color(230, 230, 250));
		dbmsa.setBounds(664, 263, 173, 34);
		panel.add(dbmsa);
		
		adaa = new JLabel("usn");
		adaa.setOpaque(true);
		adaa.setHorizontalAlignment(SwingConstants.CENTER);
		adaa.setForeground(new Color(0, 128, 0));
		adaa.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		adaa.setBackground(new Color(230, 230, 250));
		adaa.setBounds(664, 345, 173, 34);
		panel.add(adaa);
		
		unixa = new JLabel("usn");
		unixa.setOpaque(true);
		unixa.setHorizontalAlignment(SwingConstants.CENTER);
		unixa.setForeground(new Color(0, 128, 0));
		unixa.setFont(new Font("Lucida Fax", Font.PLAIN, 15));
		unixa.setBackground(new Color(230, 230, 250));
		unixa.setBounds(664, 428, 173, 34);
		panel.add(unixa);
		
		JLabel lblNewLabel_5 = new JLabel("ACADEMIC DETAILS");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_5.setBackground(new Color(100, 149, 237));
		lblNewLabel_5.setBounds(47, 132, 192, 26);
		contentPane.add(lblNewLabel_5);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
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
				
				
//				
//				
//				
//				
//				
//				
//				
//				dispose();
//				String str = l1.getText();
//				StudentPage sp = new StudentPage();
//				sp.setVisible(true);
//				sp.mai_update(str);
				
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(120, 68, 85, 21);
		contentPane.add(btnBack);
		

	}

}
