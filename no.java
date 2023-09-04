package guiha;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class no extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					no frame = new no();
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
	public no() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(234, 38, 17));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(105, 49, 425, 226);
		contentPane.add(lblNewLabel);
		 ImageIcon aae = new ImageIcon(this.getClass().getResource("/dd.jpg"));
		 lblNewLabel.setIcon(aae);
		 
		 JButton btnNewButton = new JButton("TRY AGAIN");
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		paws3 a = new paws3();
		 		paws3.main(null);
		 	}
		 });
		 btnNewButton.setBackground(new Color(0, 0, 0));
		 btnNewButton.setForeground(new Color(255, 255, 255));
		 btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 20));
		 btnNewButton.setBounds(92, 286, 443, 42);
		 contentPane.add(btnNewButton);
		 
		 JLabel lblNewLabel_1 = new JLabel("OH NO i think he is going to bite u");
		 lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 20));
		 lblNewLabel_1.setBounds(69, 11, 492, 30);
		 contentPane.add(lblNewLabel_1);
	}
	}


