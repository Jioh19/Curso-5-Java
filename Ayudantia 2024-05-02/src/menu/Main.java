package menu;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

//		Object[] values = {"Sumar", "Restar", "Multiplicar", "Dividir"};
//		
//		Object value = JOptionPane.showInputDialog(null, "Selección operación", "Input",
//				JOptionPane.INFORMATION_MESSAGE, null,
//				values, values[0]);
		
		Menu menu = new Menu();
		
		menu.crearMenu();
		
	}

}
