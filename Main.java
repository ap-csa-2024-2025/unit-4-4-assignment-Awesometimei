import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    problemOne(sc.nextLine());
    problemTwo(sc.nextLine());
    problemThree(sc.nextLine(), sc.nextLine());

  }

  public static void problemOne(String awesomeSauce)
  {
    int count = 0;
    for (int i = 0; i < awesomeSauce.length()-1d; i++)
    {
      String yippee = awesomeSauce.substring(i, i+2);
      yippee = yippee.toLowerCase();
      if (yippee.equals("pu") || yippee.equals("po") || yippee.equals("pi") || yippee.equals("pe") || yippee.equals("pa"))
      {
        count++;
      }
    }
    System.out.println("Contains p followed by a vowel " + count + " times.");
  }

  public static void problemTwo(String original)
  {
    for (int i = 0; i < original.length()-1; i++)
    {
      String str1 = original.substring(i, i+1);
      str1 = str1.toLowerCase();
      if (!(str1.equals("t") || str1.equals("o") || str1.equals("i") || str1.equals("e") || str1.equals("a")))
      {
        System.out.print(str1);
      }
    }
  }

  public static void problemThree(String str1, String str2)
  {
    String str3 = "";
    if (str1.length() == str2.length())
    {
      for (int i = str1.length()-1; i>=0; i--)
      {
        str3 += str2.substring(i, i+1);
        str3 += str1.substring(i, i+1);
      }
    }
    System.out.println(str3);
  }
}
