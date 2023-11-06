package ejemploCambioVentana;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla3View extends View {
	public Pantalla3View(App appController) {
		super(appController);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("pantalla 3");
		lblNewLabel.setBounds(137, 111, 115, 30);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("pantalla 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irAPantalla1();
			}
		});
		btnNewButton.setBounds(245, 222, 89, 23);
		add(btnNewButton);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
