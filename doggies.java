package guiha;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class doggies extends JFrame {

    private JPanel contentPane;
    private Music musicPlayer; // Instance of the Music class

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    doggies frame = new doggies();
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
    public doggies() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 676, 376);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(231, 150, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Create an instance of the Music class
        musicPlayer = new Music();

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(10, 0, 312, 230);
        contentPane.add(lblNewLabel);
        ImageIcon aaee = new ImageIcon(this.getClass().getResource("/a5.jpg"));
        lblNewLabel.setIcon(aaee);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setBounds(425, 40, 183, 242);
        contentPane.add(lblNewLabel_1);
        ImageIcon aae = new ImageIcon(this.getClass().getResource("/a6.jpg"));
        lblNewLabel_1.setIcon(aae);

        JButton btnNewButton = new JButton("VISIT THE PAWS");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the PlayMusic method with the file path
                musicPlayer.PlayMusic("dogcry.wav");
                paws an = new paws();
                an.main(null);
            }
        });
        btnNewButton.setBackground(new Color(255, 125, 239));
        btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 25));
        btnNewButton.setBounds(10, 241, 312, 87);
        contentPane.add(btnNewButton);
    }
}
