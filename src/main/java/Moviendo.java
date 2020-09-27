import javax.swing.JOptionPane;

public class Moviendo {

	public void trasladando(int planta) {

		String dato = JOptionPane.showInputDialog("¿A qué planta desea ir?");
		planta = Integer.parseInt(dato);

		for (int i = 1; i <= planta; i++) {
			JOptionPane.showMessageDialog(null, "Está en la planta " + i);

		}
		JOptionPane.showMessageDialog(null, "Ha llegado a su planta, " + planta);

	}

}
