package app.controller;

import java.util.List;

import app.AppController;
import app.modelo.Animal;
import app.service.AnimalesNotFoundException;
import app.service.AnimalesService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Pantalla1Controller extends AppController {

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
		tablaAnimales.setItems(datos);

	}

	@FXML
	void consultarAnimales(ActionEvent event) {

		try {
			AnimalesService as = new AnimalesService();
			List<Animal> animales = as.consultarAnimales(txtfieldTipo.getText());
			
			
			
			
			
			datos.setAll(animales);

		} catch (AnimalesNotFoundException e) {

			e.printStackTrace();
		}

	}

	@FXML
	void irARegistro(ActionEvent event) {

		Pantalla2Controller bienvenidaController = (Pantalla2Controller) cambiarVista(AppController.FXML_PANTALLA2);

	}

}
