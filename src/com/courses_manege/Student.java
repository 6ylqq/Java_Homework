package com.courses_manege;

import java.io.*;
import java.util.ArrayList;

public class Student extends Person implements Serializable {
    private String sid;
    private String major;

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSid() {
        return sid;
    }

    public String getMajor() {
        return major;
    }

    public Student(String name, String sex, int age, String sid, String major) {
        super(name, sex, age);
        this.sid = sid;
        this.major = major;
    }

    @Override
    public void display() {
        System.out.println(this.sid+" "+this.name+" "+this.sex+" "+this.age+" "+this.major);
    }

    public ArrayList<Student> readfile(File opfile) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(opfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Student> courses=(ArrayList<Student>)ois.readObject();
        ois.close();
        fis.close();
        return courses;
    }

    public void writefile(ArrayList<Student> courses,File opfile) throws IOException {
        FileOutputStream fos=new FileOutputStream(opfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }
}
