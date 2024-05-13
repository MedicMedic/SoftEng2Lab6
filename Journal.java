package solidPrinciplesWithDesignPattern;

public class Journal implements Resource 
{
    private String title;

    public Journal(String title) 
    {
        this.title = title;
    }

    @Override
    public void access() 
    {
        System.out.println("Borrowing journal: " + title);
    }
}