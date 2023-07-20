package Module25.Comparator;

import java.util.Comparator;

class ComparatorByLength implements Comparator<String> {

    @Override
    public int compare(String arg0, String arg1) {
        if (arg0 == null)
            return 1;
        if (arg1 == null)
            return -1;
        return arg0.length() - arg1.length();
    }
}
