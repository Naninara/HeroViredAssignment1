import java.io.BufferedReader;
import java.io.FileReader;
public class Question5 {
    public static void main(String[] args)
    {
        String line = ""; 
        try
        {   int count=0;
            double min=Double.MAX_VALUE;
            double max=Double.MAX_VALUE;
            double Total=0;
            BufferedReader br = new BufferedReader(new FileReader("demoDataBase.csv"));
            while ((line = br.readLine()) != null)
            {
                String[] Transaction = line.split(",");
                double Cost=Double.parseDouble(Transaction[3]);
                Total+=Cost;
                if (Cost>max){
                    max=Cost;
                }
                if(Cost<min){
                    min=Cost;
                }
                count+=1;
            }
            System.out.println("Total number of Transactions (bills) : "+count);
            System.out.println("Total Bill amount  : "+Total);
            System.out.println("Maximum Bill amount : "+max);
            System.out.println("Minimum Bill amount : "+min);
        }
        catch (Exception e)
        {
            System.out.println("Run Time Error");
        }
        }

}

