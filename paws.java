 package guiha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paws extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paws frame = new paws();
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
	public paws() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676,376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("The Dog was abandoned by its owner. Do u want to adopt it?");
		lblNewLabel.setBackground(new Color(255, 128, 255));
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(0, 11, 662, 101);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("YES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paws2 a= new paws2();
				paws2.main(null);
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 64));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(68, 142, 524, 101);
		contentPane.add(btnNewButton);
	}

}
