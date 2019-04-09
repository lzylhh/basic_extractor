package extractor;

public class Phase {
    String qs;
    public static final String []act = {"creat", "Creat", "Modify", "modify", "Following", "following"};
    public static final String []ob = {"class", "return value", "method", "Fields"};
    Phase(String lqs)
    {
        qs = lqs;
    }

}
