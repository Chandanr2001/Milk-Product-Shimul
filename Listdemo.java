import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Listdemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listdemo frame = new Listdemo();
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
	public Listdemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 1300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img15 = new ImageIcon(this.getClass().getResource("/shimul.png"));
		lblNewLabel.setIcon(img15);
		lblNewLabel.setBounds(404, 151, 300, 151);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon img16 = new ImageIcon(this.getClass().getResource("/welcome.png"));
		lblNewLabel_1.setIcon(img16);
		lblNewLabel_1.setBounds(267, 314, 600, 221);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Buttondemo btn=new Buttondemo();
				btn.show();
				dispose();
			}
		});
		ImageIcon img17 = new ImageIcon(this.getClass().getResource("/ok2.png"));
		btnNewButton.setIcon(img17);
		btnNewButton.setBounds(835, 622, 103, 34);
		contentPane.add(btnNewButton);
	}
}
