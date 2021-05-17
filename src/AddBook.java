import java.util.ArrayList;
import java.util.Scanner;

public class AddBook
{
    Scanner s = new Scanner(System.in);
    char c = 'y';
    public void add(ArrayList<Book> list)
    {
        Book b = new Book();
        while(c == 'y')
        {

            System.out.println("Enter book id");
            b.id = s.nextInt();
            System.out.println("Enter book name");
            s.nextLine();
            b.bookName = s.nextLine();


            System.out.println("Entered details are");
            System.out.println("Book Name:" + b.bookName);
            System.out.println("Book Id: " + b.id);
            System.out.println("Do you want to change details? if yes press y else press n");
            c = s.next().charAt(0);
        }
        list.add(b);
        System.out.println("Book added successfully");
    }
}
