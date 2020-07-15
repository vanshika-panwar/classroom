// Author Siddhartha Tiwari

import java.io.Serializable;

public class Assignment extends AssignmentT {

    public double maxMarks;
    public Date dueDate;
    private static final long serialVersionUID = 2L;

    Assignment() {
        maxMarks = 0.0;
        dueDate = new Date();
        fileAddress = "";
        textContent = "";
    }

    Assignment(double marks, Date due, String address, String textContent) {
        maxMarks = marks;
        dueDate = due;
        fileAddress = address;
        this.textContent = textContent;
    }

    Assignment(double marks, Date due, String address) {
        maxMarks = marks;
        dueDate = due;
        fileAddress = address;
    }

    public double getMarks() {
        return maxMarks;
    }

    public Date getDueDate() {
        return dueDate;
    }

}
