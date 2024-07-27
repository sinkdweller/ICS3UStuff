
//==============================================================================
// Assignment 1
// Evelynn Lu
// Mar 25 2024
// JAVA 2023-12 (4.30.0)
// ==============================================================================
// Program menu with three programs: Factorial Table, Binary conversion, Pi calculation
//==============================================================================

import java.io.*; //allow access to the coding within the io library

public class tribs {//Start of tribs class

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 							//declare/insantiate BufferedReader object

        String programChoice;																				//declare String type programChoice variable, store user program choice
        String programRepeatCondition;																		//declare String type programRepeatCondition variable

        
        do {																								//start of program loop
            System.out.println("Choose the corresponding number to pick your exciting program, or type 'q' to quit. \n");

            System.out.println("1. Binary/Decimal Converter");
            System.out.println("2. Factorial Table");
            System.out.println("3. PI Calculator \n");

            System.out.print("Your pick is:");																//prompt for user program choice 
            programChoice = br.readLine();																	



            switch (programChoice) {																		//choose program based on user choice
                case "1":
            		programRepeatCondition = "";  															//reset condition to repeat the program to nothing
            		do {
            			String convertChoice;               												//Store what type of conversion the user wants to do 
            			
            			
            			//ASK USER FOR PROGRAM CHOICE
            			System.out.println();
            			System.out.println("would you like to convert a decimal to binary or convert binary to decimal?");
            			System.out.println("1.    Convert decimal to binary");
            			System.out.println("2.    Convert binary to decimal");
            			System.out.print("\n enter (1) or (2) to select.");
            			convertChoice = br.readLine();
            			
            			
            			while((!convertChoice.equals("1")) && (!convertChoice.equals("2"))) {               //Loop to get proper user choice 
            				System.out.println("Please enter 1 or 2!!!");									//for program- either 1
            				convertChoice = br.readLine();
            			}
            			
            			switch(convertChoice) { 															//play different program based on convertChoice
            			
            				//CONVERT DECIMAL TO BINARY
            				case "1":
            					int toBinary; //The integer to be converted
            					String decToBin=""; 														//Stores the returned binary number
            					
            					//ASK FOR INTEGER TO BE CONVERTED
            					System.out.println("What number would you like to convert to binary?");
            					
            					while (true) { 																//Loop for valid input
            						try {
            							toBinary = Integer.parseInt(br.readLine()); 						//get user input for toBinary
            							if (toBinary >=0)                          						//break if toBinary is positive
            								break;
            							
            							else 
            								System.out.println("please enter a positive number");
            							
            						}
            						catch(NumberFormatException e) {                              			//catch non-integer error
            							System.out.println("Please enter an integer number (less than 2147483648)");	
            						}
            					}//end of valid input loop
            					
            					
            					//CALCULATE BINARY TO BE RETURNED
            					if(toBinary == 0) {  														//set toBinary to 0 in case user inputs 0
            						decToBin = "0";
            					}
            					
            					while(toBinary !=0) {														//calculate binary if number > 0
            						if(toBinary %2 !=0) {													//if input number divisible by 2, add 1 to the start of
            							decToBin = "1" + decToBin;											//new binary string
            							toBinary -=1;
            						}
            						
            						else {																	//else add 0 to start of binary string
            							decToBin = "0" + decToBin;
            						}
            						toBinary/=2;															//floor divide the input number by 2
            					}//end of while loop
            					
            					//RETURN THE NUMBER IN BINARY
            					System.out.println("Your number in binary is: " + decToBin);				//return the new number in binary!
            					break;
            					
            					
            				//CONVERT BINARY TO DECIMAL;
            				case "2":
            			        int toDecimal; 																// Binary number input by the user
            			        int binToDec = 0;															//store the returned decimal value
            			        int pow = 1;																//store power of 2
            			        int temp;																	//copy of toDecimal

            			        //PROMPT USER FOR BINARY INPUT
                    			System.out.println();
            			        System.out.println("What binary number would you like to convert into decimal?");
            			        
            			        while (true) {																//Validate binary
            			            try {
            			                System.out.print("Enter a positive binary number: (10 digits maximum) ");
            			                toDecimal = Integer.parseInt(br.readLine());
            			                temp = toDecimal;

            			                while (temp > 0) {													//while temp is still there: take last digit of temp (modulo 10)and check if 1 or 0
            			                    if (temp % 10 != 0 && temp % 10 != 1) {							//restart the try loop if a non binary digit is found
            			                        System.out.println("Please enter a proper binary number!! (1s and 0s, positive)");
            			                        break;
            			                    }
            			                    temp /= 10;														//remove last digit of temp. (move on to next digit)
            			                }

            			                if (temp == 0) {													//if the above while loop is completed/all digits are binary: break out of loop
            			                    break;
            			                }

            			            } catch (NumberFormatException e) {										//catch non-integer error
            			                System.out.println("Please enter a positive binary number.(10 digits max)");
            			            }
            			        }
            			        	
            			        	
            			        	
            			        
            			        //CALCULATE! THE..... BINARY!?!?!?
            			        while (toDecimal > 0) {
            			            binToDec += (toDecimal % 10) * pow;										//get the last digit of toDecimal. multiply it by the right power of 2
            			            toDecimal /= 10;														//move on to the second last digit
            			            pow *= 2;																//power of 2 for the next digit + 1!
            			        }
            			        
            			        //RETURN THE.... BINARY?!!
            			        System.out.println("Your number in decimal is: " + binToDec);	
            					break;

            			    }
            					
            			//PROMPT USER FOR PROGRAM REPEAT
            			System.out.println("");
            			System.out.println("Type 'm' to return to the menu, or any other character to repeat the program.");
            			programRepeatCondition = br.readLine();
            		}while(!programRepeatCondition.equals("m")); //end of program loop. 
            		break;
            			//convert binary to decimal;
            				
            			       
                case "2":
            		programRepeatCondition = "";
            		
            		do {															//start of factorial loop
            			String factorialString = "";								//store the 15x14x13x12.... thing. (level 4? :) please ?)
            			int factorial = 1;											//Store the factorial value.
            			System.out.println("factorial------------------------calculating----------------------------value");
            			System.out.println(" ");
            			for(int i=1, space1 = 30, space2=40;						//i for x value of table. space1 for # spaces between i and factorialString. space2 for #Spaces between String and factorial.
            					i<=15;												//program goes up to  15		
            					i++) 												//increment the x value
            			{
            				//MAKING THE FACTORIAL STRING
            				if(i==1) 												//set the first number to 1 on first iteration
            					factorialString = "1";
            					
            				else 
            					factorialString += ("x" + i);						//else append *i to previous factorialString
            		
            				
            				//CALCULATING THE NEW FACTORIAL VALUE
            				factorial *= i;
            				
            				//CALCULATING SPACES FOR STRAIGHT COLUMNS 
            				if(i == 10) 											//space 1:
            					space1-=1;											//once i reaches above 10, remove the additional space taken up by the second digit
            				
            				
            				if (i <= 9) 											//space2:
            					space2 -=2;											//remove the space taken by adding [xi] to factorialString each iteration e.g: x4
            				
            				else 													
            					space2 -=3;											//once i reaches two digits start removing three digits. e.g: x10
            				
            				
            				//PRINT! THE ! TABLE!!!!
            				
            				System.out.print(i + "!=");								//print the x (i) value
            				
            				for (int b = 1; b<=space1; b++)							//print the spaces between i and factorialString
            					System.out.print(" ");	
            					

            				System.out.print(factorialString);						//print the 5x4x3x2x1 factorialString thingamagig
            				
            				for (int b = 1; b<=space2; b++) {						//do the spaces between factorialString and factorial (value)
            					System.out.print(" ");	
            				}
            				
            				System.out.print(factorial);							//print factorial 
            				System.out.println("");			
            			}
            			//? PROGRAM REPEAT PROMPT?????
            			System.out.println("\nType 'm' to return to the menu, or any other character to repeat the program.");
            			programRepeatCondition = br.readLine();
            	}while(!programRepeatCondition.equals("m")); 						//end of factorial loop. yipeee!!!
            		break;															//break once user types m for menu

                case "3":
            		programRepeatCondition = "";
            		
            		do {																									//start of pi loop
            			double Pi = 0;																						//value of pi calculated
            			int term;																							//number of terms
            			int dPlaces;																						//how much decimal place accuracy?
            			
            			//ASK USER FOR PI ACCURACY
            			System.out.println("How many terms do you want to calculate for pi?");
            	     	  
            	     	   while (true) {  																					//Valid input check loop for term
            	                try {
            	                    term = Integer.parseInt(br.readLine()); 												//get term input value
            	                    
            	                    if(term >0) break;																		//break loop if term input is positive
            	                    else System.out.println("Please enter a positive integer above 0!");
            	                    
            	                } catch (NumberFormatException e) { 														// Catch not integer error
            	                    System.out.println("Please enter an integer number (less than 2147483648)");
            	                }
            	            }
            	     	   
            		           
            			//ASK FOR DECIMAL PLACE (dPlace value)
            			System.out.println("how many decimal places would you like to round it to? (1-15)");
            		     	  
            		     	   while (true) { 																				//validate loop for a proper dPlaces value
            		                try {
            		                    dPlaces = Integer.parseInt(br.readLine());
            		            
            		                    if(dPlaces >= 0 &&dPlaces <15)																	//check if decimal place input is a positive number >15.
            		                    	 break;	
            		                    else 
            		                    	 System.out.print("Please enter a positive integer less than 15!");
            		                    
            		                } catch (NumberFormatException e) {
            		                    System.out.println("\"Please enter an integer number less than 15"); 								// Catch not integer error
            		                }
            		            }
            		     	   
            			          
            			           
            		    //TABLE LOOP CODE:
            		    System.out.println("Term:    value:");
            			for(int factor = 1, termNum=1, one=1;           // factor sets the factor for 4 each term. termNum keeps track of the x value on the table. one alternates + and -.
            				termNum <= term;							//loops until termNum reaches term inputed by user.
            				factor +=2, termNum +=1, one*=-1) {			//factor increments to the next odd number each loop. one alternates to the opposite sign. 
            				
            					System.out.print(termNum + "     ");	//calculate and increment the PI value
            					Pi += ((double) 4/factor * one);
            					
            					//ROUND IT TO THE dPlaces VALUE! SEND IT OUT							
            					if(dPlaces ==0) 							//round to whole num if dPlaces is 0
            						System.out.println(Math.round(Pi));											
            					
            					else 										//calculate dPlaces for nonzero dPlace
            						System.out.println((double) Math.round(Pi * Math.pow(10, dPlaces))/(Math.pow(10, dPlaces)));
            					
            					System.out.println("");
            			}
            			
            			System.out.println("\nType 'm' to return to the menu, or any other character to repeat the program."); //prompt user for program repeat
            			programRepeatCondition = br.readLine();
            			
            			
            	}while(!programRepeatCondition.equals("m")); 			//end of pi do-while loop
            		break;												//break if user enters m
            		
            default:													//default of program choice switch case: prompt for proper input
            	if (!programChoice.equals("q"))
                	System.out.println("please enter 1, 2 or 3.");
                break;

            }
        } while (!programChoice.equals("q")); 							//end of program loop- loop condition if programChoice variable = q

        System.out.println("Thanks for playing");						//say bye after program done
    } //end main method
}//end tribs class