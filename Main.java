public class Main
{
  public static void main(String[] args)
  {
    lastFirstN("hello", "goodbye", 3);
    stringManip("yes", "wHat");
    removeStr("badaboom", "ada"); 
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output; 
    String firstN = s1.substring(s1.length() - n);  
    String lastN = s2.substring(0, n); 

    output = firstN + lastN; 
    System.out.println(output);
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    String upper1 = s1.toUpperCase();
    String letter1 = s2.substring(0, 1); 
    String letter2 = s2.substring(1); 
    String upper2 = letter1.toUpperCase() + letter2.toLowerCase();
    System.out.println(upper1 + " " + upper2);
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null; 
    int num = s1.indexOf(s2);
    output = s1.substring(0, num) + s1.substring(num + s2.length());
    System.out.println(output);

    return output; 
  }
}
