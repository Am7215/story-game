package guiha;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class page1 extends JFrame {

    private JPanel contentPane;
    private Clip musicClip;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    page1 frame = new page1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public page1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 677, 376);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Play the music automatically when the frame is created
        PlayMusic("good-night-160166.wav");

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(380, -17, 369, 368);
        contentPane.add(lblNewLabel);
        ImageIcon w = new ImageIcon(this.getClass().getResource("/hlp.png"));
        lblNewLabel.setIcon(w);

        JButton btnNewButton = new JButton("NEXT");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		page2 w = new page2();
        		page2.main(null);
        	}
        });
        btnNewButton.setFont(new Font("Zilla Slab SemiBold", Font.PLAIN, 25));
        btnNewButton.setBounds(20, 274, 150, 42);
        contentPane.add(btnNewButton);
        
        JLabel lblNewLabel_1 = new JLabel("You see the beautiful sky from your window");
        lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(10, 195, 360, 95);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_11 = new JLabel("");
        lblNewLabel_11.setBounds(-255, 0, 647, 339);
        contentPane.add(lblNewLabel_11);
        ImageIcon aw = new ImageIcon(this.getClass().getResource("/sunshine.jpg"));
        lblNewLabel_11.setIcon(aw);
        
    }

    public void PlayMusic(String location) {
        try {
            File musicPath = new File(location);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                musicClip = AudioSystem.getClip();
                musicClip.open(audioInput);
                musicClip.loop(Clip.LOOP_CONTINUOUSLY); // Set the loop count to LOOP_CONTINUOUSLY
                musicClip.start();
            } else {
                System.out.println("Can't find file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
