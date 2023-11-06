package ejemploCambioVentana;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla2View extends View{
	public Pantalla2View(App appController) {
		super(appController);
		setLayout(null);
		
		JButton btnNewButton = new JButton("pantalla 3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irAPantalla3();
			}
		});
		btnNewButton.setBounds(268, 207, 89, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("pantalla 2");
		lblNewLabel.setBounds(117, 112, 110, 30);
		add(lblNewLabel);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
