package ge.edu.btu;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileCounter {
    public static void main(String[] args) {
        File dirToOpen;
        try {
            dirToOpen = new File("C:\\Users\\Gio\\Desktop\\BTU_DOCUMENTS");
            String fullfile = Arrays.toString(dirToOpen.list());
            Pattern pattern = Pattern.compile("btu");
            Matcher matcher = pattern.matcher(fullfile);
            int count = 0;
            while (matcher.find()) count++;
            System.out.println("btu დასახელებით მოიძებნა " + count + " ფაილი");
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        }
    }
}