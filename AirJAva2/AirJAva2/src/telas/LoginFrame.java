package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Cliente;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField pfSenha;

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 573);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(68, 91, 69));
		contentPane.setBackground(new Color(147, 174, 148));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbAirJava = new JLabel("Air Java");
		lbAirJava.setHorizontalAlignment(SwingConstants.CENTER);
		lbAirJava.setFont(new Font("Courier New", Font.PLAIN, 47));
		lbAirJava.setBounds(210, 87, 263, 65);
		contentPane.add(lbAirJava);
		
		JLabel lbUsuario = new JLabel("Usuário:");
		lbUsuario.setFont(new Font("Courier New", Font.PLAIN, 18));
		lbUsuario.setBounds(110, 242, 90, 21);
		contentPane.add(lbUsuario);
		
		JTextPane txtUsuario = new JTextPane();
		txtUsuario.setToolTipText("");
		txtUsuario.setForeground(new Color(0, 0, 0));
		txtUsuario.setBounds(210, 244, 263, 19);
		contentPane.add(txtUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Courier New", Font.PLAIN, 18));
		lblSenha.setBounds(134, 273, 67, 21);
		contentPane.add(lblSenha);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(210, 273, 263, 21);
		contentPane.add(pfSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBackground(new Color(58, 80, 60));
		btnEntrar.setFont(new Font("Courier New", Font.PLAIN, 25));
		btnEntrar.setForeground(new Color(255, 255, 255));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PaginaPrincipalFrame frame = new PaginaPrincipalFrame();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnEntrar.setBounds(274, 316, 137, 37);
		contentPane.add(btnEntrar);
		
		JLabel lblNoPossuoConta = new JLabel("Não possui cadastro?");
		lblNoPossuoConta.setFont(new Font("Courier New", Font.BOLD, 15));
		lblNoPossuoConta.setBounds(182, 415, 190, 21);
		contentPane.add(lblNoPossuoConta);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CadastroFrame frame = new CadastroFrame();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		btnCadastrar.setForeground(new Color(255, 255, 255));
		btnCadastrar.setFont(new Font("Courier New", Font.PLAIN, 14));
		btnCadastrar.setBackground(new Color(58, 80, 60));
		btnCadastrar.setBounds(372, 415, 114, 21);
		contentPane.add(btnCadastrar);
		
		
		
		
	
		
	}
}
