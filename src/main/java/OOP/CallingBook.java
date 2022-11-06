package OOP;

public class CallingBook {
    public static void main(String[] args) {
        //Create book class object
        Book book1 = new Book();

        //Setting field values
        book1.title = "Test";
        book1.author = "Test author";
        book1.setNumberOfPages(100);


        book1.printBookInfo();

        //Creating new instance of Book Class
        Book book2 = new Book();
        book2.author="Book 2 author";
        book2.title = " Book title";
        book2.setNumberOfPages(140);
        book2.printBookInfo();


    }
}
