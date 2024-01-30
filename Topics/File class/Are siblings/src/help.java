import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class help {
//    public static String readFile(String file) throws IOException{
//        return new String(Files.readAllBytes(Paths.get(file)));

//    }
    public static void check(File[] dir,List<String>ans) {

        for (File x : dir) {
            if (x.isDirectory()) {
                if (x.list().length == 0) {
                    ans.add(x.getName());
                }
                else{
                    File[] y = x.listFiles();
                    check(y,ans);
                }
            }
        }
    }
    static class Pair{
        File[] f;
        int depth;
        Pair(File[] f, int depth){
            this.f = f;
            this.depth = depth;
        }
    }
    public static void main(String[] args) {
        File f = new File("/Users/amakker/Downloads/basedir 4");
        File[] dir = f.listFiles();
//        List<String> ans = new ArrayList<>();
//        check(dir,ans);
//        ans.forEach(System.out::print);
        String ans="";
        int maxy = -1;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(dir,0));
        while(!st.isEmpty()){
            Pair p = st.pop();
            for(File file : p.f){
                if(file.isFile()){
                    if(maxy < p.depth){
                        maxy = p.depth;
                        ans = file.getName();
                    }
                }
                else{
                    st.push(new Pair(file.listFiles(),p.depth + 1));
                }
            }
        }
        System.out.println(ans+" "+maxy);
    }
}
