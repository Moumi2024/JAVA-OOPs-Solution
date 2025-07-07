import java.util.*;

class RESORT {
    int RNo;
    String Name;
    int Charges;
    int Days;

    public double Compute() {
        double amt;
        amt = Charges * Days;
        if (amt >= 11000)
            amt = amt * 1.02;
        return amt;
    }

    public void GetInfo() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Room Number : ");
            RNo = sc.nextInt();
            System.out.println("Enter Name : ");
            Name = sc.next();
            System.out.println("Enter Charges : ");
            Charges = sc.nextInt();
            System.out.println("Enter Days : ");
            Days = sc.nextInt();
        }
    }

    public void DispInfo() {
        System.out.println("Room No     : " + RNo);
        System.out.println("Name    : " + Name);
        System.out.println("Charges   : " + Charges);
        System.out.println("Days : " + Days);
        System.out.println("Total Amount : " + Compute()); 
    }
}

class ResortData {
    public static void main(String args[]) {
        RESORT res = new RESORT();
        res.GetInfo();
        res.DispInfo();
    }
}

