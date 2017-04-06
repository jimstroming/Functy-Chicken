import static java.lang.System.out;

public class Composewithlambdas {


  static Function<Integer, Integer> triple = x -> x * 3;

  static Function<Integer, Integer> square = x -> x * x;

  static Function<Integer, Integer> compose(final Function<Integer, Integer> f1, final Function<Integer, Integer> f2) {
    return arg -> f1.apply(f2.apply(arg));
  }

  public static void main(String[] args)  {
    System.out.println(compose(triple, square).apply(3));
  }
}
