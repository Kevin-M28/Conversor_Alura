package logica;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Conversor {

	private static final Map<Integer, Float> monedas = new HashMap<>();
	private static DecimalFormat dc;

	static {
		dc = new DecimalFormat("#.###");
		monedas.put(0, (float) 1);
		monedas.put(1, (float) 0.0018748);
		monedas.put(2, (float) 0.0015062);
		monedas.put(3, (float) 0.25166);
		monedas.put(4, (float) 2.4951);
		monedas.put(5, (float) 0.0017062);
	}

	public Conversor() {

	}

	public String conversion_finalMon(float valor, int origen, int destino) {
		return dc.format((valor * (monedas.get(destino) / monedas.get(origen))));
	}

	public String conversion_finalTem(float valor_conver, String origen, String destino) {
		float valor_final = 0;
		
		switch (origen) {
		case "Celsius":
			if (destino == "Fahrenheit") { // Celsius a Fahrenheit
				valor_final = (float) (((valor_conver * 9 )/ 5) + 32);
			} else if (destino == "Kelvin") { // Celsius a Kelvin
				valor_final = (float) (valor_conver + 273.15);
			}else {
            	valor_final = valor_conver;
            }
			break;
		case "Fahrenheit":
			if (destino == "Celsius") { // Fahrenheit a Celsius
				valor_final = (((valor_conver - 32) *5)/9);
            } else if (destino == "Kelvin") { // Fahrenheit a Kelvin
            	valor_final = (float) ((valor_conver + 459.67) * (5/9));
            }else {
            	valor_final = valor_conver;
            }
			break;
		case "Kelvin":
			if (destino == "Celsius") { // Kelvin a Celsius
				valor_final = (float) (valor_conver - 273.15);
            } else if (destino == "Fahrenheit") { // Kelvin a Fahrenheit
            	valor_final = (float) (((valor_conver * 9)/5) - 459.67);
            }            else {
            	valor_final = valor_conver;
            }
		default:
			break;
			
		}
		return dc.format(valor_final);
	}

}
