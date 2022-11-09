package Task3;

public class NameToNumber {

    int nameToNumber(String str) {
        char[] chr = str.toCharArray();
        int num = 0;
        for (char ccc : chr) {
            num += ((int) ccc - 64);
        }
        return num;
    }
}


