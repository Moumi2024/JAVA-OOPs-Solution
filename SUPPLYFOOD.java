import java.util.Scanner;

class SUPPLYFOOD {
    int Code;
    String FoodName;
    String Sticker;
    String FoodType;

    public void GetType() {
        if (Sticker.equals("Green"))
            FoodType = "Vegetarian";
        if (Sticker.equals("Yellow"))
            FoodType = "Contains Egg";
        if (Sticker.equals("Red"))
            FoodType = "Non Vegetarian";
    }

    public void FoodIn() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter food Code: ");
            Code = sc.nextInt();
            System.out.print("Enter Food Name: ");
            FoodName = sc.next();
            System.out.print("Enter Sticker Color: ");
            Sticker = sc.next();
        }
        GetType();
    }

    public void FoodOut() {
        System.out.println("You Entered");
        System.out.println("Food Code  : " + Code);
        System.out.println("Food Name  : " + FoodName);
        System.out.println("Sticker Color  : " + Sticker);
        System.out.println("Food Type   : " + FoodType);

    }

    public static void main(String args[]) {
        SUPPLYFOOD object = new SUPPLYFOOD();
        object.FoodIn();
        object.FoodOut();
    }
}
