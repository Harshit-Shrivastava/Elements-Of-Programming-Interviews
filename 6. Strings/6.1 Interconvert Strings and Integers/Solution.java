public class Solution {
    public String intToString (int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
        }

        StringBuilder sb = new StringBuilder();
        int result = x;
        while (result > 0) {
            sb.append((char)('0' + Math.abs(result % 10)));
            result = result/10;
        }
        return s.append(isNegative ? "-" : "").reverse().toString();
    }

    public int stringToInt(String s) {
        return (s.charAt(0) == '-' ? -1 : 1) *
            s.subString(s.charAt(0) == "-1" ? 1 : 0)
            .chars()
            .reduce(0, (runningSum, c) -> runningSum * 10 + c - '0');
    }
}
