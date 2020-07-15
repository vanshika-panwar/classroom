import java.io.*;
import java.util.*;

class Student implements Serializable {

    private static final long serialVersionUID = 20L;
    public int id;
    public String name;
    public ArrayList<AssignmentT> assign;
    public ArrayList<AssignmentT> done;

    Student() {
        name = "NULL";
        id = 0;
    }

    Student(String name) {
        assign = new ArrayList<AssignmentT>();
        done = new ArrayList<AssignmentT>();
        this.name = name;
        id = 1;// anything
    }

    void submitAssignment(AssignmentT assg) throws FileNotFoundException, IOException {

        FileOutputStream fil = new FileOutputStream("Submitted.out", true);
        ObjectOutputStream obj = new ObjectOutputStream(fil);
        obj.writeObject(assg);
        done.add(assg);
        for (int i = 0; i < assign.size(); i++) {
            if (assign.get(i).equals(assg)) {
                assign.remove(i);
                break;
            }
        }
        obj.close();
    }

    void assignHom(AssignmentT assg) {
        assign.add(assg);
    }

    boolean search(AssignmentT assg) {
        for (int i = 0; i < assign.size(); i++) {
            if (assign.get(i).equals(assg)) {
                return true;
            }
        }
        for (int i = 0; i < done.size(); i++) {
            if (done.get(i).equals(assg)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        Student newObj = (Student) obj;
        if (newObj.id == this.id) {
            return true;
        }
        return false;
    }
}
