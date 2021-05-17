import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        char c = 'y';
        addBooks(list);
        while(c == 'y')
        {
            System.out.println("Welcome to City Library");
            System.out.println("Press 1 to add a book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a book");
            System.out.println("Press 4 to see issued books");
            System.out.println("Press 5 to see all books");
            System.out.println("press -1 to exit");

            int i = s.nextInt();
            switch(i)
            {
                case 1: AddBook ab = new AddBook();
                        ab.add(list);
                        break;
                case 2: Issue is = new Issue();
                        is.issue(list);
                        break;
                case 3: ReturnBook rb = new ReturnBook();
                        rb.returnBook(list);
                        break;
                case 4: DisplayIssuedBooks dib = new DisplayIssuedBooks();
                        dib.displayIssued(list);
                        break;
                case 5: DisplayBooks db = new DisplayBooks();
                        db.display(list);
                        break;
                case -1: System.exit(0);
                         break;

            }
            System.out.println("If you want to continue press y else n");
            c = s.next().charAt(0);
        }
    }

    private static void addBooks(ArrayList<Book> list)
    {
        for(int i=0;i<6;i++)
        {
            Book a = new Book();
            if(i % 2 == 0)
            {
                a.bookName = "Hello "+i;
                a.id = 101+i;
                a.issued = true;
                a.issueDate = "21 May";
                a.returnDate = "21 july ";
            }
            else
            {
                a.bookName = "Hi "+i;
                a.id = 101+i;
                a.issued = false;
            }
            list.add(a);
        }
    }
}
