import static java.lang.System.out;

public class Chapter2 {


  Function<Integer, Integer> triple = new Function<Integer, Integer>() {
    @Override
    public Integer apply(Integer arg) {
      return arg * 3;
    }
  }; 

  Function<Integer, Integer> square = new Function<Integer, Integer>() {
    @Override
    public Integer apply(Integer arg) {
      return arg * arg;
    }
  };

  Function<Integer, Integer> compose(final Function<Integer, Integer> f1, final Function<Integer, Integer> f2) {
    return new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer arg) {
         return f1.apply(f2.apply(arg));
      }
    };
  }


  //System.out.println(compose(triple, square).apply(3));
  public static void main(String[] args)  {
    System.out.println("dummy");
  }
}
