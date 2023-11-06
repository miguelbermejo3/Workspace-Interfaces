package ejercicio15;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla2 extends View {
	
	private static final long serialVersionUID = 1L;

	private JTextField textField;

	public Pantalla2(App appController) {
		super(appController);
		setLayout(null);

		textField = new JTextField();
		textField.setBounds(155, 86, 86, 20);
		

		add(textField);
		textField.setColumns(10);

		JButton irPantalla1 = new JButton("pantalla1");
		irPantalla1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irPantalla1(textField.getText());
				
			}
		});
		irPantalla1.setBounds(28, 212, 89, 23);
		add(irPantalla1);

		JButton irPantalla2 = new JButton("pantalla2");
		irPantalla2.setBounds(155, 212, 89, 23);
		irPantalla2.setEnabled(false);
		add(irPantalla2);

		JButton irPantalla3 = new JButton("pantalla3");
		irPantalla3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irPantalla3(textField.getText());

			}
		});
		irPantalla3.setBounds(294, 212, 89, 23);
		add(irPantalla3);
		// TODO Auto-generated constructor stub

	}
	public void cambiarTexto(String texto) {
		textField.setText(texto);
	}

}
