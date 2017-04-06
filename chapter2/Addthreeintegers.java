import static java.lang.System.out;

public class Addthreeintegers {

  static Function<Integer, Function<Integer, Function<Integer,Integer>>> addthree = x -> y -> z -> x+y+z;

  public static void main(String[] args)  {
    System.out.println(addthree.apply(3).apply(5).apply(7));
  }
}
