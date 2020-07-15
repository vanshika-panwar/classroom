// Author Siddhartha Tiwari

import java.io.Serializable;

class AssignmentT implements Serializable {

    public String fileAddress;
    public String textContent;
    public String myFileAddress;
    public String myTextContent;
    protected double marksAssigned;
    private static final long serialVersionUID = 1L;

    AssignmentT() {
        marksAssigned = 0.0;
        myFileAddress = "";
        myTextContent = "";
    }

    AssignmentT(String address, String textContent) {
        marksAssigned = 0.0;
        myFileAddress = address;
        this.myTextContent = textContent;
    }

    AssignmentT(String address) {
        marksAssigned = 0.0;
        fileAddress = address;
        textContent = "";
    }

    public String getAddress() {
        return fileAddress;
    }

    public String getTextContent() {
        return textContent;
    }

    public boolean equals(Object toCompare) {
        AssignmentT temp = (AssignmentT) toCompare;
        if (temp.fileAddress == fileAddress && temp.textContent == textContent) {
            return true;
        }
        return false;
    }

}
