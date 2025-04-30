package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clase.Contar;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtCantidad;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private Contar contar = new Contar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P1 frame = new P1();
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
	public P1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("\"Control de Perros en Veterinaria\"");
			lblNewLabel.setBounds(10, 11, 173, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Cantidad de Perros:");
			lblNewLabel_1.setBounds(10, 50, 102, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setEditable(false);
			txtCantidad.setBounds(122, 47, 91, 20);
			contentPane.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		{
			btnNewButton = new JButton("Ingresar Perro");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(31, 90, 135, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Sacar Perro");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(244, 90, 127, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 137, 384, 113);
			contentPane.add(scrollPane);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		contar.ingresarPerro();  
	    int cantidad = contar.getCantidad();
	    txtCantidad.setText(String.valueOf(cantidad));  

	    if (cantidad == 1) {
	        textArea.setText("Se ingresó 1 perro.\n");
	    } else {
	        textArea.setText("Se ingresaron " + cantidad + " perros.\n");
	    }
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		boolean retirado = contar.retirarPerro(); 
	    int cantidad = contar.getCantidad();
	    txtCantidad.setText(String.valueOf(cantidad));  

	    if (retirado) {
	        if (cantidad == 1) {
	            textArea.setText("Se retiró un perro. Queda 1 perro.\n");
	        } else {
	            textArea.setText("Se retiró un perro. Quedan " + cantidad + " perros.\n");
	        }
	    } else {
	        textArea.setText("No hay perros para retirar.\n");
	    }
	}
	}
	
		
	

