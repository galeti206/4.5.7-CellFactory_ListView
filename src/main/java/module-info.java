module es.ieslosmontecillos.cellfactories_listview {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.cellfactories_listview to javafx.fxml;
    exports es.ieslosmontecillos.cellfactories_listview;
}