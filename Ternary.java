import java.util.Scanner;

public class Ternary {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String grades = "CBA";
    int grade = Integer.parseInt(in.nextLine());
    String word1 = in.nextLine();
    String word2 = in.nextLine();
    int num1 = Integer.parseInt(in.nextLine());
    int num2 = Integer.parseInt(in.nextLine());

    System.out.print("Letter grade: ");
    System.out.println(grade/10 < 7 ? "F" : grades.charAt(grade/10-7)+"");
    
    System.out.println(word1.charAt(0) < word2.charAt(0) ?
      word1+", "+word2 : word2+", "+word1);

    System.out.println(num1+" is "+(num1%2==1 ? "odd" : "even"));
    System.out.println(num2+" is "+(num2%2==1 ? "odd" : "even"));

    System.out.println(num1+" is "+(num1>num2 ? "greater than " :
      (num1<num2 ? "less than " : "equal to "))+num2);
  }
}