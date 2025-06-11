/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Gule Narjis
 */
import Model.Student;
import java.util.ArrayList;
import java.util.List;

public class SummaryModel {
    private static final double GPA_THRESHOLD = 75.0;

    public List<String> getAboveThresholdSummaries(List<Student> students) {
        List<String> aboveList = new ArrayList<>();

        for (Student student : students) {
            if (student.getGrade() >= GPA_THRESHOLD) {
                aboveList.add(summarize(student));
            }
        }

        return aboveList;
    }

    public List<String> getBelowThresholdSummaries(List<Student> students) {
        List<String> belowList = new ArrayList<>();

        for (Student student : students) {
            if (student.getGrade() < GPA_THRESHOLD) {
                belowList.add(summarize(student));
            }
        }

        return belowList;
    }

    private String summarize(Student student) {
        return "Name: " + student.getFirstName() + " " + student.getLastName()
                + ", Age: " + student.getAge()
                + ", Grade: " + student.getGrade();
    }

    //List<String> getAboveThresholdSummaries(List<Student> students) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
}
