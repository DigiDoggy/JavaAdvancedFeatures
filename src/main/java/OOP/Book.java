package OOP;

public class Book {
    //Fields
    public String title;        // public fields
    public String author;
    private int numberOfPages;  // private field

    //Methods
    public void setNumberOfPages(int numberOfPages){
        if(isNumberOfPagesCorrect(numberOfPages)){
            this.numberOfPages=numberOfPages;
        }else{
            System.out.println("The provided number pages is incorrect " + numberOfPages);
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    private boolean isNumberOfPagesCorrect(int numberOfPages){
        return numberOfPages > 10 ;
    }

    public void printBookInfo(){
        System.out.println("Title" + title);
        System.out.println("Autor" + author);
        System.out.println("Number of pages" + numberOfPages);
    }



}
