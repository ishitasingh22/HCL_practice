package Streams;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.Set;
import java.util.List;
import java.util.Arrays;

public class Employee {

    record Emp(int id, String name, BigDecimal salary,
               LocalDate hireDate, Set<String> skills) {
    }

    static Emp e(int id, String name, int sal,
                 String date, String... skills) {
        return new Emp(
                id,
                name,
                BigDecimal.valueOf(sal),
                LocalDate.parse(date),
                Set.of(skills)
        );
    }

    public static void main(String[] args) {

        List<Emp> employees = Arrays.asList(
                e(101, "Rahul", 60000, "2023-01-15",
                        "Java", "SQL", "Spring"),
                e(102, "Priya", 75000, "2022-06-10",
                        "Python", "ML", "SQL"),
                e(103, "Aman", 45000, "2024-03-20",
                        "Java", "React"),
                e(104, "Neha", 90000, "2021-11-05",
                        "Java", "Spring", "AWS"),
                e(105, "Karan", 55000, "2023-08-12",
                        "Python", "React", "SQL")
        );
    }
}