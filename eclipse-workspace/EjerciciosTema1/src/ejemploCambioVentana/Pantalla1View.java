package ejemploCambioVentana;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Pantalla1View extends View {
	private JLabel lblNewLabel;
	public Pantalla1View(App appController) {
		super(appController);
		setLayout(null);

		 lblNewLabel = new JLabel("Pantalla1");
		lblNewLabel.setBounds(106, 11, 140, 42);
		add(lblNewLabel);

		JButton btnNewButton = new JButton("pantalla 2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String user=textField.getText();
				String pass = passwordField.getPassword().toString();
				appController.login(user,pass);
				
				
				
			}
		});
		btnNewButton.setBounds(271, 236, 89, 23);
		add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(106, 133, 117, 20);
		add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(106, 78, 117, 20);
		add(textField);
		textField.setColumns(10);
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField textField;
}
