/*
 * Author - Karan Navin Javali
 * ASURITE - knjavali
 * ASU ID - 1225469752
 */

public class urinals {
    Boolean goodString( String str ) { // checks to see if valid string

        // check if input string is valid
        boolean manPresent = false;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='1') {
                if(manPresent == true) {
                    return false;
                }
                manPresent = true;
            } else if (str.charAt(i) == '0') {
                manPresent = false;
            }
            else {
                return false;
            }
        }
        return true;
    }

    int numberOfUrinals(String str) {
        if(!goodString(str)) {
            return -1;
        }
        int numUrinals = 0;
        boolean prevZero = true;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == '0') {
                if (prevZero) {
                    if((i+1) == str.length() || str.charAt(i+1) == '0'){
                        numUrinals++;
                        prevZero = false;
                    }
                }
                else {
                    prevZero = true;
                }
            }
            else {
                numUrinals++;
                prevZero = false;
            }
        }

        return numUrinals;
    }



}
