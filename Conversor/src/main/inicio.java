package main;

import gui.VentanaInicio;

public class inicio {

	public static void main(String[] args) {
		
		
		try {
			VentanaInicio frame = new VentanaInicio();
			frame.setVisible(true);
		} catch (Exception e) {
			throw new RuntimeException();
		}

	}

}
