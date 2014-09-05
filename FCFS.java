import java.util.*;
public class fcfs {
	
	public static void main(String[] args)
    {
    
        
        int btime[]=new int[20];
        int atime[]=new int[20];
        int wtime[]=new int[20];
        float art=0,abt=0,atat=0;
        Scanner sn = new Scanner(System.in);
        System.out.print("\nEnter the number of processes : ");
        int n = sn.nextInt();
        for(int i=0;i<n;i++)
        {
        	System.out.println();
            System.out.print("Enter the burst time of process "+(i)+" : ");
            btime[i]=sn.nextInt();
            System.out.print("Enter the arival time of process "+(i)+" : ");
            atime[i]=sn.nextInt();
        }
        wtime[0]=0;
        for(int g=1;g<n;g++)
        {
        	wtime[g]=wtime[g-1]+btime[g-1];
        }
        for(int g=0;g<=n;g++)
        {
        	art+=(wtime[g]-atime[g]);
        	abt+=btime[g];
        }
        art=art/n;
        abt=abt/n;
        atat=abt+art;
        System.out.println("Average Response time:"+art);
        System.out.println("Average Waiting time:"+art);
        System.out.println("Average Turn Around time:"+atat);
        }
        
        }
