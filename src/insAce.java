import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class insAce extends JFrame {

	private JPanel contentPane;
	private JLabel l1;
	private JTextField usn;
	private JTextField liam;
	private JTextField liaa;
	private JTextField dbmsm;
	private JTextField dbmsa;
	private JTextField javam;
	private JTextField javaa;
	private JTextField adam;
	private JTextField adaa;
	private JTextField unixm;
	private JTextField unixa;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insAce frame = new insAce();
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
	
	public insAce() {
		
			
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 790);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		l1 = new JLabel("BMSCE");
		l1.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		l1.setForeground(Color.BLUE);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(66, 12, 81, 26);
		contentPane.add(l1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(54, 155, 852, 588);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("USN");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		lblNewLabel_2.setBounds(22, 10, 45, 26);
		panel.add(lblNewLabel_2);
		
		usn = new JTextField();
		usn.setHorizontalAlignment(SwingConstants.CENTER);
		usn.setColumns(10);
		usn.setBounds(77, 10, 145, 26);
		panel.add(usn);
		
		liam = new JTextField();
		liam.setHorizontalAlignment(SwingConstants.CENTER);
		liam.setColumns(10);
		liam.setBounds(360, 131, 130, 26);
		panel.add(liam);
		
		liaa = new JTextField();
		liaa.setHorizontalAlignment(SwingConstants.CENTER);
		liaa.setColumns(10);
		liaa.setBounds(618, 131, 130, 26);
		panel.add(liaa);
		
		dbmsm = new JTextField();
		dbmsm.setHorizontalAlignment(SwingConstants.CENTER);
		dbmsm.setColumns(10);
		dbmsm.setBounds(360, 207, 130, 26);
		panel.add(dbmsm);
		
		dbmsa = new JTextField();
		dbmsa.setHorizontalAlignment(SwingConstants.CENTER);
		dbmsa.setColumns(10);
		dbmsa.setBounds(618, 207, 130, 26);
		panel.add(dbmsa);
		
		javam = new JTextField();
		javam.setHorizontalAlignment(SwingConstants.CENTER);
		javam.setColumns(10);
		javam.setBounds(360, 294, 130, 26);
		panel.add(javam);
		
		javaa = new JTextField();
		javaa.setHorizontalAlignment(SwingConstants.CENTER);
		javaa.setColumns(10);
		javaa.setBounds(618, 294, 130, 26);
		panel.add(javaa);
		
		adam = new JTextField();
		adam.setHorizontalAlignment(SwingConstants.CENTER);
		adam.setColumns(10);
		adam.setBounds(360, 375, 130, 26);
		panel.add(adam);
		
		adaa = new JTextField();
		adaa.setHorizontalAlignment(SwingConstants.CENTER);
		adaa.setColumns(10);
		adaa.setBounds(618, 375, 130, 26);
		panel.add(adaa);
		
		unixm = new JTextField();
		unixm.setHorizontalAlignment(SwingConstants.CENTER);
		unixm.setColumns(10);
		unixm.setBounds(360, 460, 130, 26);
		panel.add(unixm);
		
		unixa = new JTextField();
		unixa.setHorizontalAlignment(SwingConstants.CENTER);
		unixa.setColumns(10);
		unixa.setBounds(618, 460, 130, 26);
		panel.add(unixa);
		
		JLabel lblNewLabel_5_1 = new JLabel(" INTERNAL MARKS (out of 50)");
		lblNewLabel_5_1.setOpaque(true);
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_5_1.setBackground(new Color(25, 25, 112));
		lblNewLabel_5_1.setBounds(270, 63, 220, 26);
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("ATTENDANCE in %");
		lblNewLabel_5_2.setOpaque(true);
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_5_2.setBackground(new Color(25, 25, 112));
		lblNewLabel_5_2.setBounds(556, 63, 192, 26);
		panel.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6 = new JLabel("LINEAR ALGEBRA");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(111, 130, 145, 26);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("DATABASE MANAGEMENT SYSTEM");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		lblNewLabel_6_1.setBounds(59, 205, 234, 26);
		panel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("JAVA PROGRAMMING");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setForeground(Color.WHITE);
		lblNewLabel_6_2.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		lblNewLabel_6_2.setBounds(111, 294, 145, 26);
		panel.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("ANALYSIS AND DESIGN OF ALGORITHOM");
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3.setForeground(Color.WHITE);
		lblNewLabel_6_3.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		lblNewLabel_6_3.setBounds(28, 375, 265, 26);
		panel.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("UNIX PROGRAMMING");
		lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_4.setForeground(Color.WHITE);
		lblNewLabel_6_4.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		lblNewLabel_6_4.setBounds(111, 460, 145, 26);
		panel.add(lblNewLabel_6_4);
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String myusn = usn.getText();
				String mathm = liam.getText();
				String matha = liaa.getText();
				String jam = javam.getText();
				String jaa = javaa.getText();
				String datam = dbmsm.getText();
				String dataa = dbmsa.getText();
				String aadm = adam.getText();
				String aada = adaa.getText();
				String um = unixm.getText();
				String ua = unixa.getText();
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectJava","root","");
					
					String query = "INSERT INTO academic VALUES('"+ myusn +"','"+ mathm +"','"+ matha +"','"+ jam +"','"+ jaa +"','"+ datam +"','"+ dataa +"','"+ aadm +"','"+ aada +"','"+ um +"','"+ ua +"');";
					Statement stmt=con.createStatement();
					int x = stmt.executeUpdate(query);
					
					if(x == 0)
					{
						JOptionPane.showMessageDialog(submit, "Informaton already exist");
						
					}
					else {
						JOptionPane.showMessageDialog(submit,  "Information Inserted");
						
						liam.setText("");
						liaa.setText("");
						dbmsm.setText("");
						dbmsa.setText("");
						javam.setText("");
						javaa.setText("");
						adam.setText("");
						adaa.setText("");
						unixa.setText("");
						unixm.setText("");
						usn.setText("");
						
						

					}
					
					
				}
				catch(Exception e1) {System.out.println(e1);}
				
				
				
				
				
				
				
			}
		});
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		submit.setBackground(SystemColor.activeCaption);
		submit.setBounds(413, 530, 112, 35);
		panel.add(submit);
		
		JCheckBox check = new JCheckBox("VERIFIED");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ( check.isSelected())
				{
					
				}
				else
				{
					liam.setText("");
					liaa.setText("");
					dbmsm.setText("");
					dbmsa.setText("");
					javam.setText("");
					javaa.setText("");
					adam.setText("");
					adaa.setText("");
					unixa.setText("");
					unixm.setText("");
					usn.setText("");
				}
				
			}
		});
		check.setSelected(true);
		check.setBackground(SystemColor.inactiveCaptionBorder);
		check.setBounds(215, 537, 93, 21);
		panel.add(check);
		
		JButton reset = new JButton("RESET");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				liam.setText("");
				liaa.setText("");
				dbmsm.setText("");
				dbmsa.setText("");
				javam.setText("");
				javaa.setText("");
				adam.setText("");
				adaa.setText("");
				unixa.setText("");
				unixm.setText("");
				usn.setText("");
				
			}
		});
		reset.setForeground(Color.WHITE);
		reset.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		reset.setBackground(SystemColor.activeCaption);
		reset.setBounds(577, 530, 112, 35);
		panel.add(reset);
		
		JLabel lblNewLabel_5 = new JLabel("ACADEMIC DETAILS");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_5.setBackground(new Color(0, 204, 153));
		lblNewLabel_5.setBounds(54, 119, 192, 26);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_3 = new JLabel("BATCH 2019");
		lblNewLabel_5_3.setOpaque(true);
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setForeground(Color.WHITE);
		lblNewLabel_5_3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_5_3.setBackground(new Color(0, 204, 153));
		lblNewLabel_5_3.setBounds(714, 119, 192, 26);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_3 = new JLabel(".BMSCE");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_3.setBounds(867, 10, 119, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Campus");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(755, 4, 112, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("Department of Information Science and Engineering");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		lblNewLabel_1.setBackground(new Color(102, 204, 0));
		lblNewLabel_1.setBounds(10, 37, 309, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Faculty :");
		lblNewLabel.setFont(new Font("Bradley Hand ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 17, 68, 19);
		contentPane.add(lblNewLabel);
		
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
		btnNewButton.setBounds(10, 70, 85, 21);
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
		btnLogout.setBounds(111, 70, 85, 21);
		contentPane.add(btnLogout);
	}
}
