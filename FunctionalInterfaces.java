package LamdaTest;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.*;
public class FunctionalInterfaces {
  public static void main(String[] args)
  {
      Supplier<String> supplier =()->"Lakshmi";
      supplier.get();
      Consumer<String> consumer =(name)->System.out.println(name+"\n");
      consumer.accept(supplier.get());
      Predicate<String> predicate =(name)->name==supplier.get();
      System.out.println(predicate.test("Lakshmi")+"\n");
      Function<String,Integer> function=(name)->name.length();
      System.out.println(function.apply(supplier.get()));

  }

}

