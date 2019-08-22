public class SimpleOperations {
    public SimpleOperations() {
        System.out.println(">>Initializing the SimpleOperations class...");
    }

    public int addIntegers(int int1, int int2) {
        return int1 + int2;
    }

    public Integer sumArrayOfIntegers(int[] intArray) {
        if (intArray == null) {
            return null;
        }
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    public Integer simpleDotProduct(int[] sequence1, int[] sequence2) {
        if (sequence1 == null || sequence2 == null) {
            return null;
        }
        if (sequence1.length != sequence2.length) {
            return null;
        }
        int result = 0;
        for (int i = 0; i < sequence1.length; i++) {
            result += sequence1[i] * sequence2[i];
        }
        return result;
    }
    public String letsGetIt(String hello) {
        StringBuilder result = new StringBuilder();
        if (hello == null) {
            return  null;
        }
        else{
            for (int i = hello.length() - 1; i >= 0; i--) {
                result.append(hello.charAt(i));
            }
            hello = result.toString();
        }
        return hello;
    }
}
