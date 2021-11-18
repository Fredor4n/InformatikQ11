
public class Schuler implements Datenelement
{
    private String name;
    public Schuler(String s)
    {
        name = s; 
    }

    public void informationAusgeben()
    {
        System.out.println(name);
    }

    public boolean istKleinerAls(Datenelement d)
    {
        if(name.compareTo(d.schluesselGeben())>0)
        {
            return false;
        }
        return true;
    }

    public boolean schluesselIstGleich(String s)
    {
        boolean b; 
        b = name.equals(s);
        return b;
    }

    public String schluesselGeben()
    {
        return name;
    }

}
