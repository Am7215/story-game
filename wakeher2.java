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

public class wakeher2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wakeher2 frame = new wakeher2();
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
	public wakeher2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 327, 262);
		contentPane.add(lblNewLabel);
		ImageIcon aw = new ImageIcon(this.getClass().getResource("/ang3.png"));
	    lblNewLabel.setIcon(aw);
	        
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(336, 11, 317, 263);
		contentPane.add(lblNewLabel_1);
		ImageIcon h = new ImageIcon(this.getClass().getResource("/ang4.png"));
	    lblNewLabel_1.setIcon(h);
	    
	    JButton btnNewButton = new JButton("NEXT");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		wakeher3 ww = new wakeher3();
	    		wakeher3.main(null);
	    	}
	    });
	    btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
	    btnNewButton.setBounds(250, 284, 157, 44);
	    contentPane.add(btnNewButton);
	        
	}

}
