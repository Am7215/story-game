package guiha;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class wait extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wait frame = new wait();
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
	public wait() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(191, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 77, 283, 224);
		contentPane.add(lblNewLabel);
		ImageIcon hi = new ImageIcon(this.getClass().getResource("/g1.jpg"));
	    lblNewLabel.setIcon(hi);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(335, 97, 328, 184);
		contentPane.add(lblNewLabel_1);
		ImageIcon w = new ImageIcon(this.getClass().getResource("/g2.jpg"));
	    lblNewLabel_1.setIcon(w);
	    
	    JLabel lblNewLabel_2 = new JLabel("good choice. soon u hear your mom wake up and u go see her ");
	    lblNewLabel_2.setBackground(new Color(240, 240, 240));
	    lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD, 18));
	    lblNewLabel_2.setBounds(20, 11, 643, 62);
	    contentPane.add(lblNewLabel_2);
	    
	    JButton btnNewButton = new JButton("NEXT");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		wait2 ew =  new wait2();
	    		wait2.main(null);
	    		}
	    });
	    btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
	    btnNewButton.setBounds(407, 292, 132, 36);
	    contentPane.add(btnNewButton);
	}

}
