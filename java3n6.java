public class java3n6{
  public static void main(String[] args){
    System.out.println("【数あてゲーム】");
    int ans = new java.util.Random().nextInt(10);
    System.out.println(ans);
    for(int i = 0;i<5;i++){
      System.out.println("0~9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if(num == ans){
        System.out.println("当たり！");
        break;
      }else{
        System.out.println("違います");
      }
    }
      System.out.println("正解は"+ans+"でした");
      System.out.println("ゲームを終了します");
  }
}