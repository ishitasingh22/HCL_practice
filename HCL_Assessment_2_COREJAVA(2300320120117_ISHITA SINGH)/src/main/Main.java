package main;

import model.Book;
import model.DVD;
import model.LibraryItem;
import model.Magazine;
import model.Member;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B101", "Java Basics", 2024, "James") {
            @Override
            public String getItemType() {
                return "";
            }
        });
        items.add(new Magazine("M101", "Science Today", 2025, 12) {
            @Override
            public String getItemType() {
                return "";
            }
        });
        items.add(new DVD("D101", "Java Tutorial", 2023, 120) {
            @Override
            public double lateFee(int overdueDays) {
                return 0;
            }

            @Override
            public String getItemType() {
                return "";
            }
        });

        System.out.println("LIBRARY ITEMS");
        for (LibraryItem item : items) {
            System.out.println(item);
        }

        System.out.println("\nLATE FEES FOR 3 DAYS");
        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + ": Rs. "
                    + item.lateFee(3));
        }

        Member member = new Member(
                "U101", "Ishita", "ishita@example.com");

        member.borrowItem(items.get(0));

        System.out.println("\nMEMBER DETAILS");
        System.out.println(member);

        System.out.println("\nAFTER BORROWING");
        System.out.println(items.get(0));

        member.returnItem(items.get(0));

        System.out.println("\nAFTER RETURNING");
        System.out.println(items.get(0));
    }


}
