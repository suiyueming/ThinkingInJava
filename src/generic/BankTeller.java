package generic;//: generics/BankTeller.java
// A very simple bank teller simulation.

import util.Generators;
import util.Generator;

import java.util.*;

class Customer {
  private static long counter = 1;
  private final long id = counter++;
  private Customer() {}
  public String toString() { return "Customer " + id; }
  public static Generator<Customer> generator() {
    return Customer::new;
  }
}

class Teller {
  private static long counter = 1;
  private final long id = counter++;
  private Teller() {}
  public String toString() { return "Teller " + id; }
  // A single Generator object:
  public static Generator<Teller> generator =
          Teller::new;
}

public class BankTeller {
  public static void serve(Teller t, Customer c) {
    System.out.println(t + " serves " + c);
  }
  public static void main(String[] args) {
    Random rand = new Random(47);
    Queue<Customer> line = new LinkedList<>();
    Generators.fill((Collection)line, Customer.generator(), 15);
    List<Teller> tellers = new ArrayList<>();
    Generators.fill(tellers, Teller.generator, 4);
    for(Customer c : line)
      serve(tellers.get(rand.nextInt(tellers.size())), c);
  }	
}