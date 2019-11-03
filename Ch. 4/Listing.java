import javax.swing.JOptionPane;

public class Listing
{
    private String name;
    private String idNum;
    private String gpa;

    private Listing next;

    public void setName(String Name)
    {
        name = Name;
    }
    public String getName()
    {
        return name;
    }
    public void setId(String ID)
    {
        idNum = ID;
    }
    public String getID()
    {
        return idNum;
    }
    public void setGpa(String GPA)
    {
        gpa = GPA;
    }
    public String getGPA()
    {
        return gpa;
    }
    public void setNext(Listing node)
    {
        next = node;
    }
    public Listing getNext()
    {
        return next;
    }
    public Listing()
    {
        name = "null";
        idNum = "0";
        gpa = "0.0";
    }
    public Listing(String Name, String ID, String GPA)
    {
        name = Name;
        idNum = ID;
        gpa = GPA;
    }
    public String toString()
    {
        return ("Name: " + this.name + "/nID Number: " + this.idNum + "/nGPA: " + this.gpa);
    }
    public Listing deepCopy()
    {
        Listing clone = new Listing(name, idNum, gpa);
        return clone;
    }
    public int compareTo(String targetKey)
    {
        return (name.compareTo(targetKey));
    }
    public void input()
    {
        name = JOptionPane.showInputDialog("Enter Student's Name: ");
        idNum = JOptionPane.showInputDialog("Enter Student's ID number: ");
        gpa = JOptionPane.showInputDialog("Enter Student's GPA: ");
    }
}
