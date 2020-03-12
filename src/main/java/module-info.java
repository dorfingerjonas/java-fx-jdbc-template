module at.htl.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.apache.derby.client;
    requires org.apache.derby.commons;
    requires org.apache.derby.tools;

    opens at.htl.demo.view to javafx.fxml;
    exports at.htl.demo.controller;
    exports at.htl.demo.view;
    exports at.htl.demo.model;
}