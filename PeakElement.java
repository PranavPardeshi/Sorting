import java.util.Scanner;

class DataStructure
{
    public int Peak(int Arr[])
    {
        int start,end,mid;
        start = 0;
        end = Arr.length;
        mid = (start + end) / 2;

        while(start < end)
        {
            if(Arr[mid] < Arr[mid + 1])
            {
                start = mid + 1;
            }
            else
            {
                end = mid;
            }
            mid = (start + end) / 2;
        }
        return start;
    }
}

class PeakElement
{
    public static void main(String arr[])
    {
        int iret = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];
        for(int i = 0;i < Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }
        DataStructure dobj = new DataStructure();
        iret = dobj.Peak(Arr);

        System.out.println("Peak element is "+iret);
    }
}