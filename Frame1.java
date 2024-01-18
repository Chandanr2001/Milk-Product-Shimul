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

public class Frame1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 1300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		ImageIcon img1=new ImageIcon(this.getClass().getResource("/Curd.png"));
		label.setIcon(img1);
		label.setBounds(427, 100, 125, 130);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("CURD");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel.setBounds(472, 230, 46, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("500ml");
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_1.setBounds(562, 113, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs.28");
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_2.setBounds(562, 156, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Qty");
		lblNewLabel_3.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_3.setBounds(562, 193, 31, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setBounds(595, 190, 37, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("");
		ImageIcon img12= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton.setIcon(img12);
		btnNewButton.setBounds(448, 252, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel label1 = new JLabel("");
		ImageIcon img2=new ImageIcon(this.getClass().getResource("/Buttermilk.png"));
		label1.setIcon(img2);
		label1.setBounds(695, 113, 130, 107);
		contentPane.add(label1);
		
		JLabel lblNewLabel_4 = new JLabel("200ml");
		lblNewLabel_4.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_4.setBounds(835, 126, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rs.07");
		lblNewLabel_5.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_5.setBounds(835, 156, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Qty");
		lblNewLabel_6.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_6.setBounds(835, 193, 31, 14);
		contentPane.add(lblNewLabel_6);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_1.setBounds(866, 190, 37, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_7 = new JLabel("BUTTERMILK");
		lblNewLabel_7.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_7.setBounds(716, 217, 97, 20);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_1 = new JButton("");
		ImageIcon img9= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_1.setIcon(img9);
		btnNewButton_1.setBounds(726, 248, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		ImageIcon img11= new ImageIcon(this.getClass().getResource("/Curd2.png"));
		lblNewLabel_8.setIcon(img11);
		lblNewLabel_8.setBounds(138, 126, 130, 87);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("200ml");
		lblNewLabel_9.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_9.setBounds(278, 137, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Rs.10");
		lblNewLabel_10.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_10.setBounds(278, 166, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Qty");
		lblNewLabel_11.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_11.setBounds(278, 193, 31, 14);
		contentPane.add(lblNewLabel_11);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setBounds(306, 190, 37, 20);
		contentPane.add(comboBox_2);
		
		JLabel lblNewLabel_12 = new JLabel("CURD");
		lblNewLabel_12.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_12.setBounds(181, 217, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		JButton btnNewButton_2 = new JButton("");
		ImageIcon img19= new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_2.setIcon(img19);
		btnNewButton_2.setBounds(157, 237, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Buttondemo btn=new Buttondemo();
				btn.show();
				dispose();
			}
		});
		ImageIcon img15= new ImageIcon(this.getClass().getResource("/ok1.png"));
		btnNewButton_3.setIcon(img15);
		btnNewButton_3.setBounds(736, 544, 97, 30);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_13 = new JLabel("");
		ImageIcon img16=new ImageIcon(this.getClass().getResource("/paneer1.png"));
		lblNewLabel_13.setIcon(img16);
		lblNewLabel_13.setBounds(137, 306, 131, 174);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("200g");
		lblNewLabel_14.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_14.setBounds(278, 347, 46, 23);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Rs.80");
		lblNewLabel_15.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_15.setBounds(278, 394, 46, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Qty");
		lblNewLabel_16.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_16.setBounds(278, 434, 31, 14);
		contentPane.add(lblNewLabel_16);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_3.setBounds(306, 431, 37, 20);
		contentPane.add(comboBox_3);
		
		JLabel lblNewLabel_17 = new JLabel("PANEER");
		lblNewLabel_17.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_17.setBounds(173, 481, 73, 23);
		contentPane.add(lblNewLabel_17);
		
		JButton btnNewButton_4 = new JButton("");
		ImageIcon img17=new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_4.setIcon(img17);
		btnNewButton_4.setBounds(157, 503, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_18 = new JLabel("");
		ImageIcon img18=new ImageIcon(this.getClass().getResource("/paneer2.png"));
		lblNewLabel_18.setIcon(img18);
		lblNewLabel_18.setBounds(427, 306, 130, 158);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("PANEER");
		lblNewLabel_19.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_19.setBounds(459, 471, 77, 20);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("1kg");
		lblNewLabel_20.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_20.setBounds(567, 348, 46, 20);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Rs.320");
		lblNewLabel_21.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_21.setBounds(567, 394, 51, 20);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Qty");
		lblNewLabel_22.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		lblNewLabel_22.setBounds(567, 434, 31, 14);
		contentPane.add(lblNewLabel_22);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Sitka Heading", Font.BOLD, 15));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4.setBounds(595, 431, 37, 20);
		contentPane.add(comboBox_4);
		
		JButton btnNewButton_5 = new JButton("");
		ImageIcon img20=new ImageIcon(this.getClass().getResource("/ok.png"));
		btnNewButton_5.setIcon(img20);
		btnNewButton_5.setBounds(437, 491, 89, 23);
		contentPane.add(btnNewButton_5);
	}
}
