import java.util.Scanner;



public class controller extends query{
    void dispdept()
    {
        for(int i=0;i<deptl.length;i++)
        {
            System.out.println((i+1)+". "+deptl[i]);
        }
    }

    void selector(char st)
    {
        char adm;
        int dp;
        Scanner scn=new Scanner(System.in);
        switch(st)
        {
            case 'c':
                dispdept();
                System.out.println("select the department from the list:");
                dp=scn.nextInt();
                switch(dp)
                {
                    case 1:
                        ai.admission(1,"AI & DS");
                        System.out.println("Are you sure you want to admit in this department?(y/n)");
                        adm=scn.next().charAt(0);
                        if (ai.availc=="NA")
                        {
                            System.out.println("No seats available");
                        }
                        if (adm=='n')
                        {
                            ai.cancel(1,"AI & DS");
                        }
                        break;
                    case 2:
                        mech.admission(1,"Mechanical Engineering");
                        System.out.println("Are you sure you want to admit in this department?(y/n)");
                        adm=scn.next().charAt(0);
                        if (adm=='n')
                        {
                            mech.cancel(1,"Mechanical Engineering");
                        }
                        break;
                    case 3:
                        it.admission(1,"IT");
                        System.out.println("Are you sure you want to admit in this department?(y/n)");
                        adm=scn.next().charAt(0);
                        if (adm=='n')
                        {
                            it.cancel(1,"IT");
                        }
                        break;
                    case 4:
                        eee.admission(1,"EEE");
                        System.out.println("Are you sure you want to admit in this department?(y/n)");
                        adm=scn.next().charAt(0);
                        if (adm=='n')
                        {
                            eee.cancel(1,"EEE");
                        }
                        break;
                    default:
                        System.out.println("Invalid selector");
                        break;
                }  
                break;
                
            case'm':
                dispdept();
                System.out.println("select the department from the list:");
                dp=scn.nextInt();
                switch(dp)
                {
                    case 1:
                        ai.admission(2,"AI & DS");
                        System.out.println("Are you sure you want to admit in this department?(y/n)");
                        adm=scn.next().charAt(0);
                        if (adm=='n')
                        {
                            ai.cancel(2,"AI & DS");
                        }
                        break;
                    case 2:
                        mech.admission(2,"Mechanical Engineering");
                        System.out.println("Are you sure you want to admit in this department?(y/n)");
                        adm=scn.next().charAt(0);
                        if (adm=='n')
                        {
                            mech.cancel(2,"Mechanical Engineering");
                        }
                        break;
                    case 3:
                        it.admission(2,"IT");
                        System.out.println("Are you sure you want to admit in this department?(y/n)");
                        adm=scn.next().charAt(0);
                        if (adm=='n')
                        {
                            it.cancel(2,"IT");
                        }
                        break;
                    case 4:
                        eee.admission(2,"EEE");
                        System.out.println("Are you sure you want to admit in this department?(y/n)");
                        adm=scn.next().charAt(0);
                        if (adm=='n')
                        {
                            eee.cancel(2,"EEE");
                        }
                        break;
                    default:
                        System.out.println("Invalid selector");
                        break;
                }
                break;
            case 'h':
                display(deptl,seatl);
                break;
            case 'e':
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selector");
                break;
        }

    }
}
