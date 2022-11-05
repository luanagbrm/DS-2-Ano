import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtualizarAmigo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtApelido;
	private JTextField txtTelefone;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarAmigo frame = new AtualizarAmigo();
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
	public AtualizarAmigo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(153, 204, 153));
		contentPane_1.setBounds(0, 0, 460, 351);
		contentPane.add(contentPane_1);
		
		JLabel lblTituloAtualizar = new JLabel("ATUALIZAR AMIGO");
		lblTituloAtualizar.setForeground(Color.BLACK);
		lblTituloAtualizar.setFont(new Font("Calibri", Font.BOLD, 24));
		lblTituloAtualizar.setBounds(137, 22, 192, 35);
		contentPane_1.add(lblTituloAtualizar);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(240, 255, 240));
		panel.setBounds(279, -11, 192, 397);
		contentPane_1.add(panel);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setForeground(Color.WHITE);
		btnAtualizar.setFont(new Font("Calibri", Font.BOLD, 13));
		btnAtualizar.setBackground(new Color(102, 153, 102));
		btnAtualizar.setBounds(38, 146, 120, 34);
		panel.add(btnAtualizar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaAmigos telaLista = new ListaAmigos();
				telaLista.setVisible(true);
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
		txtNome.setColumns(10);
		txtNome.setBounds(92, 112, 141, 28);
		contentPane_1.add(txtNome);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(240, 255, 240));
		lblNome.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNome.setBounds(92, 93, 71, 20);
		contentPane_1.add(lblNome);
		
		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setForeground(new Color(240, 255, 240));
		lblApelido.setFont(new Font("Calibri", Font.BOLD, 14));
		lblApelido.setBounds(27, 151, 71, 20);
		contentPane_1.add(lblApelido);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(new Color(240, 255, 240));
		lblTelefone.setFont(new Font("Calibri", Font.BOLD, 14));
		lblTelefone.setBounds(27, 207, 71, 20);
		contentPane_1.add(lblTelefone);
		
		txtApelido = new JTextField();
		txtApelido.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtApelido.setColumns(10);
		txtApelido.setBounds(27, 168, 206, 28);
		contentPane_1.add(txtApelido);
		
		txtTelefone = new JTextField();
		txtTelefone.setToolTipText("c");
		txtTelefone.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(27, 226, 206, 28);
		contentPane_1.add(txtTelefone);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtId.setColumns(10);
		txtId.setBounds(26, 112, 56, 28);
		contentPane_1.add(txtId);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(new Color(240, 255, 240));
		lblId.setFont(new Font("Calibri", Font.BOLD, 14));
		lblId.setBounds(27, 94, 55, 20);
		contentPane_1.add(lblId);
	}

}
