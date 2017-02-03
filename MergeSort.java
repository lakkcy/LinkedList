public class MergeSort{

	public void merge(int[] arr, int l, int m, int r){
		int n1 = m - l + 1;
		int n2 = r - m;
		int[] temp_arr1 = new int[n1];
		int[] temp_arr2 = new int[n2];

		for(int i = 0; i < n1; i++){
			temp_arr1[i] = arr[l+i];
			//System.out.print(" -- " + temp_arr1[i]);

		}
		//System.out.println();
		for(int j = 0; j < n2; j++){
			temp_arr2[j] = arr[m+j+1];
                        //System.out.print(" -- " + temp_arr2[j]);
		}
		//System.out.println();

		int i=0, j=0, k=l;

		while(i<n1 && j<n2){
			if(temp_arr1[i] <= temp_arr2[j]){
				arr[k] = temp_arr1[i];
				i++;
			}
			else{
				arr[k] = temp_arr2[j];
				j++;
			}
			k++;
		}

		while(i<n1){
			arr[k] = temp_arr1[i];
			k++;
			i++;
		}

		while(j<n2){
			arr[k] = temp_arr2[j];
			k++;
			j++;
		}
		//for(int k1=0; k1 < r; k1++) System.out.print("==> " + arr[k1]);
		//System.out.println();
		//return arr;
	}

	public void mergeSort(int[] arr, int l, int r){
		//System.out.println("R: " + r);
		if(l < r){
			int m = (l+r)/2;
			//System.out.println("M: " + r);
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			merge(arr, l, m, r);
		}
		//return arr;
	}

	public static void main(String[] args){
		MergeSort ms = new MergeSort();
		int[] arr = {3,4,2,5,1,6,9,7,8};
		ms.mergeSort(arr,0,arr.length-1);
		for(int i=0; i<arr.length; i++){
			System.out.println(" - "+arr[i]);
		}
	}

}
