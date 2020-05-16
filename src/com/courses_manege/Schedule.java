package com.courses_manege;

import java.io.*;
import java.util.ArrayList;

public class Schedule implements Serializable {
    private String classid;
    private String cid;
    private String tid;
    private String classroom;

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Schedule(String classid, String cid, String tid, String classroom) {
        this.classid = classid;
        this.cid = cid;
        this.tid = tid;
        this.classroom = classroom;
    }

    public void display(){
        System.out.println(this.cid+" "+this.classid+" "+this.tid+" "+this.classroom);
    }

    public ArrayList<Schedule> readfile(File opfile) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(opfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Schedule> courses=(ArrayList<Schedule>)ois.readObject();
        ois.close();
        fis.close();
        return courses;
    }

    public void writefile4(ArrayList<Schedule> courses,File opfile) throws IOException {
        FileOutputStream fos=new FileOutputStream(opfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }
}
