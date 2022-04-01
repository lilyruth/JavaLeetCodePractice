package tech.ruthie;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) return true;
        if (n > flowerbed.length/2 + 1) return false;

        int counter = n;

        int previous = flowerbed[0];

        for (int i = 0; i < flowerbed.length; i++) {
            if (i > 0) previous = flowerbed[i-1];
            int current = flowerbed[i];
            int next;
            if (i+1 == flowerbed.length) next = 0;
            else next = flowerbed[i+1];

            if (previous == 0 && current == 0 && next == 0) {
                flowerbed[i] = 1;
                counter--;
            }
            if (counter == 0) {
                return true;
            }
        }

        return false;
    }
}
