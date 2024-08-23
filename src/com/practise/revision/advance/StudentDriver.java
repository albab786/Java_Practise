package com.practise.revision.advance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDriver {
    private static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Enter 1 to add details, 2 to view details by id:, 3 to view all details,4 to delete by id, 5 to finished the program");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter id:");
                    int id = sc.nextInt();
                    sc.nextLine();  // Consume newline

                    System.out.println("Enter name:");
                    String name = sc.nextLine();

                    System.out.println("Enter email:");
                    String email = sc.nextLine();

                    System.out.println("Enter dob (yyyy-MM-dd):");
                    String dob = sc.nextLine();
                    Student student = new Student(id, name, email, LocalDate.parse(dob));
                    studentList.add(student);
                    System.out.println("Details added successfully");
                    break;

                case 2:
                    System.out.println("Enter the id:");
                    int userId = sc.nextInt();

                    // Search for the student by id
                    for (Student stu : studentList) {
                        if (stu.getId() == userId) {
                            System.out.println(stu);
                            break;
                        }
                    }
                    System.out.println("invalid id pls enter valid id");
                    break;
                case 3:
                    System.out.println("now you will get all the deatils of your Student data");
                    for (Student stu : studentList) {
                        System.out.println(stu);
                    }
                    break;
                case 4:
                    System.out.println("now you can delete the data of given user");
                    System.out.println("Enter the id:");
                    int givenId = sc.nextInt();

                    // Delete for the student by id
                    for (Student stu : studentList) {
                        if (stu.getId() == givenId) {
                            studentList.remove(stu);

                            break;
                        }
                    }
                    System.out.println("invalid id pls enter valid id");
                    break;

                case 5:
                    System.out.println("program finished");
                    sc.close();
                    return; // Exit the program


                default:
                    System.out.println("Invalid input. Please try again.");
            }


        }
    }
}