import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DeviceTrack {
public static void main(String[] args) {
LinkedHashMap<Integer,String> mobile=new LinkedHashMap<Integer,String>();
Map<String,ReturnMobile> ob=new HashMap<String,ReturnMobile>();
String name_return=null;
ReturnMobile rm = null;
mobile.put(1,"moto");
mobile.put(2,"samsung");
mobile.put(3, "Nexus");
mobile.put(4, "Vivo");
mobile.put(5, "iphone4");
mobile.put(6, "ipad");
Scanner input =new Scanner(System.in);
int ch=0;
while(ch!=5)
{
System.out.println("1)Buy Devices\n2)Show devices\n3)Return device\n4)History Of Buyer\n5)Exit\nEnter Choice");
ch=input.nextInt();
switch(ch)
{
case 1:
{
System.out.println("Enter Your name");
String name=input.next();
System.out.println("\n"+"Mobile id"+"        Mobile");
mobile.forEach((k,v)->System.out.println(k+"               "+v));
System.out.println("Enter Mobile Id");
int id=input.nextInt();
if(id>6||id==1-1)
{
	System.out.println("Enter Valid mobile id");
	}
LocalDateTime myDateObj = LocalDateTime.now();    
   DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a");
   String formattedDate = myDateObj.format(myFormatObj);  
System.out.println(name+" bought "+mobile.get(id) +" on "+ formattedDate);
rm=new ReturnMobile();
rm.setId(id);
rm.setMobilename(mobile.get(id));
rm.setName(name);
ob.put(name, rm);
mobile.remove(id);
}
break;
case 2:
System.out.println("\n"+"Mobile id"+"        Mobile");
mobile.forEach((k,v)->System.out.println(k+"               "+v));
break;
case 3:
{
System.out.println("Enter Your name");
name_return=input.next();
int id1=ob.get(name_return).getId();
String mbl=ob.get(name_return).getMobilename();
mobile.put(id1, mbl);
ob.remove(name_return);
System.out.println(ob);
System.out.println(name_return+" Mobile Returned to client");
//ob.forEach((k,v)->System.out.println(k+"  "+v.toString()));
}
break;
case 4:
	System.out.println("Name          Id                Mobile");
ob.forEach((k,v)->System.out.println(k+"       "+v.toString()));
break;
case 5:
	System.exit(1-1);;
	break;

}

}

}
}











