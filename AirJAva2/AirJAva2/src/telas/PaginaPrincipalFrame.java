package telas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class PaginaPrincipalFrame extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public PaginaPrincipalFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 573);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 174, 148));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbAirJava = new JLabel("Air Java");
		lbAirJava.setBounds(206, 118, 224, 55);
		lbAirJava.setHorizontalAlignment(SwingConstants.CENTER);
		lbAirJava.setFont(new Font("Courier New", Font.PLAIN, 47));
		contentPane.add(lbAirJava);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PerfilFrame frame = new PerfilFrame();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnPerfil.setForeground(Color.WHITE);
		btnPerfil.setFont(new Font("Courier New", Font.PLAIN, 16));
		btnPerfil.setBackground(new Color(58, 80, 60));
		btnPerfil.setBounds(173, 221, 286, 39);
		contentPane.add(btnPerfil);
		
		JButton btnReservarPassagens = new JButton("Reservar passagens");
		btnReservarPassagens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ReservaPassagensFrame frame = new ReservaPassagensFrame();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnReservarPassagens.setForeground(Color.WHITE);
		btnReservarPassagens.setFont(new Font("Courier New", Font.PLAIN, 16));
		btnReservarPassagens.setBackground(new Color(58, 80, 60));
		btnReservarPassagens.setBounds(173, 280, 286, 39);
		contentPane.add(btnReservarPassagens);
		
		JButton btnVoltar_1_1 = new JButton("Sair");
		btnVoltar_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginFrame login = new LoginFrame();
				login.setVisible(true);
				dispose();
			}
		});
		btnVoltar_1_1.setForeground(Color.WHITE);
		btnVoltar_1_1.setFont(new Font("Courier New", Font.PLAIN, 16));
		btnVoltar_1_1.setBackground(new Color(58, 80, 60));
		btnVoltar_1_1.setBounds(173, 339, 286, 39);
		contentPane.add(btnVoltar_1_1);
	}

}
