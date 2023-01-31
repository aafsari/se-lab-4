public class Square implements Shape {

    public int size;

    public Square(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int computeArea(){
        return size * size;
    }
}
