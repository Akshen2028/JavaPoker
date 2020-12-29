/**
 * JAVA POKER
 */
import java.util.*;
public class poker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playAgainAs = 0;
		//runs game until the user's do not want to play again
		while (playAgainAs == 0){
			Scanner input = new Scanner(System.in);
			Random rand = new Random();
			System.out.println("WELCOME TO JAVA POKER.");
			System.out.println("Each of you have 1000 dollars to start with.");
			System.out.print("Enter name of first player: ");
			String name1 = input.next();
			System.out.print("Enter name of Second player: ");
			String name2 = input.next();
			String name3 = "";
			int player1 = 1;
			boolean alive1 = true,alive2 = true,alive3 = true;
			int user1Cash = 1000;
			int user2Cash = 1000;
			int user3Cash = 1000;
			int numOfTurns=0;
			int og2Cash = 1000, og1Cash=1000;
			int A =0;
			int gameOver = 0;
			//runs the game rounds 10 times
			for(;A<10;A++){
				String[] cards = {"Ace of Hearts","Two of Hearts", "Three of Hearts", "Four of Hearts","Five of Hearts","Six of Hearts","Seven of Hearts","Eight of Hearts","Nine of Hearts","Ten of Hearts","Jack of Hearts", "Queen of Hearts", "King of Hearts", "Ace of diamonds", "Two of diamonds", "Three of diamonds","Four of diamonds", "Five of diamonds", "Six of diamonds", "Seven of diamonds", "Eight of diamonds", "Nine of diamonds", "Ten of diamonds", "Jack of diamonds", "Queen of diamonds", "King of diamonds","Ace of Spades","Two of Spades","Three of Spades","Four of Spades","Five of Spades","Six of Spades","Seven of Spades","Eight of Spades","Nine of Spades","Ten of Spades","Jack of Spades","Queen of Spades","King of Spades","Ace of Clubs","Two of Clubs","Three of Clubs","Four of Clubs","Five of Clubs","Six of Clubs","Seven of Clubs","Eight of Clubs","Nine of Clubs","Ten of Clubs","Jack of Clubs","Queen of Clubs","King of Clubs"};
				String gameCards[] = DealDeck();
				String rankName1 = "fold", rankName2 = "fold";
				String user1Card1 = gameCards[0];
				String user1Card2 = gameCards[1];
				String user2Card1 = gameCards[2];
				String user2Card2 = gameCards[3];
				String pot1 = gameCards[4];
				String pot2 = gameCards[5];
				String pot3 = gameCards[6];
				String pot4 = gameCards[7];
				String pot5 = gameCards[8];
				int cardValueArray[] = new int[9];
				String[] cardNumArray = new String[9];
				String[] cardSuitArray = new String[9];
				String top = "_______";
				String medium = "|     |";
				String bottom = "|_____|";
				//saves the card value of each card in play
				for (int i = 0;i<9;i++){
					if ((gameCards[i]==cards[0]||gameCards[i]==cards[13]||gameCards[i]==cards[26]||gameCards[i]==cards[39])){
						cardValueArray[i]=1;
						cardNumArray[i] = "|A    |"; 
					}else if ((gameCards[i]==cards[1]||gameCards[i]==cards[14]||gameCards[i]==cards[27]||gameCards[i]==cards[40])){
						cardValueArray[i]=2;
						cardNumArray[i] = "|2    |"; 
					}else if ((gameCards[i]==cards[2]||gameCards[i]==cards[15]||gameCards[i]==cards[28]||gameCards[i]==cards[41])){
						cardValueArray[i]=3;
						cardNumArray[i] = "|3    |"; 
					}else if ((gameCards[i]==cards[3]||gameCards[i]==cards[16]||gameCards[i]==cards[29]||gameCards[i]==cards[42])){
						cardValueArray[i]=4;
						cardNumArray[i] = "|4    |"; 
					}else if ((gameCards[i]==cards[4]||gameCards[i]==cards[17]||gameCards[i]==cards[30]||gameCards[i]==cards[43])){
						cardValueArray[i]=5;
						cardNumArray[i] = "|5    |"; 
					}else if ((gameCards[i]==cards[5]||gameCards[i]==cards[18]||gameCards[i]==cards[31]||gameCards[i]==cards[44])){
						cardValueArray[i]=6;
						cardNumArray[i] = "|6    |"; 
					}else if ((gameCards[i]==cards[6]||gameCards[i]==cards[19]||gameCards[i]==cards[32]||gameCards[i]==cards[45])){
						cardValueArray[i]=7;
						cardNumArray[i] = "|7    |"; 
					}else if ((gameCards[i]==cards[7]||gameCards[i]==cards[20]||gameCards[i]==cards[33]||gameCards[i]==cards[46])){
						cardValueArray[i]=8;
						cardNumArray[i] = "|8    |"; 
					}else if ((gameCards[i]==cards[8]||gameCards[i]==cards[21]||gameCards[i]==cards[34]||gameCards[i]==cards[47])){
						cardValueArray[i]=9;
						cardNumArray[i] = "|9    |"; 
					}else if ((gameCards[i]==cards[9]||gameCards[i]==cards[22]||gameCards[i]==cards[35]||gameCards[i]==cards[48])){
						cardValueArray[i]=10;
						cardNumArray[i] = "|10   |"; 
					}else if ((gameCards[i]==cards[10]||gameCards[i]==cards[23]||gameCards[i]==cards[36]||gameCards[i]==cards[49])){
						cardValueArray[i]=11;
						cardNumArray[i] = "|J    |"; 
					}else if ((gameCards[i]==cards[11]||gameCards[i]==cards[24]||gameCards[i]==cards[37]||gameCards[i]==cards[50])){
						cardValueArray[i]=12;
						cardNumArray[i] = "|Q    |"; 
					}else if ((gameCards[i]==cards[12]||gameCards[i]==cards[25]||gameCards[i]==cards[38]||gameCards[i]==cards[51])){
						cardValueArray[i]=13;
						cardNumArray[i] = "|K    |"; 
					}
				}
				//saves the suit of each card in play
				int suiteValueArray[] = new int[9];
				for (int i = 0;i<9;i++){
					int b = 0;
					for(;b<13;b++){
						if ((gameCards[i]==cards[b])){
							suiteValueArray[i]=1;
							cardSuitArray[i] = "|  ♥  |";
						}
					}
					for(;b<26;b++){
						if ((gameCards[i]==cards[b])){
							suiteValueArray[i]=2;
							cardSuitArray[i] = "|  ♦  |";
						}
					}
					for(;b<39;b++){
						if ((gameCards[i]==cards[b])){
							suiteValueArray[i]=3;
							cardSuitArray[i] = "|  ♠  |";
						}
					}
					for(;b<52;b++){
						if ((gameCards[i]==cards[b])){
							suiteValueArray[i]=4;
							cardSuitArray[i] = "|  ♣  |";
						}
					}
				}
				int cardValueU1C1 = cardValueArray[0];
				int cardValueU1C2 = cardValueArray[1];
				int cardValueU2C1 = cardValueArray[2];
				int cardValueU2C2 = cardValueArray[3];
				int cardValueP1 = cardValueArray[4];
				int cardValueP2 = cardValueArray[5];
				int cardValueP3 = cardValueArray[6];
				int cardValueP4 = cardValueArray[7];
				int cardValueP5 = cardValueArray[8];
				int suitValueU1C1 = suiteValueArray[0];
				int suitValueU1C2 = suiteValueArray[1];
				int suitValueU2C1 = suiteValueArray[2];
				int suitValueU2C2 = suiteValueArray[3];
				int suitValueP1 = suiteValueArray[4];
				int suitValueP2 = suiteValueArray[5];
				int suitValueP3 = suiteValueArray[6];
				int suitValueP4 = suiteValueArray[7];
				int suitValueP5 = suiteValueArray[8];
				String cardFaceU1C1 = cardNumArray[0];
				String cardFaceU1C2 = cardNumArray[1];
				String cardFaceU2C1 = cardNumArray[2];
				String cardFaceU2C2 = cardNumArray[3];
				String cardFaceP1 = cardNumArray[4];
				String cardFaceP2 = cardNumArray[5];
				String cardFaceP3 = cardNumArray[6];
				String cardFaceP4 = cardNumArray[7];
				String cardFaceP5 = cardNumArray[8];
				String cardSuitU1C1 = cardSuitArray[0];
				String cardSuitU1C2 = cardSuitArray[1];
				String cardSuitU2C1 = cardSuitArray[2];
				String cardSuitU2C2 = cardSuitArray[3];
				String cardSuitP1 = cardSuitArray[4];
				String cardSuitP2 = cardSuitArray[5];
				String cardSuitP3 = cardSuitArray[6];
				String cardSuitP4 = cardSuitArray[7];
				String cardSuitP5 = cardSuitArray[8];
				
				int u1BetAmount = 0;
				int u2BetAmount = 0;
				int u3BetAmount = 0;
				int match = 0;
				int totalBet = 0;
				int raise1 = 0, raise2 =0;
				Boolean fold1=false,fold2=false,fold3=false;
				Boolean check1=false,check2=false,check3=false;
				int rank1=0;
				int rank2=0;
				//checks who is player one and displays their turn first
				if (player1 ==1){
					int s = 0;
					while(s<4){
						match=0;
						u1BetAmount = 0;
						u2BetAmount = 0;
						u3BetAmount = 0;
						if (s<4){
							//correct actions are taken based off user's choice 
							int choice1 = name1turn(totalBet,name1,name2,name3,gameCards,alive1, match, user1Cash,raise2,user2Cash,s,pot1,pot2,pot3,pot4,pot5,cardValueU1C1,cardValueU1C2,cardFaceU1C1,cardFaceU1C2,cardFaceU2C1,cardFaceU2C2,cardFaceP1,cardFaceP2,cardFaceP3,cardFaceP4,cardFaceP5,cardSuitU1C1,cardSuitU1C2,cardSuitU2C1,cardSuitU2C2,cardSuitP1,cardSuitP2,cardSuitP3,cardSuitP4,cardSuitP5,top, medium, bottom);
							//takes in users raise amount if they chose to raise
							if (choice1 ==0){
								System.out.print("How much do you want to raise by? You currently have "+user1Cash+" dollars: ");
								raise1 = input.nextInt();
								while (raise1>user1Cash){
									System.out.print("How much do you want to raise by? You currently have "+user1Cash+" dollars: ");
									raise1 = input.nextInt();
								}
								while(raise1>user2Cash){
									System.out.print("The max you may raise is "+user2Cash+", as "+(name2.substring(0,1).toUpperCase()+name2.substring(1))+" only has that much money left.");
									raise1 = input.nextInt();
								}
								u1BetAmount = u2BetAmount+raise1;
								user1Cash -= raise1+raise2;
								match = u1BetAmount;
								totalBet+=raise2+raise1;
							//takes in users bet amount if they chose to bet
							}else if (choice1 ==1){
								System.out.print("How much do you want to bet? You currently have "+user1Cash+" dollars.");
								u1BetAmount = input.nextInt(); 
								while (u1BetAmount>user1Cash||u1BetAmount<0){
									System.out.print("How much do you want to bet? You currently have "+user1Cash+" dollars.");
									u1BetAmount = input.nextInt();
								}
								while (u1BetAmount>user2Cash){
									System.out.print("The max you may bet is "+user2Cash+", as "+(name2.substring(0,1).toUpperCase()+name2.substring(1))+" only has that much money left.");
									u1BetAmount = input.nextInt();
								}
								user1Cash -= u1BetAmount;
								match = u1BetAmount;
								totalBet+=u1BetAmount;
								raise1 = u1BetAmount;
							//makes user fold if they chose to fold
							}else if (choice1 ==2){
								fold1=true;
								s=5;
							//makes check fold if they chose to check (bet no money)
							}else if (choice1 ==3){
								u1BetAmount = 0;
								check1 = true;
							//makes user match the new bet amount 
							}else if (choice1 ==4){
								u1BetAmount +=raise2;
								user1Cash-=raise2;
								totalBet+=raise2;
								if (user1Cash ==0){
									s=10;
								}
							}else{
								s=10;
							}
							for(int z = 0;z<60;z++){
								System.out.println("");
							}
						}
						if (s<=4){
							//correct actions are taken based off user's choice 
							int choice2 = name2turn(totalBet,name1,name2,name3,gameCards,alive2, match, user2Cash,raise1,user1Cash,s,pot1,pot2,pot3,pot4,pot5,cardValueU2C1,cardValueU2C2,cardFaceU1C1,cardFaceU1C2,cardFaceU2C1,cardFaceU2C2,cardFaceP1,cardFaceP2,cardFaceP3,cardFaceP4,cardFaceP5,cardSuitU1C1,cardSuitU1C2,cardSuitU2C1,cardSuitU2C2,cardSuitP1,cardSuitP2,cardSuitP3,cardSuitP4,cardSuitP5,top, medium, bottom);
							if (choice2 ==0){
								System.out.print("How much do you want to raise by? You currently have "+user2Cash+" dollars: ");
								raise2 = input.nextInt();
								while (raise2>user2Cash){
									System.out.print("How much do you want to raise by? You currently have "+user2Cash+" dollars.");
									raise2 = input.nextInt();
								}
								while(raise2>user1Cash){
									System.out.print("The max you may raise is "+user1Cash+", as "+(name1.substring(0,1).toUpperCase()+name1.substring(1))+" only has that much money left.");
									raise2 = input.nextInt();
								}
								u2BetAmount = u1BetAmount+raise2;
								user2Cash -= raise2+raise1;
								match = u2BetAmount;
								totalBet+=raise2+raise1;
							}else if (choice2 ==1){
								System.out.print("How much do you want to bet? You currently have "+user2Cash+" dollars.");
								u2BetAmount = input.nextInt();
								while (u2BetAmount>user2Cash||u2BetAmount<0){
									System.out.print("How much do you want to bet? You currently have "+user2Cash+" dollars.");
									u2BetAmount = input.nextInt();
								}
								while (u2BetAmount>user1Cash){
									System.out.print("The max you may bet is"+user1Cash+", as "+(name1.substring(0,1).toUpperCase()+name1.substring(1))+" only has that much money left.");
									u1BetAmount = input.nextInt();
								}
								user2Cash -= u2BetAmount;
								match = u2BetAmount;
								totalBet+=u2BetAmount;
								raise2 = u2BetAmount;
							}else if (choice2 ==2){
								fold2=true;
								s = 5;
							}else if (choice2 ==3){
								u2BetAmount = 0;
								check2=true;
							}else if (choice2 ==4){
								u2BetAmount +=raise1;
								user2Cash-=raise1;
								totalBet+=raise1;
								if (user2Cash ==0){
									s=10;
								}
							}else{
								s=10;
							}
							for(int z = 0;z<60;z++){
								System.out.println("");
							}
						}
						if (s<=4){
							//both users keep taking turns until the both match the same bet amount
							while(u1BetAmount!=u2BetAmount){
								if (u1BetAmount !=match){
									int choice1 = name1turn(totalBet,name1,name2,name3,gameCards,alive1, match, user1Cash,raise2,user2Cash,s,pot1,pot2,pot3,pot4,pot5,cardValueU1C1,cardValueU1C2,cardFaceU1C1,cardFaceU1C2,cardFaceU2C1,cardFaceU2C2,cardFaceP1,cardFaceP2,cardFaceP3,cardFaceP4,cardFaceP5,cardSuitU1C1,cardSuitU1C2,cardSuitU2C1,cardSuitU2C2,cardSuitP1,cardSuitP2,cardSuitP3,cardSuitP4,cardSuitP5,top, medium, bottom);
									if (choice1 ==0){
										System.out.print("How much do you want to raise by? You currently have "+user1Cash+" dollars: ");
										raise1 = input.nextInt();
										while (raise1>user1Cash){
											System.out.print("How much do you want to raise by? You currently have "+user1Cash+" dollars.");
											raise1 = input.nextInt();
										}
										while(raise1>user2Cash){
											System.out.print("The max you may raise is "+user2Cash+", as "+(name2.substring(0,1).toUpperCase()+name2.substring(1))+" only has that much money left.");
											raise1 = input.nextInt();
										}
										u1BetAmount=u2BetAmount+raise1;
										user1Cash -= raise1+raise2;
										match = u1BetAmount;
										totalBet+=raise2+raise1;
									}else if (choice1 ==1){
										System.out.print("How much do you want to bet? You currently have "+user1Cash+" dollars.");
										u1BetAmount = input.nextInt();
										while (u1BetAmount>user1Cash||u1BetAmount<0){
											System.out.print("How much do you want to bet? You currently have "+user1Cash+" dollars.");
											u1BetAmount = input.nextInt();
										}
										while (u1BetAmount>user2Cash){
											System.out.print("The max you may bet is"+user2Cash+", as "+(name2.substring(0,1).toUpperCase()+name2.substring(1))+" only has that much money left.");
											u1BetAmount = input.nextInt();
										}
										user1Cash -= u1BetAmount;
										match = u1BetAmount;
										totalBet+=u1BetAmount;
										raise1 = u1BetAmount;
									}else if (choice1 ==2){
										fold1=true;
										u1BetAmount=u2BetAmount;
									}else if (choice1 ==3){
										u1BetAmount = 0;
										check1 = true;
									}else if (choice1 ==4){
										u1BetAmount +=raise2;
										user1Cash-=raise2;
										totalBet+=raise2;
										if (user1Cash ==0){
											s=10;
										}
									}else{
										s=10;
									}
									for(int z = 0;z<60;z++){
										System.out.println("");
									}
								}
								if (u2BetAmount !=match){
									int choice2 = name2turn(totalBet,name1,name2,name3,gameCards,alive2, match, user2Cash,raise1,user1Cash,s,pot1,pot2,pot3,pot4,pot5,cardValueU2C1,cardValueU2C2,cardFaceU1C1,cardFaceU1C2,cardFaceU2C1,cardFaceU2C2,cardFaceP1,cardFaceP2,cardFaceP3,cardFaceP4,cardFaceP5,cardSuitU1C1,cardSuitU1C2,cardSuitU2C1,cardSuitU2C2,cardSuitP1,cardSuitP2,cardSuitP3,cardSuitP4,cardSuitP5,top, medium, bottom);
									if (choice2 ==0){
										System.out.print("How much do you want to raise by? You currently have "+user2Cash+" dollars: ");
										raise2 = input.nextInt();
										while (raise2>user2Cash){
											System.out.print("How much do you want to raise by? You currently have "+user2Cash+" dollars.");
											raise2 = input.nextInt();
										}
										while(raise2>user1Cash){
											System.out.print("The max you may raise is "+user1Cash+", as "+(name1.substring(0,1).toUpperCase()+name1.substring(1))+" only has that much money left.");
											raise2 = input.nextInt();
										}
										u2BetAmount=u1BetAmount+raise2;
										user2Cash -= raise2+raise1;;
										match = u2BetAmount;
										totalBet+=raise2+raise1;
									}else if (choice2 ==1){
										System.out.print("How much do you want to bet? You currently have "+user2Cash+" dollars.");;
										u2BetAmount = input.nextInt();
										while (u2BetAmount>user2Cash||u2BetAmount<0){
											System.out.print("How much do you want to bet? You currently have "+user2Cash+" dollars.");
											u2BetAmount = input.nextInt();
										}
										while (u2BetAmount>user1Cash){
											System.out.print("The max you may bet is"+user1Cash+", as "+(name1.substring(0,1).toUpperCase()+name1.substring(1))+" only has that much money left.");
											u1BetAmount = input.nextInt();
										}
										user2Cash -= u2BetAmount;
										match = u2BetAmount;
										totalBet+=u2BetAmount;
										raise2=u2BetAmount;
									}else if (choice2 ==2){
										fold2=true;
										u2BetAmount=u1BetAmount;
									}else if (choice2 ==3){
										u2BetAmount = 0;
										check2 = true;
									}else if (choice2 ==4){
										u2BetAmount +=raise1;
										user2Cash-=raise1;
										totalBet+=raise1;
										if (user2Cash ==0){
											s=10;
										}
									}else{
										s=10;
									}
									for(int z = 0;z<60;z++){
										System.out.println("");
									}
								}
							}
						}
						s++;
						//correct river cards are displayed based off the round, and as long as both users are still in the game
						if (fold1==false &&fold2==false){
							if(s==1){
								System.out.println("\nEveryone may look now.");
								System.out.println("\nRiver: ");
								System.out.println(top+"  "+top+"  "+top);
								System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3);
								System.out.println(medium+"  "+medium+"  "+medium);
								System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3);
								System.out.println(medium+"  "+medium+"  "+medium);
								System.out.println(bottom+"  "+bottom+"  "+bottom);
							}else if (s==2){
								System.out.println("\nEveryone may look now.");
								System.out.println("\nRiver: ");
								System.out.println(top+"  "+top+"  "+top+"  "+top);
								System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3+"  "+cardFaceP4);
								System.out.println(medium+"  "+medium+"  "+medium+"  "+medium);
								System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3+"  "+cardSuitP4);
								System.out.println(medium+"  "+medium+"  "+medium+"  "+medium);
								System.out.println(bottom+"  "+bottom+"  "+bottom+"  "+bottom);
							}else if (s==3||s==11||s==4){
								System.out.println("\nEveryone may look now.");
								System.out.println("\nFinal River: ");
								System.out.println(top+"  "+top+"  "+top+"  "+top+"  "+top);
								System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3+"  "+cardFaceP4+"  "+cardFaceP5);
								System.out.println(medium+"  "+medium+"  "+medium+"  "+medium+"  "+medium);
								System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3+"  "+cardSuitP4+"  "+cardSuitP5);
								System.out.println(medium+"  "+medium+"  "+medium+"  "+medium+"  "+medium);
								System.out.println(bottom+"  "+bottom+"  "+bottom+"  "+bottom+"  "+bottom);
								if (s>3){
									int pairs1[] = {0,0,0,0,0,0,0,0,0};
									int pairs2[] = {0,0,0,0,0,0,0,0,0};
									int suitU1 = 0;
									int suitU2 = 0;
									//calculates the number of alike cards each user has
									for (int i =0;i<9;i++){
										if (i==0||i==1||i==4||i==5||i==6||i==7||i==8){
											if(i==0){
												for(int b = 1;b<9;b++){
													if (b==0||b==1||b==4||b==5||b==6||b==7||b==8){
														if (cardValueArray[i] ==cardValueArray[b]){
															pairs1[0]++;
														}
													}
												}
											}else if (i==1){
												for(int b = 4;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&cardValueArray[0]!=cardValueArray[b]){
														pairs1[1]++;
													}
												}
											}else if (i==4){
												for(int b = 5;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[0]!=cardValueArray[b])&&(cardValueArray[1]!=cardValueArray[b])){
														pairs1[4]++;
													}
												}
											}else if (i==5){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[0]!=cardValueArray[b])&&(cardValueArray[1]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])){
														pairs1[5]++;
													}
												}
											}else if (i==6){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[0]!=cardValueArray[b])&&(cardValueArray[1]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])){
														pairs1[6]++;
													}
												}
											}else if (i==7){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[0]!=cardValueArray[b])&&(cardValueArray[1]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])&&(cardValueArray[6]!=cardValueArray[b])){
														pairs1[7]++;
													}
												}
											}else if (i==8){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[0]!=cardValueArray[b])&&(cardValueArray[1]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])&&(cardValueArray[6]!=cardValueArray[b])&&(cardValueArray[7]!=cardValueArray[b])){
														pairs1[8]++;
													}
												}
											}
										}
									}
									for (int i =0;i<9;i++){
										if (i==2||i==3||i==4||i==5||i==6||i==7||i==8){
											if(i==2){
												for(int b = 3;b<9;b++){
													if (b==2||b==3||b==4||b==5||b==6||b==7||b==8){
														if (cardValueArray[i] ==cardValueArray[b]){
															pairs2[2]++;
														}
													}
												}
											}else if (i==3){
												for(int b = 4;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&cardValueArray[2]!=cardValueArray[b]){
														pairs2[3]++;
													}
												}
											}else if (i==4){
												for(int b = 5;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[2]!=cardValueArray[b])&&(cardValueArray[3]!=cardValueArray[b])){
														pairs2[4]++;
													}
												}
											}else if (i==5){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[2]!=cardValueArray[b])&&(cardValueArray[3]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])){
														pairs2[5]++;
													}
												}
											}else if (i==6){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[2]!=cardValueArray[b])&&(cardValueArray[3]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])){
														pairs2[6]++;
													}
												}
											}else if (i==7){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[2]!=cardValueArray[b])&&(cardValueArray[3]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])&&(cardValueArray[6]!=cardValueArray[b])){
														pairs2[7]++;
													}
												}
											}else if (i==8){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[2]!=cardValueArray[b])&&(cardValueArray[3]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])&&(cardValueArray[6]!=cardValueArray[b])&&(cardValueArray[7]!=cardValueArray[b])){
														pairs2[8]++;
													}
												}
											}
										}
									}
									boolean flush1 = false;
									boolean flush2 = false;
									//checks if each user has at least five cards of the same suit
									for (int i =0;i<9;i++){
										if (i==0||i==1||i==4||i==5||i==6||i==7||i==8){
											for(int b = i+1;b<9;b++){
												if (b==0||b==1||b==4||b==5||b==6||b==7||b==8){
													if (suiteValueArray[i] == suiteValueArray[b]){
														suitU1++;
													}
												}
											}
											if (suitU1>=4){
												i=10;
												flush1 = true;
											}else{
												suitU1 = 0;
											}
										}
									}
									for (int i =0;i<9;i++){
										if (i==2||i==3||i==4||i==5||i==6||i==7||i==8){
											for(int b = i+1;b<9;b++){
												if (b==2||b==3||b==4||b==5||b==6||b==7||b==8){
													if (suiteValueArray[i] == suiteValueArray[b]){
														suitU2++;
													}
												}
											}
											if (suitU2>=4){
												i=10;
												flush2 = true;
											}else{
												suitU2 = 0;
											}
										}
									}
									System.out.println("\n"+name1+"'s cards: ");
									System.out.println(top+"  "+top);
									System.out.println(cardFaceU1C1+"  "+cardFaceU1C2);
									System.out.println(medium+"  "+medium);
									System.out.println(cardSuitU1C1+"  "+cardSuitU1C2);
									System.out.println(medium+"  "+medium);
									System.out.println(bottom+"  "+bottom);
									
									System.out.println("\n"+name2+"'s cards: ");
									System.out.println(top+"  "+top);
									System.out.println(cardFaceU2C1+"  "+cardFaceU2C2);
									System.out.println(medium+"  "+medium);
									System.out.println(cardSuitU2C1+"  "+cardSuitU2C2);
									System.out.println(medium+"  "+medium);
									System.out.println(bottom+"  "+bottom);
									rank1=0;
									rank2=0;
									rank1 = name1rank(pairs1,flush1,rank1);
									rank2 = name2rank(pairs2,flush1,rank2);
									rankName1 = name1rankName(pairs1,flush1,rankName1);
									rankName2 = name2rankName(pairs2,flush1,rankName2);
									if (rank1>rank2){
										fold1=true;
									}else if (rank1<rank2){
										fold2=true;
									}else if (rank1==rank2){
										System.out.println("\n\n\nRESULTS: ");
										System.out.println("Split Pot: ");
										user2Cash=og2Cash;
										user1Cash=og1Cash;
										System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+"'s total is "+user2Cash+" dollars");
										System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+"'s total is "+user1Cash+" dollars");
										s=5;
									}
								}
							}
						}
						//displays the winner and how much they won along with the new totals of both users
						if (fold1 == true){
							if (totalBet-raise2!=0){
								user2Cash +=totalBet;
								System.out.println("\n\n\nRESULTS: ");
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+" won this round with a "+rankName2);
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+" won "+ (user2Cash-og2Cash)+" dollars");
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+"'s total is "+user2Cash+" dollars");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+"'s total is "+user1Cash+" dollars");
								og2Cash=user2Cash;
								og1Cash=user1Cash;
								s=5;
							}else{
								System.out.println("\n\n\nRESULTS: ");
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+" won this round. ");
								System.out.println("No money was won.");
								user2Cash +=totalBet;
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+"'s total is "+user2Cash+" dollars");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+"'s total is "+user1Cash+" dollars");
								og2Cash=user2Cash;
								og1Cash=user1Cash;
							}
						}else if(fold2 == true){
							if (totalBet-raise1!=0){
								user1Cash +=totalBet;
								System.out.println("\n\n\nRESULTS: ");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+" won this round with a "+rankName1);
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+" won "+ (user1Cash-og1Cash)+" dollars");
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+"'s total is "+user2Cash+" dollars");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+"'s total is "+user1Cash+" dollars");
								og2Cash=user2Cash;
								og1Cash=user1Cash;
								s=5;
							}else{
								System.out.println("\n\n\nRESULTS: ");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+" won this round. ");
								System.out.println("No money was won.");
								user1Cash +=totalBet;
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+"'s total is "+user2Cash+" dollars");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+"'s total is "+user1Cash+" dollars");
								og2Cash=user2Cash;
								og1Cash=user1Cash;
							}
						}
						if (user1Cash ==0){
							System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+" WINS!! YOU WON $2000");
							A=11;
							gameOver =1;
						}else if (user2Cash ==0){
							System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+" WINS!! YOU WON $2000");
							A=11;
							gameOver =1;
						}
					}
				}else if(player1==2){
					int s = 0;
					while(s<4){
						match=0;
						u1BetAmount = 0;
						u2BetAmount = 0;
						u3BetAmount = 0;
						if (s<4){
							//correct actions are taken based off user's choice 
							int choice2 = name2turn(totalBet,name1,name2,name3,gameCards,alive2, match, user2Cash,raise1,user1Cash,s,pot1,pot2,pot3,pot4,pot5,cardValueU2C1,cardValueU2C2,cardFaceU1C1,cardFaceU1C2,cardFaceU2C1,cardFaceU2C2,cardFaceP1,cardFaceP2,cardFaceP3,cardFaceP4,cardFaceP5,cardSuitU1C1,cardSuitU1C2,cardSuitU2C1,cardSuitU2C2,cardSuitP1,cardSuitP2,cardSuitP3,cardSuitP4,cardSuitP5,top, medium, bottom);
							if (choice2 ==0){
								System.out.print("How much do you want to raise by? You currently have "+user2Cash+" dollars: ");
								raise2 = input.nextInt();
								while (raise2>user2Cash){
									System.out.print("How much do you want to raise by? You currently have "+user2Cash+" dollars.");
									raise2 = input.nextInt();
								}
								while(raise2>user1Cash){
									System.out.print("The max you may raise is "+user1Cash+", as "+(name1.substring(0,1).toUpperCase()+name1.substring(1))+" only has that much money left.");
									raise2 = input.nextInt();
								}
								u2BetAmount = u1BetAmount+raise2;
								user2Cash -= raise2+raise1;
								match = u2BetAmount;
								totalBet+=raise2+raise1;
							}else if (choice2 ==1){
								System.out.print("How much do you want to bet? You currently have "+user2Cash+" dollars.");
								u2BetAmount = input.nextInt();
								while (u2BetAmount>user2Cash||u2BetAmount<0){
									System.out.print("How much do you want to bet? You currently have "+user2Cash+" dollars.");
									u2BetAmount = input.nextInt();
								}
								while (u2BetAmount>user1Cash){
									System.out.print("The max you may bet is"+user1Cash+", as "+(name1.substring(0,1).toUpperCase()+name1.substring(1))+" only has that much money left.");
									u1BetAmount = input.nextInt();
								}
								user2Cash -= u2BetAmount;
								match = u2BetAmount;
								totalBet+=u2BetAmount;
								raise2 = u2BetAmount;
							}else if (choice2 ==2){
								fold2=true;
								s = 5;
							}else if (choice2 ==3){
								u2BetAmount = 0;
								check2=true;
							}else if (choice2 ==4){
								u2BetAmount +=raise1;
								user2Cash-=raise1;
								totalBet+=raise1;
								if (user1Cash ==0){
									s=10;
								}
							}else{
								s=10;
							}
							for(int z = 0;z<60;z++){
								System.out.println("");
							}
						}
						if (s<=4){
							int choice1 = name1turn(totalBet,name1,name2,name3,gameCards,alive1, match, user1Cash,raise2,user2Cash,s,pot1,pot2,pot3,pot4,pot5,cardValueU1C1,cardValueU1C2,cardFaceU1C1,cardFaceU1C2,cardFaceU2C1,cardFaceU2C2,cardFaceP1,cardFaceP2,cardFaceP3,cardFaceP4,cardFaceP5,cardSuitU1C1,cardSuitU1C2,cardSuitU2C1,cardSuitU2C2,cardSuitP1,cardSuitP2,cardSuitP3,cardSuitP4,cardSuitP5,top, medium, bottom);
							//correct actions are taken based off user's choice 
							if (choice1 ==0){
								System.out.print("How much do you want to raise by? You currently have "+user1Cash+" dollars: ");
								raise1 = input.nextInt();
								while (raise1>user1Cash){
									System.out.print("How much do you want to raise by? You currently have "+user1Cash+" dollars: ");
									raise1 = input.nextInt();
								}
								while(raise1>user2Cash){
									System.out.print("The max you may raise is "+user2Cash+", as "+(name2.substring(0,1).toUpperCase()+name2.substring(1))+" only has that much money left.");
									raise1 = input.nextInt();
								}
								u1BetAmount = u2BetAmount+raise1;
								user1Cash -= raise1+raise2;
								match = u1BetAmount;
								totalBet+=raise2+raise1;
							}else if (choice1 ==1){
								System.out.print("How much do you want to bet? You currently have "+user1Cash+" dollars.");
								u1BetAmount = input.nextInt(); 
								while (u1BetAmount>user1Cash||u1BetAmount<0){
									System.out.print("How much do you want to bet? You currently have "+user1Cash+" dollars.");
									u1BetAmount = input.nextInt();
								}
								while (u1BetAmount>user2Cash){
									System.out.print("The max you may bet is"+user2Cash+", as "+(name2.substring(0,1).toUpperCase()+name2.substring(1))+" only has that much money left.");
									u1BetAmount = input.nextInt();
								}
								user1Cash -= u1BetAmount;
								match = u1BetAmount;
								totalBet+=u1BetAmount;
								raise1 = u1BetAmount;
							}else if (choice1 ==2){
								fold1=true;
								s=5;
							}else if (choice1 ==3){
								u1BetAmount = 0;
								check1 = true;
							}else if (choice1 ==4){
								u1BetAmount +=raise2;
								user1Cash-=raise2;
								totalBet+=raise2;
								if (user1Cash ==0){
									s=10;
								}
							}else{
								s=10;
							}
							for(int z = 0;z<60;z++){
								System.out.println("");
							}
						}
						if (s<=4){
							//users keep on taking turns until both match the same bet
							while(u1BetAmount!=u2BetAmount){
								if (u2BetAmount !=match){
									int choice2 = name2turn(totalBet,name1,name2,name3,gameCards,alive2, match, user2Cash,raise1,user1Cash,s,pot1,pot2,pot3,pot4,pot5,cardValueU2C1,cardValueU2C2,cardFaceU1C1,cardFaceU1C2,cardFaceU2C1,cardFaceU2C2,cardFaceP1,cardFaceP2,cardFaceP3,cardFaceP4,cardFaceP5,cardSuitU1C1,cardSuitU1C2,cardSuitU2C1,cardSuitU2C2,cardSuitP1,cardSuitP2,cardSuitP3,cardSuitP4,cardSuitP5,top, medium, bottom);
									//correct actions are taken based off user's choice 
									if (choice2 ==0){
										System.out.print("How much do you want to raise by? You currently have "+user2Cash+" dollars: ");
										raise2 = input.nextInt();
										while (raise2>user2Cash){
											System.out.print("How much do you want to raise by? You currently have "+user2Cash+" dollars.");
											raise2 = input.nextInt();
										}
										while(raise2>user1Cash){
											System.out.print("The max you may raise is "+user1Cash+", as "+(name1.substring(0,1).toUpperCase()+name1.substring(1))+" only has that much money left.");
											raise2 = input.nextInt();
										}
										u2BetAmount = u1BetAmount+raise2;
										user2Cash -= raise2+raise1;
										match = u2BetAmount;
										totalBet+=raise2+raise1;
									}else if (choice2 ==1){
										System.out.print("How much do you want to bet? You currently have "+user2Cash+" dollars.");
										u2BetAmount = input.nextInt();
										while (u2BetAmount>user2Cash||u2BetAmount<0){
											System.out.print("How much do you want to bet? You currently have "+user2Cash+" dollars.");
											u2BetAmount = input.nextInt();
										}
										while (u2BetAmount>user1Cash){
											System.out.print("The max you may bet is"+user1Cash+", as "+(name1.substring(0,1).toUpperCase()+name1.substring(1))+" only has that much money left.");
											u1BetAmount = input.nextInt();
										}
										user2Cash -= u2BetAmount;
										match = u2BetAmount;
										totalBet+=u2BetAmount;
										raise2 = u2BetAmount;
									}else if (choice2 ==2){
										fold2=true;
										s = 5;
									}else if (choice2 ==3){
										u2BetAmount = 0;
										check2=true;
									}else if (choice2 ==4){
										u2BetAmount +=raise1;
										user2Cash-=raise1;
										totalBet+=raise1;
										if (user1Cash ==0){
											s=10;
										}
									}else{
										s=10;
									}
									for(int z = 0;z<60;z++){
										System.out.println("");
									}
								}
								if (u1BetAmount !=match){
									int choice1 = name1turn(totalBet,name1,name2,name3,gameCards,alive1, match, user1Cash,raise2,user2Cash,s,pot1,pot2,pot3,pot4,pot5,cardValueU1C1,cardValueU1C2,cardFaceU1C1,cardFaceU1C2,cardFaceU2C1,cardFaceU2C2,cardFaceP1,cardFaceP2,cardFaceP3,cardFaceP4,cardFaceP5,cardSuitU1C1,cardSuitU1C2,cardSuitU2C1,cardSuitU2C2,cardSuitP1,cardSuitP2,cardSuitP3,cardSuitP4,cardSuitP5,  top, medium, bottom);
									//correct actions are taken based off user's choice
									if (choice1 ==0){
										System.out.print("How much do you want to raise by? You currently have "+user1Cash+" dollars: ");
										raise1 = input.nextInt();
										while (raise1>user1Cash){
											System.out.print("How much do you want to raise by? You currently have "+user1Cash+" dollars: ");
											raise1 = input.nextInt();
										}
										while(raise1>user2Cash){
											System.out.print("The max you may raise is "+user2Cash+", as "+(name2.substring(0,1).toUpperCase()+name2.substring(1))+" only has that much money left.");
											raise1 = input.nextInt();
										}
										u1BetAmount = u2BetAmount+raise1;
										user1Cash -= raise1+raise2;
										match = u1BetAmount;
										totalBet+=raise2+raise1;
									}else if (choice1 ==1){
										System.out.print("How much do you want to bet? You currently have "+user1Cash+" dollars.");
										u1BetAmount = input.nextInt(); 
										while (u1BetAmount>user1Cash||u1BetAmount<0){
											System.out.print("How much do you want to bet? You currently have "+user1Cash+" dollars.");
											u1BetAmount = input.nextInt();
										}
										while (u1BetAmount>user2Cash){
											System.out.print("The max you may bet is"+user2Cash+", as "+(name2.substring(0,1).toUpperCase()+name2.substring(1))+" only has that much money left.");
											u1BetAmount = input.nextInt();
										}
										user1Cash -= u1BetAmount;
										match = u1BetAmount;
										totalBet+=u1BetAmount;
										raise1 = u1BetAmount;
									}else if (choice1 ==2){
										fold1=true;
										s=5;
									}else if (choice1 ==3){
										u1BetAmount = 0;
										check1 = true;
									}else if (choice1 ==4){
										u1BetAmount +=raise2;
										user1Cash-=raise2;
										totalBet+=raise2;
										if (user1Cash ==0){
											s=10;
										}
									}else{
										s=10;
									}
									for(int z = 0;z<60;z++){
										System.out.println("");
									}
								}
							}
						}
						s++;
						//displays correct river cards as long as both users are still in the game
						if (fold1==false &&fold2==false){
							if(s==1){
								System.out.println("\nEveryone may look now.");
								System.out.println("\nRiver: ");
								System.out.println(top+"  "+top+"  "+top);
								System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3);
								System.out.println(medium+"  "+medium+"  "+medium);
								System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3);
								System.out.println(medium+"  "+medium+"  "+medium);
								System.out.println(bottom+"  "+bottom+"  "+bottom);
							}else if (s==2){
								System.out.println("\nEveryone may look now.");
								System.out.println("\nRiver: ");
								System.out.println(top+"  "+top+"  "+top+"  "+top);
								System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3+"  "+cardFaceP4);
								System.out.println(medium+"  "+medium+"  "+medium+"  "+medium);
								System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3+"  "+cardSuitP4);
								System.out.println(medium+"  "+medium+"  "+medium+"  "+medium);
								System.out.println(bottom+"  "+bottom+"  "+bottom+"  "+bottom);
							}else if (s==3||s==11||s==4){
								System.out.println("\nEveryone may look now.");
								System.out.println("\nFinal River: ");
								System.out.println(top+"  "+top+"  "+top+"  "+top+"  "+top);
								System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3+"  "+cardFaceP4+"  "+cardFaceP5);
								System.out.println(medium+"  "+medium+"  "+medium+"  "+medium+"  "+medium);
								System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3+"  "+cardSuitP4+"  "+cardSuitP5);
								System.out.println(medium+"  "+medium+"  "+medium+"  "+medium+"  "+medium);
								System.out.println(bottom+"  "+bottom+"  "+bottom+"  "+bottom+"  "+bottom);
								if (s>3){
									int pairs1[] = {0,0,0,0,0,0,0,0,0};
									int pairs2[] = {0,0,0,0,0,0,0,0,0};
									int suitU1 = 0;
									int suitU2 = 0;
									//calculates how many alike cards each user has
									for (int i =0;i<9;i++){
										if (i==0||i==1||i==4||i==5||i==6||i==7||i==8){
											if(i==0){
												for(int b = 1;b<9;b++){
													if (b==0||b==1||b==4||b==5||b==6||b==7||b==8){
														if (cardValueArray[i] ==cardValueArray[b]){
															pairs1[0]++;
														}
													}
												}
											}else if (i==1){
												for(int b = 4;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&cardValueArray[0]!=cardValueArray[b]){
														pairs1[1]++;
													}
												}
											}else if (i==4){
												for(int b = 5;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[0]!=cardValueArray[b])&&(cardValueArray[1]!=cardValueArray[b])){
														pairs1[4]++;
													}
												}
											}else if (i==5){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[0]!=cardValueArray[b])&&(cardValueArray[1]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])){
														pairs1[5]++;
													}
												}
											}else if (i==6){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[0]!=cardValueArray[b])&&(cardValueArray[1]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])){
														pairs1[6]++;
													}
												}
											}else if (i==7){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[0]!=cardValueArray[b])&&(cardValueArray[1]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])&&(cardValueArray[6]!=cardValueArray[b])){
														pairs1[7]++;
													}
												}
											}else if (i==8){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[0]!=cardValueArray[b])&&(cardValueArray[1]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])&&(cardValueArray[6]!=cardValueArray[b])&&(cardValueArray[7]!=cardValueArray[b])){
														pairs1[8]++;
													}
												}
											}
										}
									}
									for (int i =0;i<9;i++){
										if (i==2||i==3||i==4||i==5||i==6||i==7||i==8){
											if(i==2){
												for(int b = 3;b<9;b++){
													if (b==2||b==3||b==4||b==5||b==6||b==7||b==8){
														if (cardValueArray[i] ==cardValueArray[b]){
															pairs2[2]++;
														}
													}
												}
											}else if (i==3){
												for(int b = 4;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&cardValueArray[2]!=cardValueArray[b]){
														pairs2[3]++;
													}
												}
											}else if (i==4){
												for(int b = 5;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[2]!=cardValueArray[b])&&(cardValueArray[3]!=cardValueArray[b])){
														pairs2[4]++;
													}
												}
											}else if (i==5){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[2]!=cardValueArray[b])&&(cardValueArray[3]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])){
														pairs2[5]++;
													}
												}
											}else if (i==6){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[2]!=cardValueArray[b])&&(cardValueArray[3]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])){
														pairs2[6]++;
													}
												}
											}else if (i==7){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[2]!=cardValueArray[b])&&(cardValueArray[3]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])&&(cardValueArray[6]!=cardValueArray[b])){
														pairs2[7]++;
													}
												}
											}else if (i==8){
												for(int b = i+1;b<9;b++){
													if ((cardValueArray[i] ==cardValueArray[b])&&(cardValueArray[2]!=cardValueArray[b])&&(cardValueArray[3]!=cardValueArray[b])&&(cardValueArray[4]!=cardValueArray[b])&&(cardValueArray[5]!=cardValueArray[b])&&(cardValueArray[6]!=cardValueArray[b])&&(cardValueArray[7]!=cardValueArray[b])){
														pairs2[8]++;
													}
												}
											}
										}
									}
									boolean flush1 = false;
									boolean flush2 = false;
									//checks if user has at least five cards with the same suit
									for (int i =0;i<9;i++){
										if (i==0||i==1||i==4||i==5||i==6||i==7||i==8){
											for(int b = i+1;b<9;b++){
												if (b==0||b==1||b==4||b==5||b==6||b==7||b==8){
													if (suiteValueArray[i] == suiteValueArray[b]){
														suitU1++;
													}
												}
											}
											if (suitU1>=4){
												i=10;
												flush1 = true;
											}else{
												suitU1 = 0;
											}
										}
									}
									for (int i =0;i<9;i++){
										if (i==2||i==3||i==4||i==5||i==6||i==7||i==8){
											for(int b = i+1;b<9;b++){
												if (b==2||b==3||b==4||b==5||b==6||b==7||b==8){
													if (suiteValueArray[i] == suiteValueArray[b]){
														suitU2++;
													}
												}
											}
											if (suitU2>=4){
												i=10;
												flush2 = true;
											}else{
												suitU2 = 0;
											}
										}
									}
									System.out.println("\n"+name2+"'s cards: ");
									System.out.println(top+"  "+top);
									System.out.println(cardFaceU2C1+"  "+cardFaceU2C2);
									System.out.println(medium+"  "+medium);
									System.out.println(cardSuitU2C1+"  "+cardSuitU2C2);
									System.out.println(medium+"  "+medium);
									System.out.println(bottom+"  "+bottom);
									
									System.out.println("\n"+name1+"'s cards: ");
									System.out.println(top+"  "+top);
									System.out.println(cardFaceU1C1+"  "+cardFaceU1C2);
									System.out.println(medium+"  "+medium);
									System.out.println(cardSuitU1C1+"  "+cardSuitU1C2);
									System.out.println(medium+"  "+medium);
									System.out.println(bottom+"  "+bottom);
									rank1=0;
									rank2=0;
									rank1 = name1rank(pairs1,flush1,rank1);
									rank2 = name2rank(pairs2,flush1,rank2);
									rankName1 = name1rankName(pairs1,flush1,rankName1);
									rankName2 = name2rankName(pairs2,flush1,rankName2);
									//checks to see who has a better rank
									if (rank1>rank2){
										fold1=true;
									}else if (rank1<rank2){
										fold2=true;
									}else if (rank1==rank2){
										System.out.println("\n\n\nRESULTS: ");
										System.out.println("Split Pot: ");
										user2Cash=og2Cash;
										user1Cash=og1Cash;
										System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+"'s total is "+user2Cash+" dollars");
										System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+"'s total is "+user1Cash+" dollars");
										s=5;
									}
								}
							}
						}
						//displays winner and the amount of money they have won along with both the players new totals
						if (fold1 == true){
							if (totalBet-raise2!=0){
								user2Cash +=totalBet;
								System.out.println("\n\n\nRESULTS: ");
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+" won this round with a "+rankName2);
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+" won "+ (user2Cash-og2Cash)+" dollars");
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+"'s total is "+user2Cash+" dollars");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+"'s total is "+user1Cash+" dollars");
								og2Cash=user2Cash;
								og1Cash=user1Cash;
								s=5;
							}else{
								System.out.println("\n\n\nRESULTS: ");
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+" won this round. ");
								System.out.println("No money was won.");
								user2Cash +=totalBet;
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+"'s total is "+user2Cash+" dollars");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+"'s total is "+user1Cash+" dollars");
								og2Cash=user2Cash;
								og1Cash=user1Cash;
							}
						}else if(fold2 == true){
							if (totalBet-raise1!=0){
								user1Cash +=totalBet;
								System.out.println("\n\n\nRESULTS: ");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+" won this round with a "+rankName1);
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+" won "+ (user1Cash-og1Cash)+" dollars");
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+"'s total is "+user2Cash+" dollars");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+"'s total is "+user1Cash+" dollars");
								og2Cash=user2Cash;
								og1Cash=user1Cash;
								s=5;
							}else{
								System.out.println("\n\n\nRESULTS: ");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+" won this round. ");
								System.out.println("No money was won.");
								user1Cash +=totalBet;
								System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+"'s total is "+user2Cash+" dollars");
								System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+"'s total is "+user1Cash+" dollars");
								og2Cash=user2Cash;
								og1Cash=user1Cash;
							}
						}
						//displays the winner if one player wins all the money
						if (user1Cash ==0){
							A=11;
							s=1000;
							gameOver =1;
							System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+" WINS!! YOU WON $2000");
						}else if (user2Cash ==0){
							A=11;
							s=1000;
							System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+" WINS!! YOU WON $2000");
							gameOver =1;
						}
					}
				}
				//changes the player who starts the next round
				if (player1==1){
					player1=2;
				}else if (player1==2){
					player1=1;
				}
			}
			//displays winner after the 10 rounds of the game are up
			if(gameOver==0){
				if (user1Cash >user2Cash){
					System.out.println((name1.substring(0,1).toUpperCase()+name1.substring(1))+" WINS. YOU WON "+user1Cash+" dollars!");
				}else if (user2Cash >user1Cash){
					System.out.println((name2.substring(0,1).toUpperCase()+name2.substring(1))+" WINS. YOU WON "+user2Cash+" dollars!");
				}else{
					System.out.println("Both of you have the same amount of money so you both take home "+user1Cash+" dollars!");
				}
			}
			
			System.out.println("\n\nPlay Again? (Yes=0/No=1): ");
			playAgainAs = input.nextInt();
			for(int z = 0;z<60;z++){
				System.out.println("");
			}
		}
		System.out.println("THANKS FOR PLAYING");
	}
	

	private static String[] DealDeck() {
	// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		String[] cards = {"Ace of Hearts","Two of Hearts", "Three of Hearts", "Four of Hearts","Five of Hearts","Six of Hearts","Seven of Hearts","Eight of Hearts","Nine of Hearts","Ten of Hearts","Jack of Hearts", "Queen of Hearts", "King of Hearts", "Ace of diamonds", "Two of diamonds", "Three of diamonds","Four of diamonds", "Five of diamonds", "Six of diamonds", "Seven of diamonds", "Eight of diamonds", "Nine of diamonds", "Ten of diamonds", "Jack of diamonds", "Queen of diamonds", "King of diamonds","Ace of Spades","Two of Spades","Three of Spades","Four of Spades","Five of Spades","Six of Spades","Seven of Spades","Eight of Spades","Nine of Spades","Ten of Spades","Jack of Spades","Queen of Spades","King of Spades","Ace of Clubs","Two of Clubs","Three of Clubs","Four of Clubs","Five of Clubs","Six of Clubs","Seven of Clubs","Eight of Clubs","Nine of Clubs","Ten of Clubs","Jack of Clubs","Queen of Clubs","King of Clubs"};
		String[] gameCards = new String[12];
 		int cardsNum = cards.length;
		int num = 0;
		int card1= 0,card2= 0,card3=0,card4=0,card5=0,card6=0,card7=0,card8=0,card9=0,card10=0,card11=0,card12=0;
		//saves the nine random cards that will be used in the round
		for (int i = 0; i < 9; i++) {
			if (i == 0) {
				num = rand.nextInt(52);
				gameCards[i] = cards[num];
				card1 = num;
			}else if (i == 1) {
				while (num==card1){
					num = rand.nextInt(52);
				}
				gameCards[i] = cards[num];
				card2 = num;
			}else if((i == 2)){
				while (num==card1 || num==card2){
					num = rand.nextInt(52);
				}
				gameCards[i] = cards[num];
				card3 = num;
			}else if((i == 3)){
				while (num==card1 || num==card2|| num==card3){
					num = rand.nextInt(52);
				}
				gameCards[i] = cards[num];
				card4 = num;
			}else if((i == 4)){
				while (num==card1 || num==card2|| num==card3||num==card4){
					num = rand.nextInt(52);
				}
				gameCards[i] = cards[num];
				card5 = num;
			}else if((i == 5)){
				while (num==card1 || num==card2|| num==card3||num==card4||num==card5){
					num = rand.nextInt(52);
				}
				gameCards[i] = cards[num];
				card6 = num;
			}else if((i == 6)){
				while (num==card1 || num==card2|| num==card3||num==card4||num==card5 || num==card6){
					num = rand.nextInt(52);
				}
				gameCards[i] = cards[num];
				card7 = num;
			}else if((i == 7)){
				while (num==card1 || num==card2|| num==card3||num==card4||num==card5 || num==card6|| num ==card7){
					num = rand.nextInt(52);
				}
				gameCards[i] = cards[num];
				card8 = num;
			}else if((i == 8)){
				while (num==card1 || num==card2|| num==card3||num==card4||num==card5 || num==card6|| num ==card7|| num==card8){
					num = rand.nextInt(52);
				}
				gameCards[i] = cards[num];
				card9 = num;
			}
		}
	return(gameCards);
	}
	//player 1 turn
	private static int name1turn(int totalBet,String name1,String name2,String name3,String[] gameCards, boolean alive1,int match, int user1Cash, int raise2,int user2Cash,int s,String pot1,String pot2, String pot3, String pot4, String pot5, int cardValueU1C1, int cardValueU1C2,String cardFaceU1C1,String cardFaceU1C2,String cardFaceU2C1,String cardFaceU2C2,String cardFaceP1,String cardFaceP2,String cardFaceP3,String cardFaceP4,String cardFaceP5,String cardSuitU1C1,String cardSuitU1C2,String cardSuitU2C1,String cardSuitU2C2,String cardSuitP1,String cardSuitP2,String cardSuitP3,String cardSuitP4,String cardSuitP5, String top,String medium,String bottom) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice1=0;
		String user1Card1 = gameCards[0];
		String user1Card2 = gameCards[1];
		
		if (user1Cash>0){
			System.out.print("\nIts "+(name1.substring(0,1).toUpperCase()+name1.substring(1))+"'s turn. "+(name2.substring(0,1).toUpperCase()+name2.substring(1))+" must look away at this moment. Enter \"yes\" when ready to continue: ");
			String ready1 = input.next().toLowerCase();
			while (!ready1.equals("yes")){
				System.out.print((name2.substring(0,1).toUpperCase()+name2.substring(1))+" must look away at this moment. Enter \"yes\" when ready to continue: ");
				ready1 = input.next().toLowerCase();
			}
			System.out.println("\nYour cards: ");
			System.out.println(top+"  "+top);
			System.out.println(cardFaceU1C1+"  "+cardFaceU1C2);
			System.out.println(medium+"  "+medium);
			System.out.println(cardSuitU1C1+"  "+cardSuitU1C2);
			System.out.println(medium+"  "+medium);
			System.out.println(bottom+"  "+bottom);
			//displays correct river cards of the round
			if(s==1){
				System.out.println("\nRiver: ");
				System.out.println(top+"  "+top+"  "+top);
				System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3);
				System.out.println(medium+"  "+medium+"  "+medium);
				System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3);
				System.out.println(medium+"  "+medium+"  "+medium);
				System.out.println(bottom+"  "+bottom+"  "+bottom);
			}else if (s==2){
				System.out.println("\nRiver: ");
				System.out.println(top+"  "+top+"  "+top+"  "+top);
				System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3+"  "+cardFaceP4);
				System.out.println(medium+"  "+medium+"  "+medium+"  "+medium);
				System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3+"  "+cardSuitP4);
				System.out.println(medium+"  "+medium+"  "+medium+"  "+medium);
				System.out.println(bottom+"  "+bottom+"  "+bottom+"  "+bottom);
			}else if (s==3||s==11||s==4){
				System.out.println("\nFinal River: ");
				System.out.println(top+"  "+top+"  "+top+"  "+top+"  "+top);
				System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3+"  "+cardFaceP4+"  "+cardFaceP5);
				System.out.println(medium+"  "+medium+"  "+medium+"  "+medium+"  "+medium);
				System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3+"  "+cardSuitP4+"  "+cardSuitP5);
				System.out.println(medium+"  "+medium+"  "+medium+"  "+medium+"  "+medium);
				System.out.println(bottom+"  "+bottom+"  "+bottom+"  "+bottom+"  "+bottom);
			}
			System.out.print("\nReady? Enter \"yes\": ");
			String continue1 = input.next().toLowerCase();
			while (!continue1.equals("yes")){
				System.out.print("Ready? Enter \"yes\": ");
				continue1 = input.next().toLowerCase();
			}
			// displays the users actions
			System.out.println("Current amount of money to win: "+totalBet+" dollars");
			if (match==0){
				System.out.println("Actions: ");
				System.out.println("Bet   - 1 ");
				System.out.println("Fold  - 2 ");
				System.out.println("Check - 3 ");
				System.out.print("Enter choice number: ");
				choice1 = input.nextInt();
				while (choice1 <1||choice1 >3){
					System.out.print("Enter choice number: ");
					choice1 = input.nextInt();
				}
			}else if(match>0){
				if (user1Cash>0){
					System.out.println("Actions: ");
					System.out.println("Raise   - 0 ");
					System.out.println("Fold    - 2 ");
					System.out.println("Match   - 4 "+ "("+raise2+" dollars)");
					System.out.print("Enter choice number: ");
					choice1 = input.nextInt();
					while (choice1 <0||choice1 >4||choice1==3||choice1==1){
						System.out.print("Enter choice number: ");
						choice1 = input.nextInt();
					}
				}
			}
		}else{
			choice1 = 900;
		}
		return(choice1);
	}
	//player 2 turn
	private static int name2turn(int totalBet,String name1,String name2,String name3,String[] gameCards, boolean alive2, int match, int user2Cash,int raise1,int user1Cash,int s,String pot1,String pot2, String pot3, String pot4, String pot5, int cardValueU2C1, int cardValueU2C2 ,String cardFaceU1C1,String cardFaceU1C2,String cardFaceU2C1,String cardFaceU2C2,String cardFaceP1,String cardFaceP2,String cardFaceP3,String cardFaceP4,String cardFaceP5,String cardSuitU1C1,String cardSuitU1C2,String cardSuitU2C1,String cardSuitU2C2,String cardSuitP1,String cardSuitP2,String cardSuitP3,String cardSuitP4,String cardSuitP5, String top,String medium,String bottom) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		String user2Card1 = gameCards[2];
		String user2Card2 = gameCards[3];
		int choice2 = 0;
		if (user2Cash>0){
			System.out.print("\nIts "+(name2.substring(0,1).toUpperCase()+name2.substring(1))+"'s turn. "+(name1.substring(0,1).toUpperCase()+name1.substring(1))+" must look away at this moment. Enter \"yes\" when ready to continue: ");
			String ready1 = input.next().toLowerCase();
			while (!ready1.equals("yes")){
				System.out.print((name1.substring(0,1).toUpperCase()+name1.substring(1))+" must look away at this moment. Enter \"yes\" when ready to continue: ");
				ready1 = input.next().toLowerCase();
			}
			System.out.println("\nYour cards: ");
			System.out.println(top+"  "+top);
			System.out.println(cardFaceU2C1+"  "+cardFaceU2C2);
			System.out.println(medium+"  "+medium);
			System.out.println(cardSuitU2C1+"  "+cardSuitU2C2);
			System.out.println(medium+"  "+medium);
			System.out.println(bottom+"  "+bottom);
			//displays correct river cards for the round
			if(s==1){
				System.out.println("\nRiver: ");
				System.out.println(top+"  "+top+"  "+top);
				System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3);
				System.out.println(medium+"  "+medium+"  "+medium);
				System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3);
				System.out.println(medium+"  "+medium+"  "+medium);
				System.out.println(bottom+"  "+bottom+"  "+bottom);
			}else if (s==2){
				System.out.println("\nRiver: ");
				System.out.println(top+"  "+top+"  "+top+"  "+top);
				System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3+"  "+cardFaceP4);
				System.out.println(medium+"  "+medium+"  "+medium+"  "+medium);
				System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3+"  "+cardSuitP4);
				System.out.println(medium+"  "+medium+"  "+medium+"  "+medium);
				System.out.println(bottom+"  "+bottom+"  "+bottom+"  "+bottom);
			}else if (s==3||s==11||s==4){
				System.out.println("\nFinal River: ");
				System.out.println(top+"  "+top+"  "+top+"  "+top+"  "+top);
				System.out.println(cardFaceP1+"  "+cardFaceP2+"  "+cardFaceP3+"  "+cardFaceP4+"  "+cardFaceP5);
				System.out.println(medium+"  "+medium+"  "+medium+"  "+medium+"  "+medium);
				System.out.println(cardSuitP1+"  "+cardSuitP2+"  "+cardSuitP3+"  "+cardSuitP4+"  "+cardSuitP5);
				System.out.println(medium+"  "+medium+"  "+medium+"  "+medium+"  "+medium);
				System.out.println(bottom+"  "+bottom+"  "+bottom+"  "+bottom+"  "+bottom);
			}
			System.out.print("\nReady? Enter \"yes\": ");
			String continue1 = input.next().toLowerCase();
			while (!continue1.equals("yes")){
				System.out.print("Ready? Enter \"yes\": ");
				continue1 = input.next().toLowerCase();
			}
			//Displays the users action choices
			System.out.println("Current amount of money to win: "+totalBet+" dollars");
			if (match==0){
				System.out.println("Actions: ");
				System.out.println("Bet   - 1 ");
				System.out.println("Fold  - 2 ");
				System.out.println("Check - 3 ");
				System.out.print("Enter choice number: ");
				choice2 = input.nextInt();
				while (choice2 <1||choice2 >3){
					System.out.print("Enter choice number: ");
					choice2 = input.nextInt();
				}
			}else if(match>0){
				if (user2Cash>0){
					System.out.println("Actions: ");
					System.out.println("Raise   - 0 ");
					System.out.println("Fold    - 2 ");
					System.out.println("Match   - 4 "+ "("+raise1+" dollars)");
					System.out.print("Enter choice number: ");
					choice2 = input.nextInt();
					while (choice2 <0||choice2 >4||choice2==3||choice2==1){
						System.out.print("Enter choice number: ");
						choice2 = input.nextInt();
					}
				}
			}
		}else{
			choice2=900;
		}
		return(choice2);
	}
	//player 1 rank
	private static int name1rank(int pairs1[], boolean flush1,int rank1) {
		// TODO Auto-generated method stub
		// returns the correct rank
		int sum1 = pairs1[0]+pairs1[1]+pairs1[4]+pairs1[5]+pairs1[6]+pairs1[7]+pairs1[8];
		if ((sum1==0)&&flush1==false){
			rank1 = 7;
		}
		if (sum1==1){
			rank1 = 6;
		}
		if (sum1==2){
			rank1 = 5;
		}
		if (pairs1[0] ==2|| pairs1[1] ==2|| pairs1[4] ==2|| pairs1[5] ==2||pairs1[6] ==2|| pairs1[7] ==2||pairs1[8] ==2){
			rank1 = 4;
		}
		if (pairs1[0] ==3|| pairs1[1] ==3|| pairs1[4] ==3|| pairs1[5] ==3||pairs1[6] ==3|| pairs1[7] ==3||pairs1[8] ==3){
			rank1 = 3;
		}
		if (flush1 == true){
			rank1 = 2;
		}
		if ((pairs1[0] >=2|| pairs1[1] >=2|| pairs1[4] >=2|| pairs1[5] >=2||pairs1[6] >=2|| pairs1[7] >=2||pairs1[8] >=2)&&(pairs1[0] >=1|| pairs1[1] >=1|| pairs1[4] >=1|| pairs1[5] >=1||pairs1[6] >=1|| pairs1[7] >=1||pairs1[8] >=1)&&sum1!=pairs1[0]&&sum1!=pairs1[1]&&sum1!=pairs1[4]&&sum1!=pairs1[5]&&sum1!=pairs1[6]&&sum1!=pairs1[7]&&sum1!=pairs1[8]){
			rank1 = 1;
		}
		return (rank1);
	}
	//player 2 rank
	private static int name2rank(int pairs2[],boolean flush2,int rank2) {
		// TODO Auto-generated method stub
		// returns the correct rank
		int sum2 = pairs2[2]+pairs2[3]+pairs2[4]+pairs2[5]+pairs2[6]+pairs2[7]+pairs2[8];
		if ((sum2==0)&&flush2==false){
			rank2 = 7;
		}
		if (sum2==1){
			rank2 = 6;
		}
		if (sum2==2){
			rank2 = 5;
		}
		if (pairs2[2] ==2||pairs2[3] ==2|| pairs2[4] ==2|| pairs2[5] ==2||pairs2[6] ==2|| pairs2[7] ==2||pairs2[8] ==2){
			rank2 = 4;
		}
		if (pairs2[2] ==3||pairs2[3] ==3|| pairs2[4] ==3|| pairs2[5] ==3||pairs2[6] ==3|| pairs2[7] ==3||pairs2[8] ==3){
			rank2 = 3;
		}
		if (flush2 == true){
			rank2 = 2;
		}
		if ((pairs2[2] >=2||pairs2[3] >=2|| pairs2[4] >=2|| pairs2[5] >=2||pairs2[6] >=2|| pairs2[7] >=2||pairs2[8] >=2)&&(pairs2[2] >=1||pairs2[3] >=1|| pairs2[4] >=1|| pairs2[5] >=1||pairs2[6] >=1|| pairs2[7] >=1||pairs2[8] >=1)&&sum2!=pairs2[2]&&sum2!=pairs2[3]&&sum2!=pairs2[4]&&sum2!=pairs2[5]&&sum2!=pairs2[6]&&sum2!=pairs2[7]&&sum2!=pairs2[8]){
			rank2 = 1;
		}
		return(rank2);
	}
	//player 1 name of rank
	private static String name1rankName(int pairs1[],boolean flush1,String rankName1) {
		// TODO Auto-generated method stub
		// returns the correct name of the rank
		int sum1 = pairs1[0]+pairs1[1]+pairs1[4]+pairs1[5]+pairs1[6]+pairs1[7]+pairs1[8];
		if ((sum1==0)&&flush1==false){
			rankName1 = "nothing";
		}
		if (sum1==1){
			rankName1 = "one pair";
		}
		if (sum1==2){
			rankName1 = "two pair";
		}
		if (pairs1[0] ==2|| pairs1[1] ==2|| pairs1[4] ==2|| pairs1[5] ==2||pairs1[6] ==2|| pairs1[7] ==2||pairs1[8] ==2){
			rankName1 = "three of a kind";
		}
		if (pairs1[0] ==3|| pairs1[1] ==3|| pairs1[4] ==3|| pairs1[5] ==3||pairs1[6] ==3|| pairs1[7] ==3||pairs1[8] ==3){
			rankName1 = "four of a kind";
		}
		if (flush1 == true){
			rankName1 = "flush";
		}
		if ((pairs1[0] >=2|| pairs1[1] >=2|| pairs1[4] >=2|| pairs1[5] >=2||pairs1[6] >=2|| pairs1[7] >=2||pairs1[8] >=2)&&(pairs1[0] >=1|| pairs1[1] >=1|| pairs1[4] >=1|| pairs1[5] >=1||pairs1[6] >=1|| pairs1[7] >=1||pairs1[8] >=1)&&sum1!=pairs1[0]&&sum1!=pairs1[1]&&sum1!=pairs1[4]&&sum1!=pairs1[5]&&sum1!=pairs1[6]&&sum1!=pairs1[7]&&sum1!=pairs1[8]){
			rankName1 = "full house";
		}
		return (rankName1);
	}
	//player 2 name of rank
	private static String name2rankName(int pairs2[],boolean flush2,String rankName2) {
		// TODO Auto-generated method stub
		// returns the correct name of the rank
		int sum2 = pairs2[2]+pairs2[3]+pairs2[4]+pairs2[5]+pairs2[6]+pairs2[7]+pairs2[8];
		if ((sum2==0)&&flush2==false){
			rankName2 = "nothing";
		}
		if (sum2==1){
			rankName2 = "one pair";
		}
		if (sum2==2){
			rankName2 = "two pair";
		}
		if (pairs2[2] ==2||pairs2[3] ==2|| pairs2[4] ==2|| pairs2[5] ==2||pairs2[6] ==2|| pairs2[7] ==2||pairs2[8] ==2){
			rankName2 = "three of a kind";
		}
		if (pairs2[2] ==3||pairs2[3] ==3|| pairs2[4] ==3|| pairs2[5] ==3||pairs2[6] ==3|| pairs2[7] ==3||pairs2[8] ==3){
			rankName2 = "four of a kind";
		}
		if (flush2 == true){
			rankName2 = "flush";
		}
		if ((pairs2[2] >=2||pairs2[3] >=2|| pairs2[4] >=2|| pairs2[5] >=2||pairs2[6] >=2|| pairs2[7] >=2||pairs2[8] >=2)&&(pairs2[2] >=1||pairs2[3] >=1|| pairs2[4] >=1|| pairs2[5] >=1||pairs2[6] >=1|| pairs2[7] >=1||pairs2[8] >=1)&&sum2!=pairs2[2]&&sum2!=pairs2[3]&&sum2!=pairs2[4]&&sum2!=pairs2[5]&&sum2!=pairs2[6]&&sum2!=pairs2[7]&&sum2!=pairs2[8]){
			rankName2 = "full house";
		}
		return(rankName2);
	}
}	
