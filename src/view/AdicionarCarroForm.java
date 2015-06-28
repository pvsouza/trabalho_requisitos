package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import model.Carro;
import model.Loja;
import model.Motocicleta;

public class AdicionarCarroForm extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/*
	 * FLAG: 1 - carro 2 - moto
	 */
	public AdicionarCarroForm(final Loja loja) {
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Adicionar Veiculo");

		setBounds(100, 100, 303, 393);
		getContentPane().setLayout(null);

		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Sedan",
				"Hatch" }));
		comboBox.setBounds(121, 107, 116, 22);
		getContentPane().add(comboBox);

		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (Component c : getContentPane().getComponents()) {
					if (c instanceof JTextField) {
						if (((JTextField) c).getText().trim().length() == 0) {
							JOptionPane.showMessageDialog(null,
									"Valores inválidos", "Erro",
									JOptionPane.ERROR_MESSAGE);
							return;
						}
					}
				}

				Carro v = new Carro();
				v.setChassi(textField.getText());
				v.setMontadora(textField_1.getText());
				v.setModelo(textField_2.getText());
				v.setTipo(comboBox.getSelectedItem().toString());
				v.setCor(textField_4.getText());
				v.setMotorizacao(textField_5.getText());
				v.setCambio(textField_6.getText());
				v.setPreco(Float.valueOf(textField_7.getText()));
				loja.carros.add(v);

				JOptionPane.showMessageDialog(null,
						"Veiculo adicionado com sucesso !", "Mensagem",
						JOptionPane.PLAIN_MESSAGE);
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(12, 316, 97, 25);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setBounds(143, 316, 97, 25);
		getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Chassi:");
		lblNewLabel.setBounds(12, 13, 56, 16);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Montadora:");
		lblNewLabel_1.setBounds(12, 42, 78, 16);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Modelo:");
		lblNewLabel_2.setBounds(12, 75, 56, 16);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Tipo:");
		lblNewLabel_3.setBounds(12, 110, 56, 16);
		getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Cor:");
		lblNewLabel_4.setBounds(12, 147, 56, 16);
		getContentPane().add(lblNewLabel_4);

		JLabel lblMotorizao = new JLabel("Motoriza\u00E7\u00E3o:");
		lblMotorizao.setBounds(12, 182, 78, 16);
		getContentPane().add(lblMotorizao);

		JLabel lblCmbio = new JLabel("C\u00E2mbio:");
		lblCmbio.setBounds(12, 220, 56, 16);
		getContentPane().add(lblCmbio);

		JLabel lblNewLabel_5 = new JLabel("Pre\u00E7o:");
		lblNewLabel_5.setBounds(12, 257, 56, 16);
		getContentPane().add(lblNewLabel_5);

		textField = new JTextField();
		textField.setBounds(121, 10, 116, 22);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(121, 39, 116, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(121, 72, 116, 22);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(121, 144, 116, 22);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(121, 179, 116, 22);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(121, 219, 116, 22);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(121, 254, 116, 22);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
	}
}
