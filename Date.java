public class Date {

    public int dd, mm, yyyy;
    public String dueDate;

    Date() {
        dd = 0;
        mm = 0;
        yyyy = 0;
        dueDate = "NA NA NA";
    }

    public String toMonth(int mm) {
        String m;
        switch (mm) {
            case 1:
                m = "January";
                break;
            case 2:
                m = "February";
                break;
            case 3:
                m = "March";
                break;
            case 4:
                m = "April";
                break;
            case 5:
                m = "May";
                break;
            case 6:
                m = "June";
                break;
            case 7:
                m = "July";
                break;
            case 8:
                m = "August";
                break;
            case 9:
                m = "September";
                break;
            case 10:
                m = "October";
                break;
            case 11:
                m = "November";
                break;
            case 12:
                m = "December";
                break;
            default:
                m = "NA";
        }
        return m;
    }

    Date(int dd, int mm, int yyyy) {
        this.dd = dd;
        this.yyyy = yyyy;
        this.mm = mm;
        dueDate = Integer.toString(dd) + " " + toMonth(mm) + " " + Integer.toString(yyyy);
    }

    String getDate() {
        return dueDate;
    }
}
