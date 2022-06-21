import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Rzucam kostka!!");
    int rzut1;
    int rzut2;
    rzut1 =(int)(Math.random()*6+1);
    rzut2 =(int)(Math.random()*6+1);
    System.out.println(rzut1);
    System.out.println(rzut2);
    if(rzut1==rzut2)
      System.out.println("Wygrana!!!");
    else
      System.out.println("Spruboj jeszcze raz!!!");
    
  }
}