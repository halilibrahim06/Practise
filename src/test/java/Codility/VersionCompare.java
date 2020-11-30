package Codility;

import io.github.bonigarcia.wdm.versions.VersionComparator;

import java.util.regex.Pattern;

public class VersionCompare {

    private static VersionComparator cmp;

    public static void main (String[] args) {

        cmp = new VersionComparator();
//        Test(new String[]{"1.1.2", "1.2", "1.2.0", "1.2.1", "1.12"});
//        Test(new String[]{"1.3", "1.3a", "1.3b", "1.3-SNAPSHOT"});
    }

//    private static void Test(String[] versions) {
//        for (int i = 0; i < versions.length; i++) {
//            for (int j = i; j < versions.length; j++) {
//                Test(versions[i], versions[j]);
//            }
//        }
//
//    }

    public static void Test(String S, String T) {
        int result = cmp.compare(S, T);
        String op = "==";
        if (result < 0) op = "<";
        if (result > 0) op = ">";
        System.out.printf("%s %s %s\n", S, op, T);
    }
}