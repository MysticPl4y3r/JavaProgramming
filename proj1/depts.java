public class depts
{
    int mseat,cseat;
    String availc="A";
    String availm="A";
    public depts(int ms,int cs)
    {
        mseat=ms;
        cseat=cs;
    }

    public void close()
    {
        availc="NA";
        availm="NA";
    }
    void admission(int c,String dept)
    {
        switch (c)
        {
            case 1:
                System.out.println("Admitted in "+dept+"-Centac Quota");
                cseat--;
                break;
            case 2:
                System.out.println("Admitted in "+dept+"-Management Quota");
                mseat--;
                break;
            default:
                break;
        }
    }
    void cancel(int c,String dept)
    {
        switch (c)
                {
                    case 1:
                        System.out.println("Cancelled admission in "+dept+"-Centac Quota");
                        cseat++;
                        break;
                    case 2:
                        System.out.println("Cancelled admission in "+dept+"-Management Quota");
                        mseat++;
                        break;
                    default:
                        break;
                }
    }
};