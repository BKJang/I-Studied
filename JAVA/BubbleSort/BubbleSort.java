public class BubbleSort {
	public void Bubble(int DataArr[], int Length){
		int i=0, j=0, temp=0;
		
		for(i=0; i<Length-1; i++){
			for(j=0; j<Length-(i+1); j++){
				if(DataArr[j]>DataArr[j+1]){
					temp=DataArr[j];
					DataArr[j]=DataArr[j+1];
					DataArr[j+1]=temp;
				}
			}
		}
	}
}
	