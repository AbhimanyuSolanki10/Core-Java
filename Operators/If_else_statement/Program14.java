import java.util.Scanner;

class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price");
        double cp=sc.nextDouble();
        System.out.println("Enter the selling price");
        double sp=sc.nextDouble();
        if(sp>cp){
        double pf=((sp-cp)*100)/cp;
        System.out.println("Profit % is : " + pf);
        }else if (cp>sp){
        double ls=((cp-sp)*100)/cp;
        System.out.println("Loss % is : " + ls);
        }else{
        System.out.println("No Profit No Loss");
        }
    }
}