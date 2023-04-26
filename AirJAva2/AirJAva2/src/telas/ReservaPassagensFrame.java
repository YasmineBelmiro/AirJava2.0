package telas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import java.text.ParseException;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ReservaPassagensFrame extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public ReservaPassagensFrame() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 573);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 174, 148));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReservarPassagens = new JLabel("Reservar passagens");
		lblReservarPassagens.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservarPassagens.setFont(new Font("Courier New", Font.PLAIN, 30));
		lblReservarPassagens.setBounds(162, 27, 357, 46);
		contentPane.add(lblReservarPassagens);
		
		JLabel lblOrigem = new JLabel("Origem:");
		lblOrigem.setFont(new Font("Courier New", Font.BOLD, 15));
		lblOrigem.setBounds(37, 111, 69, 21);
		contentPane.add(lblOrigem);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setFont(new Font("Courier New", Font.BOLD, 15));
		lblDestino.setBounds(31, 142, 75, 21);
		contentPane.add(lblDestino);
		
		JComboBox cbOrigem = new JComboBox();
		cbOrigem.setModel(new DefaultComboBoxModel(new String[] {"Aeroporto Internacional de Brasília / Presidente Jucelino Kubitschek\tBrasília\tDF", "Aeroporto Internacional de São Paulo / Congonhas\tCongonhas\tSP", "Aeroporto Internacional do Rio de Janeiro / Galeão-Antônio Carlos Jobim\tGaleão\tRJ", "Aeroporto Internacional de Salvador / Deputado Luis Eduardo Magalhães\tSalvador\tBA", "Aeroporto Internacional de Florianópolis / Hercílio Luz\tFlorianópolis\tSC", "Aeroporto Internacional de Porto Alegre / Salgado Filho\tPorto Alegre\tRS", "Aeroporto Internacional de Viracopos / Campinas\tCampinas\tSP", "Aeroporto Internacional do Recife/ Guararapes – Gilberto Freyre\tRecife\tPE", "Aeroporto Internacional de Curitiba / Afonso Pena\tCuritiba\tPR", "Aeroporto Internacional de Belém / Val de Cans\tBelém\tPA", "Aeroporto de Vitória – Eurico de Aguiar Salles\tVitória\tES", "Aerorporto Santos Dumont\tSantos Dumont\tRJ", "Aeroporto Internacional de Cuiabá / Marechal Rondon\tCuiabá\tMT", "Aeroporto Internacional de Campo Grande\tCampo Grande\tMS", "Aeroporto Internacional de Fortaleza / Pinto Martins\tFortaleza\tCE", "Aeroporto Internacional de Macapá\tMacapá\tAP", "Aeroporto Regional de Maringá / Silvio Name Junior\tMaringá\tPR", "Aeroporto de Goiânia / Santa Genoveva\tGoiânia\tGO", "Aeroporto Internacional de Navegantes / Ministro Victor Konder\tNavegantes\tSC", "Aeroporto Internacional de Manaus / Eduardo Gomes\tManaus\tAM", "Aeroporto Internacional de Natal / Augusto Severo\tNatal\tRN", "Aeroporto Internacional de Porto Seguro\tPorto Seguro\tBA", "Aeroporto de Maceió / Zumbi dos Palmares\tMaceió\tAL", "Aeroporto de Palmas/Brigadeiro Lysias Rodrigues\tPalmas\tTO", "Aeroporto Internacional de São Luís / Marechal Cunha Machado\tSão Luis\tMA", "Aeroporto Internacional de São Paulo/Guarulhos-Governador André Franco Motoro\tGuarulhos\tSP", "Aeroporto de Londrina / Governador José Richa\tLondrina\tPR", "Aeroporto Internacional de Porto Velho / Governador Jorge Teixeira de Oliveira\tPorto Velho\tRO", "Aeroporto Internacional de Rio Branco / Plácido de Castro\tRio Branco\tAC", "Aeroporto de Joinville / Lauro Carneiro de Loyola\tJoinville\tSC", "Aeroporto de Uberlândia / Ten. Cel. Av. César Bombonato\tUberlândia\tMG", "Aeroporto Regional de Caxias do Sul / Hugo Cantergiani\tCaxias do Sul\tRS", "Aeroporto Internacional de Foz do Iguaçu\tFoz do Iguaçu\tPR", "Aeroporto de Teresina – Senador Petrônio Portella\tTeresina\tPI", "Aeroporto Internacional de Aracaju / Santa Maria\tAracaju\tSE", "Aeroporto Internacional de João Pessoa / Presidente Castro Pinto\tJoão Pessoa\tPB", "Aeroporto de Petrolina / Senador Nilo Coelho\tPetrolina\tPE", "Aeroporto Internacional de Minas Gerais / Confins – Tancredo Neves\tConfins\tMG", "Aeroporto Internacional de Boa Vista / Atlas Brasil Cantanhede\tBoa Vista\tRR", "Aeroporto de Campina Grande / Presidente João Suassuna\tCampina Grande\tPB", "Aeroporto de Santarém / Maestro Wilson Fonseca\tSantarém\tPA", "Aeroporto de Ilhéus/Bahia-Jorge Amado\tIlhéus\tBA", "Aeroporto de Juazeiro do Norte – Orlando Bezerra\tJuazeiro do Norte\tCE", "Aeroporto de Imperatriz – Prefeito Renato Moreira\tImperatriz\tMA", "Aeroporto de Chapecó – Serafin Enoss Bertaso\tChapecó\tSC", "Aeroporto de Marabá\tMarabá\tPA", "Aeroporto Internacional de Cruzeiro do Sul\tCruzeiro do Sul\tAC", "Aeroporto Estadual de Presidente Prudente\tPresidente Prudente\tSP", "Aeroporto Internacional de Cabo Frio\tCabo Frio\tRJ", "Aeroporto de Fernando de Noronha\tFernando de Noronha\tPE", "Aeroporto Estadual de Bauru/Arealva\tBauru\tSP", "Aeroporto de Montes Claros/Mário Ribeiro\tMontes Claros\tMG"}));
		cbOrigem.setForeground(new Color(0, 0, 0));
		cbOrigem.setFont(new Font("Courier New", Font.PLAIN, 12));
		cbOrigem.setBackground(new Color(255, 255, 255));
		cbOrigem.setBounds(116, 112, 475, 21);
		contentPane.add(cbOrigem);
		
		JComboBox cbDestino = new JComboBox();
		cbDestino.setModel(new DefaultComboBoxModel(new String[] {"Aeroporto Internacional de Brasília / Presidente Jucelino Kubitschek\tBrasília\tDF", "Aeroporto Internacional de São Paulo / Congonhas\tCongonhas\tSP", "Aeroporto Internacional do Rio de Janeiro / Galeão-Antônio Carlos Jobim\tGaleão\tRJ", "Aeroporto Internacional de Salvador / Deputado Luis Eduardo Magalhães\tSalvador\tBA", "Aeroporto Internacional de Florianópolis / Hercílio Luz\tFlorianópolis\tSC", "Aeroporto Internacional de Porto Alegre / Salgado Filho\tPorto Alegre\tRS", "Aeroporto Internacional de Viracopos / Campinas\tCampinas\tSP", "Aeroporto Internacional do Recife/ Guararapes – Gilberto Freyre\tRecife\tPE", "Aeroporto Internacional de Curitiba / Afonso Pena\tCuritiba\tPR", "Aeroporto Internacional de Belém / Val de Cans\tBelém\tPA", "Aeroporto de Vitória – Eurico de Aguiar Salles\tVitória\tES", "Aerorporto Santos Dumont\tSantos Dumont\tRJ", "Aeroporto Internacional de Cuiabá / Marechal Rondon\tCuiabá\tMT", "Aeroporto Internacional de Campo Grande\tCampo Grande\tMS", "Aeroporto Internacional de Fortaleza / Pinto Martins\tFortaleza\tCE", "Aeroporto Internacional de Macapá\tMacapá\tAP", "Aeroporto Regional de Maringá / Silvio Name Junior\tMaringá\tPR", "Aeroporto de Goiânia / Santa Genoveva\tGoiânia\tGO", "Aeroporto Internacional de Navegantes / Ministro Victor Konder\tNavegantes\tSC", "Aeroporto Internacional de Manaus / Eduardo Gomes\tManaus\tAM", "Aeroporto Internacional de Natal / Augusto Severo\tNatal\tRN", "Aeroporto Internacional de Porto Seguro\tPorto Seguro\tBA", "Aeroporto de Maceió / Zumbi dos Palmares\tMaceió\tAL", "Aeroporto de Palmas/Brigadeiro Lysias Rodrigues\tPalmas\tTO", "Aeroporto Internacional de São Luís / Marechal Cunha Machado\tSão Luis\tMA", "Aeroporto Internacional de São Paulo/Guarulhos-Governador André Franco Motoro\tGuarulhos\tSP", "Aeroporto de Londrina / Governador José Richa\tLondrina\tPR", "Aeroporto Internacional de Porto Velho / Governador Jorge Teixeira de Oliveira\tPorto Velho\tRO", "Aeroporto Internacional de Rio Branco / Plácido de Castro\tRio Branco\tAC", "Aeroporto de Joinville / Lauro Carneiro de Loyola\tJoinville\tSC", "Aeroporto de Uberlândia / Ten. Cel. Av. César Bombonato\tUberlândia\tMG", "Aeroporto Regional de Caxias do Sul / Hugo Cantergiani\tCaxias do Sul\tRS", "Aeroporto Internacional de Foz do Iguaçu\tFoz do Iguaçu\tPR", "Aeroporto de Teresina – Senador Petrônio Portella\tTeresina\tPI", "Aeroporto Internacional de Aracaju / Santa Maria\tAracaju\tSE", "Aeroporto Internacional de João Pessoa / Presidente Castro Pinto\tJoão Pessoa\tPB", "Aeroporto de Petrolina / Senador Nilo Coelho\tPetrolina\tPE", "Aeroporto Internacional de Minas Gerais / Confins – Tancredo Neves\tConfins\tMG", "Aeroporto Internacional de Boa Vista / Atlas Brasil Cantanhede\tBoa Vista\tRR", "Aeroporto de Campina Grande / Presidente João Suassuna\tCampina Grande\tPB", "Aeroporto de Santarém / Maestro Wilson Fonseca\tSantarém\tPA", "Aeroporto de Ilhéus/Bahia-Jorge Amado\tIlhéus\tBA", "Aeroporto de Juazeiro do Norte – Orlando Bezerra\tJuazeiro do Norte\tCE", "Aeroporto de Imperatriz – Prefeito Renato Moreira\tImperatriz\tMA", "Aeroporto de Chapecó – Serafin Enoss Bertaso\tChapecó\tSC", "Aeroporto de Marabá\tMarabá\tPA", "Aeroporto Internacional de Cruzeiro do Sul\tCruzeiro do Sul\tAC", "Aeroporto Estadual de Presidente Prudente\tPresidente Prudente\tSP", "Aeroporto Internacional de Cabo Frio\tCabo Frio\tRJ", "Aeroporto de Fernando de Noronha\tFernando de Noronha\tPE", "Aeroporto Estadual de Bauru/Arealva\tBauru\tSP", "Aeroporto de Montes Claros/Mário Ribeiro\tMontes Claros\tMG"}));
		cbDestino.setForeground(new Color(0, 0, 0));
		cbDestino.setFont(new Font("Courier New", Font.PLAIN, 12));
		cbDestino.setBackground(new Color(255, 255, 255));
		cbDestino.setBounds(116, 143, 475, 21);
		contentPane.add(cbDestino);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(99, 131, 100));
		separator.setBounds(30, 70, 590, 13);
		contentPane.add(separator);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Courier New", Font.BOLD, 15));
		lblData.setBounds(53, 177, 52, 21);
		contentPane.add(lblData);
		
		JFormattedTextField formattedtxtDataIda = new JFormattedTextField(new MaskFormatter("##/##/####"));
		formattedtxtDataIda.setFont(new Font("Courier New", Font.PLAIN, 13));
		formattedtxtDataIda.setBounds(116, 174, 87, 27);
		contentPane.add(formattedtxtDataIda);
		
		JButton btnReservar = new JButton("Reservar");
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Pagamento frame = new Pagamento();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnReservar.setForeground(Color.WHITE);
		btnReservar.setFont(new Font("Courier New", Font.PLAIN, 16));
		btnReservar.setBackground(new Color(58, 80, 60));
		btnReservar.setBounds(339, 463, 114, 39);
		contentPane.add(btnReservar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
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
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("Courier New", Font.PLAIN, 16));
		btnVoltar.setBackground(new Color(58, 80, 60));
		btnVoltar.setBounds(215, 463, 114, 39);
		contentPane.add(btnVoltar);
	}
}
