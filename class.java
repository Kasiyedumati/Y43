public class Search
{
	public static void main(String args[]) 
	{
        int[] num = {1, 2, 3, 4, 5};
        int search=3;
        boolean found=false;

        for(int n:num) 
	{
            if(n==search)
	    {
                search=true;
                break;
            }
        }

        if(seach)
            System.out.println(search+"is found.");
        else
            System.out.println(search+"is not found.");
    }
}
