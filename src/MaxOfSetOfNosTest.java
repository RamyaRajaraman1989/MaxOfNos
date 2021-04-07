import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MaxOfSetOfNosTest {

    @Test
    public void MaxOfIntTest() {
        MaxOfSetOfNos m = new MaxOfSetOfNos();
        int retValue = m.findMaxInt(30, 20, 10);

        Assertions.assertTrue(retValue == 30);

        retValue = m.findMaxInt(20, 30, 10);

        Assertions.assertTrue(retValue == 30);

        retValue = m.findMaxInt(10, 20, 30);

        Assertions.assertTrue(retValue == 30);

    }

    @Test
    public void MaxOfFloatTest() {
        MaxOfSetOfNos m = new MaxOfSetOfNos();
        float retValue = m.findMaxFloat(30f, 20f, 10f);

        Assertions.assertTrue(retValue == 30f);

        retValue = m.findMaxFloat(20f, 30f, 10f);

        Assertions.assertTrue(retValue == 30f);

        retValue = m.findMaxFloat(10f, 20f, 30f);

        Assertions.assertTrue(retValue == 30f);

    }

    @Test
    public void MaxOfStringTest() {
        MaxOfSetOfNos m = new MaxOfSetOfNos();
        String retValue = m.findMaxString("Peach", "Banana", "Apple");

        Assertions.assertTrue(retValue.equals("Peach"));

        retValue = m.findMaxString("Apple", "Peach", "Banana");

        Assertions.assertTrue(retValue.equals("Peach"));

        retValue = m.findMaxString("Apple", "Banana", "Peach");

        Assertions.assertTrue(retValue.equals("Peach"));

    }

    @Test
    public void testMaxOfVal() {
        MaxOfSetOfNos m = new MaxOfSetOfNos();

        Assertions.assertTrue(m.maxOfVal("Peach", "Banana", "Apple").equals("Peach"));
        Assertions.assertTrue(m.findMaxFloat(10f, 20f, 30f).equals(30f));

    }

    @Test
    public void testMaxOfList(){

        MaxOfSetOfNos m = new MaxOfSetOfNos();

        List<Integer> intList= new ArrayList<>();
        intList.add(2);
        intList.add(1);
        intList.add(3);

        System.out.println("Max value for int is "+m.maxOfList(intList));

        List<String> strList= new ArrayList<>();
        strList.add("Peach");
        strList.add("Mango");
        strList.add("Apple");

        System.out.println("Max value for String is "+m.maxOfList(strList));

        List<Float> floatList= new ArrayList<>();
        floatList.add(31f);
        floatList.add(32f);
        floatList.add(30f);

        System.out.println("Max value for Float is "+m.maxOfList(floatList));

    }
}