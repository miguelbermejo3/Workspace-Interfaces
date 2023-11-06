package ejercicio14;

import javax.swing.JPanel;

public abstract class View extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected static App appController;

	public View(App appController) {
		View.appController = appController;
	}

}
