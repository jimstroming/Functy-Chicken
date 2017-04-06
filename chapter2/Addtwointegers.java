import static java.lang.System.out;

public class Addtwointegers {

  static Function<Integer, Function<Integer,Integer>> addtwo = x -> y -> x+y;

  public static void main(String[] args)  {
    System.out.println(addtwo.apply(3).apply(5));
  }
}
