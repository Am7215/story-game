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

public class dad extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dad frame = new dad();
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
	public dad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(22, 0, 128, 243);
		contentPane.add(lblNewLabel);
		 ImageIcon aa = new ImageIcon(this.getClass().getResource("/a4.1.jpg"));
		 lblNewLabel.setIcon(aa);
	
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(183, 11, 225, 232);
		contentPane.add(lblNewLabel_1);
		 ImageIcon a = new ImageIcon(this.getClass().getResource("/a4.2.jpg"));
		 lblNewLabel_1.setIcon(a);
	
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(435, 11, 172, 232);
		contentPane.add(lblNewLabel_2);
		 ImageIcon ae = new ImageIcon(this.getClass().getResource("/a4.3.jpg"));
		 lblNewLabel_2.setIcon(ae);
		 
		 JButton btnNewButton = new JButton("UH OH...that did not go well. TRY AGAIN");
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		momordad aaa = new momordad();
		 		momordad.main(null);
		 	}
		 });
		 btnNewButton.setBackground(new Color(0, 0, 0));
		 btnNewButton.setForeground(new Color(255, 255, 255));
		 btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 17));
		 btnNewButton.setBounds(10, 267, 621, 48);
		 contentPane.add(btnNewButton);
	
	}

}
