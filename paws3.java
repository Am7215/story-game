package guiha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paws3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paws3 frame = new paws3();
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
	public paws3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Would u like to get him a friend? :)");
		lblNewLabel.setBackground(new Color(255, 128, 192));
		lblNewLabel.setFont(new Font("Segoe Script", Font.ITALIC, 20));
		lblNewLabel.setBounds(111, 39, 579, 75);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("YES ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yes ye = new yes();
				yes.main(null);
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 192));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(10, 181, 305, 102);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("NO");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				no nw = new no();
				no.main(null);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 192));
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 25));
		btnNewButton_1.setBounds(337, 181, 305, 102);
		contentPane.add(btnNewButton_1);
	}

}
