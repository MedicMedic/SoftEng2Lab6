package solidPrinciplesWithDesignPattern;

public class TestProgram 
{
    public static void main(String[] args) 
    {
        Resource book = new Book("Java Programming");
        Resource journal = new Journal("Science Journal");

        Student student = new Student();

        student.borrowResource(book);
        student.borrowResource(journal);
    }
}
