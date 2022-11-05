import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 297);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloHome = new JLabel("LISTA DE AMIGOS");
		lblTituloHome.setFont(new Font("Calibri", Font.BOLD, 22));
		lblTituloHome.setBounds(162, 11, 166, 44);
		contentPane.add(lblTituloHome);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		panel.setBorder(new LineBorder(new Color(153, 204, 153), 11, true));
		panel.setBounds(33, 45, 414, 307);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel imgLista = new JLabel("");
		imgLista.setBounds(43, 42, 145, 145);
		panel.add(imgLista);
		imgLista.setIcon(new ImageIcon(Home.class.getResource("/imagem/People flying-bro.png")));
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(222, 72, 136, 34);
		panel.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroAmigo telaCadastro = new CadastroAmigo();
				telaCadastro.setVisible(true);
				dispose();
			}
		});
		btnCadastrar.setForeground(new Color(255, 255, 255));
		btnCadastrar.setFont(new Font("Calibri", Font.BOLD, 13));
		btnCadastrar.setBackground(new Color(102, 153, 102));
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaAmigos telaLista = new ListaAmigos();
				telaLista.setVisible(true);
				dispose();
			}
		});
		btnListar.setBounds(222, 128, 136, 34);
		panel.add(btnListar);
		btnListar.setForeground(Color.WHITE);
		btnListar.setFont(new Font("Calibri", Font.BOLD, 13));
		btnListar.setBackground(new Color(102, 153, 102));
	}
}
