package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Carro;
import model.Loja;
import model.Motocicleta;

import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class BuscarForm extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	public BuscarForm(final Loja loja) {
		setBounds(100, 100, 896, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Carro", "Motocicleta"}));
		comboBox.setBounds(61, 14, 126, 22);
		contentPane.add(comboBox);

		table = new JTable();
		table.setBounds(696, 96, -698, 286);
		contentPane.add(table);
		String[] colunas = new String[] {
				"Chassi", "Montadora", "Modelo", "Tipo", "Cor", "Motorização", "Câmbio", "Preço"
		};
		final DefaultTableModel dtm = new DefaultTableModel();
		table.setModel(dtm);
		dtm.setColumnIdentifiers(colunas);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(22, 17, 56, 16);
		contentPane.add(lblTipo);
		
		JLabel lblNewLabel = new JLabel("Vari\u00E1vel:");
		lblNewLabel.setBounds(199, 17, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor:");
		lblNewLabel_1.setBounds(434, 17, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Chassi", "Montadora", "Modelo"}));
		comboBox_1.setBounds(267, 14, 137, 22);
		contentPane.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(478, 14, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (comboBox.getSelectedIndex()+1) {
				case 1: {
					for(Carro v : loja.carros) {
						switch(comboBox_1.getSelectedIndex()) {
							case 0 : {
								if (v.getChassi().equals(textField.getText())) {
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
									break;
								}
								break;
							}
							case 1 : {
								if (v.getMontadora().equals(textField.getText())) {
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
									break;
								}
								break;
							}
							case 2 : {
								if (v.getModelo().equals(textField.getText())) {
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
									break;
								}
								break;
							}
						}
					}
					break;
				}
				case 2: {
					for(Motocicleta v : loja.motocicletas) {
						switch(comboBox_1.getSelectedIndex()) {
							case 0 : {
								if (v.getChassi().equals(textField.getText())) {
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
									break;
								}
								break;
							}
							case 1 : {
								if (v.getMontadora().equals(textField.getText())) {
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
									break;
								}
								break;
							}
							case 2 : {
								if (v.getModelo().equals(textField.getText())) {
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
									break;
								}
								break;
							}
						}
					}
					break;
				}
			}
			}
		});
		btnNewButton.setBounds(652, 13, 97, 25);
		contentPane.add(btnNewButton);
	}
}
