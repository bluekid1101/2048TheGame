import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UI {

	private JFrame frame;
	private JTextField txtGripSize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
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
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 483, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image ic = new ImageIcon(this.getClass().getResource("2048.png")).getImage();
		frame.setIconImage(ic);
		frame.setTitle("2048 Game");
		

		
		
		JButton ex = new JButton("EXIT");
		ex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		
		txtGripSize = new JTextField();
		txtGripSize.setText("GRIP SIZE");
		txtGripSize.setBorder(null);
		txtGripSize.setEditable(false);
		txtGripSize.setBackground(new Color(47, 79, 79));
		txtGripSize.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		txtGripSize.setForeground(new Color(255, 255, 255));
		txtGripSize.setHorizontalAlignment(SwingConstants.CENTER);
		txtGripSize.setBounds(148, 155, 86, 27);
		frame.getContentPane().add(txtGripSize);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(47, 79, 79));
		comboBox.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setBounds(260, 155, 54, 27);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("4");
		comboBox.addItem("5");
		comboBox.addItem("6");
		
		
		
		
		ex.setForeground(Color.WHITE);
		ex.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		ex.setFocusable(false);
		ex.setBorderPainted(false);
		ex.setBorder(null);
		ex.setBackground(new Color(47, 79, 79));
		ex.setBounds(148, 396, 169, 61);
		frame.getContentPane().add(ex);
		
		JButton hc = new JButton("HIGH SCORE");
		hc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReadIO highest = new ReadIO();
				int s = highest.getScore();
				JOptionPane.showMessageDialog(frame, "The highest score Grid 4x4 until now is: "+Integer.toString(s));
			}
		});
		hc.setForeground(Color.WHITE);
		hc.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		hc.setFocusable(false);
		hc.setBorderPainted(false);
		hc.setBorder(null);
		hc.setBackground(new Color(47, 79, 79));
		hc.setBounds(148, 304, 169, 61);
		frame.getContentPane().add(hc);
		
		
		JButton ng = new JButton("NEW GAME");
		
		ng.setBackground(new Color(47, 79, 79));
		ng.setForeground(Color.WHITE);
		ng.setFocusable(false);
		ng.setBorderPainted(false);
		ng.setBorder(null);
		ng.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		ng.setBounds(148, 214, 169, 61);
		frame.getContentPane().add(ng);
		
		JLabel label = new JLabel("");
		label.setBounds(-46, -1229, 1102, 1759);
		frame.getContentPane().add(label);
		Image img = new ImageIcon(this.getClass().getResource("bg1.png")).getImage();
		label.setIcon(new ImageIcon(img));
		
		
		ng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedIndex()== 0) {
				Grip4.main(new String[]{});
				frame.dispose();
				}
				if (comboBox.getSelectedItem().toString() == "5") {
				Grip5.main(new String[]{});
				frame.dispose();;
				}
				if (comboBox.getSelectedItem().toString() == "6") {
					Grid6.main(new String[]{});
					frame.dispose();;
				}
			}
		});
		
	
		
	}
}
