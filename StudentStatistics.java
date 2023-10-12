package testingsubject;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author layla & razan
 * This class calculates the mean, mode, and median of a 5 element array for test scores out of 100
 */

public class StudentStatistics {
    
    
    //variables declaration, intialization/assignment
    public double[] data;
    public int maxLength;
    Scanner input=new Scanner(System.in);
    //constructor takes array values from user input
    
   
    public StudentStatistics()
    {
        this.data=data;
        this.maxLength=maxLength;
        
    }
    
    
    public int studentNumber(int maxLength){
        
        System.out.print("Enter number of students:");
        maxLength=input.nextInt();
        
        if(maxLength==0)
        {
            studentNumber();
        }    
            
        while(maxLength<0)
        {        
            System.out.print("Wrong input value, Please enter positive number:");
            maxLength=input.nextInt();
        }
        
        return maxLength;
    }
    
    public String studentNumber(){
        
        throw new NoSuchElementException ("No students entered, thanks for using our application.");
    }
    
    public double[] testScore(){
        
        data=new double[maxLength];
        
        for(int i=0;i<data.length;i++) 
        {
            System.out.print("Enter score number out of 100 for student #"+(i+1)+":");
            data[i]=input.nextDouble();
            
            while(data[i] < 0 || data[i] > 100)
            {
                 System.out.print("Wrong input value, Please enter a score out of 100 for student #"+(i+1)+":");
                 data[i]=input.nextDouble();   
            }   
        }
        
        return data;
        
    }
    
    /**
    * sorts array elemnts from largest to smallest 
    */
    public double[] selectionSort(double data[])
    {  
        //array=data;
        double temp;
        for(int i=0;i<data.length;i++)
        {
            for(int j=i;j<data.length;j++)
            {
                if(data[i]>data[j])
                {
                temp=data[i];
                data[i]=data[j];
                data[j]=temp;
                }
            }
        }
        return data;
    }
    
    /**
    * @return mean of the array
    */
    public double calculateMean(double data[])
    {
        double total=0;
        for (int i=0;i<data.length;i++)
        {
        total=total+data[i];   
        }
        
        return total/data.length;
    }
    
    /**
     * @return mode of array
     */
    public double calculateMode(double data[]) 
    {
        double maxValue = 0, maxCount = 0;
        int i, j;

        for (i = 0; i < data.length; ++i) 
        {
            int count = 0;
            for (j = 0; j < data.length; ++j) 
            {
            if (data[j] == data[i])
                ++count;
            }

            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = data[i];
            }
            //if there in no mode
            if(count==1)
                calculateMode();
        }
        
      return maxValue;
   }
   
   public String calculateMode() 
   {
            return null;
   }
    
    /**
     * 
     * @return median of array
     * 
     * */
  
    public double calculateMedian(double data[])
    {
    
        if(data.length%2==1)
        {
            return data[(data.length+1)/2-1];
        }
        else
        {
            return (data[data.length/2-1]+data[data.length/2])/2;
        }
        
    }
    
}
