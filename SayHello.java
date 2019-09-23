public class SayHello {
     public static void main(String[] args) {
      System.out.println("Selow is the funtion of sayhello");
   sayHello(sum());
  }
  
  public static void sayHello(int sum) {
      System.out.println("say hello!"+sum);
  }
  public static int sum(){
       int sum = 0;
    for(int i=0;i<=100;i++){
     sum += i;
    }
    return sum;
  }
}