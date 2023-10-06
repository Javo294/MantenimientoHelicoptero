package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
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
	public VistaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Placa", "Piloto", "Num Hangar", "Estado"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(152);
		table.getColumnModel().getColumn(1).setPreferredWidth(147);
		table.getColumnModel().getColumn(2).setPreferredWidth(130);
		table.getColumnModel().getColumn(3).setPreferredWidth(119);
		table.setBackground(Color.LIGHT_GRAY);
		table.setBounds(10, 130, 464, 320);
		panel.add(table);
		
		JLabel lblNewLabel = new JLabel("Monitoreo Helicopteros");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 442, 50);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Añadir Hangar");
		btnNewButton.setBounds(166, 79, 146, 40);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Añadir Helicoptero");
		btnNewButton_1.setBounds(328, 79, 146, 40);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Monitorear Helicopteros");
		btnNewButton_2.setBounds(10, 79, 146, 40);
		panel.add(btnNewButton_2);
	}
}
