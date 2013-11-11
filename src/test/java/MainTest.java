import static org.junit.Assert.*;
import org.junit.Test;
import ua.net.assedoo.Main;

/**
 * Created with IntelliJ IDEA.
 * User: assedoo@gmail.com
 * Project: Area_Fill
 * Date: 11/10/13
 * Time: 4:31 PM
 */
public class MainTest {

    @Test
    public void firstTest() {
        Main main = new Main();
        main.setColumns(new int[]{1,0,1});
        main.perform();

        assertTrue(main.getSum() == 1);
    }

    @Test
    public void secondTest() {
        Main main = new Main();
        main.setColumns(new int[]{1,0,0,1});
        main.perform();

        assertTrue(main.getSum() == 2);
    }

    @Test
    public void thirdTest() {
        Main main = new Main();
        main.setColumns(new int[]{2,0,1});
        main.perform();

        assertTrue(main.getSum() == 1);
    }

    @Test
    public void fourthTest() {
        Main main = new Main();
        main.setColumns(new int[]{2,0,0,1});
        main.perform();

        assertTrue(main.getSum() == 2);
    }

    @Test
    public void fifthTest() {
        Main main = new Main();
        main.setColumns(new int[]{1,0,2});
        main.perform();

        assertTrue(main.getSum() == 1);
    }

    @Test
    public void sixthTest() {
        Main main = new Main();
        main.setColumns(new int[]{1,0,0,2});
        main.perform();

        assertTrue(main.getSum() == 2);
    }

    @Test
    public void seventhTest() {
        Main main = new Main();
        main.setColumns(new int[]{1,0,1,0,1});
        main.perform();

        assertTrue(main.getSum() == 2);
    }

    @Test
    public void eighthTest() {
        Main main = new Main();
        main.setColumns(new int[]{0,1,0,1,0});
        main.perform();

        assertTrue(main.getSum() == 1);
    }

    @Test
    public void ninthTest() {
        Main main = new Main();
        main.setColumns(new int[]{0,1,2,1,0});
        main.perform();

        assertTrue(main.getSum() == 0);
    }


    @Test
    public void tenthTest() {
        Main main = new Main();
        main.setColumns(new int[]{1,2,3,2,1});
        main.perform();

        assertTrue(main.getSum() == 0);
    }


    @Test
    public void eleventhTest() {
        Main main = new Main();
        main.setColumns(new int[]{1,2,2,2,1});
        main.perform();

        assertTrue(main.getSum() == 0);
    }

    @Test
    public void twelfthTest() {
        Main main = new Main();
        main.setColumns(new int[]{1,2,1,2,1});
        main.perform();

        assertTrue(main.getSum() == 1);
    }

    @Test
    public void test13th() {
        Main main = new Main();
        main.setColumns(new int[]{1,2,0,2,1});
        main.perform();

        assertTrue(main.getSum() == 2);
    }

    @Test
    public void test14th() {
        Main main = new Main();
        main.setColumns(new int[]{0,1,2,0,2,1,0});
        main.perform();

        assertTrue(main.getSum() == 2);
    }

    @Test
    public void test15th() {
        Main main = new Main();
        main.setColumns(new int[]{0,1,2,0,2,1,0,1});
        main.perform();

        assertTrue(main.getSum() == 3);
    }

}
