package app.gui.bienvenida;

import java.util.List;

import app.gui.AppController;
import app.gui.modelo.Persona;
import app.gui.service.PersonaService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class Pantalla1Controller extends AppController {
	@FXML
	private Button btnConsulta;

	@FXML
	private TableColumn<Persona, String> columnDni;

	@FXML
	private TableColumn<Persona, Integer> columnEdad;

	@FXML
	private TableColumn<Persona, String> columnNombre;

	@FXML
	private TableView<Persona> tabla;

	private ObservableList<Persona> datos;

	public void initialize() {
		PropertyValueFactory<Persona, String> factoryValueDni = new PropertyValueFactory<Persona, String>("dni");
		PropertyValueFactory<Persona, Integer> factoryValueEdad = new PropertyValueFactory<Persona, Integer>("edad");
		PropertyValueFactory<Persona, String> factoryValueNombre = new PropertyValueFactory<Persona, String>("nombre");

		// configuramos la tablecolumn los propertyfactoryvalue que acabamnos de crear
		columnDni.setCellValueFactory(factoryValueDni);
		columnEdad.setCellValueFactory(factoryValueEdad);
		columnNombre.setCellValueFactory(factoryValueNombre);

		// obtenemos una observablelist y la configuramos en la tableview

		datos = FXCollections.observableArrayList();
		tabla.setItems(datos);

	}

	@FXML
	void consultarPersona(ActionEvent event) {

	}

	public void añadirPersona() {
		Task<Void> task = new Task<Void>() {

			List<Persona> personas;

			@Override
			protected Void call() throws Exception {
				personas = new PersonaService().getPersonas();
				return null;
			}

			@Override
			protected void succeeded() {
				super.succeeded();
				datos.addAll(personas);

			}

			@Override
			protected void failed() {
				super.failed();
				Alert a = new Alert(AlertType.ERROR);
				a.setHeaderText("Error ");
				a.show();
			}
		};
		
		new Thread(task).start();
		
		
		

	}
	
	
	

}
