import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class controlerTest {
    @FXML
    private Button testbt1;
    @FXML
    private  Button testbt2;
    @FXML
    private  Label l1;
    @FXML
    private  Label l2;
    @FXML
    private  Label l3;
    @FXML Label lp1;
    public void Next() throws Exception{
        Stage window = (Stage) testbt1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
        window.setScene(new Scene(root));
    }
    int contor=0;

    public void info() {
        if (contor == 0) {
            l1.setText("Bine ati venit pe aplicatia Comandare Mobila!");
            l2.setText("Prin intermediul acestei aplicatie clientii, pot  sa isi comande mobila dorita");
            l3.setText("Iar managerii firmelor pot sa isi prezinte produsele");
            lp1.setText(" clientiilor prin aceasta aplicatie.");
            l1.setVisible(true);
            l2.setVisible(true);
            l3.setVisible(true);
            lp1.setVisible(true);
            testbt2.setText("Ascunde");
            contor=1;
        }else{
            l1.setVisible(false);
            l2.setVisible(false);
            l3.setVisible(false);
            lp1.setVisible(false);
            testbt2.setText("Info");
            contor=0;
        }

    }


}
