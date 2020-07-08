package Tasks.FourthList;

import java.util.*;

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.print(st.cgpa);
            }
        }
    }

    static class Student implements Comparable<Student>{
        int cgpa;


        public Student(int cgpa){
            this.cgpa = cgpa;
        }

        public int compareTo(Student s){
                return s.cgpa - cgpa;
        }

    }

    static class Priorities{

        ArrayList<Student> getStudents(List<String> events){
            PriorityQueue<Student> pq = new PriorityQueue<>();

            for(String i : events){
                    pq.add(new Student(Integer.valueOf(i)));
            }
            System.out.println(pq);
            return new ArrayList<>(pq);
        }
    }
}
