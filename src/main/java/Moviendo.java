import javax.swing.JOptionPane;

public class Moviendo {

	public void trasladando(int planta) {

		String dato = JOptionPane.showInputDialog("�A qu� planta desea ir?");
		planta = Integer.parseInt(dato);

		for (int i = 1; i <= planta; i++) {
			JOptionPane.showMessageDialog(null, "Est� en la planta " + i);

		}
		JOptionPane.showMessageDialog(null, "Ha llegado a su planta, " + planta);

	}

}
