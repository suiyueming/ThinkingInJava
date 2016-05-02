package arrays;//: arrays/ArrayOptions.java
// Initialization & re-assignment of arrays.

import util.Print;

import java.util.Arrays;


public class ArrayOptions {
  public static void main(String[] args) {
    BerylliumSphere[] a; // Local uninitialized variable
    BerylliumSphere[] b = new BerylliumSphere[5];
    Print.print("b: " + Arrays.toString(b));
    BerylliumSphere[] c = new BerylliumSphere[4];
    for(int i = 0; i < c.length; i++)
      if(c[i] == null) // Can test for null reference
        c[i] = new BerylliumSphere();
    BerylliumSphere[] d = { new BerylliumSphere(),
      new BerylliumSphere(), new BerylliumSphere()
    };
    // Dynamic aggregate initialization:
    a = new BerylliumSphere[]{
      new BerylliumSphere(), new BerylliumSphere(),
    };
    // (Trailing comma is optional in both cases)
    Print.print("a.length = " + a.length);
    Print.print("b.length = " + b.length);
    Print.print("c.length = " + c.length);
    Print.print("d.length = " + d.length);
    a = d;
    Print.print("a.length = " + a.length);

    // Arrays of primitives:
    int[] e; // Null reference
    int[] f = new int[5];
    // The primitives inside the array are
    // automatically initialized to zero:
    Print.print("f: " + Arrays.toString(f));
    int[] g = new int[4];
    for(int i = 0; i < g.length; i++)
      g[i] = i*i;
    int[] h = { 11, 47, 93 };
    // Compile error: variable e not initialized:
    //!print("e.length = " + e.length);
    Print.print("f.length = " + f.length);
    Print.print("g.length = " + g.length);
    Print.print("h.length = " + h.length);
    e = h;
    Print.print("e.length = " + e.length);
    e = new int[]{ 1, 2 };
    Print.print("e.length = " + e.length);
  }
} /* Output:
b: [null, null, null, null, null]
a.length = 2
b.length = 5
c.length = 4
d.length = 3
a.length = 3
f: [0, 0, 0, 0, 0]
f.length = 5
g.length = 4
h.length = 3
e.length = 3
e.length = 2
*///:~
