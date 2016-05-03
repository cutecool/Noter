package Noter.com.tw;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class startNoter {
	
	
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("This is frist application");
		JPanel panel = new JPanel();
		mainFrame.add(panel);
		mainFrame.setVisible(true);
		mainFrame.setSize(400, 300);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
