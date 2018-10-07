package refactoring.solution5;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ListView<Movie> centreListView;
    @FXML
    private ListView<String> rightListView;
    @FXML
    private Label label;


    //Movies
    private Regular regular = new Regular();
    private New New = new New();
    private Classic classic = new Classic();
    private Movie m1 = new Movie("Gone with the wind", regular);
    private Movie m2 = new Movie("Venom", New);
    private Movie m3 = new Movie("Finding Nemo", classic);
    private Movie m4 = new Movie("Night School", New);

    private int daysRented;

    private RentalBasket rb = new RentalBasket();

    public Controller(){
        this.centreListView = new ListView<>();
        this.rightListView = new ListView<>();
        this.label = new Label();
        this.daysRented = 0;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<Movie> list = FXCollections.observableArrayList(m1, m2, m3, m4);
        centreListView.setItems(list);

        centreListView.setOnMouseClicked(e->{
            if (e.getClickCount() == 2){
                Movie temp = centreListView.getSelectionModel().getSelectedItem();
                RentalItem r = new RentalItem(temp, 1);
                rightListView.getItems().add(temp.getTitle());
                rb.addRentalItem(r);
                label.setText("Total Cost: " + "$" + rb.getTotalCharge());
            }
        });
    }

}
