import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Frame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
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
	public Frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 1300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label1 = new JLabel("");
		label1.setBounds(189, 42, 116, 141);
		ImageIcon img1=new ImageIcon(this.getClass().getResource("/badam1.png"));
		label1.setIcon(img1);
		contentPane.setLayout(null);
		contentPane.add(label1);
		
		JLabel lblNewLabel = new JLabel("200 ml");
		lblNewLabel.setBounds(315, 53, 58, 14);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rs.25.00");
		lblNewLabel_1.setBounds(315, 96, 67, 14);
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(342, 148, 40, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Qnt");
		lblNewLabel_2.setBounds(315, 151, 46, 14);
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BADAM MILK SHAKE");
		lblNewLabel_3.setBounds(213, 205, 170, 14);
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3);
		
		JLabel label2 = new JLabel("");
		ImageIcon img2=new ImageIcon(this.getClass().getResource("/elachi1.png"));
		label2.setIcon(img2);
		label2.setBounds(555, 42, 129, 141);
		contentPane.add(label2);
		
		JLabel lblNewLabel_4 = new JLabel("200 ml");
		lblNewLabel_4.setBounds(688, 53, 58, 14);
		lblNewLabel_4.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rs.25.00");
		lblNewLabel_5.setBounds(688, 96, 72, 14);
		lblNewLabel_5.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Qnt");
		lblNewLabel_6.setBounds(688, 151, 46, 14);
		lblNewLabel_6.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(717, 148, 37, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_7 = new JLabel("ELACHI MILK SHAKE");
		lblNewLabel_7.setBounds(587, 205, 171, 14);
		lblNewLabel_7.setFont(new Font("Sitka Heading", Font.BOLD, 17));
		contentPane.add(lblNewLabel_7);
		
		JLabel label3 = new JLabel("");
		label3.setBounds(757, 322, 116, 141);
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/banana1.png"));
		label3.setIcon(img3);
		contentPane.add(label3);
		
		JLabel lblNewLabel_8 = new JLabel("200 ml");
		lblNewLabel_8.setBounds(891, 341, 67, 14);
		lblNewLabel_8.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Rs.25.00");
		lblNewLabel_9.setBounds(891, 384, 67, 14);
		lblNewLabel_9.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Qnt");
		lblNewLabel_10.setBounds(891, 432, 46, 14);
		lblNewLabel_10.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(921, 429, 37, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_2);
		
		JLabel label4 = new JLabel("");
		label4.setBounds(904, 42, 116, 141);
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/pista1.png"));
		label4.setIcon(img4);
		contentPane.add(label4);
		
		JLabel lblNewLabel_11 = new JLabel("200 ml");
		lblNewLabel_11.setBounds(1030, 53, 58, 14);
		lblNewLabel_11.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Rs.25.00");
		lblNewLabel_12.setBounds(1030, 96, 64, 14);
		lblNewLabel_12.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Qnt");
		lblNewLabel_13.setBounds(1029, 151, 46, 14);
		lblNewLabel_13.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_13);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(1058, 148, 36, 20);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_14 = new JLabel("BANANA MILK SHAKE");
		lblNewLabel_14.setBounds(784, 481, 176, 14);
		lblNewLabel_14.setFont(new Font("Sitka Heading", Font.BOLD, 17));
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("PISTA MILK SHAKE");
		lblNewLabel_15.setBounds(948, 205, 149, 14);
		lblNewLabel_15.setFont(new Font("Sitka Heading", Font.BOLD, 17));
		contentPane.add(lblNewLabel_15);
		
		JLabel label5 = new JLabel("");
		label5.setBounds(368, 341, 116, 135);
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/rose.png"));
		label5.setIcon(img5);
		contentPane.add(label5);
		
		JLabel lblNewLabel_16 = new JLabel("ROSE MILK SHAKE");
		lblNewLabel_16.setBackground(Color.GRAY);
		lblNewLabel_16.setBounds(380, 478, 170, 21);
		lblNewLabel_16.setFont(new Font("Sitka Heading", Font.BOLD, 17));
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("200 ml");
		lblNewLabel_17.setBounds(494, 341, 58, 14);
		lblNewLabel_17.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Rs.25.00");
		lblNewLabel_18.setBounds(494, 384, 67, 14);
		lblNewLabel_18.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Qnt");
		lblNewLabel_19.setBounds(494, 432, 46, 14);
		lblNewLabel_19.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_19);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4.setBounds(522, 429, 37, 20);
		contentPane.add(comboBox_4);
		
		JButton btnNewButton = new JButton("");
		ImageIcon img0 = new ImageIcon(this.getClass().getResource("/OK.png"));
		btnNewButton.setIcon(img0);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(254, 241, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/OK.png"));
		btnNewButton_1.setIcon(img);
		btnNewButton_1.setBounds(624, 241, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		ImageIcon img11 = new ImageIcon(this.getClass().getResource("/OK.png"));
		btnNewButton_2.setIcon(img11);
		btnNewButton_2.setBounds(985, 241, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		ImageIcon img12 = new ImageIcon(this.getClass().getResource("/OK.png"));
		btnNewButton_3.setIcon(img12);
		btnNewButton_3.setBounds(825, 517, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		ImageIcon img13 = new ImageIcon(this.getClass().getResource("/OK.png"));
		btnNewButton_4.setIcon(img13);
		btnNewButton_4.setBounds(403, 517, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Buttondemo btn=new Buttondemo();
				btn.show();
				dispose();
			}
		});
		ImageIcon img15 = new ImageIcon(this.getClass().getResource("/ok1.png"));
		btnNewButton_5.setIcon(img15);
		btnNewButton_5.setBounds(1051, 567, 97, 29);
		contentPane.add(btnNewButton_5);
	}
}
