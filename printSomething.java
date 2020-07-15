
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class printSomething {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fx = new FileOutputStream("C:\\Users\\compu\\Documents\\NetBeansProjects\\Classroom\\src\\Siddhartha.txt");
        ObjectOutputStream ff = new ObjectOutputStream(fx);
        Student st = new Student("Siddhartha");
        st.assign.add(new AssignmentT("fsdkjfhs"));
        st.assign.add(new AssignmentT("fsdkjfhs"));
        st.assign.add(new AssignmentT("fsdkjfhs"));
        st.done.add(new AssignmentT("fsdkjfhs"));
        st.done.add(new AssignmentT("fsdkjfhs"));
        st.done.add(new AssignmentT("fsdkjfhs"));
        st.done.add(new AssignmentT("fsdkjfhs"));
        ff.writeObject(st);
    }
}
