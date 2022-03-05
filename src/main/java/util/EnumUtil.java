package util;

public class EnumUtil {

    public static String convertString(String string) {
        String[] strs = string.split("_");
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < strs.length; i++) {
            if(i != 0) {
                builder.append(" ");
            }
            builder.append(strs[i].toUpperCase().substring(0,1)).append(strs[i].toLowerCase().substring(1));
        }
        return builder.toString();
    }
}
