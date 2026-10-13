
package repository;

import model.LibraryItem;
import model.Member;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class LibraryRepository {
    private final Map<String, LibraryItem> items =
            new LinkedHashMap<>();

    private final Map<String, Member> members =
            new LinkedHashMap<>();

    public void addItem(LibraryItem item) {
        if (items.containsKey(item.getId())) {
            throw new IllegalArgumentException(
                    "Duplicate item ID: " + item.getId());
        }
        items.put(item.getId(), item);
    }

    public void addMember(Member member) {
        if (members.containsKey(member.getId())) {
            throw new IllegalArgumentException(
                    "Duplicate member ID: " + member.getId());
        }
        members.put(member.getId(), member);
    }

    public LibraryItem findItem(String id) {
        return items.get(id);
    }

    public Member findMember(String id) {
        return members.get(id);
    }

    public Collection<LibraryItem> getAllItems() {
        return items.values();
    }

    public Collection<Member> getAllMembers() {
        return members.values();
    }
}