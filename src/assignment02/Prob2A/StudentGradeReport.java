package Prob2A;

public class StudentGradeReport {
    public static Student createStudent(String name){
        if(name == null)
            throw new IllegalArgumentException("Name cannot be null");
        Student student = new Student(name);
        GradeReport gradeReport = new GradeReport(student);
        student.setGradeReport(gradeReport);
        return student;
    }
}
