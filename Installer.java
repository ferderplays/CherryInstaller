import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Installer implements ActionListener {
    public static ImageIcon icon = new ImageIcon("Cherry.png");
    public static JTextField username = new JTextField(20);
    public static JLabel client =  new JLabel("Berry Bush(Cherry) Client Installer");
    public static JFrame window = new JFrame();
    public static JPanel panel = new JPanel();
    public static JButton download = new JButton("Download");

    public Installer() {
    }

    public static void main(String[] args) {
        new Installer();
        client.setBounds(100, 10, 100, 30);
        download.setBounds(100, 50, 100, 30);
        download.addActionListener(new Installer());
        panel.add(client);
        panel.add(download);
        window.add(panel);
        window.getContentPane().setBackground(new Color(46, 255, 0));
        window.setIconImage(icon.getImage());
        window.setTitle("Berry Bush(Cherry) Client Installer");
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(420, 420);
    }
    
    public static ActionListener onClick;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("test Successful");
	}
}