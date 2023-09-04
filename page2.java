package guiha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class page2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 frame = new page2();
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
	public page2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Wake your mom up and go for a walk.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wakeher ha = new wakeher();
				wakeher.main(null);
			}
			
		});
		btnNewButton.setBackground(new Color(216, 69, 33));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(24, 51, 601, 86);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("wait for her to wake up and ask for a walk");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wait t = new wait();
				wait.main(null);
			}
		});
		btnNewButton_1.setBackground(new Color(0, 196, 0));
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		btnNewButton_1.setBounds(24, 201, 601, 86);
		contentPane.add(btnNewButton_1);
	}
}
