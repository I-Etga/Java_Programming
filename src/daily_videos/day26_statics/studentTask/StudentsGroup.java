package daily_videos.day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { //     StudentGroup HAS A Student


    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();// way #1

    public StudentsGroup(String groupName, int groupId) {//cereates the StudentGroup object by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        //students = new ArrayList<>(); // size : 0 way #2
    }

    public void addStudent(Student [] students){
        this.students.addAll(Arrays.asList(students));
    }

    public void addStudent(Student student) { // takes one student object, and adds it to the arrayList of students.
        students.add(student);
    }

    public void addStudent (String name, int age, char gender ,String id){
        Student student = new Student(name,age,gender,id);
        students.add(student);
    }// takes name,age,gender,id of student info, creates student object by using the given info, then adds the student object to the arraylist

    public void removeStudent(String id){
        students.removeIf(p -> p.id.equals(id));
    }// takes the id and then removes the student object with the specified id from arraylist of student.


    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
