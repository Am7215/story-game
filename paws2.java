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

public class paws2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paws2 frame = new paws2();
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
	public paws2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 170, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 307, 207);
		contentPane.add(lblNewLabel);
		 ImageIcon aaee = new ImageIcon(this.getClass().getResource("/d1.png"));
		 lblNewLabel.setIcon(aaee);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(370, 11, 270, 207);
		contentPane.add(lblNewLabel_1);
		 ImageIcon aae = new ImageIcon(this.getClass().getResource("/d2.png"));
		 lblNewLabel_1.setIcon(aae);
		 
		 JLabel lblNewLabel_2 = new JLabel("Aww now that is so cute");
		 lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 19));
		 lblNewLabel_2.setBounds(20, 232, 432, 54);
		 contentPane.add(lblNewLabel_2);
		 
		 JButton btnNewButton = new JButton("NEXT");
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		paws3 ee = new paws3();
		 		paws3.main(null);
		 	}
		 });
		 btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 25));
		 btnNewButton.setBounds(370, 246, 267, 54);
		 contentPane.add(btnNewButton);
	}

}
