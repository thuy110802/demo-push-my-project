
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thuy
 */
public class ArrayListExample2 {
    public static void main(String[] args) {
        //Khoi tao mot ArrayList
        ArrayList<Student> list= new ArrayList<>();
        Student st1= new Student("Trang",21);
        Student st2= new Student("Truong", 20);
        Student st3= new Student("Thuy",22);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        for(Student student: list){
            System.out.println(student.toString());
        }
    }
}
