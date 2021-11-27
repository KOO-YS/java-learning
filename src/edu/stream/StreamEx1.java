package edu.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("Lee", 3, 300),
                new Student("Kim", 1, 200),
                new Student("Ahn", 2, 150),
                new Student("So", 1, 100),
                new Student("Na", 2, 290)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)
                            // Student 객체에서 정의한 기본 정렬
                            .thenComparing(Comparator.naturalOrder()))
                            .forEach(System.out::println);
    }
}
class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    // 총점 내림차순을 기본 정렬로 한다
    @Override
    public int compareTo(Student o) {
        return o.totalScore - this.totalScore;
    }
}