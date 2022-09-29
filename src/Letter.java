public class Letter
{
    /** Prints out a complete letter by printing the greeting,
     Followed by the special message, followed by the closing */
    private String name;
    private String fromName;
    public Letter(String fromName)
    {
        this.fromName = fromName;
    }
    public void writeLetter(String name)
    {
        this.name = name;
        greeting();
        specialMessage();
        closing();
        /* to be implemented in (a) */
    }

    public void greeting()
    {
        System.out.println("Hello, " + name);
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing()
    {
        System.out.println("From, " + fromName) ;
    }
}

