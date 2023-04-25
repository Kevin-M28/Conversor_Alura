package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import gui.VentanaInicio;

public class grupoBotones implements ActionListener {

	private JButton boton1, boton2, boton3;
	private VentanaInicio menu;
	private int valor;
	private Conversor conver = new Conversor();

	public grupoBotones(JButton bot1, JButton bot2, JButton bot3, VentanaInicio ventanaInicio) {
		super();
		this.boton1 = bot1;
		this.boton2 = bot2;
		this.boton3 = bot3;
		this.menu = ventanaInicio;
		this.valor = 1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == boton1) {
			this.valor = 1;
			menu.cargar_monedas();
			menu.getMonedas().setContentAreaFilled(true);
			menu.getTemperatura().setContentAreaFilled(false);

		}
		if (e.getSource() == boton2) {
			this.valor = 2;
			menu.cargar_temperaturas();
			menu.getMonedas().setContentAreaFilled(false);
			menu.getTemperatura().setContentAreaFilled(true);
		}
		if (e.getSource() == boton3) {
			if (menu.getTxtIngreseCantidad().getText().isEmpty()) {
				JOptionPane.showMessageDialog(menu, "Necesitas ingresar una cantidad");
			} else {
				if (this.valor == 1) {
					JOptionPane.showMessageDialog(menu, "El resultado de la conversion es: "
							+ conver.conversion_finalMon(Float.parseFloat(menu.getTxtIngreseCantidad().getText()),
									menu.getEntrada().getSelectedIndex(), menu.getSalida().getSelectedIndex())
							+ " " + menu.getSalida().getSelectedItem());
				} else {
					JOptionPane.showMessageDialog(menu, "El resultado de la conversion es: "
							+ conver.conversion_finalTem(Float.parseFloat(menu.getTxtIngreseCantidad().getText()),
									menu.getEntrada().getSelectedItem().toString(),
									menu.getSalida().getSelectedItem().toString())
							+ " " + menu.getSalida().getSelectedItem());
				}
			}
		}
	}

}
