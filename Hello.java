// class Calculator
// {
//     int a;
//     public int add(int n1 ,int n2)
//     {
//         int r = n1 + n2;
//         return r;
//     }
// }
class  Computer 
{
    public void playMusic()
    {
        System.out.println("PlayingMusic...");
    }

    public String getPen(int cost)
    {
        if(cost>=10)
            return "Pen";
        return "Nothing";
    }
}



class hello 
{
    public static void main (String args[])
    {
        // int n = 1;
        // switch (n){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //         case 2:
        //         System.out.println("Tuesday");
        //         break;
        //         case 3:
        //         System.out.println("Wednesday");
        //         break;
        //         case 4:
        //         System.out.println("Thursday");
        //         break;
        //         case 5:
        //         System.out.println("Friday");
        //         break;
        //         case 6:
        //         System.out.println("Saturday");
        //         break;
        //     default:
        //         System.out.println("Sunday");
        // String day = "Sunday";
        // String result = "";
        // result = switch (day) 
        //     {

        //         case "Saturday","Sunday":yield"6am";
        //         case "Monday":yield"8am";
        //         default :yield"7am";
        //     };
        // System.out.println(result);


        // int i = 1;
        // while(i<5)
        // {
        //     System.out.println("Hi " + i);
        //     int j = 1;
        //     while(j<=3)
        //     {
        //         System.out.println("Hello " +  j);
        //         j++;
        //     }
        //     i++;
        
        // }
        // System.out.println("Bye"+i);

        // int a = 1;
        // do
        // {
        //     System.out.println("Hello");
        //     a++;
        // }while(a>7);
        
        // for(int i=1;i<=5;i++)
        // {
        //     System.out.println("Day " +i);
        //     for(int j=1; j<=5;j++)
        //     {
        //         System.out.println(" " + (j+8) + "-" + (j+9));
        //     }
        // }
        // int num1 = 4;
        // int num2 = 5;

        // Calculator calc = new Calculator();
        // int result = calc.add(num1, num2);
        // System.out.println(result);

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getPen(25);
        System.out.println(str);





    }

}