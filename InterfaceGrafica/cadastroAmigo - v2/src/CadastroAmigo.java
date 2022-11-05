import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroAmigo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtApelido;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAmigo frame = new CadastroAmigo();
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
	public CadastroAmigo() {
		setTitle("Cadastrar amigo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSucesso = new JLabel("AMIGO CADASTRADO COM SUCESSO!");
		lblSucesso.setFont(new Font("Calibri", Font.ITALIC, 13));
		lblSucesso.setBounds(135, 44, 206, 14);
		contentPane.add(lblSucesso);
		lblSucesso.setVisible(false);
		
		JLabel lblTituloCadastro = new JLabel("CADASTRO DE AMIGO");
		lblTituloCadastro.setForeground(new Color(0, 0, 0));
		lblTituloCadastro.setFont(new Font("Calibri", Font.BOLD, 24));
		lblTituloCadastro.setBounds(125, 21, 229, 35);
		contentPane.add(lblTituloCadastro);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		panel.setBounds(279, -11, 192, 397);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexao bd = new Conexao();
				bd.conectar();
				
				String nome = txtNome.getText();
				String apelido = txtApelido.getText();
				String telefone = txtTelefone.getText();
				if(nome == "") {
					nome = null;
				} else if(apelido == "") {
					apelido = null;
				} else if(telefone == "") {
					telefone = null;
				}
				
				bd.inserirAmigo(nome, apelido, telefone);
				txtNome.setText("");
				txtApelido.setText("");
				txtTelefone.setText("");
				
				lblSucesso.setVisible(true);
			}
		});
		btnCadastrar.setBounds(38, 146, 120, 34);
		panel.add(btnCadastrar);
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setFont(new Font("Calibri", Font.BOLD, 13));
		btnCadastrar.setBackground(new Color(102, 153, 102));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home telaHome = new Home();
				telaHome.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("Calibri", Font.BOLD, 13));
		btnVoltar.setBackground(new Color(102, 153, 102));
		btnVoltar.setBounds(38, 208, 120, 34);
		panel.add(btnVoltar);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtNome.setBounds(27, 112, 206, 28);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNome.setForeground(new Color(240, 255, 240));
		lblNome.setBounds(27, 91, 71, 20);
		contentPane.add(lblNome);
		
		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setForeground(new Color(240, 255, 240));
		lblApelido.setFont(new Font("Calibri", Font.BOLD, 14));
		lblApelido.setBounds(27, 151, 71, 20);
		contentPane.add(lblApelido);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(new Color(240, 255, 240));
		lblTelefone.setFont(new Font("Calibri", Font.BOLD, 14));
		lblTelefone.setBounds(27, 207, 71, 20);
		contentPane.add(lblTelefone);
		
		txtApelido = new JTextField();
		txtApelido.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtApelido.setColumns(10);
		txtApelido.setBounds(27, 168, 206, 28);
		contentPane.add(txtApelido);
		
		txtTelefone = new JTextField();
		txtTelefone.setToolTipText("c");
		txtTelefone.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(27, 226, 206, 28);
		contentPane.add(txtTelefone);
	}
}
