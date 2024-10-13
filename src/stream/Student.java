package stream;

import java.io.*;

public class Student implements Serializable {

    private static final long serialVersionUID = -1654391082989018462L;
    private String name;

    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//
//    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", id=" + id +
//                '}';
//    }
}
//