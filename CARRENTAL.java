import java.util.*;

class CAR {
    int CarId;
    String CarType;
    int Rent;

    public void GetCar() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Car Id : ");
            CarId = sc.nextInt();
            System.out.println("Enter Car Type : ");
            CarType = sc.next();
        }
    }

    public int GetRent() {
        if (CarType.equals("Small"))
            Rent = 1000;
        if (CarType.equals("Van"))
            Rent = 800;
        if (CarType.equals("SUV"))
            Rent = 2500;
        return Rent;
    }

    public void ShowCar() {
        System.out.println("Car Id : " + CarId);
        System.out.println("Car Type : " + CarType);
        System.out.println("Rent : " + GetRent());
    }
}

class CARRENTAL {
    public static void main(String args[]) {
        CAR ob = new CAR();
        ob.GetCar();
        ob.GetRent();
        ob.ShowCar();
    }
}