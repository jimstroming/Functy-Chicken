public class Chapter2 {


  Function<Integer, Integer> triple = new Function<Integer, Integer>() {
    @Override
    public Integer apply(Integer arg) {
      return arg * 3;
    }
  }; 

}
