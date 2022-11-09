package Task2;

public class NumberReversedNoZero {


        static public String reversed(int num){
            String str = num+"";
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();

        }
    }

