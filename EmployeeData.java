import java.util.*;

class Details
{
    String Name;
    String Yoj;
    String Address;
     
    Details(String name, String yoj, String address)
    {
        Name=name;
        Yoj=yoj;
        Address=address;
    }

    public void DisplayInfo(){
        System.out.println(Name+"\t"+Yoj+"\t\t"+Address);
    }
}

class EmployeeData
{
   public static void main(String args[])
   {
     Details ob1=new Details("Rahul","1994","Tilak Nagar, New Delhi");
     Details ob2=new Details("Raman","2000","Hari Nagar, New Delhi");
     Details ob3=new Details("Rohit","1999","Subhash Nagar, New Delhi");

     System.out.println("Name\tYear of Joining\tAddress");
     ob1.DisplayInfo();
     ob2.DisplayInfo();
     ob3.DisplayInfo();

   }
}