package Tasks.FourthList;

import java.util.*;

public class JavaSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(testCases > 0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }

        Collections.sort(studentList, (a, b) -> {
            if(a.getCgpa() < b.getCgpa()){
                return 1;
            } else if(a.getCgpa() == b.getCgpa()){
                return a.getFname().compareTo(b.getFname());
            }
            return -1;
        });
        for(Student st: studentList){
            System.out.println(st.getFname());
        }

    }

    static class Student{
        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
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
}
