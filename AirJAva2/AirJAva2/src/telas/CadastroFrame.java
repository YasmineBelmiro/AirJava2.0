package telas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;

import classes.Cliente;

public class CadastroFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtSenha;
	private JTextField txtSenha_2;


	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public CadastroFrame() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 573);
		contentPane = new JPanel();
		contentPane.setToolTipText("Inserir email");
		contentPane.setBackground(new Color(147, 174, 148));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(255, 32, 1, 1);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbCadastro = new JLabel("Cadastro");
		lbCadastro.setBounds(236, 25, 192, 46);
		lbCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lbCadastro.setFont(new Font("Courier New", Font.PLAIN, 40));
		contentPane.add(lbCadastro);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Courier New", Font.BOLD, 15));
		lblEmail.setBounds(179, 259, 62, 21);
		contentPane.add(lblEmail);
		
		JLabel lblNome = new JLabel("Nome Completo:");
		lblNome.setFont(new Font("Courier New", Font.BOLD, 15));
		lblNome.setBounds(112, 130, 129, 21);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("Primeira Nome");
		txtNome.setColumns(10);
		txtNome.setBounds(255, 131, 319, 19);
		contentPane.add(txtNome);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(255, 260, 246, 19);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Courier New", Font.BOLD, 15));
		lblSenha.setBounds(179, 291, 62, 21);
		contentPane.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(255, 292, 246, 19);
		contentPane.add(txtSenha);
		
		txtSenha_2 = new JTextField();
		txtSenha_2.setToolTipText("Confirmar email");
		txtSenha_2.setColumns(10);
		txtSenha_2.setBounds(255, 310, 246, 19);
		contentPane.add(txtSenha_2);
		
		JLabel lblComfirmarSenha = new JLabel("Comfirmar senha");
		lblComfirmarSenha.setHorizontalAlignment(SwingConstants.LEFT);
		lblComfirmarSenha.setForeground(new Color(55, 55, 55));
		lblComfirmarSenha.setFont(new Font("Courier New", Font.PLAIN, 13));
		lblComfirmarSenha.setBounds(265, 329, 129, 21);
		contentPane.add(lblComfirmarSenha);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(99, 131, 100));
		separator.setBounds(36, 81, 590, 13);
		contentPane.add(separator);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setFont(new Font("Courier New", Font.BOLD, 15));
		lblDataDeNascimento.setBounds(64, 161, 177, 21);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Courier New", Font.BOLD, 15));
		lblSexo.setBounds(187, 192, 54, 21);
		contentPane.add(lblSexo);
		
		JComboBox cbSexo = new JComboBox();
		cbSexo.setForeground(new Color(0, 0, 0));
		cbSexo.setBackground(new Color(255, 255, 255));
		cbSexo.setFont(new Font("Courier New", Font.PLAIN, 12));
		cbSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Outro", "Nâo quero imformar"}));
		cbSexo.setBounds(255, 193, 135, 21);
		contentPane.add(cbSexo);
		
		
		
		JFormattedTextField formattedtxtDataNascimento = new JFormattedTextField(new MaskFormatter("##/##/####"));
		formattedtxtDataNascimento.setFont(new Font("Courier New", Font.PLAIN, 13));
		formattedtxtDataNascimento.setBounds(255, 158, 98, 27);
		contentPane.add(formattedtxtDataNascimento);
		
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Courier New", Font.BOLD, 15));
		lblTelefone.setBounds(152, 228, 85, 21);
		contentPane.add(lblTelefone);
		
		JFormattedTextField formattedtxtTelefone = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
		formattedtxtTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		formattedtxtTelefone.setFont(new Font("Courier New", Font.PLAIN, 13));
		formattedtxtTelefone.setBounds(256, 223, 116, 27);
		contentPane.add(formattedtxtTelefone);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(58, 80, 60));
		btnSalvar.setForeground(new Color(255, 255, 255));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente dados = new Cliente(txtNome.getText(),formattedtxtDataNascimento.getText(),(String) cbSexo.getSelectedItem(), 
						formattedtxtTelefone.getText(), txtEmail.getText(), txtEmail.getText());
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							LoginFrame frame = new LoginFrame();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnSalvar.setFont(new Font("Courier New", Font.PLAIN, 16));
		btnSalvar.setBounds(255, 415, 114, 39);
		contentPane.add(btnSalvar);
	}
}
