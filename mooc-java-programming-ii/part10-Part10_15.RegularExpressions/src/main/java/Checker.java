
public class Checker {

    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");

    }

    public boolean allVowels(String string) {
        return string.matches("[a|e|i|o|u]*");
    }

    public boolean timeOfDay(String string) {
        if (string.charAt(0) == '1' || string.charAt(0) == '0') {
            return string.matches("[0-1][0-9]{1}:[0-5][0-9]{1}:[0-5][0-9]{1}");
        } else if (string.charAt(0) == '2') {
            return string.matches("[0-2][0-3]{1}:[0-5][0-9]{1}:[0-5][0-9]{1}");
        }
        return false;
    }

}
