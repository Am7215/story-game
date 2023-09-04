package guiha;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class wait2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wait2 frame = new wait2();
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
	public wait2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(21, 26, 321, 185);
		contentPane.add(lblNewLabel);
		ImageIcon w = new ImageIcon(this.getClass().getResource("/g3.jpg"));
	    lblNewLabel.setIcon(w);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(388, 0, 247, 237);
		contentPane.add(lblNewLabel_1);
		ImageIcon aa = new ImageIcon(this.getClass().getResource("/g4.jpg"));
	    lblNewLabel_1.setIcon(aa);
	    
	    JLabel lblNewLabel_3 = new JLabel("you eagerly ask her to take u out but she says NO");
	    lblNewLabel_3.setFont(new Font("Segoe Script", Font.BOLD, 15));
	    lblNewLabel_3.setBounds(0, 222, 432, 71);
	    contentPane.add(lblNewLabel_3);
	    
	    JButton btnNewButton = new JButton("NEXT");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		wait3 ma = new wait3();
	    		wait3.main(null);
	    	}
	    });
	    btnNewButton.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 25));
	    btnNewButton.setBounds(459, 278, 176, 50);
	    contentPane.add(btnNewButton);
	}

}
