package guiha;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class stay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stay frame = new stay();
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
	public stay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, -11, 309, 230);
		contentPane.add(lblNewLabel);
		ImageIcon aa = new ImageIcon(this.getClass().getResource("/g7.jpg"));
	    lblNewLabel.setIcon(aa);
	    
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(346, 0, 307, 306);
		contentPane.add(lblNewLabel_1);
		ImageIcon aaa = new ImageIcon(this.getClass().getResource("/g6.2.jpg"));
	    lblNewLabel_1.setIcon(aaa);
	    
		
		JLabel lblNewLabel_2 = new JLabel("Happy with your behaviour \r\nshe decides to surprise u");
		lblNewLabel_2.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(21, 272, 632, 91);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stay1 no = new stay1();
				stay1.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(76, 230, 164, 51);
		contentPane.add(btnNewButton);
	}

}
