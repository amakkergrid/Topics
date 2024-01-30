// do not remove imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define invert method here
    public static <T> T[] invert(T[] t){
        int l = t.length;
        for(int i=0;i<l/2;i++){
            T t1 = t[i];
            T t2 = t[l - i - 1];
            t[i] =  t2;
            t[l - i - 1] = t1;
        }
        return t;
    }
}