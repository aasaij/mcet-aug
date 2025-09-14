public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5,6,7,8,9};
        int[] c = new int[a.length + b.length];
        int i, j, k;
        for (i=j=k=0; i<a.length && j<b.length;) {
            c[k++] =  a[i] < b[j] ? a[i++] : b[j++];
            // if(a[i] < b[j]) c[k++] = a[i++];
            // else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
        for (int data : c)
            System.out.print(data + " ");
    }
}
