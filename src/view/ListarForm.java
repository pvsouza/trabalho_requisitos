package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Carro;
import model.Loja;
import model.Motocicleta;

import javax.swing.JTable;

public class ListarForm extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public ListarForm(int flag, Loja loja) {
		setBounds(100, 100, 764, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		String[] colunas = new String[] {
				"Chassi", "Montadora", "Modelo", "Tipo", "Cor", "Motorização", "Câmbio", "Preço"
		};
		JTable tabela = new JTable();
		DefaultTableModel dtm = new DefaultTableModel();
		JScrollPane scroll = new JScrollPane();

		dtm.setColumnIdentifiers(colunas);
		tabela.setModel(dtm);

		switch (flag) {
			case 1: {
				setTitle("Listar Carro");
				for(Carro v : loja.carros) {
					dtm.addRow(new Object[]{
							v.getChassi(),
							v.getMontadora(),
							v.getModelo(),
							v.getTipo(),
							v.getCor(),
							v.getMotorizacao(),
							v.getCambio(),
							v.getPreco()
					});
				}
				break;
			}
			case 2: {
				setTitle("Listar Motocicleta");
				for(Motocicleta v : loja.motocicletas) {
					dtm.addRow(new Object[]{
							v.getChassi(),
							v.getMontadora(),
							v.getModelo(),
							v.getTipo(),
							v.getCor(),
							v.getMotorizacao(),
							v.getCambio(),
							v.getPreco()
					});
				}
				break;
			}
		}

		scroll.setViewportView(tabela);
		this.add(scroll);
	}

}
