import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class halltic extends JFrame {

	private JPanel contentPane;
	private JLabel l1;
	private JLabel elia;
	private JLabel ejava;
	private JLabel edbms;
	private JLabel eada;
	private JLabel eunix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					halltic frame = new halltic();
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
	
	

    
    

	
	public halltic() {
		
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 617);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BMS COLLAGE OF ENGINEERING");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(295, 52, 346, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("sl no");
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(64, 216, 58, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("course");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(214, 216, 58, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("course code");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(396, 216, 87, 22);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("eligibility");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(626, 216, 87, 22);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("invigilator sign");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(832, 216, 110, 22);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(77, 266, 45, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("2");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(77, 314, 45, 22);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("3");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(77, 360, 45, 22);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("4");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(77, 405, 45, 22);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("5");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(77, 452, 45, 22);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("LIA");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_5.setBounds(214, 266, 45, 22);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("JAVA");
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_6.setBounds(214, 314, 45, 22);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("DBMS");
		lblNewLabel_2_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_7.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_7.setBounds(214, 360, 45, 22);
		contentPane.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("ADA");
		lblNewLabel_2_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_8.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_8.setBounds(214, 405, 45, 22);
		contentPane.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_2_9 = new JLabel("UNIX");
		lblNewLabel_2_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_9.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_9.setBounds(214, 452, 45, 22);
		contentPane.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_2_10 = new JLabel("candidate sign");
		lblNewLabel_2_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_10.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_10.setBounds(783, 518, 120, 22);
		contentPane.add(lblNewLabel_2_10);
		
		JLabel lblNewLabel_2_11 = new JLabel("19MA4BSLIA");
		lblNewLabel_2_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_11.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_11.setBounds(384, 266, 120, 22);
		contentPane.add(lblNewLabel_2_11);
		
		JLabel lblNewLabel_2_12 = new JLabel("19IS4PCJAV");
		lblNewLabel_2_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_12.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_12.setBounds(384, 314, 120, 22);
		contentPane.add(lblNewLabel_2_12);
		
		JLabel lblNewLabel_2_12_1 = new JLabel("19IS4PCDBM");
		lblNewLabel_2_12_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_12_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_12_1.setBounds(384, 360, 120, 22);
		contentPane.add(lblNewLabel_2_12_1);
		
		JLabel lblNewLabel_2_12_2 = new JLabel("19IS4PCADA");
		lblNewLabel_2_12_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_12_2.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_12_2.setBounds(384, 405, 120, 22);
		contentPane.add(lblNewLabel_2_12_2);
		
		JLabel lblNewLabel_2_12_3 = new JLabel("19IS4PWUSP");
		lblNewLabel_2_12_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_12_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_12_3.setBounds(384, 452, 120, 22);
		contentPane.add(lblNewLabel_2_12_3);
		
		elia = new JLabel("el");
		elia.setHorizontalAlignment(SwingConstants.CENTER);
		elia.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		elia.setBounds(598, 266, 150, 22);
		contentPane.add(elia);
		
		ejava = new JLabel("el");
		ejava.setHorizontalAlignment(SwingConstants.CENTER);
		ejava.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		ejava.setBounds(598, 314, 150, 22);
		contentPane.add(ejava);
		
		edbms = new JLabel("el");
		edbms.setHorizontalAlignment(SwingConstants.CENTER);
		edbms.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		edbms.setBounds(598, 360, 150, 22);
		contentPane.add(edbms);
		
		eada = new JLabel("el");
		eada.setHorizontalAlignment(SwingConstants.CENTER);
		eada.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		eada.setBounds(598, 405, 150, 22);
		contentPane.add(eada);
		
		eunix = new JLabel("el");
		eunix.setHorizontalAlignment(SwingConstants.CENTER);
		eunix.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		eunix.setBounds(598, 452, 150, 22);
		contentPane.add(eunix);
		
		l1 = new JLabel("1BM19IS058");
		l1.setForeground(Color.BLUE);
		l1.setHorizontalAlignment(SwingConstants.LEFT);
		l1.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		l1.setBounds(122, 134, 150, 22);
		contentPane.add(l1);
		
		JLabel lblNewLabel_2_12_4 = new JLabel("USN");
		lblNewLabel_2_12_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_12_4.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
		lblNewLabel_2_12_4.setBounds(22, 134, 66, 22);
		contentPane.add(lblNewLabel_2_12_4);
		
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
		btnLogout.setBounds(888, 10, 85, 21);
		contentPane.add(btnLogout);
		
		JButton btnPrinthallticket = new JButton("Print");
		btnPrinthallticket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnPrinthallticket.setForeground(Color.WHITE);
		btnPrinthallticket.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		btnPrinthallticket.setBackground(Color.BLACK);
		btnPrinthallticket.setBounds(760, 10, 85, 21);
		contentPane.add(btnPrinthallticket);
	}


    public void eligible(int liam, int liaa, int javam, int javaa, int dbmsm, int dbmsa, int adam , int adaa, int unixm, int unixa)
    {
//    	if(liam >= 20 && liaa >= 80)
//    	{
//    		elia.setText("Eligible");
//    		elia.setForeground(Color.green);
//    	}
//    	else {
//    		elia.setText("Not Eligible");
//    		elia.setForeground(Color.RED);
//    	}
    	
    	int lm , la , jm , ja , dm , da , am, aa, um,ua;
    	lm = liam;
    	la = liaa;
    	jm = javam;
    	ja = javaa;
    	dm = dbmsm;
    	da = dbmsa;
    	am = adam;
    	aa = adaa;
    	um = unixm;
    	ua = unixa;
    	
    	elL(lm,la);
    	elJ(jm,ja);
    	elD(dm,da);
    	elA(am,aa);
    	elU(um,ua);
    }
    
    
    public void elL(int lm , int la)
    {
    	if(lm >= 20 && la >= 80)
    	{
    		elia.setText("Eligible");
   	    	elia.setForeground(Color.green);
    	}
    	else {
    		elia.setText("Not Eligible");
    		elia.setForeground(Color.RED);
    	}
    }
    
    
    public void elJ(int jm, int ja)
    {
    	if(jm >=20 && ja>= 80)
    	{
    		ejava.setText("Eligible");
   	    	ejava.setForeground(Color.green);
    	}
    	else {
    		
    		ejava.setText("Not Eligible");
    		ejava.setForeground(Color.RED);
    		
    	}
    }
    
    
    public void elD(int dm , int da)
    {
    	if(dm >= 20 && da>= 80)
    	{
    		edbms.setText("Eligible");
   	    	edbms.setForeground(Color.green);
    	}
    	else {
    		edbms.setText("Not Eligible");
    		edbms.setForeground(Color.RED);
    	}
    }
    
    
    public void elA(int am , int aa)
    {
    	if(am >= 20 && aa>= 80)
    	{
    		eada.setText("Eligible");
   	    	eada.setForeground(Color.green);
    	}
    	else {
    		eada.setText("Not Eligible");
    		eada.setForeground(Color.RED);
    	}
    }
    
    
    public void elU(int um , int ua)
    {
    	if(um >= 20 && ua>= 80)
    	{
    		eunix.setText("Eligible");
   	    	eunix.setForeground(Color.green);
    	}
    	else {
    		eunix.setText("Not Eligible");
    		eunix.setForeground(Color.RED);
    	}
    }
    
    public void mai_update(String str) {
    	
        l1.setText(str);
    }
}
