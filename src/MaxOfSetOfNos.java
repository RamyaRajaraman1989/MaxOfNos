import java.util.List;

public class MaxOfSetOfNos<T extends Comparable> {

    public MaxOfSetOfNos() {
    }

    public int findMaxInt(Integer a, Integer b, Integer c) {
        int x = 0;
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            x = a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            x = b;
        } else if (c.compareTo(a) > 0 && c.compareTo(b) > 0) {
            x = c;
        }

        printMaximumValue(a,b,c,x);
        return x;
    }


    public Float findMaxFloat(Float a, Float b, Float c) {
        Float x = null;
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            x = a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            x = b;
        } else if (c.compareTo(a) > 0 && c.compareTo(b) > 0) {
            x = c;
        }
        printMaximumValue(a,b,c,x);
        return x;
    }

    public String findMaxString(String a, String b, String c) {
        String x = "";
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            x = a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            x = b;
        } else if (c.compareTo(a) > 0 && c.compareTo(b) > 0) {
            x = c;
        }
        printMaximumValue(a,b,c,x);
        return x;
    }

    public T maxOfVal(T a, T b, T c) {
        T x = null;
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            x = a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            x = b;
        } else if (c.compareTo(a) > 0 && c.compareTo(b) > 0) {
            x = c;
        }
        printMaximumValue(a,b,c,x);
        return x;
    }

    public T maxOfList(List<T> listOfObj) {
        return listOfObj.stream().max((t1, t2) -> t1.compareTo(t2)).get();
    }

    public static <G> void printMaximumValue(G x, G y, G z, G max) {
        System.out.printf("Maximum of %s, %s and %s is %s \n", x, y, z, max);
    }

}
