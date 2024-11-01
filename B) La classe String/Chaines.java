class Chaines
{
  public static void main(String[] args)
  {
    String ch1 = new String("chaine");
    System.out.println(ch1.length());
    System.out.println(ch1.charAt(0));

    String ch2 = new String("chaine");
    System.out.println(ch1 == ch2);
    System.out.println(ch1.equals(ch2));

    String ch3 = "chaines";
    String ch4 = "chaines";
    System.out.println(ch3 == ch4);
    System.out.println(ch3.equals(ch4));
  }
}
