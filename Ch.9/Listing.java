public class Listing
{
    private int value;
    boolean pushed;
    public Listing(int v)
    {
        value = v;
    }
    public String toString()
    {
        return ("Vertex: " + value + "\n");
    }
    public Listing deepCopy()
    {
        Listing clone = new Listing(value);
        return clone;
    }
    public boolean getPushed()
    {
        return pushed;
    }
    public void setPushed(boolean value)
    {
        pushed = value;
    }
    public void traversed()
    {
        System.out.println(this);
    }
}
