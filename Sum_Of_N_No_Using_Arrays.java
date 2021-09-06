
public class Sum_Of_N_No_Using_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int sum=0;
		int i=0;
		do
		{
			sum=arr[i];
			sum=sum+arr[i];
			i++;
}while(i<arr.length);
		System.out.println("The Sum Of Arrays Is "+sum);

	}

}
