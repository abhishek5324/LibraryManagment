import java.util.ArrayList;

public class DisplayBooks
{
    public void display(ArrayList<Book> list)
    {
        System.out.println("Books");
        for(int i=0;i<list.size();i++)
        {
            Book b = list.get(i);
            System.out.print(i+1+":"+"Book name: "+b.bookName+", Book id: "+b.id);
            if(b.issued == false)
            {
                System.out.print(", this book is available for issue");
            }
            else
            {
                System.out.print(", book is already issued and will be available by "+b.returnDate);
            }
            System.out.println();
        }
    }
}
