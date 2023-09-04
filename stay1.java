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

public class stay1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stay1 frame = new stay1();
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
	public stay1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(23, 11, 268, 276);
		contentPane.add(lblNewLabel);
		ImageIcon aa = new ImageIcon(this.getClass().getResource("/g6.jpg"));
	    lblNewLabel.setIcon(aa);
	    
		
		JLabel lblNewLabel_1 = new JLabel("She gives u a lollipop --_--");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(23, 279, 480, 60);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("TRY AGAIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wait3 ww = new wait3();
				wait3.main(null);
			}
		});
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(361, 103, 243, 100);
		contentPane.add(btnNewButton);
	}

}
