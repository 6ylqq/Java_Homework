package com.courses_manege;

import java.io.*;
import java.util.ArrayList;

public class Myfile {
    File opfile;

    public Myfile(File opfile) {
        this.opfile = opfile;
        try {
            this.opfile.createNewFile();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public File getOpfile() {
        return opfile;
    }

    public ArrayList<Course> readfile1() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(this.opfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Course> courses=(ArrayList<Course>)ois.readObject();
        ois.close();
        fis.close();
        return courses;
    }

    public void writefile1(ArrayList<Course> courses) throws IOException {
        FileOutputStream fos=new FileOutputStream(this.opfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }

    public ArrayList<Electivecourse> readfile2() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(this.opfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Electivecourse> courses=(ArrayList<Electivecourse>)ois.readObject();
        ois.close();
        fis.close();
        return courses;
    }

    public void writefile2(ArrayList<Electivecourse> courses) throws IOException {
        FileOutputStream fos=new FileOutputStream(this.opfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }

    public ArrayList<Person> readfile3() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(this.opfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Person> courses = (ArrayList<Person>) ois.readObject();
        ois.close();
        fis.close();
        return courses;
    }

    public void writefile3(ArrayList<Person> courses) throws IOException {
        FileOutputStream fos=new FileOutputStream(this.opfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }

    public ArrayList<Schedule> readfile4() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(this.opfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Schedule> courses=(ArrayList<Schedule>)ois.readObject();
        ois.close();
        fis.close();
        return courses;
    }

    public void writefile4(ArrayList<Schedule> courses) throws IOException {
        FileOutputStream fos=new FileOutputStream(this.opfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }

    public ArrayList<Student> readfile5() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(this.opfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Student> courses=(ArrayList<Student>)ois.readObject();
        ois.close();
        fis.close();
        return courses;
    }

    public void writefile5(ArrayList<Student> courses) throws IOException {
        FileOutputStream fos=new FileOutputStream(this.opfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }

    public ArrayList<Teacher> readfile6() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(this.opfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Teacher> courses=(ArrayList<Teacher>)ois.readObject();
        ois.close();
        fis.close();
        return courses;
    }

    public void writefile6(ArrayList<Teacher> courses) throws IOException {
        FileOutputStream fos=new FileOutputStream(this.opfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }

}
