import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMyMethod {

    private MyMethodTask2 myMethodTask2;
    @BeforeEach
    public void init(){
        myMethodTask2 = new MyMethodTask2();
    }

    @Test
    public void test1(){
        boolean refer = true;
        int[] checkArr = new int[] {1,2,4,4,2};
        boolean result = MyMethodTask2.myMethod(checkArr);
        Assertions.assertTrue(result);
    }


}
