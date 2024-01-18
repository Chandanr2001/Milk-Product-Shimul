import java.awt.BorderLayout;

import java.awt.Image;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import javax.swing.JButton;
//import java.awt.event.ActionEvent;
//import javax.swing.JTextField;
import javax.swing.JLabel;
//import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4 frame = new Frame4();
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
	public Frame4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 1300, 1300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		label.setBounds(216, 33, 130, 114);
		ImageIcon img=new ImageIcon(this.getClass().getResource("/Ghee.png"));
		contentPane.setLayout(null);
		label.setIcon(img);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("GHEE");
		lblNewLabel.setBounds(258, 145, 46, 14);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("200g");
		lblNewLabel_1.setBounds(356, 49, 46, 14);
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs.95");
		lblNewLabel_2.setBounds(356, 74, 46, 20);
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Qty");
		lblNewLabel_3.setBounds(356, 105, 29, 14);
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(382, 105, 37, 20);
		comboBox.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox);
		
		JLabel label1 = new JLabel("");
		label1.setBounds(479, 33, 130, 120);
		ImageIcon img1=new ImageIcon(this.getClass().getResource("/Ghee1.png"));
		label1.setIcon(img1);
		contentPane.add(label1);
		
		JLabel lblNewLabel_4 = new JLabel("GHEE");
		lblNewLabel_4.setBounds(534, 164, 46, 14);
		lblNewLabel_4.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("500g");
		lblNewLabel_5.setBounds(629, 48, 51, 17);
		lblNewLabel_5.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Rs.220");
		lblNewLabel_6.setBounds(629, 77, 51, 14);
		lblNewLabel_6.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Qty");
		lblNewLabel_7.setBounds(629, 105, 29, 14);
		lblNewLabel_7.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(656, 102, 37, 20);
		comboBox_1.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_1);
		
		JLabel label2 = new JLabel("");
		label2.setBounds(738, 33, 104, 145);
		ImageIcon img2=new ImageIcon(this.getClass().getResource("/Ghee2.png"));
		label2.setIcon(img2);
		contentPane.add(label2);
		
		JLabel lblNewLabel_8 = new JLabel("1kg");
		lblNewLabel_8.setBounds(863, 49, 37, 14);
		lblNewLabel_8.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Rs.425");
		lblNewLabel_9.setBounds(851, 74, 59, 20);
		lblNewLabel_9.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Qty");
		lblNewLabel_10.setBounds(851, 105, 29, 14);
		lblNewLabel_10.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(877, 102, 37, 20);
		comboBox_2.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_11 = new JLabel("GHEE");
		lblNewLabel_11.setBounds(777, 185, 46, 14);
		lblNewLabel_11.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("");
		ImageIcon img0= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton.setIcon(img0);
		btnNewButton.setBounds(236, 158, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		ImageIcon img10 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_1.setIcon(img10);
		btnNewButton_1.setBounds(514, 181, 86, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		ImageIcon img11 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_2.setIcon(img11);
		btnNewButton_2.setBounds(748, 199, 86, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel label3 = new JLabel("");
		label3.setBounds(216, 257, 124, 145);
		ImageIcon img3=new ImageIcon(this.getClass().getResource("/Cheese1.png"));
		label3.setIcon(img3);
		contentPane.add(label3);
		
		JLabel lblNewLabel_12 = new JLabel("100g");
		lblNewLabel_12.setBounds(350, 282, 46, 14);
		lblNewLabel_12.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Qty");
		lblNewLabel_13.setBounds(350, 342, 29, 14);
		lblNewLabel_13.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_13);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(382, 339, 37, 20);
		comboBox_3.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_14 = new JLabel("CHEESE");
		lblNewLabel_14.setBounds(258, 402, 65, 20);
		lblNewLabel_14.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_14);
		
		JButton btnNewButton_3 = new JButton("");
		ImageIcon img12= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_3.setIcon(img12);
		btnNewButton_3.setBounds(236, 425, 86, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_15 = new JLabel("Rs.70");
		lblNewLabel_15.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_15.setBounds(350, 316, 46, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel label4 = new JLabel("");
		ImageIcon img4=new ImageIcon(this.getClass().getResource("/Cheese2.png"));
		label4.setIcon(img4);
		label4.setBounds(479, 265, 117, 125);
		contentPane.add(label4);
		
		JLabel lblNewLabel_16 = new JLabel("CHEESE");
		lblNewLabel_16.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_16.setBounds(513, 405, 67, 14);
		contentPane.add(lblNewLabel_16);
		
		JButton btnNewButton_4 = new JButton("");
		ImageIcon img13= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_4.setIcon(img13);
		btnNewButton_4.setBounds(498, 425, 86, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_17 = new JLabel("200g");
		lblNewLabel_17.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_17.setBounds(612, 282, 46, 14);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Rs.120");
		lblNewLabel_18.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_18.setBounds(606, 316, 46, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Qty");
		lblNewLabel_19.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_19.setBounds(606, 356, 29, 14);
		contentPane.add(lblNewLabel_19);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4.setBounds(640, 353, 37, 20);
		contentPane.add(comboBox_4);
		
		JLabel label5 = new JLabel("");
		ImageIcon img5=new ImageIcon(this.getClass().getResource("/Cheese.png"));
		label5.setIcon(img5);
		label5.setBounds(730, 257, 150, 114);
		contentPane.add(label5);		
		
		JLabel lblNewLabel_20 = new JLabel("1kg");
		lblNewLabel_20.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_20.setBounds(890, 271, 46, 14);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Rs.450");
		lblNewLabel_21.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_21.setBounds(890, 303, 46, 14);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Qty");
		lblNewLabel_22.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_22.setBounds(890, 342, 29, 14);
		contentPane.add(lblNewLabel_22);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_5.setBounds(920, 339, 37, 20);
		contentPane.add(comboBox_5);
		
		JLabel lblNewLabel_23 = new JLabel("CHEESE");
		lblNewLabel_23.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_23.setBounds(777, 382, 65, 20);
		contentPane.add(lblNewLabel_23);
		
		JButton btnNewButton_5 = new JButton("");
		ImageIcon img14= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_5.setIcon(img14);
		btnNewButton_5.setBounds(761, 405, 86, 23);
		contentPane.add(btnNewButton_5);
		
		JLabel label6 = new JLabel("");
		ImageIcon img6=new ImageIcon(this.getClass().getResource("/Butter1.png"));
		label6.setIcon(img6);
		label6.setBounds(216, 486, 143, 114);
		contentPane.add(label6);
		
		JLabel lblNewLabel_24 = new JLabel("200g");
		lblNewLabel_24.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_24.setBounds(369, 507, 46, 14);
		contentPane.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Rs.95");
		lblNewLabel_25.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_25.setBounds(369, 532, 46, 14);
		contentPane.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Qty");
		lblNewLabel_26.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_26.setBounds(369, 563, 29, 14);
		contentPane.add(lblNewLabel_26);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_6.setBounds(403, 560, 37, 20);
		contentPane.add(comboBox_6);
		
		JLabel lblNewLabel_27 = new JLabel("BUTTER");
		lblNewLabel_27.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_27.setBounds(269, 599, 65, 14);
		contentPane.add(lblNewLabel_27);
		
		JButton btnNewButton_6 = new JButton("");
		ImageIcon img15= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_6.setIcon(img15);
		btnNewButton_6.setBounds(247, 615, 86, 23);
		contentPane.add(btnNewButton_6);
		
		JLabel label7 = new JLabel("");
		ImageIcon img7=new ImageIcon(this.getClass().getResource("/Butter2.png"));
		label7.setIcon(img7);
		label7.setBounds(468, 489, 150, 111);
		contentPane.add(label7);
		
		JLabel lblNewLabel_28 = new JLabel("500g");
		lblNewLabel_28.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_28.setBounds(629, 507, 46, 14);
		contentPane.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("Rs.200");
		lblNewLabel_29.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_29.setBounds(629, 532, 51, 14);
		contentPane.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Qty");
		lblNewLabel_30.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_30.setBounds(629, 563, 29, 14);
		contentPane.add(lblNewLabel_30);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_7.setBounds(656, 560, 37, 20);
		contentPane.add(comboBox_7);
		
		JLabel lblNewLabel_31 = new JLabel("BUTTER");
		lblNewLabel_31.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_31.setBounds(527, 599, 69, 23);
		contentPane.add(lblNewLabel_31);
		
		JButton btnNewButton_7 = new JButton("");
		ImageIcon img16= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_7.setIcon(img16);
		btnNewButton_7.setBounds(514, 625, 86, 23);
		contentPane.add(btnNewButton_7);
		
		JLabel label8 = new JLabel("");
		ImageIcon img8=new ImageIcon(this.getClass().getResource("/Butter3.png"));
		label8.setIcon(img8);
		label8.setBounds(730, 486, 150, 103);
		contentPane.add(label8);
		
		JLabel lblNewLabel_32 = new JLabel("1kg");
		lblNewLabel_32.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_32.setBounds(890, 507, 46, 14);
		contentPane.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("Rs.400");
		lblNewLabel_33.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_33.setBounds(890, 532, 51, 20);
		contentPane.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("Qty");
		lblNewLabel_34.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_34.setBounds(890, 563, 29, 14);
		contentPane.add(lblNewLabel_34);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_8.setBounds(920, 560, 37, 20);
		contentPane.add(comboBox_8);
		
		JLabel lblNewLabel_35 = new JLabel("BUTTER");
		lblNewLabel_35.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_35.setBounds(796, 586, 65, 20);
		contentPane.add(lblNewLabel_35);
		
		JButton btnNewButton_8 = new JButton("");
		ImageIcon img17= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_8.setIcon(img17);
		btnNewButton_8.setBounds(772, 615, 86, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Buttondemo btn=new Buttondemo();
				btn.show();
				dispose();
			}
		});
		ImageIcon img18= new ImageIcon(this.getClass().getResource("/ok1.png"));
		btnNewButton_9.setIcon(img18);
		btnNewButton_9.setBounds(877, 652, 96, 32);
		contentPane.add(btnNewButton_9);
	}
}
