package app.controller;

import java.util.ArrayList;
import java.util.List;

import app.AppController;
import app.modelo.Animal;
import app.service.AnimalesService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class Pantalla1Controller extends AppController {

	@FXML
	private AnchorPane panel;

	@FXML
	private CheckBox chckbxModoOscuro;

	@FXML
	private Button btnBuscar;

	@FXML
	private TableView<Animal> tablaAnimales;

	@FXML
	private TextField txtfieldTipo;

	@FXML
	private TableColumn<Animal, String> columnNombre;
	@FXML
	private TableColumn<Animal, String> columnTipo;
	@FXML
	private TableColumn<Animal, Integer> columnEdad;

	@FXML
	private ProgressBar progressBar;

	@FXML
	private Button btnNuevo;

	private ObservableList<Animal> datos;

	public void initialize() {
		PropertyValueFactory<Animal, String> factoryValueNombre = new PropertyValueFactory<Animal, String>("nombre");
		PropertyValueFactory<Animal, Integer> factoryValueEdad = new PropertyValueFactory<Animal, Integer>("edad");
		PropertyValueFactory<Animal, String> factoryValueTipo = new PropertyValueFactory<Animal, String>("tipo");

		columnNombre.setCellValueFactory(factoryValueNombre);
		columnTipo.setCellValueFactory(factoryValueTipo);
		columnEdad.setCellValueFactory(factoryValueEdad);

		datos = FXCollections.observableArrayList();

		Animal a = (Animal) getUserDataObject("animalNuevo");
		if (a != null) {
			txtfieldTipo.setText(a.getTipo());

			consultarAnimales(null);
		}

		tablaAnimales.setItems(datos);
		Boolean decision = (Boolean) getUserDataObject("oscuro");

		if (decision != null) {
			if (decision == true) {

				panel.getStylesheets().add("/css/dark-theme.css"); // añade la hoja de estilos
				chckbxModoOscuro.isSelected();
			} else {
				panel.getStylesheets().clear(); // borramos las hojas de estilos añadidas
			}
		}

	}

	@FXML
	void consultarAnimales(ActionEvent event) {
		AnimalesService as = new AnimalesService();

		Task<Animal> task = new Task<Animal>() {

			List<Animal> animales = new ArrayList<>();

			@Override
			protected Animal call() throws Exception {
				animales = as.consultarAnimales(txtfieldTipo.getText());

				return null;
			}

			@Override
			protected void succeeded() {
				super.succeeded();
				datos.setAll(animales);

				updateProgress(10, 10);
			}

			@Override
			protected void failed() {
				datos.clear();
				super.failed();

			}

		};

		new Thread(task).start();

		progressBar.progressProperty().bind(task.progressProperty());

	}

	@FXML
	void irARegistro(ActionEvent event) {

		Pantalla2Controller bienvenidaController = (Pantalla2Controller) cambiarVista(AppController.FXML_PANTALLA2);

	}

	@FXML
	void encenderModoOscuro(ActionEvent event) {

		if (chckbxModoOscuro.isSelected()) {
			panel.getStylesheets().add("/css/dark-theme.css"); // añade la hoja de estilos
			setUserDataObject("oscuro", true);

		} else {
			panel.getStylesheets().clear(); // borramos las hojas de estilos añadidas
			setUserDataObject("oscuro", false);
		}

	}

}
