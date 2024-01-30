class Sum {
    public static int sumOfAreas(Shape[] array) {
        // write your code here
        int sum = 0;
        for(Shape i:array){
            if(i.getClass() == Square.class){
                sum += ((Square)i).getSide()*((Square) i).getSide();
            }
            else if(i.getClass() == Rectangle.class){
                sum += ((Rectangle)i).getHeight()*((Rectangle)i).getWidth();
            }
        }
        return sum;
    }
}

//Don't change the code below
class Shape {
}

class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}