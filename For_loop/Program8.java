// print all the numbers upto 100 not divisible by 3 using continue
class Program8 {
    public static void main(String[] args) {
      for(int i = 1 ; i<100;i++){
        if(i%3==0)
            continue;
        System.out.println(i);
      }
    }
}