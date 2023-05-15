public class query{
    int acs=60,cs=90;
    
    /*depts ai=new depts(acs,120-acs);
    depts mech=new depts(cs,180-cs);
    depts it=new depts(cs,180-cs);
    depts eee=new depts(cs,180-cs);*/
    depts ai=new depts(0,0);
    depts mech=new depts(0,0);
    depts it=new depts(0,0);
    depts eee=new depts(0,0);
    String deptl[]={"AI&DS","Mech","IT","EEE"};
    int seatl[][]={{ai.cseat,ai.mseat},{mech.cseat,mech.mseat},{it.cseat,it.mseat},{eee.cseat,eee.mseat}};


    void check()
    {
        System.out.println("------ANNOUNCEMENT------");
        if (ai.cseat==0||ai.mseat==0)
        {
            if (ai.cseat+ai.mseat==0){
                System.out.println("AI&DS seats are not available");
                ai.close();
            }
            else if (ai.cseat==0){
                System.out.println("AI&DS Centac seat is not available");
                ai.close();
            }
            else
                System.out.println("AI&DS Management seat is not available");
        }
        if (mech.cseat==0||mech.mseat==0)
        {
            if(mech.cseat+mech.mseat==0){
                System.out.println("Mech seats are not available");
            }
            else if (mech.cseat==0){
                System.out.println("Mech Centac seat is not available");
            }
            else
                System.out.println("Mech Management seat is not available");
        }
        if (it.cseat==0||it.mseat==0)
        {
            if(it.cseat+it.mseat==0){
                System.out.println("IT seats are not available");
            }
            else if (it.cseat==0){
                System.out.println("IT Centac seat is not available");
            }
            else
                System.out.println("IT Management seat is not available");
        }
        if (eee.cseat==0||eee.mseat==0)
        {  
            if(eee.mseat+eee.mseat==0){
                System.out.println("EEE seats are not available");
            }
            else if (eee.cseat==0){
                System.out.println("EEE Centac seat is not available");
            }
            else
                System.out.println("EEE Management seat is not available");
        }
        System.out.println("------------------------");
    }
    void display(String ldept[],int seats[][])
    {
        System.out.println("List of departments available");
        System.out.println("Department\tCentac\tManagement");
        for(int i=0; i<ldept.length; i++)
        {
            System.out.print((i+1)+"."+ldept[i]+"\t\t");
            for(int j=i; j<i+1; j++)
            {
                for(int k=0; k<2; k++)
                {
                    System.out.print(seats[j][k]+"\t");
                }
                System.out.println();
            }
        }
    }
}
