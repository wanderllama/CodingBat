package string2;

/*A sandwich is two pieces of bread with something in between.
Return the string that is between the first and last appearance of "bread"
in the given string, or return the empty string "" if there are not two pieces of bread.*/

public class GetSandwich {
    public String getSandwich(String str) {
        int index1 = str.indexOf("bread");
        int index2 = str.lastIndexOf("bread");
        if(index1 == index2) {
            return "";
        }
        return str.substring(index1 + 5 , index2);
    }
}
