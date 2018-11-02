package lab4;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        if (day > 0 && day < 31) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void print() {
        System.out.printf("%02d/%02d/%02d\n", day, month, year);
    }

    public static void main(String[] args) {
    }

}
