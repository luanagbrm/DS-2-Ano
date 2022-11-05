import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaAmigos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaAmigos frame = new ListaAmigos();
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
	public ListaAmigos() {
		setTitle("Listar amigos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 531);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home telaHome = new Home();
				telaHome.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBackground(new Color(240, 255, 240));
		btnVoltar.setBounds(27, 21, 41, 37);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel = new JLabel("LISTA DE AMIGOS");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel.setBounds(282, 26, 140, 29);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 69, 549, 348);
		contentPane.add(scrollPane);
		
		JButton btnDeletar = new JButton("DELETAR");
		btnDeletar.setFont(new Font("Calibri", Font.BOLD, 13));
		btnDeletar.setForeground(new Color(255, 255, 255));
		btnDeletar.setBackground(new Color(204, 102, 102));
		btnDeletar.setBounds(430, 436, 113, 37);
		contentPane.add(btnDeletar);
		
		JButton btnAtualizar = new JButton("ATUALIZAR");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtualizarAmigo telaAtualizar = new AtualizarAmigo();
				telaAtualizar.setVisible(true);
				dispose();
			}
		});
		btnAtualizar.setFont(new Font("Calibri", Font.BOLD, 13));
		btnAtualizar.setForeground(new Color(255, 255, 255));
		btnAtualizar.setBackground(new Color(102, 153, 102));
		btnAtualizar.setBounds(128, 436, 113, 37);
		contentPane.add(btnAtualizar);
	}
}
