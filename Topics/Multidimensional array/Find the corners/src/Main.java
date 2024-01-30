class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int l = twoDimArray.length;
        for(int j=0;j<twoDimArray[0].length;j++){
            if(j==0){
                System.out.print(twoDimArray[0][j]);
                System.out.print(" ");
            }
            if (j==twoDimArray[0].length-1) {
                System.out.print(twoDimArray[0][j]);
            }
        }
        System.out.println();
        for(int j=0;j<twoDimArray[l-1].length;j++){
            if(j==0){
                System.out.print(twoDimArray[l-1][j]);
                System.out.print(" ");
            }
            if (j==twoDimArray[l-1].length-1) {
                System.out.print(twoDimArray[l-1][j]);
            }
        }
    }
}