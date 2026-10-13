package exception;
//library exception extens runtime exception the others extens libraryexception
//borrwoing an tem that does not exist itemnotfound
//n=borrwoing an item that is already used
//a member borrowing more than 3 items borrowliit reacged
//wrap each menu action  in try/catch
//use a finally block
//never leave an empty catch block
//implemeny exportreport using try with resources and bifferedwriter to write all items and their status
//to next file.handle ipexception by wrapping it in libraryexcpetion

public class LibraryException extends Exception {
    public LibraryException(String message) {
        super(message);
    }
}