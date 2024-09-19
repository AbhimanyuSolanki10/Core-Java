import java.util.Scanner;

class Printf {
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x=32;
        // int y =3856;
        // int z=586;
        // int p=7;
        // double p=38.56358923;
        // String s1="mohan Is Here";
        int x=35;
        double y=12.5687;
        String s1="abcd";
        // System.out.printf("%08d%08d%08d",x,y,z);
        // System.out.printf("%6d%6d%n%6d%6d\n",x,y,z,p);
        // System.out.printf("%.3f",p);
        // System.out.printf("%s",s1);
        // System.out.printf("%S",s1);
        System.out.printf("%6d  %.2f%s",x,y,s1);
    }
}