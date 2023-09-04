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

public class jj extends JFrame {

    private JPanel contentPane;
    private Clip musicClip;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    jj frame = new jj();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public jj() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 677, 376);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("HI , WELCOME TO MY PAW PROJECT ! (interactive story) ");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
        lblNewLabel.setBounds(10, 260, 643, 68);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Please click START to continue...");
        lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(173, 87, 366, 93);
        contentPane.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("START");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopMusic(); // Stop the music
                page1 hi = new page1();
                hi.setVisible(true);
                dispose(); // Close the current frame
            }
        });
        btnNewButton.setFont(new Font("Showcard Gothic", Font.PLAIN, 15));
        btnNewButton.setBounds(227, 191, 160, 53);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_2 = new JLabel(" ");
        lblNewLabel_2.setBounds(-145, -160, 829, 531);
        contentPane.add(lblNewLabel_2);
        ImageIcon hi = new ImageIcon(this.getClass().getResource("/he.png"));
        lblNewLabel_2.setIcon(hi);

        // Play the music automatically in a loop in the constructor
        PlayMusic("chill-abstract-intention-12099.wav");
    }

    public void PlayMusic(String location) {
        try {
            File musicPath = new File(location);
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                musicClip = AudioSystem.getClip();
                musicClip.open(audioInput);

                // Set the loop points to play the entire audio continuously
                musicClip.setLoopPoints(0, -1); // -1 means infinite loop
                musicClip.loop(Clip.LOOP_CONTINUOUSLY); // Start playing in a loop
            } else {
                System.out.println("Can't find file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to stop the music
    public void stopMusic() {
        if (musicClip != null && musicClip.isRunning()) {
            musicClip.stop();
        }
    }
}
