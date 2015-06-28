

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import model.Carro;
import model.Loja;
import view.AdicionarCarroForm;
import view.AdicionarMotocicletaForm;
import view.BuscarForm;
import view.ListarForm;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	public static Loja loja = new Loja();
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setTitle("Atividade 1");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenu mnRegistros = new JMenu("Registros");
		mnNewMenu.add(mnRegistros);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mnRegistros.add(mntmSalvar);
		
		JMenuItem mntmCarregar = new JMenuItem("Carregar");
		mnRegistros.add(mntmCarregar);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnNewMenu.add(mntmSair);
		
		JMenu mnNewMenu_1 = new JMenu("Carro");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmAdicionar = new JMenuItem("Adicionar");
		mntmAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarCarroForm frm = new AdicionarCarroForm(loja);
				frm.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmAdicionar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListarForm frm = new ListarForm(1, loja);
				frm.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmListar);
		
		JMenu mnMotociclet = new JMenu("Motocicleta");
		menuBar.add(mnMotociclet);
		
		JMenuItem menuItem = new JMenuItem("Adicionar");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdicionarMotocicletaForm frm = new AdicionarMotocicletaForm(loja);
				frm.setVisible(true);
			}
		});
		mnMotociclet.add(menuItem);
		
		JMenuItem menuItem_3 = new JMenuItem("Listar");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarForm frm = new ListarForm(2, loja);
				frm.setVisible(true);
			}
		});
		mnMotociclet.add(menuItem_3);
		
		JMenu mnPesquisar = new JMenu("Pesquisar");
		menuBar.add(mnPesquisar);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscarForm frm = new BuscarForm(loja);
				frm.setVisible(true);
			}
		});
		mnPesquisar.add(mntmBuscar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
