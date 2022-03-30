package string2;

/*Return true if the string "cat" and "dog" appear the same number of times in the given string.*/

public class CatDog {
    public boolean catDog(String str) {
        str += " ";
        int cat = 0;
        int dog = 0;
        for(int i = 0; i < str.length() - 2; i++) {
            if(str.substring(i , i + 3).equals("cat")) {
                cat++;
            }
            if(str.substring(i , i + 3).equals("dog")) {
                dog++;
            }
        }
        return cat == dog;
    }
}
