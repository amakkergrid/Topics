class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (x,y,z)->{
        if(x!=y&&y!=z&&x!=z)return true;
        else {
            return false;
        }
    };// Write a lambda expression here

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        public boolean test(int a,int b,int c);
    }
}