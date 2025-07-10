import java.util.*;

class EMPLOYEE {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    public float Calculate() {
        return basic + hra + da;
    }

    public void havedata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Number : ");
        empno = sc.nextInt();
        System.out.println("Enter Name : ");
        ename = sc.next();
        System.out.println("Enter Basic, HRA and DA : ");
        basic = sc.nextFloat();
        hra = sc.nextFloat();
        da = sc.nextFloat();
        netpay = Calculate();
    }

    public void dispdata() {
        System.out.println("Employee Number : " + empno);
        System.out.println("Employee Name   : " + ename);
        System.out.println("Basic   : " + basic);
        System.out.println("HRA     : " + hra);
        System.out.println("DA      : " + da);
        System.out.println("Net Pay : " + netpay);
    }
}

class EmpDetails {
    public static void main(String args[]) {
        EMPLOYEE ob = new EMPLOYEE();
        ob.havedata();
        ob.dispdata();
    }
}