import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class delivery extends JFrame {

	private JPanel contentPane;
	private JTextField textField_0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delivery frame = new delivery();
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
	public delivery() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 1300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSummary = new JLabel("SUMMARY.");
		lblSummary.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblSummary.setBounds(492, 23, 359, 46);
		contentPane.add(lblSummary);

		textField_0 = new JTextField();
		// textField.setText(textField_7.getText);
		textField_0.setBounds(333, 103, 483, 207);
		contentPane.add(textField_0);
		textField_0.setColumns(10);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnOk.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnOk.setBounds(371, 518, 89, 23);
		contentPane.add(btnOk);

		JButton btnBack = new JButton("");
		ImageIcon img15 = new ImageIcon(this.getClass().getResource("/ok1.png"));
		btnBack.setIcon(img15);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				delivery ff = new delivery();
				ff.show();

				dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnBack.setBounds(632, 505, 96, 33);
		contentPane.add(btnBack);
	}
}
