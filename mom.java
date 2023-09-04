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

public class mom extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mom frame = new mom();
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
	public mom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 183, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(249, 11, 170, 238);
		contentPane.add(lblNewLabel);
		 ImageIcon aaee = new ImageIcon(this.getClass().getResource("/a4.1.1.jpg"));
		    lblNewLabel.setIcon(aaee);
		    
		    JLabel lblNewLabel_1 = new JLabel("GREAT JOB. now u hold her hand and start walking but then u suddenly notice something");
		    lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 16));
		    lblNewLabel_1.setBounds(46, 207, 574, 82);
		    contentPane.add(lblNewLabel_1);
		    
		    JLabel lblNewLabel_2 = new JLabel("you notice something really cute");
		    lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 16));
		    lblNewLabel_2.setBounds(58, 238, 511, 68);
		    contentPane.add(lblNewLabel_2);
		    
		    JButton btnNewButton = new JButton("NEXT");
		    btnNewButton.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		doggies m = new doggies();
		    		doggies.main(null);
		    	}
		    });
		    btnNewButton.setBackground(new Color(255, 128, 192));
		    btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 20));
		    btnNewButton.setBounds(386, 278, 220, 50);
		    contentPane.add(btnNewButton);
	}

}
