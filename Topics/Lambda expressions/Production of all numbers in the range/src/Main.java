import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (x,y) -> {
        long a = 1;
        for(long i=x;i<=y;i++){
            a*=i;

        }
        return a;
    };// Write your code here
}