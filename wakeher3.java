package guiha;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class wakeher3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wakeher3 frame = new wakeher3();
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
	public wakeher3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		 lblNewLabel.setBounds(51, 68, 215, 271);
		 contentPane.add(lblNewLabel);
		 ImageIcon ah = new ImageIcon(this.getClass().getResource("/5ang.png"));
	     lblNewLabel.setIcon(ah);
		
		JLabel lblNewLabel_1 = new JLabel("You beg her but she still says no. would u like to try again?");
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, -27, 653, 138);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("TRY AGAIN :(");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page2 q = new page2();
				page2.main(null);
			}
		});
		btnNewButton.setBackground(new Color(233, 63, 14));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		btnNewButton.setBounds(320, 99, 300, 105);
		contentPane.add(btnNewButton);
	}

}
