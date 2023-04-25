package gui;

import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Cursor;
import java.awt.Point;
import javax.swing.border.LineBorder;

import logica.grupoBotones;
import logica.validarKeys;

public class VentanaInicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel panel_principal;
	private final ButtonGroup grupoOpc = new ButtonGroup();
	private JPanel titulo = new JPanel();
	private JComboBox<String> salida = new JComboBox<String>();
	private JLabel Titulo = new JLabel("Conversor");
	private JPanel opciones = new JPanel();
	private JButton monedas = new JButton("Moneda");
	private JButton temperatura = new JButton("Temperatura");
	private JComboBox<String> entrada = new JComboBox<String>();
	private JLabel ide1 = new JLabel("Moneda a cambiar");
	private JLabel ide2 = new JLabel("Moneda a convertir");
	private JButton convertir = new JButton("Convertir");
	private JTextField txtIngreseCantidad = new JTextField();
	private validarKeys verificar = new validarKeys(txtIngreseCantidad) ; 
	private grupoBotones accion = new grupoBotones(monedas, temperatura, convertir, this);

	public VentanaInicio() {

		setBackground(new Color(73, 131, 121));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 513);
		setLocationRelativeTo(null);
		panel_principal = new JPanel();
		panel_principal.setBackground(new Color(73, 131, 121));
		panel_principal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel_principal);
		panel_principal.setLayout(new BorderLayout(5, 0));
		
		cargar_pantalla();
		

	}

	public JPanel getPanel_principal() {
		return panel_principal;
	}

	public void setPanel_principal(JPanel panel_principal) {
		this.panel_principal = panel_principal;
	}

	public JComboBox<String> getSalida() {
		return salida;
	}

	public void setSalida(JComboBox<String> salida) {
		this.salida = salida;
	}

	public JComboBox<String> getEntrada() {
		return entrada;
	}

	public void setEntrada(JComboBox<String> entrada) {
		this.entrada = entrada;
	}

	public JTextField getTxtIngreseCantidad() {
		return txtIngreseCantidad;
	}

	public JButton getMonedas() {
		return monedas;
	}

	public void setMonedas(JButton monedas) {
		this.monedas = monedas;
	}

	public JButton getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(JButton temperatura) {
		this.temperatura = temperatura;
	}

	public void cargar_pantalla() {
	
		titulo.setBackground(new Color(73, 131, 121));
		panel_principal.add(titulo, BorderLayout.NORTH);
		titulo.setPreferredSize(new Dimension(75, 75));

		Titulo.setForeground(new Color(63, 38, 28));
		Titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 31));
		titulo.add(Titulo);

		opciones.setBackground(new Color(73, 131, 121));
		panel_principal.add(opciones, BorderLayout.WEST);
		opciones.setPreferredSize(new Dimension(200, 75));
		opciones.setLayout(new GridLayout(0, 1, 5, 5));

		grupoOpc.add(monedas);
		monedas.setFocusable(false);

		monedas.setForeground(new Color(63, 38, 28));
		monedas.setIcon(new ImageIcon(VentanaInicio.class.getResource("/gui/Imagenes/dinero.png")));
		monedas.setBorder(new LineBorder(new Color(206, 164, 92), 5, true));
		monedas.setBackground(new Color(206, 164, 92));
		monedas.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		monedas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		monedas.setRequestFocusEnabled(false);
		monedas.setMinimumSize(new Dimension(21, 21));
		monedas.setMaximumSize(new Dimension(21, 21));
		monedas.setPreferredSize(new Dimension(21, 21));
		monedas.setSize(new Dimension(20, 20));
		opciones.add(monedas);

		grupoOpc.add(temperatura);
		temperatura.setContentAreaFilled(false);
		temperatura.setFocusable(false);
		temperatura.setForeground(new Color(63, 38, 28));
		temperatura.setIcon(new ImageIcon(VentanaInicio.class.getResource("/gui/Imagenes/termo.png")));
		temperatura.setBackground(new Color(206, 164, 92));
		temperatura.setBorder(new LineBorder(new Color(206, 164, 92), 5, true));
		temperatura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		temperatura.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		opciones.add(temperatura);

		JPanel pie = new JPanel();
		pie.setBackground(new Color(73, 131, 121));
		panel_principal.add(pie, BorderLayout.SOUTH);
		pie.setPreferredSize(new Dimension(75, 75));

		JPanel operaciones = new JPanel();
		operaciones.setBackground(new Color(73, 131, 121));
		operaciones.setBorder(new LineBorder(new Color(206, 164, 92), 5, true));
		panel_principal.add(operaciones, BorderLayout.CENTER);
		operaciones.setLayout(null);

		entrada.setForeground(new Color(63, 38, 28));
		entrada.setMinimumSize(new Dimension(30, 30));
		entrada.setSize(207, 34);
		entrada.setLocation(new Point(101, 85));
		entrada.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		entrada.setFocusable(false);
		entrada.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		operaciones.add(entrada);

		salida.setForeground(new Color(63, 38, 28));
		salida.setMinimumSize(new Dimension(30, 30));
		salida.setLocation(new Point(69, 168));
		salida.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		salida.setFocusable(false);
		salida.setBounds(392, 85, 207, 34);
		operaciones.add(salida);

		cargar_monedas();

		ide1.setForeground(new Color(63, 38, 28));
		ide1.setHorizontalAlignment(SwingConstants.CENTER);
		ide1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		ide1.setBounds(101, 47, 207, 28);
		operaciones.add(ide1);

		ide2.setForeground(new Color(63, 38, 28));
		ide2.setHorizontalAlignment(SwingConstants.CENTER);
		ide2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		ide2.setBounds(392, 47, 207, 28);
		operaciones.add(ide2);

		grupoOpc.add(convertir);
		convertir.setBorder(new EmptyBorder(0, 0, 0, 0));
		convertir.setBorderPainted(false);
		convertir.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		convertir.setFocusable(false);
		convertir.setBounds(285, 227, 143, 39);
		operaciones.add(convertir);
		
		txtIngreseCantidad.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		txtIngreseCantidad.setBounds(245, 183, 221, 34);
		operaciones.add(txtIngreseCantidad);
		txtIngreseCantidad.setColumns(10);
		
		JLabel lblCantidadAConvertir = new JLabel("Cantidad a convertir");
		lblCantidadAConvertir.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidadAConvertir.setForeground(new Color(63, 38, 28));
		lblCantidadAConvertir.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblCantidadAConvertir.setBounds(245, 156, 221, 28);
		operaciones.add(lblCantidadAConvertir);
		
		JLabel lblO = new JLabel("#.## o .##");
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setForeground(new Color(192, 192, 192));
		lblO.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		lblO.setBounds(409, 187, 221, 28);
		operaciones.add(lblO);
		
		txtIngreseCantidad.addKeyListener(verificar);
		convertir.addActionListener(accion);
		monedas.addActionListener(accion);
		temperatura.addActionListener(accion);
		
		
	}

	public void cargar_monedas() {
		String[] mon = { "Colon (CR)", "EE.UU. (USD)", "Libras (GBP)", "Yen (JPY)", "Won (KRW)", "Euro (EUR)" };
		entrada.setModel(new DefaultComboBoxModel<String>(mon));
		salida.setModel(new DefaultComboBoxModel<String>(mon));
		entrada.setSelectedIndex(0);
		salida.setSelectedIndex(1);
	}

	public void cargar_temperaturas() {
		String[] tem = { "Celsius", "Fahrenheit", "Kelvin" };
		entrada.setModel(new DefaultComboBoxModel<String>(tem));
		salida.setModel(new DefaultComboBoxModel<String>(tem));
		entrada.setSelectedIndex(0);
		salida.setSelectedIndex(1);

	}
}
