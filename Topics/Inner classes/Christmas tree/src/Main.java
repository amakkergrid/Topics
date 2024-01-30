class ChristmasTree {

    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }

    // create method putTreeTopper()
    public void putTreeTopper(String color){
        TreeTopper t = new TreeTopper(color);
        t.sparkle();
    }

    class TreeTopper {

        private String color;        

        public TreeTopper(String color) {
            this.color = color;
        }

        // create method sparkle()
        public void sparkle(){
            if(ChristmasTree.this.color.equals("green")&&this.color.equals("silver")){
                System.out.println("Sparkling silver tree topper looks stunning with green Christmas tree!");
            }
        }
    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}