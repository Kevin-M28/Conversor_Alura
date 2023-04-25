package logica;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class validarKeys implements KeyListener {
	private int contador;
	private JTextField validar;
	public validarKeys(JTextField val) {
		super();
		this.contador = 0;
		this.validar = val;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if(!this.validar.getText().contains(".")) {
			contador=0;
		}
		if (contador == 0 && c == '.') {
			contador++;
		} else if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE)) {
			e.consume();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
