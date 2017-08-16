package com.mhawthor.casechance;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;
import java.awt.Window.Type;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Case extends JFrame {

	private JLayeredPane contentPane;
	private JLabel label;
	private JTextField field;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Case frame = new Case();
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
	public Case() {
		setType(Type.POPUP);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Case.class.getResource("/com/mhawthor/casechance/gamma.png")));
		setTitle("Case Change Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 301);
		contentPane = new JLayeredPane();
		
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		char[] number = {0,1,2,3,4,5,6,7,8,9};
		contentPane.setLayout(null);
		label = new JLabel("Kasa hesaplayýcý");
		label.setBounds(81, 24, 289, 46);
		label.setForeground(Color.BLUE);
		label.setName("test");
		label.setToolTipText("Test");
		label.setFont(new Font("Tahoma", Font.PLAIN, 38));
		contentPane.add(label);
		
		field = new JTextField();
		field.setBounds(158, 103, 86, 20);
		field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				char[] l = field.getText().toCharArray();
				if (!l.equals(alphabet)) {
					float t = Float.parseFloat(field.getText().toString().replaceAll(",", "."));
					
					Random r = new Random();
					float s = r.nextFloat();
					int i1 = 1;
					s = s + r.nextInt(100);
					
					while (s > t) {
						s = r.nextFloat() + r.nextInt(100);
						i1++;
						
					}
					JOptionPane.showMessageDialog(null, i1 + " adet kutu açýldý ve þans geldi.", "Calculator", JOptionPane.INFORMATION_MESSAGE);
					
					
				}else JOptionPane.showMessageDialog(null, "Sadece sayý içermeli!", "Calculator", JOptionPane.ERROR);
				
				}
			}
		});
		contentPane.add(field);
		field.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Þans:");
		lblNewLabel.setBounds(110, 103, 64, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Hesapla");
		btnNewButton.setBounds(136, 163, 129, 23);
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
				char[] l = field.getText().toCharArray();
				if (!l.equals(alphabet)) {
					float t = Float.parseFloat(field.getText().toString());
					System.out.println(t);
					Random r = new Random();
					float s = r.nextFloat();
					int i1 = 1;
					s = s + r.nextInt(100);
					
					while (s > t) {
						s = r.nextFloat() + r.nextInt(100);
						i1++;
						
					}
					JOptionPane.showMessageDialog(null, i1 + " adet kutu açýldý ve þans geldi.", "Calculator", JOptionPane.INFORMATION_MESSAGE);
					
					
				}else JOptionPane.showMessageDialog(null, "Sadece sayý içermeli!", "Calculator", JOptionPane.ERROR);
				
				}
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
					char[] l = field.getText().toCharArray();
					if (!l.equals(alphabet)) {
						float t = Float.parseFloat(field.getText().toString().replaceAll(",", "."));
						Random r = new Random();
						float s = r.nextFloat();
						int i1 = 1;
						s = s + r.nextInt(100);
						
						while (s > t) {
							s = r.nextFloat() + r.nextInt(100);
							i1++;
							
						}
						JOptionPane.showMessageDialog(null, i1 + " adet kutu açýldý ve þans geldi.", "Calculator", JOptionPane.INFORMATION_MESSAGE);
						
						
					}else JOptionPane.showMessageDialog(null, "Sadece sayý içermeli!", "Calculator", JOptionPane.ERROR);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNewButton);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, label, field, lblNewLabel, btnNewButton}));
	}
	public JLabel label() {
		return label;
	}
	public Color getThisBackground() {
		return getBackground();
	}
	public void setThisBackground(Color background) {
		setBackground(background);
	}
}
