import java.util.Scanner;

class CANDIDATE {
    int RNo;
    String Name, Remarks;
    int Score;

    public void AssignRem() {
        if (Score >= 50)
            Remarks = "Pass";
        else
            Remarks = "Fail";
    }

    public void Enter() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Roll No: ");
            RNo = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Name: ");
            Name = sc.nextLine();
            System.out.print("Enter Score: ");
            Score = sc.nextInt();
        }
        AssignRem();
    }

    public void Display() {
        System.out.println("Result");
        System.out.println("RNo : " + RNo);
        System.out.println("Name : " + Name);
        System.out.println("Score : " + Score);
        System.out.println("Remarks : " + Remarks);
    }
}

public class  Score{ 
    public static void main(String args[]) {
        CANDIDATE cand = new CANDIDATE();
        cand.Enter();
        cand.Display();
    }
}
