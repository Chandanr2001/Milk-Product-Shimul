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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Frame3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 frame = new Frame3();
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
	public Frame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 1300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("");
		ImageIcon img1=new ImageIcon(this.getClass().getResource("/Chocolate.png"));
		label1.setIcon(img1);
		label1.setBounds(32,56, 135, 87);
		contentPane.add(label1);
		
		JLabel lblNewLabel = new JLabel("250 g");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel.setBounds(177, 56, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rs.95.00");
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_1.setBounds(177, 99, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setBounds(213, 141, 37, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Qnt");
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_2.setBounds(177, 144, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel label2 = new JLabel("");
		ImageIcon img12 = new ImageIcon(this.getClass().getResource("/Coconut.png"));
		label2.setIcon(img12);
		label2.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		label2.setBounds(370, 56, 130, 87);
		contentPane.add(label2);
		
		JLabel lblNewLabel_3 = new JLabel("250 g");
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_3.setBounds(512, 56, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rs.95.00");
		lblNewLabel_4.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_4.setBounds(512, 99, 81, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Qnt");
		lblNewLabel_5.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_5.setBounds(496, 144, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_1.setBounds(526, 141, 37, 20);
		contentPane.add(comboBox_1);
		
		JLabel label3 = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/DarvadPeda.png"));
		label3.setIcon(img2);
		label3.setBounds(690, 56, 144, 105);
		contentPane.add(label3);
		
		JLabel lblNewLabel_6 = new JLabel("250 g");
		lblNewLabel_6.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_6.setBounds(832, 56, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Rs.95.00");
		lblNewLabel_7.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_7.setBounds(832, 99, 73, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Qnt");
		lblNewLabel_8.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_8.setBounds(832, 144, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setBounds(858, 141, 41, 20);
		contentPane.add(comboBox_2);
		
		JLabel label4 = new JLabel("");
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Dryburfi.png"));
		label4.setIcon(img4);
		label4.setBounds(1008, 56, 135, 105);
		contentPane.add(label4);
		
		JLabel lblNewLabel_9 = new JLabel("250 g");
		lblNewLabel_9.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_9.setBounds(1143, 56, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Rs.95.00");
		lblNewLabel_10.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_10.setBounds(1143, 99, 59, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Qnt");
		lblNewLabel_11.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_11.setBounds(1143, 144, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_3.setBounds(1170, 141, 37, 20);
		contentPane.add(comboBox_3);
		
		JLabel label5 = new JLabel("");
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Peda.png"));
		label5.setIcon(img5);
		label5.setBounds(32, 327, 135, 121);
		contentPane.add(label5);
		
		JLabel lblNewLabel_12 = new JLabel("250 g");
		lblNewLabel_12.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_12.setBounds(177, 328, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Rs.95.00");
		lblNewLabel_13.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_13.setBounds(177, 376, 65, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Qnt");
		lblNewLabel_14.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_14.setBounds(177, 431, 46, 14);
		contentPane.add(lblNewLabel_14);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4.setBounds(213, 428, 37, 20);
		contentPane.add(comboBox_4);
		
		JLabel label6 = new JLabel("");
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Mysore pak.png"));
		label6.setIcon(img6);
		label6.setBounds(335, 327, 132, 121);
		contentPane.add(label6);
		
		JLabel lblNewLabel_15 = new JLabel("250 g");
		lblNewLabel_15.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_15.setBounds(496, 327, 46, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Rs.95.00");
		lblNewLabel_16.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_16.setBounds(493, 376, 65, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Qnt");
		lblNewLabel_17.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_17.setBounds(496, 434, 46, 14);
		contentPane.add(lblNewLabel_17);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_5.setBounds(526, 428, 37, 20);
		contentPane.add(comboBox_5);
		
		JLabel label7 = new JLabel("");
		ImageIcon img7 = new ImageIcon(this.getClass().getResource("/cookies.png"));
		label7.setIcon(img7);
		label7.setBounds(675, 327, 118, 130);
		contentPane.add(label7);
		
		JLabel lblNewLabel_19 = new JLabel("250 g");
		lblNewLabel_19.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_19.setBounds(820, 328, 46, 14);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Rs.95.00");
		lblNewLabel_20.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_20.setBounds(820, 376, 73, 14);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Qnt");
		lblNewLabel_21.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_21.setBounds(820, 434, 46, 14);
		contentPane.add(lblNewLabel_21);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_6.setBounds(846, 431, 41, 20);
		contentPane.add(comboBox_6);
		
		JLabel label8 = new JLabel("");
		ImageIcon img8 = new ImageIcon(this.getClass().getResource("/ragi.png"));
		label8.setIcon(img8);
		label8.setBounds(958, 305, 135, 152);
		contentPane.add(label8);
		
		JLabel lblNewLabel_18 = new JLabel("250 g");
		lblNewLabel_18.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_18.setBounds(1132, 327, 46, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_22 = new JLabel("Rs.95.00");
		lblNewLabel_22.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_22.setBounds(1130, 376, 59, 14);
		contentPane.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Qnt");
		lblNewLabel_23.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_23.setBounds(1132, 431, 46, 14);
		contentPane.add(lblNewLabel_23);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_7.setBounds(1159, 428, 37, 20);
		contentPane.add(comboBox_7);
		
		JLabel lblNewLabel_24 = new JLabel("DHARWAD PEDA");
		lblNewLabel_24.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		lblNewLabel_24.setBounds(690, 185, 176, 14);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("DRY FRUITS BURFI");
		lblNewLabel_25.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_25.setBounds(1008, 186, 181, 14);
		contentPane.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("COCONUT BURFI");
		lblNewLabel_26.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		lblNewLabel_26.setBounds(370, 186, 160, 14);
		contentPane.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("CHOCOLATE BURFI");
		lblNewLabel_27.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		lblNewLabel_27.setBounds(37, 187, 174, 14);
		contentPane.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("MILK PEDA");
		lblNewLabel_28.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		lblNewLabel_28.setBounds(32, 489, 179, 14);
		contentPane.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("MYSORE PAK");
		lblNewLabel_29.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		lblNewLabel_29.setBounds(335, 489, 132, 14);
		contentPane.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("COOKIES");
		lblNewLabel_30.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		lblNewLabel_30.setBounds(675, 490, 118, 14);
		contentPane.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("RAGI BITES");
		lblNewLabel_31.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		lblNewLabel_31.setBounds(969, 489, 135, 14);
		contentPane.add(lblNewLabel_31);
		
		JButton btnNewButton = new JButton("");
		ImageIcon img10 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton.setIcon(img10);
		btnNewButton.setBounds(977, 530, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ImageIcon img17 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_1.setIcon(img17);
		btnNewButton_1.setBounds(690, 530, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");	
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ImageIcon img16 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_2.setIcon(img16);
		btnNewButton_2.setBounds(351, 530, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ImageIcon img15 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_3.setIcon(img15);
		btnNewButton_3.setBounds(56, 530, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ImageIcon img14 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_4.setIcon(img14);
		btnNewButton_4.setBounds(1032, 223, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ImageIcon img13 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_5.setIcon(img13);
		btnNewButton_5.setBounds(718, 223, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		ImageIcon img18= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_6.setIcon(img18);
		btnNewButton_6.setBounds(397, 223, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ImageIcon img11 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_7.setIcon(img11);
		btnNewButton_7.setBounds(56, 223, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Buttondemo btn=new Buttondemo();
				btn.show();
				dispose();
			}
		});
		ImageIcon img19 = new ImageIcon(this.getClass().getResource("/ok1.png"));
		btnNewButton_8.setIcon(img19);
		btnNewButton_8.setBounds(1159, 607, 97, 31);
		contentPane.add(btnNewButton_8);
	}
}
