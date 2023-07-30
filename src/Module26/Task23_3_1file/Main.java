package Module26.Task23_3_1file;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File folder = new File("C:\\Denis\\pics");
        long size = getFolderSize(folder);
        System.out.println((size / 1024 / 1024) + " MB");
    }

    private static long getFolderSize(File folder) {
        File[]files = folder.listFiles();
        long length = 0;
        int count = files.length;
        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            }
            else {
                length += getFolderSize(files[i]);
            }
        }
        return length;
    }
}
