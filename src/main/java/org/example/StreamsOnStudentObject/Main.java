package org.example.StreamsOnStudentObject;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
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


        //1- Find list of students whose first name starts with alphabet A
        List<Student> a = studentList.stream().filter(student -> student.getFirstName().startsWith("A")).collect(Collectors.toList());
        a.forEach(student -> System.out.println(student));

        System.out.println("after line 28");
        //2- Group The Student By Department Names
        studentList.stream().collect(Collectors.groupingBy(student -> student.getDepartmantName())).forEach((k,v)-> System.out.println(k+" "+v));


        System.out.println("after line 33");
        //3- Find the total count of student using stream
        System.out.println(studentList.stream().count());

        System.out.println("after line 37");
        //4- Find the max age of student
        Integer integer = studentList.stream().map(student -> student.getAge()).sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(integer);

        System.out.println("after line 43");
        //5- Find all departments names
        studentList.stream().map(student -> student.getDepartmantName()).collect(Collectors.toList()).forEach(s -> System.out.println(s));

        System.out.println("after line 47");
        //6- Find the count of student in each department
        studentList.stream().collect(Collectors.groupingBy( student ->  student.getDepartmantName(), Collectors.counting())).forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("after line 51");
        //7- Find the list of students whose age is less than 30
        studentList.stream().filter(student -> student.getAge() < 30).collect(Collectors.toList()).forEach(student -> System.out.println(student));

        System.out.println("after line 55");
        //8- Find the list of students whose rank is in between 50 and 100
        studentList.stream().filter(student ->  student.getRank() > 50 & student.getRank() < 100).collect(Collectors.toList()).forEach( student -> System.out.println(student));


        System.out.println("after line 60");
        //9- Find the average age of male and female students
        Map<String, Double> mapAvgAge = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println("Average age of male and female students : "+mapAvgAge);


        System.out.println("after line 69");
        //10- Find the department who is having maximum number of students
        Optional<Map.Entry<String, Long>> max = studentList.stream()
                .collect(Collectors.groupingBy(student -> student.getDepartmantName(), Collectors.counting()))
                .entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1);
        System.out.println(max);

        System.out.println("after line 73");
        //11- Find the Students who stays in Delhi and sort them by their names
        studentList.stream().filter(student -> student.getCity() == "Delhi")
                .sorted(Comparator.comparing(student -> student.getFirstName()))
                .collect(Collectors.toList()).forEach(student -> System.out.println(student));


        System.out.println("after line 80");
        //12- Find the average rank in all departments
        studentList.stream().collect(Collectors.groupingBy(student -> student.getDepartmantName(), Collectors.averagingInt(student -> student.getRank()))).forEach((k,v) -> System.out.println(k+" "+v));


        System.out.println("after line 85");
        //13- Find the highest rank in each department
        studentList.stream().collect(Collectors.groupingBy(student -> student.getDepartmantName(), Collectors.maxBy(Comparator.comparing(student -> student.getRank())))).forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("after line 89");
        //14- Find the list of students and sort them by their rank
        studentList.stream().sorted(Comparator.comparing(student -> student.getRank())).forEach(student -> System.out.println(student));

        System.out.println("after line 93");
        //15- Find the student who has second rank
        Student student1 = studentList.stream().sorted(Comparator.comparing(student -> student.getRank())).skip(1).findFirst().get();
        System.out.println(student1);

        System.out.println("after line 98");

    }



}
