
package service;

import exception.ItemNotFoundException;
import exception.LibraryException;
import model.LibraryItem;
import model.Member;
import repository.LibraryRepository;

public class LibraryService {
    private final LibraryRepository repository;

    public LibraryService(LibraryRepository repository) {
        this.repository = repository;
    }

    public void addItem(LibraryItem item) {
        repository.addItem(item);
    }

    public void registerMember(Member member) {
        repository.addMember(member);
    }

    public void borrowItem(String memberId, String itemId) {
        Member member = repository.findMember(memberId);
        if (member == null) {
            throw new LibraryException(
                    "Member not found: " + memberId);
        }

        LibraryItem item = repository.findItem(itemId);
        if (item == null) {
            throw new ItemNotFoundException(
                    "Item not found: " + itemId);
        }

        member.borrowItem(item);
    }

    public void returnItem(String memberId, String itemId) {
        Member member = repository.findMember(memberId);
        if (member == null) {
            throw new LibraryException(
                    "Member not found: " + memberId);
        }

        LibraryItem item = repository.findItem(itemId);
        if (item == null) {
            throw new ItemNotFoundException(
                    "Item not found: " + itemId);
        }

        member.returnItem(item);
    }

    public LibraryRepository getRepository() {
        return repository;
    }
}