package task1;

public class NumberSummation {

    static int numSum(int num){
        Integer integ = new Integer(num);
        String str = integ.toString();
        char[] strChar = str.toCharArray();
        int sum=0;
        for (char chr : strChar) {
           sum+=Character.getNumericValue(chr);

        }
        return sum;
        
        

    }
}
