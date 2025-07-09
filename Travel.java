import java.util.*;

class Tour 
{
    String TCode;
    int NoofAdults;
    int NoofKids;
    int Kilometers;
    float TotalFare;
    
    //define a constructor
    Tour ()
    {
        TCode=null;
        NoofAdults=0;
        NoofKids=0;
        Kilometers=0;
        TotalFare=0.0f;
    }

    public void AssignFare(){
        if(Kilometers>=1000)
        {
            TotalFare=NoofAdults*500+NoofKids*250;
        }
        if(Kilometers>=500 && Kilometers<1000)
        {
            TotalFare=NoofAdults*300+NoofKids*150;
        }
        if(Kilometers<500)
        {
            TotalFare=NoofAdults*200+NoofKids*100;
        }
    }

    public void EnterTour(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Travel Code : ");
        TCode=sc.next();
        System.out.println("Enter Number of Adults : ");
        NoofAdults=sc.nextInt();
        System.out.println("Enter Number of Kids : ");
        NoofKids=sc.nextInt();
        System.out.println("Enter Distance in Kilometers : ");
        Kilometers=sc.nextInt();
        AssignFare();
    }

    

    public void ShowTour(){
        System.out.println("Travel Code   : "+TCode);
        System.out.println("No of Adults  : "+NoofAdults);
        System.out.println("No of Kids    : "+NoofKids);
        System.out.println("Dist in Kms   : "+Kilometers);
        System.out.println("Total Fare    : "+TotalFare);
    }
}

class Travel
{
   public static void main(String args[])
   {
     Tour ob=new Tour();  
     ob.EnterTour();
     ob.ShowTour();
   }
}