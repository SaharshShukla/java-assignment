
public class Largest_Of_No_Using_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {23,434,56,768,345,4343,12132};
int min,max,i=0;
if (arr.length>0) {
 max=arr[0];
	while (i<arr.length) {
	if(arr[i]>max)
	{max=arr[i];
}
	i++;
	}
	System.out.println(max);

		
	}

}
}
