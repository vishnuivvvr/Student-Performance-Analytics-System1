package com.studentperformance;

import java.util.List;
import java.util.ArrayList;

public class PerformanceCalculator {

    // Method to calculate total marks from an array of marks
    public int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate GPA based on total marks
    public double calculateGPA(int totalMarks, int totalSubjects) {
        return (double) totalMarks / totalSubjects;
    }

    // Method to assign letter grade based on GPA
    public String assignGrade(double gpa) {
        if (gpa >= 90) return "A";
        else if (gpa >= 80) return "B";
        else if (gpa >= 70) return "C";
        else if (gpa >= 60) return "D";
        else return "F";
    }

    // Method to get toppers based on marks
    public List<String> getToppers(List<Student> students) {
        List<String> toppers = new ArrayList<>();
        int highestMarks = 0;
        for (Student student : students) {
            if (student.getTotalMarks() > highestMarks) {
                highestMarks = student.getTotalMarks();
                toppers.clear();
                toppers.add(student.getName());
            } else if (student.getTotalMarks() == highestMarks) {
                toppers.add(student.getName());
            }
        }
        return toppers;
    }

    // Method to calculate CGPA
    public double calculateCGPA(List<Double> gpas) {
        double totalGpa = 0.0;
        for (double gpa : gpas) {
            totalGpa += gpa;
        }
        return totalGpa / gpas.size();
    }

    // Method to generate a performance report
    public String generateReport(Student student) {
        StringBuilder report = new StringBuilder();
        report.append("Performance Report for ").append(student.getName()).append("\n");
        report.append("Total Marks: ").append(student.getTotalMarks()).append("\n");
        report.append("GPA: ").append(calculateGPA(student.getTotalMarks(), student.getSubjectsCount())).append("\n");
        report.append("Grade: ").append(assignGrade(calculateGPA(student.getTotalMarks(), student.getSubjectsCount()))).append("\n");
        return report.toString();
    }
}