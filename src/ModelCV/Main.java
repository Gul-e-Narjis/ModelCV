/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelCV;

/**
 *
 * @author Gule Narjis
 */
import Controller.Controller;
import View.View;
import Model.SummaryModel;
import Model.Student;
import Model.Model;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create sample student list
        List<Student> students = Arrays.asList(
            new Student("Ali", "Junaid", 20, 88.5),
            new Student("Bushra", "Ansari", 22, 65.0),
            new Student("Chishmish", "laiba", 19, 77.2),
            new Student("Daneen", "Fatima", 21, 59.5)
        );

        // Setup MVC components
        Model model = new Model();
        View view = new View();
        SummaryModel summaryModel = new SummaryModel();
        Controller controller = new Controller(model, view, summaryModel);

        // Set data and display results
        controller.setStudents(students);
        controller.updateView();
    }
}


