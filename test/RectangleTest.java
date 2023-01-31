import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void shouldCreateRectangle() {
        Rectangle rectangle = new Rectangle(1, 2);
        Assert.assertTrue(true);
    }

    @Test
    public void shouldSetRectangleWidthOnCreation() {
        Rectangle rectangle = new Rectangle(1, 2);
        Assert.assertEquals(rectangle.width, 1);
    }

    @Test
    public void shouldSetRectangleHeightOnCreation() {
        Rectangle rectangle = new Rectangle(1, 2);
        Assert.assertEquals(rectangle.height, 2);
    }

    @Test
    public void shouldComputeRectangleArea() {
        Rectangle rectangle = new Rectangle(3, 2);
        Assert.assertEquals(rectangle.computeArea(), 6);
    }
}
