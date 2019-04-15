public class java4n4{
  public static void main(String[] args){
    int[] numbers = {3, 4, 9};
    System.out.println("１桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    boolean hit = false;
    for(int i:numbers){
      if(input == i){
        System.out.println("当たり！");
        hit = true;
      }
    }
    if(hit == false){
      System.out.println("はずれ");
    }
  }
}
