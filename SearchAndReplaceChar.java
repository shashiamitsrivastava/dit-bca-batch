public class SearchAndReplaceChar {

    static String searchAndRemove(String str, char search) {
        if (str == "") {
            return "";
        }
        String result = searchAndRemove(str.substring(1), search);
        if (str.charAt(0) == search) {
            return result;
        } else {
            result = str.charAt(0) + result;

        }
        return result;
    }

    static String searchAndReplace(String str, char search, char replace) {
        if (str == "") {
            return "";
        }
        String result = searchAndReplace(str.substring(1), search, replace);
        if (str.charAt(0) == search) {
            result = replace + result;
        } else {
            result = str.charAt(0) + result;

        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Hello";
        char search = 'l';
        char replace = 'x';
        System.out.println(searchAndRemove(str, search));
    }

}
