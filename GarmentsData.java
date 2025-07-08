import java.util.*;

class Garments{

    String GType;
    String GCode;
    String GFabric;
    int GSize;
    float GPrice;

    Garments(){
        GCode = "Not Allowed";
        GType = "Not Allowed";
        GFabric = "Not Allowed";
        GSize = 0 ;
        GPrice = 0.0f;
    }

    public void Assign(){
        if(GFabric.equals("cotton")){
            if(GType.equals("Trouser"))
                GPrice=1300;
            if(GType.equals("Shirt"))
                GPrice=1100;
        }else{
            if(GType.equals("Trouser"))
                GPrice=1170;
            if(GType.equals("Shirt"))
                GPrice=900;
        }
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Garments Code : ");
        GCode=sc.next();
        System.out.println("Enter Garments type: ");
        GType=sc.next();
        System.out.println("Enter Garments Fabric: ");
        GSize=sc.nextInt();
        Assign();
    }

    public void Display(){
        System.out.println("Garment Code :" +GCode);
        System.out.println("Garment Type :" +GType);
        System.out.println("Garment Fabric :" +GFabric);
        System.out.println("Garment Size :" +GSize);
        System.out.println("Garment Price :" +GPrice);

    }
}

class GarmentsData {
    public static void main(String args[]){
        Garments gar = new Garments();
        gar.Input();
        gar.Display();
    }
}
