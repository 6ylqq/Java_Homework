package com.courses_manege;

import java.io.*;
import java.util.ArrayList;

public class Teacher extends Person implements Serializable {
    private String tid;
    private String title;

    public String getTid() {
        return tid;
    }

    public String getTitle() {
        return title;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher(String name, String sex, int age, String tid, String title) {
        super(name, sex, age);
        this.tid = tid;
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println(this.tid+" "+this.name+" "+this.sex+" "+this.age+" "+this.title);
    }

    public ArrayList<Teacher> readfile(File opfile) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(opfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Teacher> courses=(ArrayList<Teacher>)ois.readObject();
        ois.close();
        fis.close();
        return courses;
    }

    public void writefile(ArrayList<Teacher> courses,File opfile) throws IOException {
        FileOutputStream fos=new FileOutputStream(opfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }
}
