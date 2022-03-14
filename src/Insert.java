import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Insert extends JFrame {

	private JPanel contentPane;
	private JLabel l1;
	private JLabel lblNewLabel_1;
	private JTextField name;
	private JTextField email;
	private JTextField usn;
	private JRadioButton female;
	private JRadioButton male;
	String gender;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JButton btnNewButton;
	private JButton btnLogout;
	private JLabel lblNewLabel_7;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insert frame = new Insert();
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
	
	public Insert() {
		
		 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		l1 = new JLabel("BMSCE");
		l1.setFont(new Font("Bookman Old Style", Font.BOLD, 13));
		l1.setForeground(Color.BLUE);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(65, 26, 81, 26);
		contentPane.add(l1);
		
		
		
		lblNewLabel_1 = new JLabel("Insert New Student");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(338, 94, 301, 45);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(221, 259, 169, 33);
		contentPane.add(name);
		name.setColumns(10);
		
		email = new JTextField();
		email.setBounds(221, 347, 169, 33);
		contentPane.add(email);
		email.setColumns(10);
		
		JButton submit = new JButton("Insert Student");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String stName = name.getText();
				String myusn = usn.getText();
				String myemail = email.getText();
				
				String msg = " " + stName;
				msg += " \n";
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectJava","root","");
					
					String query = "INSERT INTO student values('" + stName + "','" + myusn + "','" + myemail + "','" + gender + "');";
					Statement stmt=con.createStatement();
					int x = stmt.executeUpdate(query);
					
					if(x == 0)
					{
						JOptionPane.showMessageDialog(submit, "Informaton already exist");
						
					}
					else {
						JOptionPane.showMessageDialog(submit, 
								" " + msg + "Information Inserted");
						name.setText(" ");
						usn.setText(" ");
						email.setText(" ");
						male.setSelected(false);
						female.setSelected(false);
						
						
						
					}
					
					//con.close();
					
					
				}
				catch(Exception e1) {System.out.println(e1);}
				
				
				
				
			}
		});
		submit.setForeground(Color.WHITE);
		submit.setBackground(Color.BLUE);
		submit.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		submit.setBounds(401, 432, 169, 45);
		contentPane.add(submit);
		
		usn = new JTextField();
		usn.setColumns(10);
		usn.setBounds(636, 259, 169, 33);
		contentPane.add(usn);
		
		JLabel lblNewLabel_2 = new JLabel("Student Name");
		lblNewLabel_2.setForeground(new Color(0, 51, 0));
		lblNewLabel_2.setFont(new Font("Bradley Hand ITC", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(74, 259, 113, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setForeground(new Color(0, 51, 0));
		lblNewLabel_2_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(74, 347, 113, 33);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("USN");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setForeground(new Color(0, 51, 0));
		lblNewLabel_2_2.setFont(new Font("Bradley Hand ITC", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(470, 259, 113, 33);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Gender");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_3.setForeground(new Color(0, 51, 0));
		lblNewLabel_2_3.setFont(new Font("Bradley Hand ITC", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(470, 347, 113, 33);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel = new JLabel("Faculty :");
		lblNewLabel.setFont(new Font("Bradley Hand ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 30, 68, 19);
		contentPane.add(lblNewLabel);
		
		male = new JRadioButton("Male");
		male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(male.isSelected())
				{
					female.setSelected(false);
					gender="Male";
				}
			}
		});
		male.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		male.setBackground(Color.WHITE);
		male.setBounds(636, 353, 103, 21);
		contentPane.add(male);
		
		female = new JRadioButton("Female");
		female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(female.isSelected())
				{
					male.setSelected(false);
					gender="Female";
				}
			}
		});
		female.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
		female.setBackground(Color.WHITE);
		female.setBounds(758, 353, 103, 21);
		contentPane.add(female);
		
		lblNewLabel_3 = new JLabel(".BMSCE");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_3.setBounds(867, 24, 119, 29);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Campus");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(758, 18, 112, 40);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		ImageIcon img = new ImageIcon(this.getClass().getResource("image1.png"));
		lblNewLabel_6.setIcon(img);
		lblNewLabel_6.setBounds(837, 57, 139, 118);
		contentPane.add(lblNewLabel_6);
		
		btnNewButton = new JButton("Back");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				dispose();
				RegMenu re = new RegMenu();
				String str = l1.getText();
				re.setVisible(true);
				re.my_update(str);
				
			}
		});
		btnNewButton.setBounds(758, 571, 85, 21);
		contentPane.add(btnNewButton);
		
		btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login li = new Login();
				li.setVisible(true);
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setBackground(Color.BLACK);
		btnLogout.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		btnLogout.setBounds(854, 571, 85, 21);
		contentPane.add(btnLogout);
		
		lblNewLabel_7 = new JLabel("Department of Information Science and Engineering");
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		lblNewLabel_7.setBackground(new Color(102, 204, 0));
		lblNewLabel_7.setBounds(10, 55, 309, 13);
		contentPane.add(lblNewLabel_7);
		
		JButton btnInsertAcademic = new JButton("Insert Academic");
		btnInsertAcademic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				insAce in = new insAce();
				String str = l1.getText();
				in.setVisible(true);
				in.mai_update(str);
			}
		});
		btnInsertAcademic.setForeground(Color.WHITE);
		btnInsertAcademic.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		btnInsertAcademic.setBackground(Color.BLUE);
		btnInsertAcademic.setBounds(552, 559, 169, 33);
		contentPane.add(btnInsertAcademic);
		
		JCheckBox check = new JCheckBox("Student access");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( check.isSelected() )
				{
					String myusn = usn.getText();
					String pass = usn.getText();
					
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectJava","root","");
						
						String query = "INSERT INTO student_login values('" + myusn + "','" + pass + "');";
						
						Statement stmt=con.createStatement();
						
						
						stmt.executeUpdate(query);
						
						con.close();
						
					}
					catch(Exception e1) {System.out.println(e1); }
				}
				
				else {
					
				}
			}
		});
		check.setForeground(Color.WHITE);
		check.setBackground(Color.BLACK);
		check.setFont(new Font("Bookman Old Style", Font.PLAIN, 10));
		check.setBounds(120, 456, 113, 21);
		contentPane.add(check);
		

	}
}
