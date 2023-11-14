import java.lang.reflect.Array;
import java.util.*;
public class StringSearch {
    public static void main(String[] arg){
        String str1[] = {"Anmol", "Adward", "Aviral"};
        char tar = 'u';
        String str2 = "Anmol";
        String str3 = "Adward";
        System.out.println(search(str2,tar));
        System.out.println(Arrays.toString(str3.toCharArray()));
        System.out.println(Arrays.toString(str1));
    }
    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
