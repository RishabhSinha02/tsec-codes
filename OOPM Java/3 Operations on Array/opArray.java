import java.util.*;

class opArray{
	public static void main(String agrs[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Declare the size of an array: ");
		int size = input.nextInt();
		int arr[] = new int[size];
		int ch = 0;
		System.out.println("Enter the elements of array: ");
		for(int i=0; i<= size - 1; i++){
			arr[i] = input.nextInt();
		}
		while(ch != 6){
			System.out.print("\n1.Find element\n 2.Delete element \n 3.Insert element \n 4.Maximum Minimum \n");
			System.out.print("Enter your choice :");
			ch = input.nextInt();
			switch(ch){
				case 1:
					System.out.println("Enter the element to find in the array : ");
					int ele1 = input.nextInt();
					findEle(arr,ele1);
					break;
				case 2:
					System.out.println("Enter the element to be removed from the array : ");
					int ele2 = input.nextInt();
					arr = removeEle(arr,ele2);
					break;
				case 3:
					System.out.println("Enter the element to be inserted and position : ");
					int ele3 = input.nextInt();
					int pos = input.nextInt();
					arr = insertEle(arr,ele3,pos);
					break;
				case 4:
					maxmin(arr);
					break;
				case 5:
					display(arr);	
					break;
			}
		}
	}

	public static void findEle(int arr[], int ele){
		int size = arr.length;
		boolean flag = false;
		for(int i=0; i<= size -1; i++){
			if(arr[i] == ele){
				flag = true;
			}
		}

		if(flag){
			System.out.print("\nArray contains "+ ele);
		}else{
			System.out.print("\nArray doesnot contain "+ ele);
		}
	}

	public static int[] removeEle(int arr[], int ele){
		int size = arr.length;
		boolean flag = false;
		for(int i=0; i<= size -1; i++){
			if(arr[i] == ele){
				flag = true;
				arr[i] = -1;
			}
		}
		if(flag){
			System.out.print("\nElement deleted Succesfully");
		}else{
			System.out.print("\nElement not found" + ele);
		}
		return arr;
	}

	public static int[] insertEle(int arr[], int ele, int pos){
		int size = arr.length;
		if(pos > arr.length){
			System.out.print("\nEnter a valid position");
		}else{
			arr[pos] = ele;
		}
		return arr;
	}
	
	public static void display(int arr[]){
		int size = arr.length;
		for(int i=0; i<= size -1; i++){
			if(arr[i] == -1){
				System.out.print("_");
			}else{
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void maxmin(int arr[]){
		int max = 0;
		int min = 0;
		int size = arr.length;
		for(int i=0; i<= size -1; i++){
			if(arr[i] < min){
				min = arr[i];
			}else if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.print("\nMaximum value :"+ max + " Minimum :" + min);	
	}

}