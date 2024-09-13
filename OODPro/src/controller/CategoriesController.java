package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
//import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class CategoriesController extends ProductBController {

	@FXML
	private Label lblUserName;

	// CatalogController object is used to traverse across the Screens and Welcome the User post successful Login
	@Override
	public void initialize() {
		lblUserName.setText("Hi " + userName + ", We are Open!!");
	}

	

	@FXML
	public void goToVegetables(ActionEvent event) {

		ConnectionsController.goToVegetablesPage(event);
	}

	@FXML
	public void goToSnacks(ActionEvent event) {

		ConnectionsController.goToSnacksPage(event);
	}

	@FXML
	public void goToDairy(ActionEvent event) {

		ConnectionsController.goToDairyPage(event);
	}
	
	
	@FXML
	void goToLogin(ActionEvent event) {
		logOff();
		ConnectionsController.goToLoginPage(event);
	}

	@FXML
	public void goToCatalogExpenses(ActionEvent event) {

		ConnectionsController.goToCatalogExpensesPage(event);
	}

	@FXML
	void goToOrderHistory(ActionEvent event) {
		ConnectionsController.goToOrderHistoryPage(event);
	}

}
