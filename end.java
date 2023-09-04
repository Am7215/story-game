package guiha;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class end extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					end frame = new end();
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
	public end() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 0, 417, 328);
		contentPane.add(lblNewLabel);
		 ImageIcon aae = new ImageIcon(this.getClass().getResource("/end.jpg"));
		 lblNewLabel.setIcon(aae);
		 
		 JLabel lblNewLabel_1 = new JLabel("THE END");
		 lblNewLabel_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD | Font.ITALIC, 20));
		 lblNewLabel_1.setBounds(472, 128, 156, 56);
		 contentPane.add(lblNewLabel_1);
	}
		
	}


