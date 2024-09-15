package assignment02.Prob2A;

import static java.lang.StringTemplate.STR;

public class Student {
    private String name;
    private GradeReport gradeReport;

    Student(String name) {
        this.name = name;
    }
    public void setGradeReport(GradeReport gradeReport) {
        this.gradeReport = gradeReport;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return STR."Student: \{name}, GPA Reports: \{gradeReport}";
    }
}
