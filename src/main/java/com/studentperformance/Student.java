package com.studentperformance;

public class Student {
    private int id;
    private String name;
    private double catMarks;
    private double assignmentMarks;
    private double fatMarks;
    private double totalMarks;
    private double gpa;
    private String grade;

    // Constructor
    public Student(int id, String name, double catMarks, double assignmentMarks, double fatMarks, double totalMarks, double gpa, String grade) {
        this.id = id;
        this.name = name;
        this.catMarks = catMarks;
        this.assignmentMarks = assignmentMarks;
        this.fatMarks = fatMarks;
        this.totalMarks = totalMarks;
        this.gpa = gpa;
        this.grade = grade;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getCatMarks() { return catMarks; }
    public void setCatMarks(double catMarks) { this.catMarks = catMarks; }

    public double getAssignmentMarks() { return assignmentMarks; }
    public void setAssignmentMarks(double assignmentMarks) { this.assignmentMarks = assignmentMarks; }

    public double getFatMarks() { return fatMarks; }
    public void setFatMarks(double fatMarks) { this.fatMarks = fatMarks; }

    public double getTotalMarks() { return totalMarks; }
    public void setTotalMarks(double totalMarks) { this.totalMarks = totalMarks; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}