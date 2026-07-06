import java.util.*;

public class PriorityQ {

    // Student class implements Comparable
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        // Method Overriding
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {

        // Min Heap based on rank
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Rahul", 5));
        pq.add(new Student("Aman", 2));
        pq.add(new Student("Priya", 8));
        pq.add(new Student("Neha", 1));

        while (!pq.isEmpty()) {
            Student s = pq.peek();
            System.out.println(s.name + " -> Rank : " + s.rank);
            pq.remove();
        }
    }
}