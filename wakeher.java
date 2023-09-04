package guiha;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class wakeher extends JFrame {

    private JPanel contentPane;
    private Music musicPlayer; // Instance of the Music class

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    wakeher frame = new wakeher();
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
    public wakeher() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 677, 376);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(143, 23, 10));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Create an instance of the Music class
        musicPlayer = new Music();

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(30, 9, 213, 268);
        contentPane.add(lblNewLabel);
        ImageIcon i = new ImageIcon(this.getClass().getResource("/ang1.png"));
        lblNewLabel.setIcon(i);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBounds(362, 21, 265, 244);
        contentPane.add(lblNewLabel_1);
        ImageIcon e = new ImageIcon(this.getClass().getResource("/ang2.png"));
        lblNewLabel_1.setIcon(e);

        JButton btnNewButton = new JButton("Play Music");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the PlayMusic method with the file path
                musicPlayer.PlayMusic("angry.wav");
            }
        });
        btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
        btnNewButton.setBounds(10, 288, 287, 42);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("NEXT");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		wakeher2 qq = new wakeher2();
        		wakeher2.main(null);
        	}
        });
        btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
        btnNewButton_1.setBounds(390, 288, 224, 42);
        contentPane.add(btnNewButton_1);
    }
}
