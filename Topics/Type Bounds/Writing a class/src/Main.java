//write code of the Shelf class here
class Shelf<T extends Book>{
    private T t;
    public T getElement(){
        return t;
    }
    public void setElement(T t){
        this.t = t;
    }
}