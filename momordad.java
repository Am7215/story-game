package guiha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class momordad extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					momordad frame = new momordad();
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
	public momordad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(58, 92, 249, 211);
		contentPane.add(lblNewLabel);
		 ImageIcon aaee = new ImageIcon(this.getClass().getResource("/mom.jpg"));
		    lblNewLabel.setIcon(aaee);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(392, 92, 288, 211);
		contentPane.add(lblNewLabel_1);
		 ImageIcon aae = new ImageIcon(this.getClass().getResource("/dad.jpg"));
		    lblNewLabel_1.setIcon(aae);
		
		JButton btnNewButton = new JButton("CHOOSE MOM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mom k = new mom();
				mom.main(null);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(58, 281, 183, 47);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("You see your dad outside,who do u want to go with?");
		lblNewLabel_2.setFont(new Font("Segoe Script", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(10, 11, 630, 71);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MOM");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(110, 63, 197, 58);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DAD");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4.setBounds(430, 63, 222, 58);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("CHOOSE DAD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dad y = new dad();
				dad.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBounds(384, 281, 151, 47);
		contentPane.add(btnNewButton_1);
	}

}
