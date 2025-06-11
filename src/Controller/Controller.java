/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Gule Narjis
 */
import View.View;
import Model.SummaryModel;
import Model.Student;
import Model.Model;
import java.util.List;

public class Controller {
    private Model model;
    private View view;
    private SummaryModel summaryModel;

    public Controller(Model model, View view, SummaryModel summaryModel) {
        this.model = model;
        this.view = view;
        this.summaryModel = summaryModel;
    }

    public void setStudents(List<Student> students) {
        model.setStudents(students);
    }

    public void updateView() {
        List<Student> students = model.getStudents();
        List<String> above = summaryModel.getAboveThresholdSummaries(students);
        List<String> below = summaryModel.getBelowThresholdSummaries(students);

        view.printStudentGroup("Students with GPA >= 75", above);
        view.printStudentGroup("Students with GPA < 75", below);
    }
}


