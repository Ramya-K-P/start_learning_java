import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

// Custom Comparator to sort students
class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        // Sort by CGPA (descending order)
        if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }
        // If CGPA is the same, sort by name (ascending order)
        else if (!s1.getFname().equals(s2.getFname())) {
            return s1.getFname().compareTo(s2.getFname());
        }
        // If name is also the same, sort by ID (ascending order)
        else {
            return Integer.compare(s1.getId(), s2.getId());
        }
    }
}

public class Java_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases-- > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            studentList.add(new Student(id, fname, cgpa));
        }
        in.close();

        // Sorting using our custom comparator
        Collections.sort(studentList, new StudentComparator());

        // Printing sorted names
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
