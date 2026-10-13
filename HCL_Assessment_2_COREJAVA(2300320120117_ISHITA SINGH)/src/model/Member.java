
package model;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String id;
    private String name;
    private String email;
    private List<LibraryItem> borrowedItems;

    public Member(String id, String name, String email) {
        this.id = id;
        this.name = name;
        setEmail(email);
        this.borrowedItems = new ArrayList<>();
    }

    public Member(String id, String name) {
        this(id, name, "unknown@example.com");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<LibraryItem> getBorrowedItems() {
        return new ArrayList<>(borrowedItems);
    }

    public void setEmail(String email) {
        if (email == null ||
                !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    public void borrowItem(LibraryItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }

        item.borrow();
        borrowedItems.add(item);
    }

    public void returnItem(LibraryItem item) {
        if (!borrowedItems.contains(item)) {
            throw new IllegalArgumentException(
                    "This item was not borrowed by this member");
        }

        item.giveBack();
        borrowedItems.remove(item);
    }

    @Override
    public String toString() {
        return "Member ID: " + id
                + ", Name: " + name
                + ", Email: " + email
                + ", Borrowed Items: " + borrowedItems.size();
    }
}