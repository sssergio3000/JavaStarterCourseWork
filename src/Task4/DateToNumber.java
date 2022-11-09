package Task4;

public class DateToNumber {
    public int dateToNumber(String date) {
        char[] chrArr = date.toCharArray();
        int sum = 0;
        for (char ccc : chrArr) {
            if ((int) ccc > 47 && (int) ccc < 58) {
                sum += ccc;
            }


        }
        return sum;
    }//dateNumber
}//class
