
package util;

import exception.LibraryException;
import model.LibraryItem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class ReportUtil {

    public static void exportReport(
            Collection<LibraryItem> items, String fileName) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(fileName))) {

            writer.write("ID,Title,Year,Type,Status");
            writer.newLine();

            for (LibraryItem item : items) {
                writer.write(
                        item.getId() + ","
                                + item.getTitle() + ","
                                + item.getYear() + ","
                                + item.getClass().getSimpleName() + ","
                                + (item.isAvailable()
                                ? "Available" : "Borrowed"));
                writer.newLine();
            }

            writer.flush();

        } catch (IOException e) {
            throw new LibraryException(
                    "Failed to export library report.", e);
        }
    }
}
