package wireframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class VistaEstado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ECabina;
	private JTextField ERotor;
	private JTextField EAltura;
	private JTextField EMotor;
	private JTextField ETemperatura;
	private JTextField EVelocidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaEstado frame = new VistaEstado();
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
	public VistaEstado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 540, 431);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Estado de componentes");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(50, 25, 464, 37);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 73, 520, 2);
		panel.add(separator);
		
		ECabina = new JTextField();
		ECabina.setBackground(new Color(152, 251, 152));
		ECabina.setEditable(false);
		ECabina.setForeground(Color.BLACK);
		ECabina.setHorizontalAlignment(SwingConstants.CENTER);
		ECabina.setText("Cabina");
		ECabina.setBounds(20, 87, 123, 49);
		panel.add(ECabina);
		ECabina.setColumns(10);
		
		ERotor = new JTextField();
		ERotor.setEditable(false);
		ERotor.setBackground(new Color(152, 251, 152));
		ERotor.setHorizontalAlignment(SwingConstants.CENTER);
		ERotor.setText("Rotor");
		ERotor.setColumns(10);
		ERotor.setBounds(20, 194, 123, 49);
		panel.add(ERotor);
		
		EAltura = new JTextField();
		EAltura.setBackground(new Color(255, 215, 0));
		EAltura.setEditable(false);
		EAltura.setHorizontalAlignment(SwingConstants.CENTER);
		EAltura.setText("Sensor Altura");
		EAltura.setColumns(10);
		EAltura.setBounds(299, 86, 123, 50);
		panel.add(EAltura);
		
		EMotor = new JTextField();
		EMotor.setEditable(false);
		EMotor.setBackground(new Color(152, 251, 152));
		EMotor.setHorizontalAlignment(SwingConstants.CENTER);
		EMotor.setText("Motor");
		EMotor.setColumns(10);
		EMotor.setBounds(20, 310, 123, 49);
		panel.add(EMotor);
		
		ETemperatura = new JTextField();
		ETemperatura.setBackground(new Color(220, 20, 60));
		ETemperatura.setEditable(false);
		ETemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		ETemperatura.setText("Sensor Temperatura");
		ETemperatura.setColumns(10);
		ETemperatura.setBounds(299, 310, 123, 49);
		panel.add(ETemperatura);
		
		EVelocidad = new JTextField();
		EVelocidad.setBackground(new Color(255, 215, 0));
		EVelocidad.setEditable(false);
		EVelocidad.setHorizontalAlignment(SwingConstants.CENTER);
		EVelocidad.setText("Sensor Velocidad");
		EVelocidad.setColumns(10);
		EVelocidad.setBounds(299, 194, 123, 49);
		panel.add(EVelocidad);
		
		JButton btnNewButton = new JButton("Reparar");
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(153, 86, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reemplazar");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(153, 113, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reparar");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(153, 194, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Reemplazar");
		btnNewButton_1_1.setEnabled(false);
		btnNewButton_1_1.setBounds(153, 220, 89, 23);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("Reparar");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setBounds(153, 310, 89, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("Reemplazar");
		btnNewButton_1_2.setEnabled(false);
		btnNewButton_1_2.setBounds(153, 336, 89, 23);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_4 = new JButton("Reparar");
		btnNewButton_4.setBounds(432, 86, 89, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_1_3 = new JButton("Reemplazar");
		btnNewButton_1_3.setEnabled(false);
		btnNewButton_1_3.setBounds(432, 113, 89, 23);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_5 = new JButton("Reparar");
		btnNewButton_5.setBounds(432, 194, 89, 23);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_1_4 = new JButton("Reemplazar");
		btnNewButton_1_4.setEnabled(false);
		btnNewButton_1_4.setBounds(432, 220, 89, 23);
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_6 = new JButton("Reparar");
		btnNewButton_6.setEnabled(false);
		btnNewButton_6.setBounds(432, 310, 89, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_1_5 = new JButton("Reemplazar");
		btnNewButton_1_5.setBounds(432, 336, 89, 23);
		panel.add(btnNewButton_1_5);
		
		JButton btnNewButton_7 = new JButton("Regresar");
		btnNewButton_7.setBounds(20, 383, 106, 37);
		panel.add(btnNewButton_7);
	}
}
