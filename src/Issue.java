import java.util.ArrayList;
import java.util.Scanner;

public class Issue
{
    Scanner s = new Scanner(System.in);
    public void issue(ArrayList<Book> list)
    {
        System.out.println("Enter book id");
        int id = s.nextInt();
        boolean found = false;
        for(int i=0;i<list.size();i++)
        {
            Book b = list.get(i);
            if(b.id == id)
            {
                found = true;

                if(b.issued == true)
                {
                    System.out.println("Book is already issued");
                    break;
                }

                System.out.println("Book name:"+b.bookName+", Book id:"+b.id);
                System.out.println("Press y to issue the book or press n to exit");
                char c = s.next().charAt(0);
                if(c == 'y')
                {
                    System.out.println("Enter issue date");
                    s.nextLine();
                    String issueDate = s.nextLine();
                    b.issueDate = issueDate;
                    System.out.println("Enter return date");
                    String rd = s.nextLine();
                    b.returnDate = rd;
                    b.issued = true;
                    System.out.println("Book issued successful");
                }
                else
                {
                    System.out.println("Book issue cancelled");
                }
            }
        }
        if(found == false)
        {
            System.out.println("Book not found");
        }
    }
}
