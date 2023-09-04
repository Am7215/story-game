package guiha;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class puppy extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					puppy frame = new puppy();
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
	public puppy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 241, 231);
		contentPane.add(lblNewLabel);
		ImageIcon aa = new ImageIcon(this.getClass().getResource("/g5.1.jpg"));
	    lblNewLabel.setIcon(aa);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(261, 21, 173, 212);
		contentPane.add(lblNewLabel_1);
		ImageIcon aae = new ImageIcon(this.getClass().getResource("/g5.2.jpg"));
	    lblNewLabel_1.setIcon(aae);
	    
	    JLabel lblNewLabel_2 = new JLabel("New label");
	    lblNewLabel_2.setBounds(444, 21, 208, 218);
	    contentPane.add(lblNewLabel_2);
	    ImageIcon aaee = new ImageIcon(this.getClass().getResource("/a1.jpg"));
	    lblNewLabel_2.setIcon(aaee);
	    
	    JButton btnNewButton = new JButton("NEXT");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		puppy2 nn = new puppy2();
	    		puppy2.main(null);
	    	}
	    });
	    btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 20));
	    btnNewButton.setBounds(261, 270, 160, 45);
	    contentPane.add(btnNewButton);
	}

}
