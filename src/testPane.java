import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class testPane {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testPane window = new testPane();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testPane() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Game newGame = new Game(4,4);
		newGame.RandomInitialize();
		
		
		JTextPane text = new JTextPane();
		text.setFont(new Font("Tahoma", Font.BOLD, 18));
		text.setText(newGame.setValue());
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT :
					newGame.left();
					newGame.addNew();
					text.setText(newGame.setValue());
					break;
				case KeyEvent.VK_RIGHT :
					newGame.right();
					text.setText(newGame.setValue());
					break;
				case KeyEvent.VK_UP :
					newGame.up();
					newGame.addNew();
					text.setText(newGame.setValue());
					break;
				case KeyEvent.VK_DOWN :
					newGame.down();
					newGame.addNew();
					text.setText(newGame.setValue());
					break;
				}
			}
		});
		text.setBounds(10, 11, 414, 395);
		frame.getContentPane().add(text);
		
	}
}
