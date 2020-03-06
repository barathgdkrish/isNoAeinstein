/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleflightseatsallocator;
import java.util.Scanner;
/**
 *
 * @author ALIENWARE
 */
public class Flight{
int passengers,seats; //These variables are private by default

Flight(){

	passengers=0;
	seats=150;
}
void add1passenger(){

	if(passengers<seats)
		++passengers;
	else
		System.out.println("Too many passengers");
}
public boolean HasRoom(Flight f1){

	int total=passengers + f1.passengers;
	return total<=seats;
}

public Flight createNewWithBoth(Flight f2){

Flight newFlight= new Flight();
newFlight.seats=seats;
newFlight.passengers=passengers+f2.passengers;
passengers=0;
f2.passengers=0;

return newFlight;
}



public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Flight lax1=new Flight();
Flight lax2=new Flight();

//Add passengers to both Flights

while(true){
char options;
System.out.println("\nEnter 'a' to add a passenger\n");
System.out.println("Enter 'e' to add a passenger\n:");
System.out.println("Enter options:");
options=sc.next().charAt(0);
if(options=='a'){
	lax1.add1passenger();
}else if(options=='e'){	
     break;
}else{
    System.out.println("Not a valid input");
    continue;
}
Flight lax3 = null;

if(lax1.HasRoom(lax2)){
	lax3= lax1.createNewWithBoth(lax2);
	System.out.println("Passengers combined and put on a single flight");
}
}
System.out.println("Passengers have been organized");
}
   
}
