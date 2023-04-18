import java.util.ArrayList;
import java.util.Scanner;

public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
        This will be our actual program that we define author and his books
        In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

        Full name = Stefan Zweig
        County = Austria
        Is still alive: No (28 November 1881 – 22 February 1942)
        Some of his books as listed below:

        BookName                            Genre           TotalPage
        Amok                                tale            189
        The Royal Game                      novella         53
        24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */

        Scanner input = new Scanner(System.in);
        ArrayList<Author> authors = new ArrayList<>();

        System.out.println(BiographyQuestions.askFirstName);
        String answerFName = input.nextLine();

        System.out.println(BiographyQuestions.askLastName);
        String answerLName = input.nextLine();

        System.out.println(BiographyQuestions.askCountry);
        String answerCountry = input.nextLine();

        System.out.println(BiographyQuestions.askAlive);
        String isAlive1 = input.nextLine();
        if (input.nextLine().equalsIgnoreCase("y")){
            System.out.println(BiographyQuestions.askAge);
            int answerAge = input.nextInt();
            input.nextLine();
        }
        else if (input.nextLine().equalsIgnoreCase("n"))
            System.out.println(BiographyQuestions.getBookInfo);



        Author a = new Author(answerFName, answerLName, answerCountry, isAlive1);
        authors.add(a);

        ArrayList<Book> bookInfo = new ArrayList<>();

        do{
            System.out.println(BiographyQuestions.getBookInfo);
            String answerBook = input.nextLine();
            if (answerBook.toLowerCase().startsWith("y"))
                Book.addBooks();

            System.out.println(BiographyQuestions.getBookName);
            String answerBookName = input.nextLine();

            System.out.println(BiographyQuestions.getBookGenre);
            String answerGenre = input.nextLine();

            System.out.println(BiographyQuestions.getBookPage);
            int answerPage = input.nextInt();
            input.nextLine();

            Book b1 = new Book(answerBookName, answerGenre, answerPage);
            bookInfo.add(b1);
        }

        while(Book.totalNumberOfBooks < 3);

        System.out.println(a);


        System.out.println("Author's books are as listed below:");
        // System.out.println(bookInfo);

        for (Book book : bookInfo) {
            System.out.println(book);

        }



    }
}
