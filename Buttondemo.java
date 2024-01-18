import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buttondemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buttondemo frame = new Buttondemo();
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
	public Buttondemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 1300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(59, 268, 130, 118);
		ImageIcon img1= new ImageIcon(this.getClass().getResource("/Milk5.png"));
	    contentPane.setLayout(null);
	    lblNewLabel.setIcon(img1);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("MILK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame0 frm=new Frame0();
				frm.show();
				dispose();
			}
		});
		btnNewButton.setBounds(87, 397, 89, 23);
		btnNewButton.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(255, 256, 130, 130);
		ImageIcon img9= new ImageIcon(this.getClass().getResource("/Curd3.png"));
	    lblNewLabel_1.setIcon(img9);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("CURD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame1 frm=new Frame1();
				frm.show();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		btnNewButton_1.setBounds(287, 397, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		ImageIcon img10= new ImageIcon(this.getClass().getResource("/Milkshakes.png"));
	    lblNewLabel_2.setIcon(img10);
		lblNewLabel_2.setBounds(442, 299, 130, 87);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("MILKSHAKES");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame2 frm=new Frame2();
				frm.show();
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		btnNewButton_2.setBounds(442, 397, 158, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		ImageIcon img11= new ImageIcon(this.getClass().getResource("/Sweets.png"));
	    lblNewLabel_3.setIcon(img11);
		lblNewLabel_3.setBounds(642, 270, 130, 116);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_3 = new JButton("SWEETS");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame3 frm=new Frame3();
				frm.show();
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		btnNewButton_3.setBounds(652, 397, 120, 22);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		ImageIcon img12= new ImageIcon(this.getClass().getResource("/Ghee3.png"));
	    lblNewLabel_4.setIcon(img12);
		lblNewLabel_4.setBounds(849, 251, 130, 135);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_4 = new JButton("GHEE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame4 frm=new Frame4();
				frm.show();
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		btnNewButton_4.setBounds(876, 397, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		ImageIcon img13= new ImageIcon(this.getClass().getResource("/Icecream.png"));
	    lblNewLabel_5.setIcon(img13);
		lblNewLabel_5.setBounds(1046, 251, 130, 135);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton_5 = new JButton("ICE CREAM");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame5 frm=new Frame5();
				frm.show();
				dispose();
			}
		});
		btnNewButton_5.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		btnNewButton_5.setBounds(1046, 397, 140, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Listdemo lst=new Listdemo();
				lst.show();
				dispose();
			}
		});
		ImageIcon img15= new ImageIcon(this.getClass().getResource("/ok1.png"));
		btnNewButton_6.setIcon(img15);
		btnNewButton_6.setBounds(1124, 484, 99, 30);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				summary smy=new summary();
				smy.show();
				dispose();
			}
		});
		ImageIcon img16=new ImageIcon(this.getClass().getResource("/ok2.png"));
		btnNewButton_7.setIcon(img16);
		btnNewButton_7.setBounds(1016, 484, 99, 30);
		contentPane.add(btnNewButton_7);
	}
}
