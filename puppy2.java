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

public class puppy2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					puppy2 frame = new puppy2();
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
	public puppy2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(54, 65, 232, 248);
		contentPane.add(lblNewLabel);
		 ImageIcon aaee = new ImageIcon(this.getClass().getResource("/a2.jpg"));
		    lblNewLabel.setIcon(aaee);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(296, 65, 207, 248);
		contentPane.add(lblNewLabel_1);
		 ImageIcon aa = new ImageIcon(this.getClass().getResource("/a3.jpg"));
		    lblNewLabel_1.setIcon(aa);
		    
		    JButton btnNewButton = new JButton("NEXT");
		    btnNewButton.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		momordad ee = new momordad();
		    		momordad.main(null);
		    		
		    	}
		    });
		    btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 25));
		    btnNewButton.setBounds(522, 168, 119, 67);
		    contentPane.add(btnNewButton);
		    
		    JLabel lblNewLabel_2 = new JLabel("it worked on her! And she takes u outside");
		    lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD, 20));
		    lblNewLabel_2.setBounds(54, 11, 642, 47);
		    contentPane.add(lblNewLabel_2);
	}

}
