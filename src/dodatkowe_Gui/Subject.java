package dodatkowe_Gui;

import java.util.Arrays;

public class Subject {
    private String name;
    private Person teacher;
    private Student[] students;
    private int counter = 0;
    private int size = 2;

    public Subject(String name){
        this.name = name;
        this.students = new Student[size];
    }

    public void setTeacher(Person person){
        this.teacher = person;
    }

    public void addStudent(Student student) throws TooManyStudentsException{
        if(counter >= size)
            throw new TooManyStudentsException("Too many students for this subject");
        else
            students[counter++] = student;

    }

    @Override
    public String toString() {
        StringBuilder studentsData = new StringBuilder();

        for (int i = 0; i < students.length; i++)
            studentsData.insert(0," " + students[i].getName());
        return name + ", teacher: " + teacher.getName() + ", students:" + studentsData;
    }
}
