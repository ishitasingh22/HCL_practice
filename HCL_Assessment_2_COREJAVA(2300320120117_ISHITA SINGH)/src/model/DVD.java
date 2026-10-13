
package model;

public abstract class DVD extends LibraryItem {
    private int durationMinutes;

    public DVD(String id, String title, int minutes, int durationMinutes) {
        super(id, title);
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String getItemType() {
        return "DVD";
    }
}
