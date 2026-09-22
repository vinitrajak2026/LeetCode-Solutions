class Solution {
public int[][] flipAndInvertImage(int[][] image) {

    int n = image.length;    // n = number of rows
 
    for (int i = 0; i < n; i++) { // Har row ko ek-ek karke process karenge( i=0: 1st row)
        int left = 0, right = n - 1;//start &lst idx
 
        while (left <= right) { //tab tak swap+invert
            int temp = image[i][left] ^ 1;
            // image[i][left] ko invert karke temp mein store karo
            //
            // XOR 1 se: 0 ^ 1 = 1;1 ^ 1 = 0
                      // Example:
            // image[i][left] = 0
            // temp = 0 ^ 1 = 1

            image[i][left] = image[i][right] ^ 1;
            // Right element ko invert karke
            // left position par put karo
            //
            // Example:
            // right element = 1
            // 1 ^ 1 = 0
            // So left position = 0

            image[i][right] = temp;
            // Jo left element invert karke temp mein rakha tha,
            // usko right position par put karo
            //
            // This is basically SWAP + INVERT

            left++;
                       right--;
                    }
    }

    return image;   // Final flipped + inverted image return karo
 
}

}
