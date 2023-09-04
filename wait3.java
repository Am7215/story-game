package guiha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class wait3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wait3 frame = new wait3();
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
	public wait3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Tell her that its ok and agree to stay home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stay ne = new stay();
				stay.main(null);
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 255));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(65, 59, 498, 83);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("show her your puppy eyes");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puppy ew = new puppy();
				puppy.main(null);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 0, 128));
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(117, 214, 389, 76);
		contentPane.add(btnNewButton_1);
	}

}
