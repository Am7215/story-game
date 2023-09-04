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

public class yes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					yes frame = new yes();
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
	public yes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 169, 190));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(138, 11, 589, 230);
		contentPane.add(lblNewLabel);
		 ImageIcon aae = new ImageIcon(this.getClass().getResource("/d4.jpg"));
		 lblNewLabel.setIcon(aae);
		 
		 JLabel lblNewLabel_1 = new JLabel("They look cute&happy!! :0");
		 lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 20));
		 lblNewLabel_1.setBounds(148, 252, 361, 53);
		 contentPane.add(lblNewLabel_1);
		 
		 JLabel lblNewLabel_2 = new JLabel("Thank u for being here. Bye!");
		 lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 20));
		 lblNewLabel_2.setBounds(138, 295, 548, 33);
		 contentPane.add(lblNewLabel_2);
		 
		 JButton btnNewButton = new JButton("complete it");
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		end ea = new end();
		 		end.main(null);
		 	}
		 });
		 btnNewButton.setBackground(new Color(255, 128, 192));
		 btnNewButton.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		 btnNewButton.setBounds(511, 275, 141, 53);
		 contentPane.add(btnNewButton);
	}
	}


