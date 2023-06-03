//Project Program

import java.io.*;
public class Airlines
{

static int faresp[]={1800,2000,2000,3500,3500,3500,1000,1000,1000,1000,1800,1800,4000,1000,4000,4000,4000,2900,2900,3500,4500,1500,2500,4000,2500,3500,3500,3900};
static int farejet[]={2000,2000,2000,8000,8000,8000,8000,2000,2000,4000,4000,10000,10000,10000,10000,5000,5000,5000,5000,8000,8000,10000,10000,9000,9000,7000,7000,7000,3000,3000,3500,3500,3500,3500,3500,7000,7000,3000,3000};
static int faredec[]={2000,2000,2000,3000,3000,1500,1500,1500,2500,2500,2500,3000,3000,3000,3000,3500,3500,2500,2500,1000,1000,1000,2500,2500,4000,4000};
static int farein[]={2500,2500,3500,3500,3500,3500,2345,1700,2654,2567,12876,976,976,3879,3879,3879,3979,4500,2350,1200,1322,1247,2523,2437,2555,13350,2445,2500,3100,3250,3500,3500,4100,4000,4000,4000,4100,2800,3200,3170,3000,2900,2700,2500,2600,2500,2500,2500,2500,2500,2469,11999,1788,1777,1000,980,880,1000,1100,3280,3280,3455,2300,2111,2000,1888,1789,1677,11231,1000,1000,2000,2100,2100,2456,2567,2654,2555,2456,2222,2890,2988,2999,2890,2890,2890,2789,2899,2999,2777,1500,1666,1890,2345,2450,2500};
static String name;
static void Run_program() throws IOException 
{
{
System.out.println(" \n\t THIS SOFTWARE IS RELATED TO AEROPLANE RESERVATION AND SCHEDULE");
}
BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
System.out.println(" Select any one of the airline for enquiry");
System.out.println("Indian");
System.out.println("Air deccan");
System.out.println("Spice jet");
System.out.println("Jet airways");
System.out.println("Exit");
System.out.println("Enter the name of selected airline or type exit");
name = buf.readLine();


if(name.equalsIgnoreCase("exit"))
{
System.exit(0);
}
else
{
menu();
choice();
}
}
public static void menu() throws IOException
{
System.out.println(" WELCOME");
System.out.println(" 1. Online Air Ticket Reservation");
System.out.println(" 2. Flight Schedule");
System.out.println(" 3. Careers");
System.out.println(" 4. Contacts of airlines");
System.out.println(" 5. Feedback for the airlines");
System.out.println(" 6. Log out");


}
static void reserve() throws IOException

{
BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
int tot=0, fr=0;
String ch;
do
{
System.out.println(" Welcome to Online booking");
System.out.println(" Departure date(dd-mm-yyyy): ?");
String dt = buf.readLine();
System.out.println(" Number of persons flying??");
String numa = buf.readLine();
int num=Integer.parseInt(numa);
System.out.println(" Select Flight ");
System.out.println(" Here are the flights and fares available on the requested date(s). /nFares are inclusive of all surcharges and taxes. Select your flight(s) of choice and continue. ");
schedule();
System.out.println(" Please enter the serial number of the chosen flight :");
String sn = buf.readLine();
int sno = Integer.parseInt(sn);
if(name.equalsIgnoreCase("Indian")|| name.equalsIgnoreCase("Indian airlines"))
fr=farein[sno-1];
if(name.equalsIgnoreCase("Spice jet"))
fr=faresp[sno-1];
if(name.equalsIgnoreCase("Jet airways"))
 fr=farejet[sno-1];
if(name.equalsIgnoreCase("Air deccan"))
fr=faredec[sno-1];
System.out.println(" The fare of the chosen flight is :"+fr);
for(int y=0; y<num; y++)
tot=tot+fr;
System.out.println(" Type 'Yes' to continue booking....");
ch = buf.readLine();
System.out.println("Your total fare is Rs. " + tot);

Run_program();
}
while(ch.equalsIgnoreCase("Yes"));
Run_program();
}
public static void schedule() throws IOException
{
int i;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
String origin_city[] ={"Delhi","Bangalore","Hyderabad","Chennai","Mumbai"};
if(name.equalsIgnoreCase("indian airlines")||name.equalsIgnoreCase("indian"))
{
String desti_city[] = {"Delhi","Bangalore","Hyderabad","Chennai","Mumbai","Ahemdabad","Goa","Pune","Singapore"};
System.out.println(" The cities from where the Indian airlines originate are :");
for(i=0;i<origin_city.length;i++)
System.out.println(origin_city[i]);
System.out.println(" The destination cities of the Indian airlines originate are :");
for(i=0;i<desti_city.length;i++)
System.out.println(desti_city[i]);
System.out.println();
String schedule[][]={{"Ahemdabad","Bangalore","IC-0109","0710","1035","2500"},
{"Bangalore","Ahmedabad","IC-0610","1700","2030","2500"},
{"Bangalore","Delhi","IC-0404","1950","2220","3500"},
{"Bangalore","Delhi","IC-0505","0930","1200","3500"},
{"Bangalore","Delhi"," IC-0804","0615","0845","3500"},
{"Bangalore","Delhi","IC-0903","1630","1900","3500"},
{"Bangalore","Goa","IC-0919","1120","1415","2345"},
{"Bangalore","Hyderabad","IC-0915","1730","1830","1700"},
{"Banaglore","Mumbai","IC-0106","0835","1005","2654"},
{"Bangalore","Pune","IC-0919","1120","1240","2567"},
{"Bangalore","Singapore","IC-0957","0005","0700","12876"},
{"Chennai","Bangalore","CD-7542", "1830","1915","976"},
{"Chennai","Bangalore","CD-7587","0700","0745","976"},
{"Chennai","Delhi","CD-7478","1000","1435","3879"},
{"Chennai","Delhi","IC-0430","1015","1245","3879"},
{"Chennai","Delhi","IC-0440","0640","0910","3879"},
{"Chennai","Delhi","IC-0539","1810","2040","3979"},
{"Chennai","Delhi","IC-0802","2000","2230","4500"},
{"Chennai","Goa","IC-0575","1355","1655","2350"},
{"Chennai","Hyderabad","IC-0935","1820","1920","1200"},
{"Chennai","Hyderabad","IC-0945","0820","0920","1322"},
{"Chennai","Hyderabad","IC-0947","1440","1540","1247"},
{"Chennai","Mumbai","IC-0672","1515","1655","2523"},
{"Chennai","Mumbai","IC-0969","0945","1130","2437"},
{"Chennai","Mumbai","IC-0971"," 0700","0845","2555"},
{"Chennai","Singapore","IC-0555","0050","0720","13350"},
{"Delhi","Ahmedabad","IC-0861","1815","1940","2445"},
{"Delhi","Ahmedabad","IC-0885","1800","1925","2500"},
{"Delhi","Bangalore","IC-0403","1630","1900","3100"},
{"Delhi","Bangalore","IC-0506","0930","1200","3250"},
{"Delhi","Bangalore","IC-0803","0615","0845","3500"},
{"Delhi","Bangalore","IC-0904","1955","2225","3500"},
{"Delhi","Chennai","CD-7477","1030","1505","4100"},
{"Delhi","Chennai","IC-0429","1010","1230","4000"},
{"Delhi","Chennai","IC-0439","0640","0910","4000"},
{"Delhi","Chennai","IC-0540","2000","2230","4000"},
{"Delhi","Chennai","IC-0801","1645","1915","4100"},
{"Delhi","Goa","IC-0865","1000","1355","2800"},
{"Delhi","Hyderabad","IC-0839","1910","2110","3200"},
{"Delhi","Hyderabad","IC-0840","0625","0825","3170"},
{"Delhi","Hyderabad","IC-0842","0950","1150","3000"},
{"Delhi","Mumbai","IC-0134","1745","2155","2900"},
{"Delhi","Mumbai","IC-0165","0800","0955","2700"},
{"Delhi","Mumbai","IC-0167","0900","1055","2500"},
{"Delhi","Mumbai","IC-0471","1300","1715","2600"},
{"Delhi","Mumbai","IC-0602","2000","2155","2500"},
{"Delhi","Mumbai","IC-0606","1230","1425","2500"},
{"Delhi","Mumbai","IC-0622","0730","1925","2500"},
{"Delhi","Mumbai","IC-0657","0600","0753","2500"},
{"Delhi","Mumbai","IC-0688","0700","0855","2500"},
{"Delhi","Pune","IC-0849","1600","1800","2469"},
{"Delhi","Singapore","IC-0859","0005","0755","11999"},
{"Hyderabad","Ahmedabad","IC-0563","1830","2010","1788"},
{"Hyderabad","Ahmedabad","IC-0981","1750","1930","1777"},
{"Hyderabad","Bangalore","IC-0916","1830","1930","1000"},
{"Hyderabad","Bangalore","IC-0961","1830","1930","980"},
{"Hyderabad","Chennai","IC-0936","0630","0730","880"},
{"Hyderabad","Chennai","IC-0946","1010","1110","1000"},
{"Hyderabad","Chennai","IC-0948","1625","1725","1100"},
{"Hyderabad","Delhi","IC-0840","1915","2115","3280"},
{"Hyderabad","Delhi","IC-0939","0640","0840","3280"},
{"Hyderabad","Delhi","IC-0941","1615","1815","3455"},
{"Hyderabad","Mumbai","CD-7562","1245","1400","2300"},
{"Hyderabad","Mumbai","IC-0618","1600","1715","2111"},
{"Hyderabad","Mumbai","IC-0620","2100","2215","2000"},
{"Hyderabad","Mumbai","IC-0927","0750","0905","1888"},
{"Hyderabad","Pune","IC-0559","2030","2130","1789"},
{"Hyderabad","Pune","IC-0562","1250","1350","1677"},
{"Hyderabad","Singapore","IC-0561","0535","1255","11231"},
{"Mumbai","Ahmedabad","IC-0603","1640","1740","1000"},
{"Mumbai","Ahmedabad","IC-0610","1930","2030","1000"},
{"Mumbai","Bangalore","IC-0105","1930","2030","2000"},
{"Mumbai","Bangalore","IC-0107","1930","2030","2100"},
{"Mumbai","Bangalore","IC-0109","1930","2030","2100"},
{"Mumbai","Bangalore","IC-0609","1930","2030","2456"},
{"Mumbai","Chennai","IC-0173","2030","2245","2567"},
{"Mumbai","Chennai","IC-0572","1810","1955","2654"},
{"Mumbai","Chennai","IC-0671","0940","1125","2555"},
{"Mumbai","Chennai","IC-0970","1145","1330","2456"},
{"Mumbai","Chennai","IC-0972","0705","0850","2222"},
{"Mumbai","Delhi","IC-0166","1300","1455","2890"},
{"Mumbai","Delhi","IC-0168","1800","1955","2988"},
{"Mumbai","Delhi","IC-0472","1515","1920","2999"},
{"Mumbai","Delhi","IC-0601","0600","0755","2890"},
{"Mumbai","Delhi","IC-0621","2045","2240","2890"},
{"Mumbai","Delhi","IC-0658","1700","1855","2890"},
{"Mumbai","Delhi","IC-0687","1230","1425","2789"},
{"Mumbai","Delhi","IC-0809","0800","0955","2999"},
{"Mumbai","Delhi","IC-0864","1000","1155","2777"},
{"Mumbai","Goa","IC-0163","1525","1625","1500"},
{"Mumbai","Goa","IC-0597","1600","1700","1666"},
{"Mumbai","Goa","IC-0663","0520","0620","1890"},
{"Mumbai","Hyderabad","CD-7561","0800","0915","2345"},
{"Mumbai","Hyderabad","IC-0617","1025","1140","2450"},
{"Mumbai","Hyderabad","IC-0619","1905","2020","2500"}};
System.out.println("Enter Flight information whose schedule you want");
System.out.println("From : Origin city ??");
String oc=buf.readLine();
System.out.println("From : Destination city ??");
String dc=buf.readLine();
int c=0,d=0;
for(i=0;i<origin_city.length;i++)
{ 
    if(oc.equalsIgnoreCase(origin_city[i]))
    c++;
    else
    if(dc.equalsIgnoreCase(desti_city[i]))
    d++;
   else
   continue;
    }
boolean flag=false;int k=0;
if(c==0)
   {
   System.out.println("Origin City not listed");
    Run_program();}
        else if(d==0) 
   {
   System.out.println("Destination City not listed");
   Run_program();
   }
      System.out.println("S.No.Origin Destination City Flight No. Departure Arrive Fare");
      for(i=0;i<schedule.length;i++)
     {
     if(oc.equalsIgnoreCase(schedule[i][0])&&dc.equalsIgnoreCase(schedule[i][1]))  
          {
              System.out.println((i+1)+"    " + oc+"    " +dc+"    " +schedule[i][2]+"    " +schedule[i][3]+"    "+schedule[i][4]+"    " +schedule[i][5]);
        flag=true;
        }
    }
if  (flag==false)
System.out.println(" No flight for the cities mentioned by you. SORRY ! ");
}
else if(name.equalsIgnoreCase("spice jet"))
{
String desti_city[] = {"Delhi","Bangalore","Hyderabad","Chennai","Mumbai"};
System.out.println(" The cities from where the Indian airlines originate are :");
for(i=0;i<origin_city.length;i++)
System.out.println(origin_city[i]);
System.out.println(" The destination cities of the Indian airlines originate are :");
for(i=0;i<desti_city.length;i++)
System.out.println(desti_city[i]);
System.out.println();
String schedule[][] ={{"Ahemdabad","Bangalore","Flight100","04:10"," 05:25","1800"},
{"Bangalore","Mumbai","Flight281","09:45","11:25","2000"},
{"Bangalore","Mumbai","Flight525","18:50","20:20","2000"},
{"Bangalore","Delhi","Flight220","09:30","12:00","3500"},
{"Bangalore","Delhi","Flight212","11:30","15:25","3500"},
{"Bangalore","Delhi","Flight224","16:30","19:00","3500"},
{"Bangalore","Hyderabad","Flight220","11:20","14:15","1000"},
{"Bangalore","Hyderabad","Flight528","17:30","18:30","1000"},
{"Banaglore","Chennai","Flight526","08:35","10:05","1000"},
{"Chennai","Bangalore","Flight521","08:35", "09:10","1000"},
{"Chennai","Mumbai","Flight101","00:05","07:00","1800"},
{"Chennai","Mumbai","Flight294","18:30","19:15","1800"},
{"Chennai","Delhi","Flight227","07:00","07:45","4000"},
{"Chennai","Hyderabad","Flight7478","10:00","14:35","1000"},
{"Delhi","Bangalore","Flight0430","10:15","12:45","4000"},
{"Delhi","Bangalore","Flight0440","06:40","09:10","4000"},
{"Delhi","Bangalore","Flight0539","18:10"," 20:40","4000"},
{"Delhi","Mumbai","Flight0802","20:00","22:30","2900"},
{"Delhi","Mumbai","Flight0575","13:55","16:55","2900"},
{"Delhi","Hyderabad","Flight0935","18:20","19:20","3500"},
{"Delhi","Chennai","Flight0945","08:20","09:20","4500"},
{"Hyderabad","Bangalore","Flight0947","14:40","15:40","1500"},
{"Hyderabad","Mumbai","Flight0672","15:15","16:55","2500"},
{"Hyderabad","Delhi","Flight0969","09:45","11:30","4000"},
{"Mumbai","Bangalore","Flight0971","07:00","08:45","2500"},
{"Mumbai","Delhi","Flight0555","00:50","07:20","3500"},
{"Mumbai","Delhi","Flight0861","18:15","19:40","3500"},
{"Mumbai","Chennai","Flight0885","18:00","19:25","3900"}};
System.out.println("Enter Flight information whose schedule you want");
System.out.println("From : Origin city ??");
String oc=buf.readLine();
System.out.println("From : Destination city ??");
String dc=buf.readLine();
int c=0,d=0;
for(int j=0;j<origin_city.length;j++)
{ 
    if(oc.equalsIgnoreCase(origin_city[j]))
    c++;
    else
    if(dc.equalsIgnoreCase(desti_city[j]))
    d++;
    else
    continue;
    }
boolean flag=false;
if(c==0)
   {
   System.out.println("Origin City not listed");
    Run_program();}
        else if(d==0)
   {
   System.out.println("Destination City not listed");
   Run_program();
   }
      System.out.println("S.No.Origin  Destination City  Flight No.Departure Arrive  Fare");
      for(i=0;i<schedule.length;i++)
     {
     if(oc.equalsIgnoreCase(schedule[i][0])&&dc.equalsIgnoreCase(schedule[i][1]))  
          {
     System.out.println((i+1)+"  " + oc+"  " +dc+"  " +schedule[i][2]+"  " +schedule[i][3]+"    "+schedule[i][4]+"  " +schedule[i][5]);
        flag=true;
        }
    }
if  (flag==false)
System.out.println(" No flight for the cities mentioned by you. SORRY ! ");
}
else if(name.equalsIgnoreCase("jet airways"))
{
String desti_city[] = {"Delhi","Bangalore","Hyderabad","Chennai","Mumbai"};
System.out.println(" The cities from where the Indian airlines originate are :");
for(i=0;i<origin_city.length;i++)
System.out.println(origin_city[i]);
System.out.println(" The destination cities of the Indian airlines originate are :");
for(i=0;i<desti_city.length;i++)
System.out.println(desti_city[i]);
System.out.println();
String schedule[][] ={{"Bangalore","Chennai","9W801","07:10","10:35","2000"},
{"Bangalore","Chennai","9W-0610","17:00","20:30","2000"},
{"Bangalore","Chennai","9W-0404","19:50","22:20","2000"},
{"Bangalore","Delhi","9W-0505","09:30","12:00","8000"},
{"Bangalore","Delhi","9W-0804","06:15","08:45","8000"},
{"Bangalore","Delhi","9W-0903","16:30","19:00","8000"},
{"Bangalore","Delhi","9W-0919","11:20","14:15","8000"},
{"Bangalore","Hyderabad","9W-0915","17:30","18:30","2000"},
{"Banaglore","Hyderabad","9W-0106","08:35","10:05","2000"},
{"Bangalore","Mumbai","9W-0919","11:20","12:40","4000"},
{"Bangalore","Mumbai","9W-0957","00:05","07:00","4000"},
{"Chennai","Delhi","CD-7542","18:30","19:15","10000"},
{"Chennai","Delhi","CD-7587","07:00","07:45","10000"},
{"Chennai","Delhi","CD-7478","10:00","14:35","10000"},
{"Chennai","Delhi","IC-0430","10:15","12:45","10000"},
{"Chennai","Mumbai","IC-0672","15:15","16:55","5000"},
{"Chennai","Mumbai","IC-0969","09:45","11:30","5000"},
{"Chennai","Mumbai","IC-0969","02:45","04:30","5000"},
{"Chennai","Mumbai","IC-0971","07:00","08:45","5000"},
{"Delhi","Bangalore","IC-0403","16:30","19:00","8000"},
{"Delhi","Bangalore","IC-0506","09:30","12:00","8000"},
{"Delhi","Chennai","CD-7477","10:30","15:05","10000"},
{"Delhi","Chennai","IC-0429","10:10","12:30","10000"},
{"Delhi","Hyderabad"," IC-0839","19:10","21:10","9000"},
{"Delhi","Hyderabad","IC-0840","06:25","08:25","9000"},
{"Delhi","Mumbai","IC-0134","17:45","21:55","7000"},
{"Delhi","Mumbai","IC-0165","08:00","09:55","7000"},
{"Delhi","Mumbai","IC-0167","09:00","10:55","7000"},
{"Hyderabad","Mumbai","IC-0563","18:30","20:10","3000"},
{"Hyderabad","Mumbai","IC-0981","17:50","19:30","3000"},
{"Mumbai","Bangalore","IC-0610","19:30","20:30","3500"},
{"Mumbai","Bangalore","IC-0610","19:30","20:30","3500"},
{"Mumbai","Bangalore","IC-0610","19:30","20:30","3500"},
{"Mumbai","Chennai","IC-0173","20:30","22:45","3500"},
{"Mumbai","Chennai","IC-0572","18:10","19:55","3500"},
{"Mumbai","Delhi","IC-0166","13:00","14:55","7000"},
{"Mumbai","Delhi","IC-0168","18:00","19:55","7000"},
{"Mumbai","Hyderabad","IC-0617","10:25","11:40","3000"},
{"Mumbai","Hyderabad","IC-0619","19:05","20:20","3000"}};
System.out.println("Enter Flight information whose schedule you want");
System.out.println("From : Origin city ??");
String oc=buf.readLine();
System.out.println("From : Destination city ??");
String dc=buf.readLine();
int c=0,d=0;
for (i=0;i<origin_city.length;i++)
{ 
    if(oc.equalsIgnoreCase(origin_city[i]))
    c++;
    else
    if(dc.equalsIgnoreCase(desti_city[i]))
    d++;
    else
    continue;
    }
boolean flag=false;
if(c==0)
   {
   System.out.println("Origin City not listed");
    Run_program();}
        else if(d==0) 
   {
   System.out.println("Destination City not listed");
   Run_program();
   }
      System.out.println("S.No.Origin Destination City Flight No. Departure Arrive Fare");
      for(i=0;i<schedule.length;i++)
     {
     if(oc.equalsIgnoreCase(schedule[i][0])&&dc.equalsIgnoreCase(schedule[i][1]))  
          {
     System.out.println((i+1)+"   " + oc+"   " +dc+"   " +schedule[i][2]+"   " +schedule[i][3]+"   "+schedule[i][4]+"   " +schedule[i][5]);
        flag=true;
        }
    }
if  (flag==false)
System.out.println(" No flight for the cities mentioned by you. SORRY ! ");
}
else if(name.equalsIgnoreCase("Air deccan"))
{
String desti_city[] ={"Delhi","Bangalore","Hyderabad","Chennai","Mumbai"};
System.out.println(" The cities from where the Indian airlines originate are :");
for(i=0;i<origin_city.length;i++)
System.out.println(origin_city[i]);
System.out.println(" The destination cities of the Indian airlines originate are :");
for(i=0;i<desti_city.length;i++)
System.out.println(desti_city[i]);
System.out.println();
String schedule[][] ={{"Bangalire","Mumbai","AD-0109","07:10","10:35","2000"},
{"Bangalore","Mumbai","AD-0610","17:00","20:30","2000"},
{"Bangalore","Mumbai","AD-0404","19:50","22:20","2000"},
{"Bangalore","Delhi","AD-0505","09:30","12:00","3000"},
{"Bangalore","Delhi","AD-0804","06:15","08:45","3000"},
{"Bangalore","Chennai","AD-0903","16:30","19:00","1500"},
{"Bangalore","Chennai","AD-0919","11:20","14:15","1500"},
{"Bangalore","Chennai","AD-0915","17:30","18:30","1500"},
{"Mumbai","Bangalore","AD-0106","08:35","10:05","2500"},
{"Mumbai","Bangalore","AD-0919","11:20","12:40","2500"},
{"Mumbai","Bangalore","AD-0957","00:05","07:00","2500"},
{"Mumbai","Delhi","AD-7478","10:00","14:35","3000"},
{"Mumbai","Delhi","AD-0430","10:15","12:45","3000"},
{"Mumbai","Chennai","AD-0440","06:40","09:10","3000"},
{"Mumbai","Chennai","AD-0539","18:10","20:40","3000"},
{"Delhi","Bangalore","AD-0403","16:30","19:00","3500"},
{"Delhi","Bangalore","AD-0506","09:30","12:00","3500"},
{"Delhi","Mumbai","AD-0803","06:15","08:45","2500"},
{"Delhi","Mumbai","AD-0904","19:55","22:25","2500"},
{"Chennai","Bangalore","AD-7477","10:30","15:05","1000"},
{"Chennai","Bangalore","AD-0429","10:10","12:30","1000"},
{"Chennai","Bangalore","AD-0459","12:10","14:30","1000"},
{"Chennai","Mumbai","AD-0439","06:40","09:10","2500"},
{"Chennai","Mumbai","AD-0540","20:00","22:30","2500"},
{"Chennai","Delhi","AD-0801","16:45","19:15","4000"},
{"Chennai","Delhi","AD-0865","10:00","13:55","4000"}};
System.out.println("Enter Flight information whose schedule you want");
System.out.println("From : Origin city ??");
String oc=buf.readLine();
System.out.println("From : Destination city ??");
String dc=buf.readLine();
int c=0,d=0;
for (int j=0;j<origin_city.length;j++)
{ 
    if(oc.equalsIgnoreCase(origin_city[j]))
    c++;
    else
    if(dc.equalsIgnoreCase(desti_city[j]))
    d++;
   else
   continue;
    }
boolean flag=false;
if(c==0)
   {
   System.out.println("Origin City not listed");
    Run_program();}
        else if(d==0)
   {
   System.out.println("Destination City not listed");
   Run_program();
   }
      System.out.println("S.No. Origin Destination City Flight No. Departure Arrive Fare");
      for(i=0;i<schedule.length;i++)
     {
     if(oc.equalsIgnoreCase(schedule[i][0])&&dc.equalsIgnoreCase(schedule[i][1]))  
          {
     System.out.println((i+1)+"    " + oc+"    " +dc+"    " +schedule[i][2]+"    " +schedule[i][3]+"     "+schedule[i][4]+"   " +schedule[i][5]);
        flag=true;
        }
    }
   
if  (flag==false)
System.out.println(" No flight for the cities mentioned by you. SORRY ! ");
}
System.out.println("Type 'yes'  If u want to go to Main Menu...");
String c = buf.readLine();
if(c.equalsIgnoreCase("yes"))
Run_program();
        }
        public static void  choice() throws IOException
        {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter choice 1 to 6");
        String ch1 = buf.readLine();
        int ch = Integer.parseInt(ch1);
        switch(ch)
        {
        case 1:reserve();
        break;
        case 2:schedule();
        break;
        case 3:careers();
        break;
        case 4:contact();
        break;
        case 5:feedback();
        break;
        case 6:
        break;
        default: System.out.println("invalid choice...try again");
}
}

static void careers() throws IOException
{
if(name.equalsIgnoreCase("jet airways"))
{
System.out.println("We, at Jet Airways believe that 'People' are our principle asset and success will only come through creating an environment, where 'People' are nurtured and developed.");
System.out.println("To this extent, the organization has continuously focused on recruiting the best people and then developing them to achieve business excellence through empowerment, commitment and due acknowledgement and recognition of their outstanding efforts");
System.out.println("Give your career a flying start. Rise above the mundane and find your place in the sun.Our vast network and wealth of experience give you ample opportunities to blossom professionally and personally When you walk into Jet Airways, we prepare you for life.So if you are interested in exciting, challenging career,Welcome aboard and join Jet airways, India's finest International Airline. ");
}
else if(name.equalsIgnoreCase("air deccan"))
{
System.out.println("To accommodate our expansion plans we are constantly on the look out for young and energetic individuals, who are passionate, bright and brimming with ideas to join our organization and be part of our Vision-empower every indian to fly,");
System.out.println("Copilots Current Indian CPL,FRTO,RTR,IR.Flying Experience: For A-30 A minimumof 25 hrs on ME  aircraft (of which 10hrs could be on an approved ME simulator) is mandatory.");
System.out.println("Also Currency of ME instrument rating is necessary at the time of joining for A-320. For ATR  Preference will be given to ME endorsement holders.");
System.out.println("Email to recruitment.pilots@airdeccen.net, with cc to ershahi09@airdeccen.net");
}
else if(name.equalsIgnoreCase("spice jet"))
{
System.out.println("JOIN US! be a part of the spice jet team because we are going places !");
System.out.println("Aircraft Maint Engg Heavy Jet engineer engineering financial analyst Cabin attendants In flight instructor are the current vaccant positions");
}
else if(name.equalsIgnoreCase("Indian") || name.equalsIgnoreCase("Indian airlines"))
{
System.out.println("Careers in Indian Airlines Recruitment-Engineers. Invitation of Applications for the Recruitment of Contractual A/C Engineer Category IS for DO-228 Aircraft.");
System.out.println("Invitation of Applications for the post of 'Pharmacist' Invitation of Applications for the  recruitment of Aircraft/Plant Technicians' - Southern Region. Invitation of Applications for the post of  Aircraft Technicians - Western Region.");
}
Run_program();
}
static void contact() throws IOException
{
if(name.equalsIgnoreCase("Air deccan"))
{
System.out.println("Contact 24/7 to book tickets:");
System.out.println("\t All India:\t39008888\n\t N.E.States:\t18004257008");
}
else if(name.equalsIgnoreCase("spice jet"))
{
System.out.println("\t Registered Office: \n\t SpiceJet ltd.,\n\t Cargo Complex, \n\t Terminal 1-B, \n\t Indra Ghandhi International Airport, \n\t Domestic Terminal, \n\t New Delhi-37");
System.out.println("\t C.O.: \n\t SpiceJet Ltd.,\n\t 319, Udyog Vihar, Phase IV, \n\t Gurgaon, Haryana-16. \n\t India.");
System.out.println("\t Marketing Department : marketing@spicejet.com");
}
else if(name.equalsIgnoreCase("indian")||name.equalsIgnoreCase("indian airlines"))
{
System.out.println("\t For any queries regarding Reservations,Schedules and Fares.Please dial 1407. \n\t Callers in India using MTNL/BSNL on toll free number 1800 180 1407.");
}
else if(name.equalsIgnoreCase("jet airways"))
{
System.out.println("Customer Relations Jet Airways (India) Ltd., SM center, Andheri- Kurla Road, Andheri(East), Mumbai-59.");
System.out.println("24 Hrs Flight information City Numbers Chennai +91 44 3989333, Mumbai +91 22 3989333, Delhi +91 11 398933");
}
Run_program();
}
static void feedback() throws IOException
{
BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
if(name.equalsIgnoreCase("Indian"))
{
System.out.println("Thank you for flying Indian Airlines. To improve our services\n in a way that truly makes a difference to your flying experience, we need to know your views about your flight.");
System.out.println("Please spare a few minutes to fill this form. Let us assure you that we will not only consider your views but act on them as well.");
System.out.println("______________________________________________________________________________");
System.out.println("Rank the given services on a scale of 1 to 5");
System.out.println("1 being the highest and 5 being the lowest");
System.out.println("RESERVATION");
System.out.println("Enter choice 1 to 5");
String ch1 = buf.readLine();
System.out.println("CHECK-IN");
System.out.println("Enter choice 1 to 5");
String ch2 = buf.readLine();
System.out.println("BAGGAGE");
String ch3 = buf.readLine();
System.out.println("FACILITATION");
System.out.println("Enter choice 1 to 5");
String ch4 = buf.readLine();
System.out.println("Indian Slogan-A WARM EXPERIENCE AND MOTHERLY TREATMENT");
System.out.println("Thanks for your valuable feedback");
}
if(name.equalsIgnoreCase("Spice jet"))
{
System.out.println("Enter your email-id :");
String eid = buf.readLine();
System.out.println("Enter your Name :");
String nma = buf.readLine();
System.out.println("Enter your Mobile number :");
String mob = buf.readLine();
System.out.println("Enter your feedback & suggestion");
String fs = buf.readLine();
System.out.println("Spice jet Slogan- FLYING FOR EVERYONE");
System.out.println(" THANK YOU FOR YOUR FEEDBACK TO Spice Jet");
}
if(name.equalsIgnoreCase("air deccan"))
{
System.out.println("Please enter the type of feedback u r providing....compliment/complaint/suggestion/feedback");
String type = buf.readLine();
System.out.println("Is it about staff/facilities/baggage handling/cabin crew/delays/fares/reservations/in-flight products");
String abt = buf.readLine();
System.out.println("Enter your contact details");
System.out.println("First Name");
String fnm = buf.readLine();
System.out.println("Last Name");
String lnm = buf.readLine();
System.out.println("email-id:");
String id = buf.readLine();
System.out.println("HOW MANY TIMES HAVE YOU FLOWN IN THE AIR-DECCAN?");
String num = buf.readLine();
System.out.println("Air deccan Slogan- THE CHOICE IS SIMPLE");
System.out.println(" THANK YOU FOR YOUR FEEDBACK TO AIR DECCAN");
}
if(name.equalsIgnoreCase("Jet airways"))
{
System.out.println("Enter your contact Details");
System.out.println("First Name ");
String fnm = buf.readLine();
System.out.println("Last Name ");
String lnm = buf.readLine();
System.out.println("Email-ID");
String id = buf.readLine();
System.out.println("HOW MANY TIMES HAVE YOU FLOWN IN THE JET AIRWAYS");
String num = buf.readLine(); 
System.out.println("Enter your feedback & suggestion");
String fdb = buf.readLine();
System.out.println("Jet airways- JOY OF FLYING ON SALE AS A DOMAIN");

System.out.println(" THANK YOU FOR YOUR FEEDBACK TO JET AIRWAYS");
}
Run_program();
}
public void exit()throws IOException
{
 System.out.print("bye bye... ");
 System.out.println("Thanks for visiting ");


Run_program();
}

{
 System.out.println(" \n\t............THANK .................YOU.................");
 }
}
class air
{
public static void main(String args[])throws Exception
{
     Airlines air = new Airlines();
     air.Run_program();
     air.menu();
     air.reserve();
     air.schedule();
     air.choice();
     air.careers();
     air.contact();
     air.feedback();
     air.exit();
}
}
