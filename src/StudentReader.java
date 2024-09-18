import java.util.ArrayList;
 
public class StudentReader {
    ArrayList<String> studentNames = new ArrayList<>();
 
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
 
    public void createRandomGroups() {
        for (int i = 0; i < studentNames.size(); i += 2) {
            if (i + 1 < studentNames.size()) {
                // Print a pair
                System.out.println("Group: " + studentNames.get(i) + ", " + studentNames.get(i + 1));
            } else {
                // If odd number of students, the last group will have 3 students
                System.out.println("Group: " + studentNames.get(i - 1) + ", " + studentNames.get(i));
            }
        }
    }
 
    public static void main(String[] args) {
        StudentReader reader = new StudentReader();
        reader.addStudentNames();
        System.out.println("\nRandom Groups:");
        reader.createRandomGroups();  
    }
}
 
 