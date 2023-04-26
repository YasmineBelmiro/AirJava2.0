package telas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PerfilFrame extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public PerfilFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 573);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 174, 148));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
