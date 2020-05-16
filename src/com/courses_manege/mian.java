package com.courses_manege;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class mian {
    public static void main(String[] args) throws IOException {

        File tfile=new File("teacher.txt");
        File sfile=new File("student.txt");
        File cfile=new File("course.txt");
        File scfile=new File("schedule.txt");
        File efile=new File("elective_course.txt");

        Scanner input=new Scanner(System.in);
        System.out.println("请输入5条记录的教师、学生、课程、排课、选课等信息");

        System.out.println("请输入教师信息（姓名，性别，年龄，id，课题.共5条）：");
        ArrayList<Teacher> teacherArrayList=new ArrayList<>();
        Teacher teacher1=new Teacher("temp","temp",1,"temp","temp");
        for (int i = 0; i < 5; i++) {
            String name=input.next();
            String sex=input.next();
            int age=input.nextInt();
            String tid=input.next();
            String title=input.next();
            Teacher teacher=new Teacher(name,sex,age,tid,title);;
            teacherArrayList.add(teacher);
        }
        teacher1.writefile(teacherArrayList,tfile);


        System.out.println("请输入学生信息（姓名，性别，年龄，id，专业.共5条）：");
        ArrayList<Student> studentArrayList=new ArrayList<>();
        Student student1=new Student("temp","temp",1,"temp","temp");
        for (int i = 0; i < 5; i++) {
            String name=input.next();
            String sex=input.next();
            int age=input.nextInt();
            String tid=input.next();
            String title=input.next();
            Student student=new Student(name,sex,age,tid,title);;
            studentArrayList.add(student);
        }
        student1.writefile(studentArrayList,sfile);


        System.out.println("请输入课程信息（课程名称，课程id，课程小时.共5条）：");
        ArrayList<Course> courseArrayList=new ArrayList<>();
        Course course1=new Course("temp","1",1);
        for (int i = 0; i < 5; i++) {
            String cname=input.next();
            String cid=input.next();
            int chour=input.nextInt();
            Course course=new Course(cname,cid,chour);
            courseArrayList.add(course);
        }
        course1.writefile(courseArrayList,cfile);


        System.out.println("请输入排课信息（课程班号，课程编号cid，老师id，教室.共5条）：");
        ArrayList<Schedule> scheduleArrayList=new ArrayList<>();
        Schedule schedule1=new Schedule("temp","temp","temp","temp");
        for (int i = 0; i < 5; i++) {
            String classid=input.next();
            String cid=input.next();
            String tid=input.next();
            String classroom=input.next();
            Schedule schedule=new Schedule(classid,cid,tid,classroom);
            scheduleArrayList.add(schedule);
        }
        schedule1.writefile4(scheduleArrayList,scfile);


        System.out.println("请输入选课信息（选课id，学号，课程班号.共5条）：");
        ArrayList<Electivecourse> electivecourseArrayList=new ArrayList<>();
        Electivecourse electivecourse1=new Electivecourse("temp","temp","temp");
        for (int i = 0; i < 5; i++) {
            String elid=input.next();
            String sid=input.next();
            String classid=input.next();
            Electivecourse electivecourse=new Electivecourse(elid,sid,classid);
            electivecourseArrayList.add(electivecourse);
        }
        electivecourse1.writefile(electivecourseArrayList,efile);


        System.out.println("初始化完成！");
        while (true){
            System.out.println("1、查询学生课表，2、退出系统");
            int chose=input.nextInt();
            switch (chose){
                case 1:{
                    String courseName=new String();
                    String teacherName=new String();
                    System.out.println("请输入学生学号：");
                    String sid=input.next();
                    for (int i = 0; i < electivecourseArrayList.size(); i++) {
                        if(sid.equals(electivecourseArrayList.get(i).getSid())){
                            for (int j = 0; j < scheduleArrayList.size(); j++) {
                                if(electivecourseArrayList.get(i).getClassid().equals(scheduleArrayList.get(j).getClassid())){
                                    for (int k = 0; k < courseArrayList.size(); k++) {
                                        if(courseArrayList.get(k).getCid().equals(scheduleArrayList.get(j).getCid())){
                                            courseName=courseArrayList.get(k).getCname();
                                        }
                                    }
                                    for (int k = 0; k < teacherArrayList.size(); k++) {
                                        if(teacherArrayList.get(k).getTid().equals(scheduleArrayList.get(j).getTid())){
                                            teacherName=teacherArrayList.get(k).getName();
                                        }
                                    }
                                    System.out.println("该学生所选的课程名称，上课教师，上课地点是：");
                                    System.out.println(courseName+" "+teacherName+" "+scheduleArrayList.get(i).getClassroom());
                                }
                            }
                        }
                    }
                };break;
                case 2:return;
            }
        }

    }

}
