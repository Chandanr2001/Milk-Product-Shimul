import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paymentdemo extends JFrame {

	private JPanel contentPane;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paymentdemo frame = new paymentdemo();
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
	public paymentdemo() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 1300);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblSelectpaymentmethod = new JLabel("Select Payment Method");
		lblSelectpaymentmethod.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblSelectpaymentmethod.setBounds(219, 73, 265, 14);
		contentPane.add(lblSelectpaymentmethod);
		
		JRadioButton r1 = new JRadioButton("Cash on delivery");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		r1.setBounds(230, 94, 188, 23);
		contentPane.add(r1);
		r1.setEnabled(true);
		JRadioButton r2 = new JRadioButton("Phonepe");
		r2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		r2.setBounds(231, 124, 109, 23);
		contentPane.add(r2);
		r2.setEnabled(true);
		JRadioButton r3 = new JRadioButton("Paytm");
		r3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		r3.setBounds(231, 159, 109, 23);
		contentPane.add(r3);
		r3.setEnabled(true);
		JRadioButton r4 = new JRadioButton("Online");
		r4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		r4.setBounds(230, 193, 109, 23);
		contentPane.add(r4);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);
		
		JLabel lblNewLabel = new JLabel("Price details?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(239, 233, 85, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("CONTINUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				delivery dly=new delivery();
				dly.show();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(353, 273, 127, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				summary smy=new summary();
				smy.show();
				dispose();
			}
		});
		ImageIcon img11= new ImageIcon(this.getClass().getResource("/ok1.png"));
		btnNewButton_1.setIcon(img11);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(235, 273, 95, 31);
		contentPane.add(btnNewButton_1);
		
		
	}
}
