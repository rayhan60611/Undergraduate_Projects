import java.util.*;
import java.io.*;
public class Blood 
{
    
    public static void main(String[]args)throws Exception
    {   
        
        ///o positive
        File file=new File("d:/o+.txt");
        if(!file.exists())
        {
          file.createNewFile();
        }
        FileWriter fw1=new FileWriter(file,true);
        BufferedWriter w1=new BufferedWriter(fw1);
        
        
        
        
        ///o negative
        File file2=new File("d:/o-.txt");
        if(!file2.exists())
        {
          file2.createNewFile();
        }
        FileWriter fw2=new FileWriter(file2,true);
        BufferedWriter w2=new BufferedWriter(fw2);
        
        
        
        
        
        ///A+
        File file3=new File("d:/A+.txt");
        if(!file3.exists())
        {
          file3.createNewFile();
        }
        FileWriter fw3=new FileWriter(file3,true);
        BufferedWriter w3=new BufferedWriter(fw3);
        
        
        
        
        
        ///A-
        File file4=new File("d:/A-.txt");
        if(!file4.exists())
        {
          file4.createNewFile();
        }
        FileWriter fw4=new FileWriter(file4,true);
        BufferedWriter w4=new BufferedWriter(fw4);
        
        
        
        
        ///B+
        File file5=new File("d:/B+.txt");
        if(!file5.exists())
        {
          file5.createNewFile();
        }
        FileWriter fw5=new FileWriter(file5,true);
        BufferedWriter w5=new BufferedWriter(fw5);
        
        
        
        
        ///B-
        File file6=new File("d:/B-.txt");
        if(!file6.exists())
        {
          file6.createNewFile();
        }
        FileWriter fw6=new FileWriter(file6,true);
        BufferedWriter w6=new BufferedWriter(fw6);
        
        
        
        ///AB+
        File file7=new File("d:/AB+.txt");
        if(!file7.exists())
        {
          file7.createNewFile();
        }
        FileWriter fw7=new FileWriter(file7,true);
        BufferedWriter w7=new BufferedWriter(fw7);
        
        
        
        ///AB-
        File file8=new File("d:/AB-.txt");
        if(!file8.exists())
        {
          file8.createNewFile();
        }
        FileWriter fw8=new FileWriter(file8,true);
        BufferedWriter w8=new BufferedWriter(fw8);
        
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String accStr; 
       Scanner Scan= new Scanner(System.in);
       
       System.out.println("WELCOME");
       System.out.println("1.Search\n"+"2.Save\n"+"3.Exit");
       System.out.println("Chose an Option From Uphead :");
       
       
       //int search,save;
       int search;
       search=Scan.nextInt();
       while(search!=3)
       {
     
      System.out.println();
       System.out.println();
      ///int save=Scan.nextInt();
       if(search== 1)
          {
            System.out.println("1.Search As Patient\n");
            System.out.println("Chose an Option From Uphead :");
            int patient=Scan.nextInt();
            if(patient==1)
            {
               System.out.println("The Blood Groups Are \n"+"1.O+\n"+"2.O-\n"+"3.A+\n"+"4.A-\n"+"5.B+\n"+"6.B-\n"+"7.AB+\n"+"8.AB-\n");
               //System.out.println();
               System.out.println("Which Blood Group you Need\n ");
               
               ///System.out.println("Please Enter The Blood Group Serial Number\n");
               int op=Scan.nextInt();
               System.out.println();
               if(op==1)
               {
                 File f1=new File("d:/O+.txt");
		Scanner read1=new Scanner(f1);
		while(read1.hasNextLine())
		{
			String Line=read1.nextLine();
			System.out.println(Line);
		}
               }
               else if(op==2)
               {
                   File f2=new File("d:/O-.txt");
		Scanner read2=new Scanner(f2);
		while(read2.hasNextLine())
		{
			String Line=read2.nextLine();
			System.out.println(Line);
		}
               }
               else if(op==3)
               {
                   File f3=new File("d:/A+.txt");
		Scanner read3=new Scanner(f3);
		while(read3.hasNextLine())
		{
			String Line=read3.nextLine();
			System.out.println(Line);
		}
               }
               
               else if(op==4)
               {
                  File f4=new File("d:/A-.txt");
		Scanner read4=new Scanner(f4);
		while(read4.hasNextLine())
		{
			String Line=read4.nextLine();
			System.out.println(Line);
		}
               }
               
               else if(op==5)
              
               {
                 File f5=new File("d:/B+.txt");
		Scanner read5=new Scanner(f5);
		while(read5.hasNextLine())
		{
			String Line=read5.nextLine();
			System.out.println(Line);
		}
               }
               
               else if(op==6)
               {
                  File f6=new File("d:/B-.txt");
		Scanner read6=new Scanner(f6);
		while(read6.hasNextLine())
		{
			String Line=read6.nextLine();
			System.out.println(Line);
		} 
               }
               
               else if(op==7)
               {
                 File f7=new File("d:/AB+.txt");
		Scanner read7=new Scanner(f7);
		while(read7.hasNextLine())
		{
			String Line=read7.nextLine();
			System.out.println(Line);
		}  
               }
               
               else if(op==8)
               {
                 File f8=new File("d:/AB-.txt");
		Scanner read8=new Scanner(f8);
		while(read8.hasNextLine())
		{
			String Line=read8.nextLine();
			System.out.println(Line);
		}  
               }
            }
               
            ///int donner=Scan.nextInt();
            ///int bdonner=Scan.nextInt();
          }
    
       else if(search==2)
       {
           System.out.println("1.Be A Donner\n");
           String name;
           System.out.println("Input Your name :");
           ///ame=Scan.next();
           name = br.readLine();
           //w.write(name);
           //w.newLine();
           String number,bg;
           System.out.println("Input Your Number :");
           number=Scan.next();
           ///w.write(number);
           ///bg=Blood group
           System.out.println("Blood Group");
           
           bg=br.readLine();
           
           switch(bg)
           {
               case "O+":
               case "o+":
               w1.write(name);
               w1.newLine();
               w1.write(number);
               w1.newLine();
               w1.flush();
               w1.close();
                     break;
               
               
               
               case "O-":
               case "o-":
               w2.write(name);
               w2.newLine();
               w2.write(number);
               w2.newLine();
               w2.flush();
               w2.close();
                     break;
                   
               
                   
               case "A+":
               case "a+":
               w3.write(name);
               w3.newLine();
               w3.write(number);
               w3.flush();
               w3.newLine();
               w3.close();
                     break;
               
              
                   
               case "A-":
               case "a-":
               w4.write(name);
               w4.newLine();
               w4.write(number);
               w4.newLine();
               w4.flush();
               w4.close();
                     break;
               
               
               case "B+":
               case "b+":
               w5.write(name);
               w5.newLine();
               w5.write(number);
               w5.newLine();
               w5.flush();
               w5.close();
                     break;
               
                   
               case "B-":
               case "b-":
               w6.write(name);
               w6.newLine();
               w6.write(number);
               w6.newLine();
               w6.flush();
               w6.close();
                     break;   
                   
               
               case "AB+":
               case "ab+":
               w7.write(name);
               w7.newLine();
               w7.write(number);
               w7.newLine();
               w7.flush();
               w7.close();
                     break;
               
                   
               case "AB-":
               case "ab-":
               w8.write(name);
               w8.newLine();
               w8.write(number);
               w8.newLine();
               w8.flush();
               w8.close();
                     break;
              
              
           }
           System.out.println("Details Saved");
           
           
           
                
                   
       }
       
       
        
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("If You Want Do\n**Something**\n Then Do Something");
    System.out.println("Welcome Again");
    System.out.println("1.Search\n"+"2.Save\n"+"3.Exit");
    search=Scan.nextInt();  
   
   
}
 
 
    
   
}
    
    
}
