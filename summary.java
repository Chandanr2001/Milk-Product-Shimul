import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTabbedPane;

public class summary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					summary frame = new summary();
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
	public summary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 1300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(435, 108, 65, 21);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(628, 109, 157, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("BUILDING NAME");
		lblNewLabel_1.setBounds(435, 150, 124, 20);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(628, 151, 157, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblRoadName = new JLabel("ROAD NAME");
		lblRoadName.setBounds(435, 191, 119, 21);
		lblRoadName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblRoadName);

		textField_2 = new JTextField();
		textField_2.setBounds(628, 192, 157, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("AREA");
		lblNewLabel_2.setBounds(435, 233, 119, 21);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);

		textField_3 = new JTextField();
		textField_3.setBounds(628, 234, 157, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("CITY");
		lblNewLabel_3.setBounds(435, 275, 123, 21);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("STATE");
		lblNewLabel_4.setBounds(435, 315, 119, 21);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);

		textField_4 = new JTextField();
		textField_4.setBounds(628, 276, 157, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(628, 315, 157, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("PIN CODE");
		lblNewLabel_5.setBounds(435, 363, 124, 21);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel_5);

		textField_6 = new JTextField();
		textField_6.setBounds(628, 364, 157, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		JButton btnOk = new JButton("OK");
		btnOk.setBounds(358, 650, 113, 33);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text, text1, text2, text3, text4, text5, text6, text7;

				textField_7.setText(textField.getText() + "\n"
						+ textField_1.getText() + "\n" + textField_2.getText()
						+ "\n" + textField_3.getText() + "\n"
						+ textField_4.getText() + "\n" + textField_5.getText()
						+ "\n" + textField_6.getText());
			}
		});
		btnOk.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(btnOk);

		btnNewButton_1 = new JButton("");
		ImageIcon img15 = new ImageIcon(this.getClass().getResource("/ok2.png"));
		btnNewButton_1.setIcon(img15);
		btnNewButton_1.setBounds(539, 650, 98, 33);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paymentdemo pym = new paymentdemo();
				pym.show();

				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(btnNewButton_1);

		btnNewButton_2 = new JButton("");
		ImageIcon img17 = new ImageIcon(this.getClass().getResource("/ok1.png"));
		btnNewButton_2.setIcon(img17);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Buttondemo btn=new Buttondemo();
				btn.show();
				dispose();
			}
		});
		btnNewButton_2.setBounds(705, 650, 98, 33);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_6 = new JLabel("DELIVERY ADDRESS");
		lblNewLabel_6.setBounds(539, 11, 129, 51);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblNewLabel_6);

		textField_7 = new JTextField();
		textField_7.setBounds(451, 411, 346, 202);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
	}
}
