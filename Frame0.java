import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame0 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame0 frame = new Frame0();
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
	public Frame0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 1300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		label.setBounds(400, 130, 121, 140);
		ImageIcon img1=new ImageIcon(this.getClass().getResource("/Milk.png"));
		contentPane.setLayout(null);
		label.setIcon(img1);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("MILK");
		lblNewLabel.setBounds(442, 281, 46, 14);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(414, 299, 89, 23);
		ImageIcon img4= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton.setIcon(img4);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("100ml");
		lblNewLabel_1.setBounds(534, 152, 56, 23);
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs.11");
		lblNewLabel_2.setBounds(531, 186, 46, 23);
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Qty");
		lblNewLabel_3.setBounds(531, 220, 34, 23);
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(561, 221, 40, 20);
		comboBox.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox);
		
		JLabel label1 = new JLabel("");
		label1.setBounds(683, 130, 121, 132);
		ImageIcon img2=new ImageIcon(this.getClass().getResource("/Milk1.png"));
		label1.setIcon(img2);
		contentPane.add(label1);
		
		JLabel lblNewLabel_4 = new JLabel("MILK");
		lblNewLabel_4.setBounds(722, 273, 46, 22);
		lblNewLabel_4.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(698, 299, 83, 23);
		ImageIcon img5= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_1.setIcon(img5);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("500ml");
		lblNewLabel_5.setBounds(814, 156, 46, 23);
		lblNewLabel_5.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Rs.19");
		lblNewLabel_6.setBounds(814, 186, 46, 18);
		lblNewLabel_6.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Qty");
		lblNewLabel_7.setBounds(814, 224, 28, 19);
		lblNewLabel_7.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(846, 223, 34, 20);
		comboBox_1.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_1);
		
		JLabel label2 = new JLabel("");
		label2.setBounds(683, 368, 121, 123);
		ImageIcon img3=new ImageIcon(this.getClass().getResource("/Milk2.png"));
		label2.setIcon(img3);
		contentPane.add(label2);
		
		JLabel lblNewLabel_8 = new JLabel("MILK");
		lblNewLabel_8.setBounds(722, 496, 46, 14);
		lblNewLabel_8.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(704, 516, 83, 23);
		ImageIcon img6= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_2.setIcon(img6);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("500ml");
		lblNewLabel_9.setBounds(814, 379, 46, 23);
		lblNewLabel_9.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Rs.22");
		lblNewLabel_10.setBounds(814, 419, 46, 14);
		lblNewLabel_10.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Qty");
		lblNewLabel_11.setBounds(814, 451, 28, 14);
		lblNewLabel_11.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		contentPane.add(lblNewLabel_11);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(846, 448, 34, 20);
		comboBox_2.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		contentPane.add(comboBox_2);
		ImageIcon img9= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_1.setIcon(img9);
		
		JLabel lblMilk = new JLabel("MILK");
		lblMilk.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblMilk.setBounds(1009, 299, 46, 23);
		contentPane.add(lblMilk);
		
		JLabel lblNewLabel_12 = new JLabel("");
		ImageIcon img7= new ImageIcon(this.getClass().getResource("/Milk4.png"));
		lblNewLabel_12.setIcon(img7);
		lblNewLabel_12.setBounds(961, 123, 130, 165);
		contentPane.add(lblNewLabel_12);
		
		JButton btnNewButton_3 = new JButton("");
		ImageIcon img8= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_3.setIcon(img8);
		btnNewButton_3.setBounds(985, 320, 83, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_13 = new JLabel("1l");
		lblNewLabel_13.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_13.setBounds(1111, 140, 34, 23);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Rs.35");
		lblNewLabel_14.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_14.setBounds(1111, 190, 46, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Qty");
		lblNewLabel_15.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_15.setBounds(1111, 229, 28, 14);
		contentPane.add(lblNewLabel_15);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_3.setBounds(1136, 224, 34, 20);
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_16 = new JLabel("");
		ImageIcon img10= new ImageIcon(this.getClass().getResource("/Milk3.png"));
		lblNewLabel_16.setIcon(img10);
		lblNewLabel_16.setBounds(400, 368, 130, 95);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("MILK");
		lblNewLabel_17.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_17.setBounds(442, 454, 46, 23);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("200ml");
		lblNewLabel_18.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_18.setBounds(540, 383, 46, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Rs.10");
		lblNewLabel_19.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_19.setBounds(540, 406, 46, 14);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Qty");
		lblNewLabel_20.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_20.setBounds(544, 431, 28, 14);
		contentPane.add(lblNewLabel_20);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4.setBounds(573, 428, 40, 20);
		contentPane.add(comboBox_4);
		
		JButton btnNewButton_4 = new JButton("");
		ImageIcon img11= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_4.setIcon(img11);
		btnNewButton_4.setBounds(414, 474, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Buttondemo btn=new Buttondemo();
						btn.show();
				dispose();
			}
		});
		ImageIcon img12= new ImageIcon(this.getClass().getResource("/ok1.png"));
		btnNewButton_5.setIcon(img12);
		btnNewButton_5.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		btnNewButton_5.setBounds(961, 595, 101, 32);
		contentPane.add(btnNewButton_5);
	}
}
