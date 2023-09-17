package wireframes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField FieldNombreInspector;
	private JTextField FieldCodigoInspeccion;
	private JTextField FieldEstadoInspeccion;
	private JTextField FieldEstadoHelicoptero;

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
		setBounds(100, 100, 500, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 484, 370);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnRevision = new JButton("Revisión");
		btnRevision.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRevision.setBounds(283, 318, 102, 41);
		panel.add(btnRevision);
		
		JButton btnDespegar = new JButton("Despegar");
		btnDespegar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDespegar.setBounds(91, 318, 102, 41);
		panel.add(btnDespegar);
		
		JLabel lblNewLabel = new JLabel("Nombre Inspector: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(30, 106, 189, 25);
		panel.add(lblNewLabel);
		
		FieldNombreInspector = new JTextField();
		FieldNombreInspector.setEnabled(false);
		FieldNombreInspector.setBounds(258, 112, 150, 20);
		panel.add(FieldNombreInspector);
		FieldNombreInspector.setColumns(10);
		
		FieldCodigoInspeccion = new JTextField(); 
		FieldCodigoInspeccion.setEditable(false);
		FieldCodigoInspeccion.setColumns(10);
		FieldCodigoInspeccion.setBounds(258, 158, 150, 20);
		panel.add(FieldCodigoInspeccion);
		
		FieldEstadoInspeccion = new JTextField();
		FieldEstadoInspeccion.setEditable(false);
		FieldEstadoInspeccion.setColumns(10);
		FieldEstadoInspeccion.setBounds(258, 208, 150, 20);
		panel.add(FieldEstadoInspeccion);
		
		JLabel lblNewLabel_1 = new JLabel("Control de mantenimiento");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 11, 464, 51);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 61, 454, 5);
		panel.add(separator);
		
		JLabel lblCdigoInspeccin = new JLabel("Código Inspección:");
		lblCdigoInspeccin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCdigoInspeccin.setBounds(30, 152, 189, 25);
		panel.add(lblCdigoInspeccin);
		
		JLabel lblEstadoInspeccin = new JLabel("Estado Inspección:");
		lblEstadoInspeccin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstadoInspeccin.setBounds(30, 202, 189, 25);
		panel.add(lblEstadoInspeccin);
		
		JLabel lblEstadoHelicoptero = new JLabel("Estado Helicoptero:");
		lblEstadoHelicoptero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstadoHelicoptero.setBounds(30, 257, 189, 25);
		panel.add(lblEstadoHelicoptero);
		
		FieldEstadoHelicoptero = new JTextField();
		FieldEstadoHelicoptero.setEditable(false);
		FieldEstadoHelicoptero.setColumns(10);
		FieldEstadoHelicoptero.setBounds(258, 263, 150, 20);
		panel.add(FieldEstadoHelicoptero);
	}
}
