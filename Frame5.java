import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Frame5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame5 frame = new Frame5();
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
	public Frame5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 1300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		label.setBounds(51, 61, 120, 109);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/chocolatei.png"));
		contentPane.setLayout(null);
		label.setIcon(img);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Rs.80.00");
		lblNewLabel_1.setBounds(181, 61, 70, 14);
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qnt");
		lblNewLabel_2.setBounds(181, 136, 46, 14);
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(212, 133, 37, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox);
		
		JLabel label2 = new JLabel("");
		label2.setBounds(424, 53, 108, 109);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/mangoi.png"));
		label2.setIcon(img2);
		contentPane.add(label2);
		
		JLabel lblNewLabel_4 = new JLabel("Rs.80.00");
		lblNewLabel_4.setBounds(547, 61, 76, 14);
		lblNewLabel_4.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Qnt");
		lblNewLabel_5.setBounds(542, 136, 46, 14);
		lblNewLabel_5.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(573, 133, 37, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_1);
		
		JLabel label3 = new JLabel("");
		label3.setBounds(723, 53, 118, 109);
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/kajui.png"));
		label3.setIcon(img3);
		contentPane.add(label3);
		
		JLabel lblNewLabel_7 = new JLabel("Rs.80.00");
		lblNewLabel_7.setBounds(862, 61, 76, 14);
		lblNewLabel_7.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Qnt");
		lblNewLabel_8.setBounds(866, 136, 46, 14);
		lblNewLabel_8.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_8);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(899, 130, 37, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_2);
		
		JLabel label4 = new JLabel("");
		label4.setBounds(1034, 41, 113, 129);
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/pineapplei.png"));
		label4.setIcon(img4);
		contentPane.add(label4);
		
		JLabel lblNewLabel_3 = new JLabel("Rs.80.00");
		lblNewLabel_3.setBounds(1157, 61, 66, 14);
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("Qnt");
		lblNewLabel_6.setBounds(1157, 136, 46, 14);
		lblNewLabel_6.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(1186, 133, 37, 20);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_3);
		
		JLabel label5 = new JLabel("");
		label5.setBounds(51, 323, 120, 118);
		ImageIcon img12 = new ImageIcon(this.getClass().getResource("/strawberryi.png"));
		label5.setIcon(img12);
		contentPane.add(label5);
		
		JLabel lblNewLabel = new JLabel("Rs.80.00");
		lblNewLabel.setBounds(181, 321, 70, 14);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_10 = new JLabel("Qnt");
		lblNewLabel_10.setBounds(181, 408, 46, 14);
		lblNewLabel_10.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_10);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(212, 405, 39, 20);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_4);
		
		JLabel label6 = new JLabel("");
		label6.setBounds(424, 310, 118, 131);
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/vanillai.png"));
		label6.setIcon(img6);
		contentPane.add(label6);
		
		JLabel lblNewLabel_11 = new JLabel("Rs.80.00");
		lblNewLabel_11.setBounds(542, 332, 81, 14);
		lblNewLabel_11.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Qnt");
		lblNewLabel_12.setBounds(542, 408, 46, 14);
		lblNewLabel_12.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_12);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(573, 405, 40, 20);
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_5);
		
		JLabel label7 = new JLabel("");
		label7.setBounds(723, 329, 118, 112);
		ImageIcon img7 = new ImageIcon(this.getClass().getResource("/tuttii.png"));
		label7.setIcon(img7);
		label7.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(label7);
		
		
		JLabel lblNewLabel_13 = new JLabel("Rs.80.00");
		lblNewLabel_13.setBounds(855, 330, 83, 18);
		lblNewLabel_13.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Qnt");
		lblNewLabel_14.setBounds(862, 408, 46, 14);
		lblNewLabel_14.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_14);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(888, 405, 37, 20);
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_6);
		
		JLabel lblNewLabel_9 = new JLabel("CHOCOLATE");
		lblNewLabel_9.setBounds(51, 199, 141, 14);
		lblNewLabel_9.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_15 = new JLabel("MANGO");
		lblNewLabel_15.setBounds(453, 199, 79, 14);
		lblNewLabel_15.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("KAJU");
		lblNewLabel_16.setBounds(758, 193, 46, 26);
		lblNewLabel_16.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("PINE APPLE");
		lblNewLabel_17.setBounds(1034, 199, 141, 14);
		lblNewLabel_17.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("STRAWBERRY");
		lblNewLabel_18.setBounds(51, 466, 141, 14);
		lblNewLabel_18.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("VANILLA");
		lblNewLabel_19.setBounds(442, 466, 131, 14);
		lblNewLabel_19.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("TUTTI FRUTTI");
		lblNewLabel_20.setBounds(723, 466, 141, 14);
		lblNewLabel_20.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		contentPane.add(lblNewLabel_20);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(71, 224, 89, 23);
		ImageIcon img11 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton.setIcon(img11);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(442, 224, 89, 23);
		ImageIcon img13 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_1.setIcon(img13);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(735, 224, 89, 23);
		ImageIcon img14 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_2.setIcon(img14);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(1044, 224, 89, 23);
		ImageIcon img15 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_3.setIcon(img15);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(752, 497, 89, 23);
		ImageIcon img16 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_4.setIcon(img16);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(443, 497, 89, 23);
		ImageIcon img17 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_5.setIcon(img17);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(61, 497, 89, 23);
		ImageIcon img18 = new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_6.setIcon(img18);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Buttondemo btn=new Buttondemo();
				btn.show();
				dispose();
			}
		});
		ImageIcon img20=new ImageIcon(this.getClass().getResource("/ok1.png"));
		btnNewButton_7.setIcon(img20);
		btnNewButton_7.setBounds(1024, 582, 96, 32);
		contentPane.add(btnNewButton_7);
	}
}
