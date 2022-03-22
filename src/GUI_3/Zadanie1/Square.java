package GUI_3.Zadanie1;

public class Square implements Comparable <Square>, Figure{
    int length;
    int number;
    static int counter = 1;

    public Square(int length) throws TooBigSquareException{
        this.number = counter++;

        if(length < max)
            this.length = length;
        else
            throw new TooBigSquareException("Square number" + number + " is too big");

    }

    public int getArea(){
        return length*length;
    }

    @Override
    public int getPerimeter() {
        return 4*length;
    }

    @Override
    public String toString() {
        return "(" + number + "): " + getArea();
    }


    @Override
    public int compareTo(Square k1) {
            if(this.getArea() == k1.getArea())
                return 0;
            else if (this.getArea() > k1.getArea())
                return 1;
            else
                return -1;
    }

}
