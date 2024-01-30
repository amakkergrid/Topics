class Util {
    public static int indexOf(String src, String tgt) {
        // your code here
        if(tgt.length() > src.length()){
            return -1;
        }
        if(tgt.equals(src.substring(0,tgt.length()))){
            return 0;
        }
        int idx = indexOf(src.substring(1),tgt);
        if(idx == -1) return -1;
        return 1 + idx;
    }
}