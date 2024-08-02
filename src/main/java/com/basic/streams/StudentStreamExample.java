package com.basic.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentStreamExample {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        //list of students whose first name starts with alphabet A
        List<Student> nameStarts =  list.stream().filter(x -> x.getFirstName().startsWith("A")).collect(Collectors.toList());
        //nameStarts.forEach(x -> System.out.println(x.getFirstName()));

        //Group The Student By Department Names
        Map<String, List<Student>> groupingByDept = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName));

        //groupingByDept.forEach((x, y) -> System.out.println(x + " : " + y));

        //Find the total count of student using stream
        Long count = list.stream().count();
        //System.out.println(count);

        //Find the max age of student
        OptionalInt maxAge = list.stream().mapToInt(x -> x.getAge()).max();
        //System.out.println("Max Age " + maxAge.getAsInt());

        //Find all departments names
        Set<String> deptNames = list.stream().map(x -> x.getDepartmantName()).collect(Collectors.toSet());
        //deptNames.forEach(System.out::println);

        //Find the count of student in each department
        Map<String, Long> cntStdDept = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        //cntStdDept.forEach((x,y) -> System.out.println(x + " " + y));

        //Find the list of students whose age is less than 30
        List<Student> studentList = list.stream().filter(x -> x.getAge() < 30).collect(Collectors.toList());
        //studentList.forEach(x -> System.out.println(x.getFirstName()));

        //Find the list of students whose rank is in between 50 and 100
        List<Student> studentRankList = list.stream().filter(x -> x.getRank() > 50 && x.getRank() < 100).collect(Collectors.toList());
        //studentRankList.forEach(x -> System.out.println(x.getFirstName()));

        //Find the average age of male and female students
        Map<String, Double> avgAge = list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(x -> x.getAge())));
        //avgAge.forEach((x,y) -> System.out.println(x + " " + y));

        //Find the department who is having maximum number of students
        Map.Entry<String, Long> deptName = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();

            //System.out.println(deptName.getKey() + " " + deptName.getValue());

        //Find the Students who stays in Delhi and sort them by their names
        Stream<Student> sortStudent = list.stream().filter(x -> x.getCity().equals("Karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName));
        //sortStudent.forEach(x -> System.out.println(x.getFirstName()));

        //Find the average rank in all departments
        Map<String, Double> avgRankDept = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingDouble(Student::getRank)));
        //avgRankDept.forEach((x,y) -> System.out.println(x + " " + y));

        //Find the highest rank in each department
        Map<String, Optional<Student>> maxRank = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.maxBy(Comparator.comparing(x -> x.getRank()))));
        //maxRank.forEach((x,y) -> System.out.println(x + " " + y.get().getRank()));

        //Find the list of students and sort them by their rank
        List<Student> sortedStudents = list.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());
        //list.sort(Comparator.comparing(Student::getRank));
        //sortedStudents.forEach(x -> System.out.println(x.getFirstName() + " " + x.getRank()));

        //Find the student who has second rank
        Student secondRank = list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
        System.out.println(secondRank.getFirstName() + " " + secondRank.getRank());



    }
}
