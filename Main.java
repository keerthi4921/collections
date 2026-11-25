package Collections;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Saradha");
        students.put(102, "Ravi");
        students.put(103, "Anu");

        System.out.println(students);
    }
}