
package model;

public abstract class DVD extends LibraryItem {
    private int durationMinutes;

    public DVD(String id, String title, int year,
               int durationMinutes) {
        super(id, title, year);
        this.durationMinutes = durationMinutes;
    }

    public DVD(String id, String title, int year,
               int durationMinutes, boolean available) {
        super(id, title, year, available);
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public double lateFee(int overdueDays) {
        return Math.max(0, overdueDays) * 5.0;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Duration: " + durationMinutes + " minutes"
                + ", Type: DVD";
    }
}