import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void shouldCreateSquare() {
        Square square = new Square(1);
        Assert.assertTrue(true);
    }

    @Test
    public void shouldSetSquareSizeOnCreation() {
        Square square = new Square(1);
        Assert.assertEquals(square.size, 1);
    }
    
    @Test
    public void shouldComputeSquareArea() {
        Square square = new Square(3);
        Assert.assertEquals(square.computeArea(), 9);
    }

    @Test
    public void shouldGetSquareSizeByGetter() {
        Square square = new Square(3);
        Assert.assertEquals(square.getSize(), 3);
    }


    @Test
    public void shouldSetSquareSizeBySetter() {
        Square square = new Square(3);
        square.setSize(10);
        Assert.assertEquals(square.getSize(), 10);
    }

    @Test
    public void shouldComputeSquareAreaAfterSetSize() {
        Square square = new Square(3);
        square.setSize(10);
        Assert.assertEquals(square.computeArea(), 100);
    }


}
