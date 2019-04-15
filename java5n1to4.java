import java.io.*;
public class java5n1to4{
  public static void main(String[] args){
    introduceOneself();
  }
  public static void introduceOneself(){
    System.out.println("名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("歳を入力してください");
    int age = new java.util.Scanner(System.in).nextInt();
    System.out.println("身長を入力してください");
    float height = new java.util.Scanner(System.in).nextFloat();
    System.out.println("性別を入力してください");
    try{
      char sex = (char)System.in.read();
      System.out.println("私は"+name+"です。"+age+"歳で身長は"+height+"の"+sex+"性です。");
    }catch(IOException e){
      System.out.println(e);
    }
  }
}
