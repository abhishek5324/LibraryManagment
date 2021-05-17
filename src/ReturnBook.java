import java.util.ArrayList;
import java.util.Scanner;

public class ReturnBook
{
    Scanner s = new Scanner(System.in);
    public void returnBook(ArrayList<Book> list)
    {
        System.out.println("Enter book id you want to return");
        int id = s.nextInt();
        boolean found = false;
        for(int i=0;i<list.size();i++)
        {
            Book b = list.get(i);

            if(b.id == id)
            {
                if(b.issued == true)
                {
                    found = true;
                    b.issued = false;
                    b.issueDate = "";
                    b.returnDate = "";
                    System.out.println("Book was succesfully returned");
                }
                else
                {
                    System.out.println("This book is not issued yet");
                }
            }
        }
    }
}
