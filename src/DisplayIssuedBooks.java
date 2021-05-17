import java.util.ArrayList;

public class DisplayIssuedBooks
{
    public void displayIssued(ArrayList<Book> list)
    {
        int j=1;
        for(int i=0;i<list.size();i++)
        {

            Book b = list.get(i);
            if(b.issued == true)
            {
                System.out.print(j++ +":"+"Book name: "+b.bookName+", Book id: "+b.id);
                System.out.print(", book is already issued and will be available by "+b.returnDate);
                System.out.println();
            }
        }
    }
}
