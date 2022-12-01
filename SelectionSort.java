import java.util.*;

class Sorting
{
	public void SelectionSort1(int Arr[])
	{
		int i =0, j = 0, minindex = 0, temp = 0;
		int size = Arr.length;

		for(i = 0; i < size; i++)
		{
			minindex = i;
			for(j = i+1; j < size; j++)
			{
				if(Arr[minindex] > Arr[j])
				{
					minindex = j;
				}
			}
			temp = Arr[i];
			Arr[i] = Arr[minindex];
			Arr[minindex] = temp;
		}
	}
}
class SelectionSort
{
	public static void main(String arr[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();

		int Arr[] = new int[size];
		System.out.println("Enter the elements");
		for(int i = 0; i < Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
		Sorting obj = new Sorting();
		obj.SelectionSort1(Arr);
		
		System.out.println("Data after Sorting");
		for(int i = 0 ; i < Arr.length; i++)
		{
			System.out.println(Arr[i]);
		}
	}
}