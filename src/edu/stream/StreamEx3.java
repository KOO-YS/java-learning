package edu.stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("Lee", 3, 300),
                new Student("Kim", 1, 200),
                new Student("An", 2, 100),
                new Student("Park", 1, 150),
                new Student("So", 1, 200),
                new Student("Na", 3, 290),
                new Student("Kim", 3, 180)
        };

        Stream<Student> stuStream = Stream.of(stuArr);

        stuStream.sorted(Comparator.comparing(Student::getBan)
                                    .thenComparing(Comparator.naturalOrder()))
                                    .forEach(System.out::println);

        // 스트림 재생성
        stuStream = Stream.of(stuArr);
        IntStream stuScoreStream = stuStream.mapToInt(Student::getTotalScore);

        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
        System.out.println("count = "+stat.getCount());
        System.out.println("sum = "+stat.getSum());
        System.out.printf("average = %.2f%n", stat.getAverage());
        System.out.println("min = "+stat.getMin());
        System.out.println("max = "+stat.getMax());
    }
}
//class Student implements Comparable<Student> {
//    String name;
//    int ban;
//    int totalScore;
//
//    public Student(String name, int ban, int totalScore) {
//        this.name = name;
//        this.ban = ban;
//        this.totalScore = totalScore;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getBan() {
//        return ban;
//    }
//
//    public int getTotalScore() {
//        return totalScore;
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return o.totalScore - this.totalScore;
//    }
//}