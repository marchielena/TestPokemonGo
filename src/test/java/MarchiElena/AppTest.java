package MarchiElena;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void Test1(){
        assertEquals("Expected 500",500, App.maxXP(1, 12));
    }

    @Test
    public void Test2(){
        assertEquals("Expected 6500",6500, App.maxXP(13, 144));
    }

    @Test
    public void Test3(){
        assertEquals("Expected 3000",3000, App.maxXP(10, 63));
    }

    @Test
    public void Test4(){
        assertEquals("Expected 500",500, App.maxXP(1, 63));
    }

    @Test
    public void Test5(){
        assertEquals("Expected 2500",2500, App.maxXP(63, 1));
    }

    @Test
    public void Test6(){
        assertEquals("Expected 0",0, App.maxXP(0, 0));
    }
    /*
    Test.describe("Basic Tests", function(){

        Test.assertEquals(pidgeyCalc(63, 1), 2500, 'Expected 2500');
        Test.assertEquals(pidgeyCalc(0, 0), 0, 'Expected 0');
    });*/
}
