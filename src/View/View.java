/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Gule Narjis
 */
import java.util.List;

public class View {
    public void printStudentGroup(String title, List<String> summaries) {
        System.out.println("=== " + title + " ===");
        for (String summary : summaries) {
            System.out.println(summary);
        }
        System.out.println();
    }
}
