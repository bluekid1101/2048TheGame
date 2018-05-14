import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class Grid6 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JTextField t11;
	private JTextField t12;
	private JTextField t13;
	private JTextField t14;
	private JTextField t15;
	private JTextField t16;
	private JTextField Score;

	private JTextField t17;
	private JTextField t18;
	private JTextField t19;
	private JTextField t20;
	private JTextField t21;
	private JTextField t22;
	private JTextField t23;
	private JTextField t24;
	private JTextField t25;
	/**
	 * Launch the application.
	 */
	
	private JTextField t26;
	private JTextField t27;
	private JTextField t28;
	private JTextField t29;
	private JTextField t30;
	private JTextField t31;
	private JTextField t32;
	private JTextField t33;
	private JTextField t34;
	private JTextField t35;
	private JTextField t36;
	Game newGame = new Game(6,6);
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grid6 window = new Grid6();
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
	public Grid6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.getContentPane().setBackground(new Color(51, 51, 51));
		frame.getContentPane().setLayout(null);
		Image ic = new ImageIcon(this.getClass().getResource("2048.png")).getImage();
		frame.setIconImage(ic);
		frame.setTitle("2048 Game");
		
		Score = new JTextField();
		Score.setBackground(new Color(51, 51, 51));
		Score.setForeground(new Color(255, 255, 255));
		Score.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		Score.setBounds(23, 602, 172, 49);
		frame.getContentPane().add(Score);
		Score.setColumns(10);
		
		t1 = new JTextField();t2 = new JTextField();t3 = new JTextField();t4 = new JTextField();
		t5 = new JTextField();t6 = new JTextField();t7 = new JTextField();t8 = new JTextField();
		t9 = new JTextField();t10 = new JTextField();t11 = new JTextField();t12 = new JTextField();
		t13 = new JTextField();t14 = new JTextField();t15 = new JTextField();t16 = new JTextField();
		t17 = new JTextField();t18 = new JTextField();t19 = new JTextField();t20 = new JTextField();
		t21 = new JTextField();t22 = new JTextField();t23 = new JTextField();t24 = new JTextField();	t25 = new JTextField();
		t26 = new JTextField();t27 = new JTextField();t28 = new JTextField();t29 = new JTextField(); t30 = new JTextField();
		t31 = new JTextField();t32 = new JTextField();t33 = new JTextField();	t34 = new JTextField();t35 = new JTextField();
		t36 = new JTextField();
		
		newGame.RandomInitialize();
		t1.setText(newGame.pointValue(0, 0));t2.setText(newGame.pointValue(0, 1));t3.setText(newGame.pointValue(0, 2));t4.setText(newGame.pointValue(0, 3));t5.setText(newGame.pointValue(0, 4));
		t6.setText(newGame.pointValue(0, 5));t7.setText(newGame.pointValue(1, 0));t8.setText(newGame.pointValue(1, 1));t9.setText(newGame.pointValue(1, 2));t10.setText(newGame.pointValue(1, 3));
		t11.setText(newGame.pointValue(1, 4));t12.setText(newGame.pointValue(1, 5));t13.setText(newGame.pointValue(2, 0));t14.setText(newGame.pointValue(2, 1));t15.setText(newGame.pointValue(2, 2));
		t16.setText(newGame.pointValue(2, 3));t17.setText(newGame.pointValue(2, 4));t18.setText(newGame.pointValue(2, 5));t19.setText(newGame.pointValue(3, 0));t20.setText(newGame.pointValue(3, 1));
		t21.setText(newGame.pointValue(3, 2));t22.setText(newGame.pointValue(3, 3));t23.setText(newGame.pointValue(3, 3));t24.setText(newGame.pointValue(3, 5));t25.setText(newGame.pointValue(4, 0));
		t26.setText(newGame.pointValue(4, 1));t27.setText(newGame.pointValue(4, 2));t28.setText(newGame.pointValue(4, 3));t29.setText(newGame.pointValue(4, 4));t30.setText(newGame.pointValue(4, 5));
		t31.setText(newGame.pointValue(5, 0));t32.setText(newGame.pointValue(5, 1));t33.setText(newGame.pointValue(5, 2));t34.setText(newGame.pointValue(5, 3));t35.setText(newGame.pointValue(5, 4));
		t36.setText(newGame.pointValue(5, 5));
		Score.setText("Your Score : "+Integer.toString(newGame.Score()));
		newGame.Recovery1();
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				
				case KeyEvent.VK_LEFT :
					
					newGame.left();	
					newGame.addNew();
					t1.setText(newGame.pointValue(0, 0));t2.setText(newGame.pointValue(0, 1));t3.setText(newGame.pointValue(0, 2));t4.setText(newGame.pointValue(0, 3));t5.setText(newGame.pointValue(0, 4));
					t6.setText(newGame.pointValue(0, 5));t7.setText(newGame.pointValue(1, 0));t8.setText(newGame.pointValue(1, 1));t9.setText(newGame.pointValue(1, 2));t10.setText(newGame.pointValue(1, 3));
					t11.setText(newGame.pointValue(1, 4));t12.setText(newGame.pointValue(1, 5));t13.setText(newGame.pointValue(2, 0));t14.setText(newGame.pointValue(2, 1));t15.setText(newGame.pointValue(2, 2));
					t16.setText(newGame.pointValue(2, 3));t17.setText(newGame.pointValue(2, 4));t18.setText(newGame.pointValue(2, 5));t19.setText(newGame.pointValue(3, 0));t20.setText(newGame.pointValue(3, 1));
					t21.setText(newGame.pointValue(3, 2));t22.setText(newGame.pointValue(3, 3));t23.setText(newGame.pointValue(3, 3));t24.setText(newGame.pointValue(3, 5));t25.setText(newGame.pointValue(4, 0));
					t26.setText(newGame.pointValue(4, 1));t27.setText(newGame.pointValue(4, 2));t28.setText(newGame.pointValue(4, 3));t29.setText(newGame.pointValue(4, 4));t30.setText(newGame.pointValue(4, 5));
					t31.setText(newGame.pointValue(5, 0));t32.setText(newGame.pointValue(5, 1));t33.setText(newGame.pointValue(5, 2));t34.setText(newGame.pointValue(5, 3));t35.setText(newGame.pointValue(5, 4));
					t36.setText(newGame.pointValue(5, 5));
					t1.setBackground(newGame.setColor(0, 0));t2.setBackground(newGame.setColor(0, 1));t3.setBackground(newGame.setColor(0, 2));t4.setBackground(newGame.setColor(0, 3));t5.setBackground(newGame.setColor(0, 4));
					t6.setBackground(newGame.setColor(0, 5));t7.setBackground(newGame.setColor(1, 0));t8.setBackground(newGame.setColor(1, 0));t9.setBackground(newGame.setColor(1, 2));t10.setBackground(newGame.setColor(1, 3));
					t11.setBackground(newGame.setColor(1, 4));t12.setBackground(newGame.setColor(1, 5));t13.setBackground(newGame.setColor(2, 0));t14.setBackground(newGame.setColor(2, 1));t15.setBackground(newGame.setColor(2,2));
					t16.setBackground(newGame.setColor(2, 3));t17.setBackground(newGame.setColor(2, 4));t18.setBackground(newGame.setColor(2, 5));t19.setBackground(newGame.setColor(3, 0));t20.setBackground(newGame.setColor(3, 1));
					t21.setBackground(newGame.setColor(3, 2));t22.setBackground(newGame.setColor(3, 3));t23.setBackground(newGame.setColor(3, 4));t24.setBackground(newGame.setColor(3, 5));t25.setBackground(newGame.setColor(4, 0));
					t26.setBackground(newGame.setColor(4, 1));t27.setBackground(newGame.setColor(4, 2));t28.setBackground(newGame.setColor(4, 3));t29.setBackground(newGame.setColor(4, 4));t30.setBackground(newGame.setColor(4, 5));
					t31.setBackground(newGame.setColor(5, 0));t32.setBackground(newGame.setColor(5, 1));t33.setBackground(newGame.setColor(5, 2));t34.setBackground(newGame.setColor(5, 3));t35.setBackground(newGame.setColor(5, 4));
					t36.setBackground(newGame.setColor(5, 5));
					Score.setText("Your Score : "+Integer.toString(newGame.Score()));
					break;
				case KeyEvent.VK_RIGHT :
					
					newGame.right();
					newGame.addNew();
					
					t1.setText(newGame.pointValue(0, 0));t2.setText(newGame.pointValue(0, 1));t3.setText(newGame.pointValue(0, 2));t4.setText(newGame.pointValue(0, 3));t5.setText(newGame.pointValue(0, 4));
					t6.setText(newGame.pointValue(0, 5));t7.setText(newGame.pointValue(1, 0));t8.setText(newGame.pointValue(1, 1));t9.setText(newGame.pointValue(1, 2));t10.setText(newGame.pointValue(1, 3));
					t11.setText(newGame.pointValue(1, 4));t12.setText(newGame.pointValue(1, 5));t13.setText(newGame.pointValue(2, 0));t14.setText(newGame.pointValue(2, 1));t15.setText(newGame.pointValue(2, 2));
					t16.setText(newGame.pointValue(2, 3));t17.setText(newGame.pointValue(2, 4));t18.setText(newGame.pointValue(2, 5));t19.setText(newGame.pointValue(3, 0));t20.setText(newGame.pointValue(3, 1));
					t21.setText(newGame.pointValue(3, 2));t22.setText(newGame.pointValue(3, 3));t23.setText(newGame.pointValue(3, 3));t24.setText(newGame.pointValue(3, 5));t25.setText(newGame.pointValue(4, 0));
					t26.setText(newGame.pointValue(4, 1));t27.setText(newGame.pointValue(4, 2));t28.setText(newGame.pointValue(4, 3));t29.setText(newGame.pointValue(4, 4));t30.setText(newGame.pointValue(4, 5));
					t31.setText(newGame.pointValue(5, 0));t32.setText(newGame.pointValue(5, 1));t33.setText(newGame.pointValue(5, 2));t34.setText(newGame.pointValue(5, 3));t35.setText(newGame.pointValue(5, 4));
					t36.setText(newGame.pointValue(5, 5));
					t1.setBackground(newGame.setColor(0, 0));t2.setBackground(newGame.setColor(0, 1));t3.setBackground(newGame.setColor(0, 2));t4.setBackground(newGame.setColor(0, 3));t5.setBackground(newGame.setColor(0, 4));
					t6.setBackground(newGame.setColor(0, 5));t7.setBackground(newGame.setColor(1, 0));t8.setBackground(newGame.setColor(1, 0));t9.setBackground(newGame.setColor(1, 2));t10.setBackground(newGame.setColor(1, 3));
					t11.setBackground(newGame.setColor(1, 4));t12.setBackground(newGame.setColor(1, 5));t13.setBackground(newGame.setColor(2, 0));t14.setBackground(newGame.setColor(2, 1));t15.setBackground(newGame.setColor(2,2));
					t16.setBackground(newGame.setColor(2, 3));t17.setBackground(newGame.setColor(2, 4));t18.setBackground(newGame.setColor(2, 5));t19.setBackground(newGame.setColor(3, 0));t20.setBackground(newGame.setColor(3, 1));
					t21.setBackground(newGame.setColor(3, 2));t22.setBackground(newGame.setColor(3, 3));t23.setBackground(newGame.setColor(3, 4));t24.setBackground(newGame.setColor(3, 5));t25.setBackground(newGame.setColor(4, 0));
					t26.setBackground(newGame.setColor(4, 1));t27.setBackground(newGame.setColor(4, 2));t28.setBackground(newGame.setColor(4, 3));t29.setBackground(newGame.setColor(4, 4));t30.setBackground(newGame.setColor(4, 5));
					t31.setBackground(newGame.setColor(5, 0));t32.setBackground(newGame.setColor(5, 1));t33.setBackground(newGame.setColor(5, 2));t34.setBackground(newGame.setColor(5, 3));t35.setBackground(newGame.setColor(5, 4));
					t36.setBackground(newGame.setColor(5, 5));
					Score.setText("Your Score : "+Integer.toString(newGame.Score()));
					break;
				case KeyEvent.VK_UP :
					
					newGame.up();
					newGame.addNew();
					t1.setText(newGame.pointValue(0, 0));t2.setText(newGame.pointValue(0, 1));t3.setText(newGame.pointValue(0, 2));t4.setText(newGame.pointValue(0, 3));t5.setText(newGame.pointValue(0, 4));
					t6.setText(newGame.pointValue(0, 5));t7.setText(newGame.pointValue(1, 0));t8.setText(newGame.pointValue(1, 1));t9.setText(newGame.pointValue(1, 2));t10.setText(newGame.pointValue(1, 3));
					t11.setText(newGame.pointValue(1, 4));t12.setText(newGame.pointValue(1, 5));t13.setText(newGame.pointValue(2, 0));t14.setText(newGame.pointValue(2, 1));t15.setText(newGame.pointValue(2, 2));
					t16.setText(newGame.pointValue(2, 3));t17.setText(newGame.pointValue(2, 4));t18.setText(newGame.pointValue(2, 5));t19.setText(newGame.pointValue(3, 0));t20.setText(newGame.pointValue(3, 1));
					t21.setText(newGame.pointValue(3, 2));t22.setText(newGame.pointValue(3, 3));t23.setText(newGame.pointValue(3, 3));t24.setText(newGame.pointValue(3, 5));t25.setText(newGame.pointValue(4, 0));
					t26.setText(newGame.pointValue(4, 1));t27.setText(newGame.pointValue(4, 2));t28.setText(newGame.pointValue(4, 3));t29.setText(newGame.pointValue(4, 4));t30.setText(newGame.pointValue(4, 5));
					t31.setText(newGame.pointValue(5, 0));t32.setText(newGame.pointValue(5, 1));t33.setText(newGame.pointValue(5, 2));t34.setText(newGame.pointValue(5, 3));t35.setText(newGame.pointValue(5, 4));
					t36.setText(newGame.pointValue(5, 5));
					t1.setBackground(newGame.setColor(0, 0));t2.setBackground(newGame.setColor(0, 1));t3.setBackground(newGame.setColor(0, 2));t4.setBackground(newGame.setColor(0, 3));t5.setBackground(newGame.setColor(0, 4));
					t6.setBackground(newGame.setColor(0, 5));t7.setBackground(newGame.setColor(1, 0));t8.setBackground(newGame.setColor(1, 0));t9.setBackground(newGame.setColor(1, 2));t10.setBackground(newGame.setColor(1, 3));
					t11.setBackground(newGame.setColor(1, 4));t12.setBackground(newGame.setColor(1, 5));t13.setBackground(newGame.setColor(2, 0));t14.setBackground(newGame.setColor(2, 1));t15.setBackground(newGame.setColor(2,2));
					t16.setBackground(newGame.setColor(2, 3));t17.setBackground(newGame.setColor(2, 4));t18.setBackground(newGame.setColor(2, 5));t19.setBackground(newGame.setColor(3, 0));t20.setBackground(newGame.setColor(3, 1));
					t21.setBackground(newGame.setColor(3, 2));t22.setBackground(newGame.setColor(3, 3));t23.setBackground(newGame.setColor(3, 4));t24.setBackground(newGame.setColor(3, 5));t25.setBackground(newGame.setColor(4, 0));
					t26.setBackground(newGame.setColor(4, 1));t27.setBackground(newGame.setColor(4, 2));t28.setBackground(newGame.setColor(4, 3));t29.setBackground(newGame.setColor(4, 4));t30.setBackground(newGame.setColor(4, 5));
					t31.setBackground(newGame.setColor(5, 0));t32.setBackground(newGame.setColor(5, 1));t33.setBackground(newGame.setColor(5, 2));t34.setBackground(newGame.setColor(5, 3));t35.setBackground(newGame.setColor(5, 4));
					t36.setBackground(newGame.setColor(5, 5));
					Score.setText("Your Score : "+Integer.toString(newGame.Score()));
				
					break;
					
				case KeyEvent.VK_DOWN :
					newGame.down();
					newGame.addNew();
					t1.setText(newGame.pointValue(0, 0));t2.setText(newGame.pointValue(0, 1));t3.setText(newGame.pointValue(0, 2));t4.setText(newGame.pointValue(0, 3));t5.setText(newGame.pointValue(0, 4));
					t6.setText(newGame.pointValue(0, 5));t7.setText(newGame.pointValue(1, 0));t8.setText(newGame.pointValue(1, 1));t9.setText(newGame.pointValue(1, 2));t10.setText(newGame.pointValue(1, 3));
					t11.setText(newGame.pointValue(1, 4));t12.setText(newGame.pointValue(1, 5));t13.setText(newGame.pointValue(2, 0));t14.setText(newGame.pointValue(2, 1));t15.setText(newGame.pointValue(2, 2));
					t16.setText(newGame.pointValue(2, 3));t17.setText(newGame.pointValue(2, 4));t18.setText(newGame.pointValue(2, 5));t19.setText(newGame.pointValue(3, 0));t20.setText(newGame.pointValue(3, 1));
					t21.setText(newGame.pointValue(3, 2));t22.setText(newGame.pointValue(3, 3));t23.setText(newGame.pointValue(3, 3));t24.setText(newGame.pointValue(3, 5));t25.setText(newGame.pointValue(4, 0));
					t26.setText(newGame.pointValue(4, 1));t27.setText(newGame.pointValue(4, 2));t28.setText(newGame.pointValue(4, 3));t29.setText(newGame.pointValue(4, 4));t30.setText(newGame.pointValue(4, 5));
					t31.setText(newGame.pointValue(5, 0));t32.setText(newGame.pointValue(5, 1));t33.setText(newGame.pointValue(5, 2));t34.setText(newGame.pointValue(5, 3));t35.setText(newGame.pointValue(5, 4));
					t36.setText(newGame.pointValue(5, 5));
					t1.setBackground(newGame.setColor(0, 0));t2.setBackground(newGame.setColor(0, 1));t3.setBackground(newGame.setColor(0, 2));t4.setBackground(newGame.setColor(0, 3));t5.setBackground(newGame.setColor(0, 4));
					t6.setBackground(newGame.setColor(0, 5));t7.setBackground(newGame.setColor(1, 0));t8.setBackground(newGame.setColor(1, 0));t9.setBackground(newGame.setColor(1, 2));t10.setBackground(newGame.setColor(1, 3));
					t11.setBackground(newGame.setColor(1, 4));t12.setBackground(newGame.setColor(1, 5));t13.setBackground(newGame.setColor(2, 0));t14.setBackground(newGame.setColor(2, 1));t15.setBackground(newGame.setColor(2,2));
					t16.setBackground(newGame.setColor(2, 3));t17.setBackground(newGame.setColor(2, 4));t18.setBackground(newGame.setColor(2, 5));t19.setBackground(newGame.setColor(3, 0));t20.setBackground(newGame.setColor(3, 1));
					t21.setBackground(newGame.setColor(3, 2));t22.setBackground(newGame.setColor(3, 3));t23.setBackground(newGame.setColor(3, 4));t24.setBackground(newGame.setColor(3, 5));t25.setBackground(newGame.setColor(4, 0));
					t26.setBackground(newGame.setColor(4, 1));t27.setBackground(newGame.setColor(4, 2));t28.setBackground(newGame.setColor(4, 3));t29.setBackground(newGame.setColor(4, 4));t30.setBackground(newGame.setColor(4, 5));
					t31.setBackground(newGame.setColor(5, 0));t32.setBackground(newGame.setColor(5, 1));t33.setBackground(newGame.setColor(5, 2));t34.setBackground(newGame.setColor(5, 3));t35.setBackground(newGame.setColor(5, 4));
					t36.setBackground(newGame.setColor(5, 5));
					Score.setText("Your Score : "+Integer.toString(newGame.Score()));
				
					break;
				}
			}
			
		});
		t1.setEditable(false);
		t1.setBackground(newGame.setColor(0, 0));
		t1.setForeground(new Color(255, 255, 255));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t1.setBounds(23, 27, 86, 85);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		
		
		t2.setEditable(false);
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setForeground(Color.WHITE);
		t2.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t2.setColumns(10);
		t2.setBackground(newGame.setColor(0, 1));
		t2.setBounds(119, 27, 86, 85);
		frame.getContentPane().add(t2);
		
		
		t3.setEditable(false);
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setForeground(Color.WHITE);
		t3.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t3.setColumns(10);
		t3.setBackground(newGame.setColor(0, 2));
		t3.setBounds(215, 27, 86, 85);
		frame.getContentPane().add(t3);
		
		
		t4.setEditable(false);
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setForeground(Color.WHITE);
		t4.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t4.setColumns(10);
		t4.setBackground(newGame.setColor(0, 3));
		t4.setBounds(311, 27, 86, 85);
		frame.getContentPane().add(t4);
		
	
		t5.setEditable(false);
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setForeground(Color.WHITE);
		t5.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t5.setColumns(10);
		t5.setBackground(newGame.setColor(0, 4));
		t5.setBounds(407, 27, 86, 85);
		frame.getContentPane().add(t5);
		
		
		t6.setEditable(false);
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		t6.setForeground(Color.WHITE);
		t6.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t6.setColumns(10);
		t6.setBackground(newGame.setColor(0, 5));
		t6.setBounds(504, 27, 86, 85);
		frame.getContentPane().add(t6);
		
		
		t7.setEditable(false);
		t7.setHorizontalAlignment(SwingConstants.CENTER);
		t7.setForeground(Color.WHITE);
		t7.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t7.setColumns(10);
		t7.setBackground(newGame.setColor(1, 0));
		t7.setBounds(23, 123, 86, 85);
		frame.getContentPane().add(t7);
		
		
		t8.setEditable(false);
		t8.setHorizontalAlignment(SwingConstants.CENTER);
		t8.setForeground(Color.WHITE);
		t8.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t8.setColumns(10);
		t8.setBackground(newGame.setColor(1, 1));
		t8.setBounds(119, 123, 86, 85);
		frame.getContentPane().add(t8);
		
		
		t9.setEditable(false);
		t9.setHorizontalAlignment(SwingConstants.CENTER);
		t9.setForeground(Color.WHITE);
		t9.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t9.setColumns(10);
		t9.setBackground(newGame.setColor(1, 2));
		t9.setBounds(215, 123, 86, 85);
		frame.getContentPane().add(t9);
		
		
		t10.setEditable(false);
		t10.setHorizontalAlignment(SwingConstants.CENTER);
		t10.setForeground(Color.WHITE);
		t10.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t10.setColumns(10);
		t10.setBackground(newGame.setColor(1, 3));
		t10.setBounds(311, 123, 86, 85);
		frame.getContentPane().add(t10);
		
		
		t11.setEditable(false);
		t11.setHorizontalAlignment(SwingConstants.CENTER);
		t11.setForeground(Color.WHITE);
		t11.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t11.setColumns(10);
		t11.setBackground(newGame.setColor(1, 4));
		t11.setBounds(407, 123, 86, 85);
		frame.getContentPane().add(t11);
		
	
		t12.setEditable(false);
		t12.setHorizontalAlignment(SwingConstants.CENTER);
		t12.setForeground(Color.WHITE);
		t12.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t12.setColumns(10);
		t12.setBackground(newGame.setColor(1, 5));
		t12.setBounds(504, 123, 86, 85);
		frame.getContentPane().add(t12);
		
		
		t13.setEditable(false);
		t13.setHorizontalAlignment(SwingConstants.CENTER);
		t13.setForeground(Color.WHITE);
		t13.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t13.setColumns(10);
		t13.setBackground(newGame.setColor(2, 0));
		t13.setBounds(23, 219, 86, 85);
		frame.getContentPane().add(t13);
		
		
		t14.setEditable(false);
		t14.setHorizontalAlignment(SwingConstants.CENTER);
		t14.setForeground(Color.WHITE);
		t14.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t14.setColumns(10);
		t14.setBackground(newGame.setColor(2, 1));
		t14.setBounds(119, 219, 86, 85);
		frame.getContentPane().add(t14);
		
		
		t15.setEditable(false);
		t15.setHorizontalAlignment(SwingConstants.CENTER);
		t15.setForeground(Color.WHITE);
		t15.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t15.setColumns(10);
		t15.setBackground(newGame.setColor(2, 2));
		t15.setBounds(215, 219, 86, 85);
		frame.getContentPane().add(t15);
		
		
		t16.setEditable(false);
		t16.setHorizontalAlignment(SwingConstants.CENTER);
		t16.setForeground(Color.WHITE);
		t16.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t16.setColumns(10);
		t16.setBackground(newGame.setColor(2, 3));
		t16.setBounds(311, 219, 86, 85);
		frame.getContentPane().add(t16);
		
		
		t17.setText((String) null);
		t17.setHorizontalAlignment(SwingConstants.CENTER);
		t17.setForeground(Color.WHITE);
		t17.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t17.setEditable(false);
		t17.setColumns(10);
		t17.setBackground(newGame.setColor(2, 4));
		t17.setBounds(407, 219, 86, 85);
		frame.getContentPane().add(t17);
		
		
		t18.setText((String) null);
		t18.setHorizontalAlignment(SwingConstants.CENTER);
		t18.setForeground(Color.WHITE);
		t18.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t18.setEditable(false);
		t18.setColumns(10);
		t18.setBackground(newGame.setColor(2, 5));
		t18.setBounds(504, 219, 86, 85);
		frame.getContentPane().add(t18);
		
		
		t19.setText((String) null);
		t19.setHorizontalAlignment(SwingConstants.CENTER);
		t19.setForeground(Color.WHITE);
		t19.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t19.setEditable(false);
		t19.setColumns(10);
		t19.setBackground(newGame.setColor(3,0 ));
		t19.setBounds(23, 315, 86, 85);
		frame.getContentPane().add(t19);
		
		
		t20.setText((String) null);
		t20.setHorizontalAlignment(SwingConstants.CENTER);
		t20.setForeground(Color.WHITE);
		t20.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t20.setEditable(false);
		t20.setColumns(10);
		t20.setBackground(newGame.setColor(3, 1));
		t20.setBounds(119, 315, 86, 85);
		frame.getContentPane().add(t20);
		
		
		t21.setText((String) null);
		t21.setHorizontalAlignment(SwingConstants.CENTER);
		t21.setForeground(Color.WHITE);
		t21.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t21.setEditable(false);
		t21.setColumns(10);
		t21.setBackground(newGame.setColor(3, 2));
		t21.setBounds(215, 315, 86, 85);
		frame.getContentPane().add(t21);
		
		
		t22.setText((String) null);
		t22.setHorizontalAlignment(SwingConstants.CENTER);
		t22.setForeground(Color.WHITE);
		t22.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t22.setEditable(false);
		t22.setColumns(10);
		t22.setBackground(newGame.setColor(3, 3));
		t22.setBounds(311, 315, 86, 85);
		frame.getContentPane().add(t22);
		
		
		t23.setText((String) null);
		t23.setHorizontalAlignment(SwingConstants.CENTER);
		t23.setForeground(Color.WHITE);
		t23.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t23.setEditable(false);
		t23.setColumns(10);
		t23.setBackground(newGame.setColor(3, 4));
		t23.setBounds(407, 315, 86, 85);
		frame.getContentPane().add(t23);
		
		
		t24.setText((String) null);
		t24.setHorizontalAlignment(SwingConstants.CENTER);
		t24.setForeground(Color.WHITE);
		t24.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t24.setEditable(false);
		t24.setColumns(10);
		t24.setBackground(newGame.setColor(3, 5));
		t24.setBounds(504, 315, 86, 85);
		frame.getContentPane().add(t24);
		
	
		t25.setText((String) null);
		t25.setHorizontalAlignment(SwingConstants.CENTER);
		t25.setForeground(Color.WHITE);
		t25.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t25.setEditable(false);
		t25.setColumns(10);
		t25.setBackground(newGame.setColor(4, 0));
		t25.setBounds(23, 411, 86, 85);
		frame.getContentPane().add(t25);
		
		
		t26.setText((String) null);
		t26.setHorizontalAlignment(SwingConstants.CENTER);
		t26.setForeground(Color.WHITE);
		t26.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t26.setEditable(false);
		t26.setColumns(10);
		t26.setBackground(newGame.setColor(4, 1));
		t26.setBounds(119, 411, 86, 85);
		frame.getContentPane().add(t26);
		
		t27.setText((String) null);
		t27.setHorizontalAlignment(SwingConstants.CENTER);
		t27.setForeground(Color.WHITE);
		t27.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t27.setEditable(false);
		t27.setColumns(10);
		t27.setBackground(newGame.setColor(4, 2));
		t27.setBounds(215, 411, 86, 85);
		frame.getContentPane().add(t27);
		
		
		t28.setText((String) null);
		t28.setHorizontalAlignment(SwingConstants.CENTER);
		t28.setForeground(Color.WHITE);
		t28.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t28.setEditable(false);
		t28.setColumns(10);
		t28.setBackground(newGame.setColor(4, 3));
		t28.setBounds(311, 411, 86, 85);
		frame.getContentPane().add(t28);
		
		
		t29.setText((String) null);
		t29.setHorizontalAlignment(SwingConstants.CENTER);
		t29.setForeground(Color.WHITE);
		t29.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t29.setEditable(false);
		t29.setColumns(10);
		t29.setBackground(newGame.setColor(4, 4));
		t29.setBounds(407, 411, 86, 85);
		frame.getContentPane().add(t29);
		
		
		t30.setText((String) null);
		t30.setHorizontalAlignment(SwingConstants.CENTER);
		t30.setForeground(Color.WHITE);
		t30.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t30.setEditable(false);
		t30.setColumns(10);
		t30.setBackground(newGame.setColor(4, 5));
		t30.setBounds(504, 411, 86, 85);
		frame.getContentPane().add(t30);
		
		
		t31.setText((String) null);
		t31.setHorizontalAlignment(SwingConstants.CENTER);
		t31.setForeground(Color.WHITE);
		t31.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t31.setEditable(false);
		t31.setColumns(10);
		t31.setBackground(newGame.setColor(5, 0));
		t31.setBounds(22, 506, 86, 85);
		frame.getContentPane().add(t31);
		
		
		t32.setText((String) null);
		t32.setHorizontalAlignment(SwingConstants.CENTER);
		t32.setForeground(Color.WHITE);
		t32.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t32.setEditable(false);
		t32.setColumns(10);
		t32.setBackground(newGame.setColor(5, 1));
		t32.setBounds(118, 506, 86, 85);
		frame.getContentPane().add(t32);
		
		
		t33.setText((String) null);
		t33.setHorizontalAlignment(SwingConstants.CENTER);
		t33.setForeground(Color.WHITE);
		t33.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t33.setEditable(false);
		t33.setColumns(10);
		t33.setBackground(newGame.setColor(5, 2));
		t33.setBounds(214, 506, 86, 85);
		frame.getContentPane().add(t33);
		
	
		t34.setText((String) null);
		t34.setHorizontalAlignment(SwingConstants.CENTER);
		t34.setForeground(Color.WHITE);
		t34.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t34.setEditable(false);
		t34.setColumns(10);
		t34.setBackground(newGame.setColor(5, 3));
		t34.setBounds(310, 506, 86, 85);
		frame.getContentPane().add(t34);
		
		
		t35.setText((String) null);
		t35.setHorizontalAlignment(SwingConstants.CENTER);
		t35.setForeground(Color.WHITE);
		t35.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t35.setEditable(false);
		t35.setColumns(10);
		t35.setBackground(newGame.setColor(5, 4));
		t35.setBounds(407, 506, 86, 85);
		frame.getContentPane().add(t35);
		
		
		t36.setText((String) null);
		t36.setHorizontalAlignment(SwingConstants.CENTER);
		t36.setForeground(Color.WHITE);
		t36.setFont(new Font("Segoe UI Light", Font.PLAIN, 40));
		t36.setEditable(false);
		t36.setColumns(10);
		t36.setBackground(newGame.setColor(5, 5));
		t36.setBounds(504, 507, 86, 85);
		frame.getContentPane().add(t36);
		
		frame.setBounds(100, 100, 641, 701);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
