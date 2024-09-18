import java.util.ArrayList;
 
public class StudentReader {
    ArrayList<String> studentNames = new ArrayList<>();
 
    // Method to add student names
    public void addStudentNames() {
        studentNames.add("Amal");
        studentNames.add("Jood");
        studentNames.add("Noora");
        studentNames.add("Sara");
        studentNames.add("Danah");
        studentNames.add("Hayat");
 
        System.out.println("Student list:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
 
 