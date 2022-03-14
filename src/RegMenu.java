import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegMenu extends JFrame  {
	private JLabel l1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegMenu frame = new RegMenu();
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
    public void my_update(String str) {
        l1.setText(str);
    }
	
	public RegMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		 l1 = new JLabel("BMSCE ");
		 
		 l1.setOpaque(true);
		 l1.setBackground(Color.WHITE);
		 l1.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(887, 29, 73, 29);
		contentPane.add(l1);
		
		JLabel lblNewLabel_1 = new JLabel("Campus");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 112, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(".BMSCE");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.PLAIN, 27));
		lblNewLabel_2.setBounds(114, 16, 119, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		lblWelcome.setBounds(803, 36, 93, 20);
		contentPane.add(lblWelcome);
		
		JButton btnNewButton = new JButton("Display General");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String str = l1.getText();
				AccessGenera as = new AccessGenera();
				as.setVisible(true);
				as.mai_update(str);
			}
		});
		btnNewButton.setBackground(new Color(119, 136, 153));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		btnNewButton.setBounds(208, 339, 186, 40);
		contentPane.add(btnNewButton);
		
		JButton btnInsertStudent = new JButton("Insert General details");
		btnInsertStudent.setForeground(Color.WHITE);
		btnInsertStudent.setBackground(new Color(119, 136, 153));
		btnInsertStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Insert in = new Insert();
				String S = l1.getText();
				in.setVisible(true);
				in.mai_update(S);
				
				
				
			}
		});
		btnInsertStudent.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		btnInsertStudent.setBounds(208, 254, 186, 40);
		contentPane.add(btnInsertStudent);
		
		JButton btnInsertStudent_1 = new JButton("Insert Academic");
		btnInsertStudent_1.setForeground(Color.WHITE);
		btnInsertStudent_1.setBackground(new Color(119, 136, 153));
		btnInsertStudent_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String s = l1.getText();
				insAce in = new insAce();
				in.setVisible(true);
				in.mai_update(s);
				
			}
		});
		btnInsertStudent_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		btnInsertStudent_1.setBounds(597, 254, 186, 40);
		contentPane.add(btnInsertStudent_1);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("image1.png"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(385, 29, 208, 118);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Department of Information Science And Engineering");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 17));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(262, 128, 475, 52);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Display Academic");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String str = l1.getText();
				dispose();
				AccAce ac = new AccAce();
				ac.setVisible(true);
				ac.mai_update(str);
				
			}
		});
		btnNewButton_1.setBackground(new Color(119, 136, 153));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 13));
		btnNewButton_1.setBounds(597, 339, 186, 40);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 153));
		panel.setBounds(10, 478, 966, 125);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Bmsce.ac.in");
		lblNewLabel_4.setForeground(new Color(51, 0, 204));
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.PLAIN, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(432, 10, 94, 13);
		panel.add(lblNewLabel_4);
		
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
		btnLogout.setBounds(891, 447, 85, 21);
		contentPane.add(btnLogout);
		
		
		
	}
}
