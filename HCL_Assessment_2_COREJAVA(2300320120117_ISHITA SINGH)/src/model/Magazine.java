
package model;

public abstract class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String id, String title, int year,
                    int issueNumber) {
        super(id, title, year);
        this.issueNumber = issueNumber;
    }

    public Magazine(String id, String title, int year,
                    int issueNumber, boolean available) {
        super(id, title, year, available);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public double lateFee(int overdueDays) {
        return Math.max(0, overdueDays) * 1.0;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Issue Number: " + issueNumber
                + ", Type: Magazine";
    }
}
