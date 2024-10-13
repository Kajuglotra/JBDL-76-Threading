package stream;

import java.io.*;

public class FileStreamDemo {

    public void write() throws IOException {
        File file = new File("/Users/kajalglotra/Downloads/SkillOVill/JBD-76-Threading/temp.txt");
        String  str = "kajal;";
        Student student  = new Student("Kajal", 1);
        FileOutputStream outputStream  = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//        outputStream.write(str.getBytes());
        objectOutputStream.writeObject(student);
    }
    public void read() throws IOException, ClassNotFoundException {
        File file = new File("/Users/kajalglotra/Downloads/SkillOVill/JBD-76-Threading/temp.txt");
        FileInputStream stream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(stream);

//        System.out.println(stream.read());
        System.out.println(objectInputStream.readObject());
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileStreamDemo demo  = new FileStreamDemo();
//        demo.write();
        demo.read();
    }
}
