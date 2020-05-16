package com.courses_manege;

import java.io.*;
import java.util.ArrayList;

public class Course implements Serializable {
    private String cname;
    private String cid;
    private int chour;


    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getChour() {
        return chour;
    }

    public void setChour(int chour) {
        this.chour = chour;
    }

    public Course(String cname, String cid, int chour) {
        this.cname = cname;
        this.cid = cid;
        this.chour = chour;
    }

    public void display(){
        System.out.printf(this.cid+" "+this.cname+" "+this.chour);
    }

    public ArrayList<Course> readfile(File opfile) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(opfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Course> courses=(ArrayList<Course>)ois.readObject();
        ois.close();
        fis.close();
        return courses;
    }

    public void writefile(ArrayList<Course> courses,File opfile) throws IOException {
        FileOutputStream fos=new FileOutputStream(opfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }
}
