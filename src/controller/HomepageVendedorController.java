package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HomepageVendedorController {

    @FXML
    private Button buttonTechSupport;

    @FXML
    private ImageView imageEditProduct;
	
    @FXML
    private Label cajaClienttes;

	public Label getCajaClienttes() {
		return cajaClienttes;
	}

	public void setCajaClienttes(Label cajaClienttes) {
		this.cajaClienttes = cajaClienttes;
	}
    
	   @FXML
	   void mostrarTechSupportPageVendedor(ActionEvent event) {
	    	
	        try {
	            FXMLLoader loader4 = new FXMLLoader(getClass().getResource("/fxml/TechSupportVendedor.fxml"));

	            Parent root4 = loader4.load();
	            Stage stage = new Stage();

	            stage.setScene(new Scene(root4));
	            stage.initModality(Modality.WINDOW_MODAL);
	            stage.initOwner(((Node) (event.getSource())).getScene().getWindow());
	            stage.show();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
    
    
}
