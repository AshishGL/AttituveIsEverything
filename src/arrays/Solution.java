package arrays;
import java.util.*;

public class Solution {

    public static void main(String [] args) {
        // you can write to stdout for debugging purposes, e.g.

        System.out.println(checkSoftwareVersion("1.2.0","3.2.0"));
        System.out.println(checkSoftwareVersion("1.2","1.0.0"));


    }

    public static int checkSoftwareVersion(String s1, String s2){

     String s11=s1.replace(".","");
     String s22=s2.replace(".","");
     
     int fisrtSoftwareVersion=Integer.parseInt(s11);
     int secondSoftwareVersion=Integer.parseInt(s22);

     if(fisrtSoftwareVersion<secondSoftwareVersion && s1.length()>=s2.length())
      return -1;

    else if(fisrtSoftwareVersion==secondSoftwareVersion)
      return 0;

    else
    return 1;

    }
}
