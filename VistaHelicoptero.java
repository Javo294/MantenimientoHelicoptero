package Vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VistaHelicoptero extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaHelicoptero frame = new VistaHelicoptero();
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
	public VistaHelicoptero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 356, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 340, 354);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione Hangar"}));
		comboBox.setBounds(10, 59, 145, 22);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Seleccione Helicoptero"}));
		comboBox_1.setBounds(185, 59, 145, 22);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Placa");
		lblNewLabel.setBounds(21, 115, 76, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Conductor");
		lblNewLabel_1.setBounds(21, 162, 76, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Estado");
		lblNewLabel_2.setBounds(21, 205, 76, 14);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(107, 112, 190, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(107, 159, 190, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(107, 202, 190, 20);
		panel.add(textField_2);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.setBounds(21, 290, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reparar");
		btnNewButton_1.setBounds(107, 233, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Destruir");
		btnNewButton_2.setBounds(208, 233, 89, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mantenimiento Helicoptero");
		lblNewLabel_3.setBounds(10, 34, 136, 14);
		panel.add(lblNewLabel_3);
	}
}
