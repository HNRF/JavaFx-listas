package Controlador;

import Modelo.Personas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControladorAnadir {

	// declaramos tabla personas y columnas
	@FXML
	private TableView<Personas> tblpersonas;

	@FXML
	private TableColumn<?, ?> cledad;

	@FXML
	private TableColumn<?, ?> clnombre;

	@FXML
	private TableColumn<?, ?> clapellido;

	// declamos casillas de texto
	@FXML
	private TextField txtapellido;

	@FXML
	private TextField txtnombre;

	@FXML
	private TextField txtedad;

	// declaramos botones
	@FXML
	private Button btnagregar;

	@FXML
	private Button btneliminar;

	@FXML
	private Button btnmodificar;
	
	@FXML
    private Button btnbuscar;

	// ObservableList para ir añadiendo

	ObservableList<Personas> person;

	// posicion

	private int posicionPersonaEnTabla;

	// asignamos el objecto con su columna correspondiente
	public void initialize() {

		// observablelist vacio

		person = FXCollections.observableArrayList();
		tblpersonas.setItems(person);

		// Asigno las columnas con los atributos del modelo

		clnombre.setCellValueFactory(new PropertyValueFactory("nombre"));
		clapellido.setCellValueFactory(new PropertyValueFactory("apellido"));
		cledad.setCellValueFactory(new PropertyValueFactory("edad"));
	}

	// metodos para ejecutar
	@FXML
	void agregar(ActionEvent event) {

		Personas listaPersonas = new Personas();
		listaPersonas.setNombre(txtnombre.getText());
		listaPersonas.setApellido(txtapellido.getText());
		listaPersonas.setEdad((Integer.parseInt(txtedad.getText())));
		person.add(listaPersonas);

	}

	@FXML
	void Seleccionar(ActionEvent event) {

		// obtener la persona al seleccionar el campo
		Personas selectPersona = tblpersonas.getSelectionModel().getSelectedItem();

		if (selectPersona != null) {
			txtnombre.setText(selectPersona.getNombre());
			txtapellido.setText(selectPersona.getApellido());
			txtedad.setText(selectPersona.getEdad() + "");

		}
	}

	@FXML
	void modificar(ActionEvent event) {

		Personas modiPersonas = new Personas();
		modiPersonas.setNombre(txtnombre.getText());
		modiPersonas.setApellido(txtapellido.getText());
		modiPersonas.setEdad((Integer.parseInt(txtedad.getText())));
		person.set(posicionPersonaEnTabla, modiPersonas);

	}

	@FXML
	void eliminar(ActionEvent event) {

		person.remove(posicionPersonaEnTabla);

	}

}
