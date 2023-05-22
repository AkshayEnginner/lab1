import java.util.*;

class akshay
{
    String id;
    int dl,pr;
    
    public akshay(){}
    
    public akshay(String id,int dl,int pr)
    {
        this.id = id;
        this.dl = dl;
        this.pr = pr;
    }
    int max(ArrayList<akshay> array)
    {
        int max = array.get(0).dl;
        for(int i=1;i<array.size();i++)
        
            if(array.get(i).dl>max)
            
                max = array.get(i).dl;
            
        return max;
    }
    
    void printjobsheduling(ArrayList<akshay> array)
    {
        int n = array.size();
        int profit = 0;
        int t = max(array);
        
        Collections.sort(array,(a,b) -> b.pr - a.pr);
        boolean result[] = new boolean[t];
        String job[] = new String[t];
        
        for(int i=0;i<n;i++)
        {
            int index = array.get(i).dl-1;
            
            if(result[index] == false)
            {
                result[index] = true;
                job[index] = array.get(i).id;
                profit += array.get(i).pr;
            }
        }
        for (String jb : job) 
        {
            System.out.print(jb + " ");
        }
        System.out.println();
        System.out.println(profit);
    }
    
    public static void main(String args[])
    {
         ArrayList<akshay> array = new ArrayList<akshay>();
         array.add(new akshay("j1",2,60));
         array.add(new akshay("j2",1,100));
         array.add(new akshay("j3",3,20));
         array.add(new akshay("j4",2,40));
         array.add(new akshay("j5",1,20));
         
        akshay job = new akshay();
        job.printjobsheduling(array);
    }
}