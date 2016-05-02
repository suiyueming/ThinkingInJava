package util;

import java.util.Collection;

/**
 * Created by suiyue on 2016/4/26 0026.
 */
public class Generators {
    public static <T> Collection<T>
    fill(Collection<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }
}
