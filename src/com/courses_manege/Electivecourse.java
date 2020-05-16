package com.courses_manege;

import java.io.*;
import java.util.ArrayList;

public class Electivecourse implements Serializable {
    private String elid;
    private String sid;
    private String classid;

    public String getElid() {
        return elid;
    }

    public void setElid(String elid) {
        this.elid = elid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public Electivecourse(String elid, String sid, String classid) {
        this.elid = elid;
        this.sid = sid;
        this.classid = classid;
    }

    public void display(){
        System.out.println(this.elid+" "+this.sid+" "+this.classid);
    }

    public ArrayList<Electivecourse> readfile(File opfile) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(opfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Electivecourse> courses=(ArrayList<Electivecourse>)ois.readObject();
        ois.close();
        fis.close();
        return courses;
    }

    public void writefile(ArrayList<Electivecourse> courses,File opfile) throws IOException {
        FileOutputStream fos=new FileOutputStream(opfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }
}
