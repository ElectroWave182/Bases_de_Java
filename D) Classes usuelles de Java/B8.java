import java.lang.Math;
import java.util.ArrayList;

class B8
{
    public static void main(String[] args)
    {
        ArrayList<Integer> liste = new ArrayList<>();
        for(int i = 0; i < 20; i++)
        {
            liste.add((int)(Math.random() * 40 + 10));
        }
        int maxi = 0;
        for(int ele : liste)
        {
            if(ele > maxi)
            {
                maxi = ele;
            }
        }
        System.out.print(maxi);
    }
}
