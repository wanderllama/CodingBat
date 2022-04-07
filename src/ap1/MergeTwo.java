package ap1;

/*Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.*/

public class MergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] send = new String[n];
        for(int i = 0 , j = 0 , k = 0; i < send.length; i++) {
            if(a[j].compareTo(b[k]) < 0) {
                send[i] = a[j++];
            } else if(a[j].compareTo(b[k]) > 0) {
                send[i] = b[k++];
            } else {
                send[i] = a[j++];
                k++;
            }
        }
        return send;
    }
}
