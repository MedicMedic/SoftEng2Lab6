package solidPrinciplesWithDesignPattern;

public class Book implements Resource 
{
    private String title;

    public Book(String title) 
    {
        this.title = title;
    }

    @Override
    public void access() 
    {
        System.out.println("Borrowing book: " + title);
    }
}