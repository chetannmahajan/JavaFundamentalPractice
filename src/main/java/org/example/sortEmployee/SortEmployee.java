package org.example.sortEmployee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEmployee {
    public static void main(String[] args) {


        //add employees to list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Rahul Khod", 25, 80000.09, "Yes", "HR", 2015));
        employeeList.add(new Employee(2,"Chetan mahajan", 23, 50000.00, "Yes", "Security and Transport", 2393));
        employeeList.add(new Employee(3,"Nikhil Patil", 23,90000.12, "No","Infrastructure", 1232));
        employeeList.add(new Employee(4,"Hari", 23,100000.01, "Yes", "Product Development", 3242));
        employeeList.add(new Employee(5,"Gitesh Patil", 23,120000.01,"No", "Product Development", 3643));

        //Print the original list
        employeeList.forEach(i -> System.out.println(i));

        Comparator<Employee> objectComparator = new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };


        //sort the list by name
        Map<Integer, List<Employee>> collect = employeeList.stream()
                .sorted(objectComparator)
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        System.out.println("after sorting by name and grouping by age");
        collect.forEach((e,k) -> System.out.println(e+"|"+k));


        System.out.println("Coverting Arraylist to hashmap");
        //converting a ArrayList to Map
        //key= Name, value = Age
        Map<String, Integer> employeeHashMap = employeeList.stream().collect(Collectors.toMap(employee -> employee.getName(), employee -> employee.getAge()));
        System.out.println(employeeHashMap);
        employeeHashMap.entrySet().forEach(e -> System.out.println(e.getKey()+ "|" + e.getValue()));
        String name = "Chetan mahajan";
        employeeHashMap.forEach((k,v) -> {
            if(k.equals(name)){
                System.out.println(k+" "+ v);
            }
        });


        //Sort using comparator in java 8 streams
        Map<Integer, List<Employee>> employeeListSortedUsingComparator = employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.groupingBy(Employee::getAge));
        employeeListSortedUsingComparator.entrySet().forEach((employee) -> System.out.println(employee.getKey() + " " + employee.getValue()));


        //get employees on whose age are greater than 23

        List<Employee> employeeListGreaterThan23 = employeeList.stream().filter(employee -> employee.getAge() > 23).collect(Collectors.toList());
        employeeListGreaterThan23.forEach(employee -> System.out.println(employee));

        //swap two number without using temp variable
        int a=6;
        int b=5;
        a = a+b; //a=11
        b = a-b; //b=6
        a = a-b; //a=5

        //using streams find the vowles count in the string


        String input = "hello hello";
        System.out.println("online 76");
        long count = input.chars().filter(x -> x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u').count();
        System.out.println(count);

        //find the duplicate in the string
        input = "hello hello";
        input.chars().mapToObj(x ->{
                    return (char)x;
                }).collect(Collectors.groupingBy(str -> str.toString(), Collectors.counting()))
                .forEach((k,v) -> System.out.println(k+" "+v));
        //input.chars().forEach(System.out::println);


        //find the number of times the number and character got repeated

        List<Integer> numList = Arrays.asList(5,3,4,1,3,7,2,9,9,4);
        Map<Integer, Long> numListMap = numList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        numListMap.entrySet().forEach(num -> System.out.println(num.getKey()+" "+num.getValue()));

        //find the number of times the String got repeated
        List<String> stringList = Arrays.asList("Amanda", "Rob", "sunny", "Amanda", "Rob");
        stringList.stream().collect(Collectors.groupingBy(str -> str, Collectors.counting())).forEach((k,v) -> System.out.println(k+" "+v));


        //Program to print min and max employee salary from the given list
        Optional<Employee> maxSalaryEmployee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(employee -> employee.getSalary())));
        System.out.println(maxSalaryEmployee);

        //Program to print min employee salary from the given list
        Optional<Employee> minSalaryEmployee = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(employee -> employee.getSalary())));
        System.out.println(minSalaryEmployee);

        System.out.println("after line 107");
        //max salary from each department
        Map<String, Optional<Employee>> maxSalaryEmployeeByDepartment = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.maxBy(Comparator.comparing(employee -> employee.getSalary()))));
        maxSalaryEmployeeByDepartment.entrySet().forEach(map -> System.out.println(map.getKey()+" "+map.getValue()));

        System.out.println("after line 112");
        //min salary form each department
        Map<String, Optional<Employee>> mixSalaryEmployeeByDepartment = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.minBy(Comparator.comparing(employee -> employee.getSalary()))));
        mixSalaryEmployeeByDepartment.forEach((k,v) -> System.out.println(k+" "+v));


        System.out.println("after line 118");
        //program to find active employees in the given list
        employeeList.stream().filter(employee -> employee.getActive() == "Yes").forEach(employee -> System.out.println(employee));


        System.out.println("after line 123");
        //program to find inactive employees in the given list
        employeeList.stream().filter(employee -> employee.getActive() == "No").forEach(employee -> System.out.println(employee));


        System.out.println("after line 128");
        //program to find number of active and inactive employee in list
        Map<String, Long> mapOfActiveAndInactive = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getActive(), Collectors.counting()));
        mapOfActiveAndInactive.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("after line 133");
        //program to find employees by each department
        Map<String, List<Employee>> mapOfEmployeeByDepartment = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment()));
        mapOfEmployeeByDepartment.forEach((k,v) -> System.out.println(k+" "+v));

        System.out.println("after line 138");
        //program to print count working in each department
        Map<String, Long> mapOfEmployeeNoByDepartment = employeeList.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.counting()));
        mapOfEmployeeNoByDepartment.forEach((k,v) -> System.out.println(k+ " "+ v));


        System.out.println("after line 144");
        //find the second heigest element using java 8
        Integer array[] = {12,16,45,11,18,22,19,20,45};

        List<Integer> integersList = Arrays.asList(array);

        //find second lowest number
        Integer secondLowest = integersList.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(secondLowest);


        System.out.println("after line 155");
        //find second highest number
        Integer secondHighestNumber = integersList.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secondHighestNumber);


        System.out.println("after line 161");
        //random question
        int arr1[] = { 8, 9, 5, 11, 6, 1, 7, 6 };
        // output = 11,11,11,-1,7,7,-1,-1

        int max=0;

        for(int i=arr1.length-1; i >= 0; i--){
            if(arr1[i] > max){
                max = arr1[i];
                arr1[i] = -1;
            }
            else{
                arr1[i] = max;
            }
        }

        // check
        System.out.println(Arrays.toString(arr1));

    }
}
