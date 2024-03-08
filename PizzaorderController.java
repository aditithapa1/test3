package com.example.test3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
public class PizzaorderController implements Initializable  {

    @FXML
    public TableColumn<PizzaorderController, DecimalFormat> totalbillcolumn;
    @FXML
    public TableColumn<PizzaorderController, Integer> phonecolumn;
    @FXML
    public TableColumn<PizzaorderController, Integer> numberoftoppingscolumn;
    @FXML
    public TableColumn<PizzaorderController, String> pizzasizecolumn;
    @FXML
    public TableColumn<PizzaorderController, String> namecolumn;
    @FXML
    public TableView<PizzaorderController> tablefororder;
    private ObservableList<PizzaorderController> orderlist = FXCollections.observableArrayList();
   
    public Button addbutton;
    public Button updatebutton;
    public Button viewbutton;
    public Button deletebutton;

    public TextField nameinput;
    public TextField numberinput;

    public void adddata(ActionEvent actionEvent) {
    }

    public void updatedata(ActionEvent actionEvent) {
    }

    public void viewdata(ActionEvent actionEvent) {
    }

    public void deletedata(ActionEvent actionEvent) {
    }
    public void populateTable() {
        orderlist.clear();
        String jdbcUrl = "jdbc:mysql://localhost:3306/pizzaorders";
        String dbUser = "root";
        String dbPassword = "";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword)) {
            String query = "SELECT * FROM `customerorders`";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String pizzasize = resultSet.getString("pizzasize");
               Integer numberoftoppings = resultSet.getInt("numberoftoppings");
                Integer phone = resultSet.getInt("phone");
                String totalbill = resultSet.getString("totalbill");
                orderlist.add(new PizzaorderController(name,pizzasize,numberoftoppings,phone,totalbill));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
