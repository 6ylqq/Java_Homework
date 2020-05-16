package com.courses_manege;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MyfieTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        File file1=new File("test_person.txt");
        Myfile myfile1=new Myfile(file1);
        Person person=new Person("Tom","man",15);
        Person person1=new Person("Jack","man",17);
        ArrayList<Person> personArrayList=new ArrayList<>();
        personArrayList.add(person);
        personArrayList.add(person1);
        myfile1.writefile3(personArrayList);



        File file2=new File("test_electivecourse.txt");
        Myfile myfile2=new Myfile(file2);
        Electivecourse electivecourse=new Electivecourse("2018091201","11","1");
        Electivecourse electivecourse1=new Electivecourse("2018091202","12","2");
        ArrayList<Electivecourse> electivecourseArrayList=new ArrayList<>();
        electivecourseArrayList.add(electivecourse);
        electivecourseArrayList.add(electivecourse1);
        myfile2.writefile2(electivecourseArrayList);//写入对象


        File file3=new File("test_course.txt");
        Myfile myfile3=new Myfile(file3);
        Course course=new Course("SoftEngine","1",3);
        Course course1=new Course("Java","2",4);
        ArrayList<Course> courseArrayList=new ArrayList<>();
        courseArrayList.add(course);
        courseArrayList.add(course1);
        myfile3.writefile1(courseArrayList);


        File file4=new File("test_schedule.txt");
        Myfile myfile4=new Myfile(file4);
        Schedule schedule=new Schedule("11","1","11","Second_408");
        Schedule schedule1=new Schedule("12","2","12","Second_205");
        ArrayList<Schedule> scheduleArrayList=new ArrayList<>();
        scheduleArrayList.add(schedule);
        scheduleArrayList.add(schedule1);
        myfile4.writefile4(scheduleArrayList);


        File file5=new File("test_student.txt");
        Myfile myfile5=new Myfile(file5);
        Student student=new Student("Tom","man",20,"1","SoftEngine");
        Student student1=new Student("Sam","man",30,"2","Java");
        ArrayList<Student> studentArrayList=new ArrayList<>();
        studentArrayList.add(student);
        scheduleArrayList.add(schedule1);
        myfile5.writefile5(studentArrayList);


        File file6=new File("test_teacher.txt");
        Myfile myfile6=new Myfile(file6);
        Teacher teacher=new Teacher("Sam","man",40,"11","Doctor");
        Teacher teacher1=new Teacher("Tom","man",40,"12","Doctor");
        ArrayList<Teacher> teacherArrayList=new ArrayList<>();
        teacherArrayList.add(teacher);
        teacherArrayList.add(teacher1);
        myfile6.writefile6(teacherArrayList);

        System.out.println("全部信息以及存入，可以从调试器看出内容");
    }
}
