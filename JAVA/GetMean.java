/*
def average(list):
함수를 완성해서 매개변수 list의 평균값을 return하도록 만들어 보세요.
어떠한 크기의 list가 와도 평균값을 구할 수 있어야 합니다.
*/
public class GetMean {
    public int getMean(int[] array) {
      int a = 0;
      for(int i=0; i<array.length; i++){
      	a += array[i];
      }
      return a/array.length;
    }
//main
    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}
