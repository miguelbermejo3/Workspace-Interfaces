package ejercicio15;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class PantallaBienvenida extends View{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PantallaBienvenida(App appController) {
		super(appController);
		setLayout(null);
		
		JLabel lblBienvenida = new JLabel("BIENVENIDO A MI PROGRAMA!!!");
		lblBienvenida.setBounds(146, 87, 167, 62);
		add(lblBienvenida);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				appController.irPantalla1("");
				
			}
		});
		btnEntrar.setBounds(175, 219, 89, 23);
		add(btnEntrar);
		
		//appController.quitarMenu();
		
	}
	
}
