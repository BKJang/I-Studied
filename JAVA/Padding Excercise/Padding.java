public class Padding {
    public void PrintPad(int height) {
        int k = 0;        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                k += 1;
                String line = String.format("% 4d", k);
                System.out.print(line + " ");
            }
            System.out.println();
        }
    }
}