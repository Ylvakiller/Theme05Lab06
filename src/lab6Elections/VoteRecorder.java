package lab6Elections;

import java.util.Scanner;

/**
 * Holds the names for the candidates for both president and vice-president
 * Records the total amount of votes
 * Allows the names for candidates to be changed, but only when the number of votes is 0 for all candidates
 * Allows the votes to be reset. 
 * Can return the standings for the election
 * 
 * Records the vote for a specific voter
 * @author Ylva
 */
public class VoteRecorder {
	/**
	 * Name of the first candidate for president.
	 */
	private static String nameCandidatePresident1;
	/**
	 * Name of the second candidate for President.
	 */
	private static String nameCandidatePresident2;
	/**
	 * Name of the first Vice President candidate.
	 */
	private static String nameCandidateVicePresident1;
	/**
	 * Name of the second Vice President Candidate.
	 */
	private static String nameCandidateVicePresident2;

	/**
	 * Total amount of votes that have been cast for the first candidate for president.
	 */
	private static int votesCandidatePresident1;

	/**
	 * Total amount of votes that have been cast for the second candidate for president.
	 */
	private static int votesCandidatePresident2;

	/**
	 * Total amount of votes that have been cast for the first candidate for vice president.
	 */
	private static int votesCandidateVicePresident1;

	/**
	 * Total amount of votes that have been cast for the second candidate for vice president.
	 */
	private static int votesCandidateVicePresident2;

	/**
	 * Holds the amount of total voters, this is used to calculate the next voteID in case a voter does not vote for a president of vice president
	 */
	private static int voters;

	/**
	 * This is the vote that this specific person has cast for president
	 * If 0 this means no vote is cast, if 1 or 2 it means that candidate for president
	 */
	private int myVoteForPresident;

	/**
	 * This is the vote that this specific person has cast for vice president
	 * If 0 this means no vote is cast, if 1 or 2 it means that candidate for vice president
	 */
	private int myVoteForVicePresident;

	/**
	 * The voteID, can be used to figure out what voter this is, defaults to voters +1
	 */
	private int voteID;

	/**
	 * placeholder, will be deleted later
	 */
	private boolean confirmed;

	/**
	 * Default constructor, sets voteID and increments the amount of voters
	 */
	public VoteRecorder(){
		voteID = voters+1;
		voters++;

	}

	/**
	 * Only works if the amount of votes for the president is equal to 0
	 * This in order to prevent fraud during the election
	 * @param candidate1 Name that you want to set the first candidate of president to
	 * @param candidate2 Name that you want to set the second candidate of president to
	 * @return true if successful, false if the amount of votes was not equal to 0
	 */
	public static boolean setCandidatesPresident(String candidate1, String candidate2){
		if(votesCandidatePresident1==0&&votesCandidatePresident2==0){
			return false;
		}else{
			nameCandidatePresident1=candidate1;
			nameCandidatePresident2=candidate2;
			return true;
		}

	}

	/**
	 * Only works if the amount of votes for the president is equal to 0
	 * This in order to prevent fraud during the election
	 * @param index 1 or 2 depending on which candidate for president to change
	 * @param name the name to change the name of the candidate towards
	 * @return true if successful, false if the amount of votes was not equal to 0 or the index was of a wrong format
	 */
	public static boolean setCandidatesPresident(int index, String name){
		if(votesCandidatePresident1==0&&votesCandidatePresident2==0){
			return false;
		}else{
			if(index==1){
				nameCandidatePresident1=name;
			}else if (index==2){
				nameCandidatePresident2=name;
			}else{
				return false;
			}
			return true;
		}
	}

	/**
	 * Sets the names of the presidential candidates by combining their first and last name
	 * Only works if the amount of votes for the president is equal to 0
	 * This in order to prevent fraud during the election
	 * @param first1 first name of the first candidate
	 * @param last1 last name of the first candidate
	 * @param first2 first name of the second candidate
	 * @param last2 last name of the second candidate
	 * @return true if successful, false if the amount of votes was not equal to 0
	 */
	public static boolean setCandidatesPresident(String first1, String last1, String first2, String last2){
		if(votesCandidatePresident1==0&&votesCandidatePresident2==0){
			return false;
		}else{
			nameCandidatePresident1=first1+" " + last1;	//Add a space in between the first and last name
			nameCandidatePresident2=first2+" " + last2;
			return true;
		}
	}


	/**
	 * Only works if the amount of votes for the president is equal to 0
	 * This in order to prevent fraud during the election
	 * @param index 1 or 2 depending on which candidates name to change
	 * @param first first name that you want the new candidate to have
	 * @param last last name that you want the new candidate to have
	 * @return true if successful, false if the amount of votes was not 0 or the index was not 1 or 2
	 */
	public static boolean setCandidatesPresident(int index, String first, String last){
		if(votesCandidatePresident1==0&&votesCandidatePresident2==0){
			return false;
		}else{
			if(index==1){
				nameCandidatePresident1=first+" " + last;
			}else if (index==2){
				nameCandidatePresident2=first+" " + last;
			}else{
				return false;
			}
			return true;
		}
	}

	/**
	 * Only works if the amount of votes for the president is equal to 0
	 * This in order to prevent fraud during the election
	 * @param candidate1 Name that you want to set the first candidate of vice president to
	 * @param candidate2 Name that you want to set the second candidate of vice president to
	 * @return true if successful, false if the amount of votes was not equal to 0
	 */
	public static boolean setCandidatesVicePresident(String candidate1, String candidate2){
		if(votesCandidatePresident1==0&&votesCandidatePresident2==0){
			return false;
		}else{
			nameCandidateVicePresident1=candidate1;
			nameCandidateVicePresident2=candidate2;
			return true;
		}
	}

	/**
	 * Resets all the votes to 0,
	 * Also sets the amount of voters to 0
	 */
	public static void resetVotes(){
		votesCandidatePresident1=0;
		votesCandidatePresident2=0;
		votesCandidateVicePresident1=0;
		votesCandidateVicePresident2=0;
		voters=0;
	}


	/**
	 * Returns a string with a , as delimiter with the votes for both candidates for presidents
	 * @return string in the format [votesPresident1,votesPresident2]
	 */
	public static String getCurrentVotePresident(){
		return Integer.toString(votesCandidatePresident1) + "," + Integer.toString(votesCandidatePresident2);
	}

	/**
	 * Returns a string with a , as delimiter with the votes for both candidates for Vice Presidents
	 * @return string in the format [votesVicePresident1,votesVicePresident2]
	 */
	public static String getCurrentVoteVicePresident(){
		return Integer.toString(votesCandidateVicePresident1) + "," + Integer.toString(votesCandidateVicePresident2);
	}

	/**
	 * Gets the votes from a user and keeps on going until the user has entered votes that he also confirmed.
	 * It will then record those votes in the correct variables
	 */
	public void getAndConfirmVotes(){
		boolean temb = true;
		String temp = getVotes();
		String sub1 = temp.substring(0, temp.indexOf(","));
		String sub2 = temp.substring(temp.indexOf(","));
		while(temb){

			if(confirmVotes(Integer.valueOf(sub1), Integer.valueOf(sub2))){
				recordVotes(Integer.valueOf(sub1),Integer.valueOf(sub2));
				temb=false;
			}else{
				temp = getVotes();
				sub1 = temp.substring(0, temp.indexOf(","));
				sub2 = temp.substring(temp.indexOf(","));
			}
		}
	}

	/**
	 * Gets a single vote for either the president or for the vice president.
	 * It uses the names of the candidates to check if it should ask for the vice president vote or for the president vote
	 * 
	 * @param name1 Name of the first candidate, this must be a valid name for either the president or the vice president
	 * @param name2 Name of the second candidate, this must be a valid name for either the president or the vice president
	 * @return 0 if no vote cast, 1 if vote cast for name1, 2 if vote cast for name2
	 */
	private static int getAVote(String name1, String name2){
		if(name1.equals(nameCandidatePresident1)&&name2.equals(nameCandidatePresident2)){
			System.out.println("If you want " + name1 + " to be president please vote a 1.");
			System.out.println("If you instead want " + name2 + " to be president please vote a 2.");
		}else{
			System.out.println("If you want " + name1 + " to be vice president please vote a 1.");
			System.out.println("If you instead want " + name2 + " to be vice president please vote a 2.");

		}
		Scanner keyboard = new Scanner(System.in);
		int temp=0;
		boolean tempB = true;
		System.out.println("Please enter your vote now:");
		while(tempB){

			temp = keyboard.nextInt();
			if (temp==1||temp==2||temp==0){
				tempB=false;
				keyboard.close();

			}else{
				System.err.println("Invalid input, please enter your vote again");
			}
		}

		keyboard.close();
		return temp;


	}

	/**
	 * A method to get votes for this person for both the president and the vice president
	 * @return a string in the format [votePresident,voteVicePresident], where both votes are either 0 or 1 or 2
	 */
	private static String getVotes(){
		int votePresident=getAVote(nameCandidatePresident1,nameCandidatePresident2);
		int voteVicePresident = getAVote(nameCandidateVicePresident1,nameCandidateVicePresident2);
		return Integer.toString(votePresident) + "," + Integer.toString(voteVicePresident);
	}

	/**
	 * Method that checks with the voter if his votes are correct
	 * @param president 1 for the first candidate, a 2 for the second candidate for president
	 * @param vicePresident 1 for the first candidate, a 2 for the second candidate for president
	 * @return true if the vote was confirmed to be true, false if the vote was incorrect
	 */
	private static boolean confirmVotes(int president, int vicePresident){
		boolean confirmed = false;
		if(president==0){
			System.out.println("You have entered that you do not care who the president is.");
		}else{
			System.out.print("You have entered that you want to have ");
			if(president==1){
				System.out.print(nameCandidatePresident1);
			}else{
				System.out.print(nameCandidatePresident2);
			}
			System.out.println(" as President");
		}
		if(vicePresident==0){
			System.out.println("You have also entered that you do not mind who the vice president is");
		}else{
			System.out.print("You have also entered that you want to have ");
			if(vicePresident==1){
				System.out.print(nameCandidateVicePresident1);
			}else{
				System.out.print(nameCandidateVicePresident2);
			}
			System.out.println(" as Vice President.");
		}
		System.out.println("If you still agree with these votes please say yes, otherwise say no.");
		String temp = "";
		boolean tempB=true;

		while(tempB){
			Scanner keyboard = new Scanner(System.in);
			temp = keyboard.next();
			if (temp.equalsIgnoreCase("yes")){
				confirmed = true;
				tempB=false;
			}else if(temp.equalsIgnoreCase("no")){
				confirmed = false;
				tempB=false;
			}else{
				System.out.println("I could not understand what you entered, can you please enter it again?");
			}
			keyboard.close();
		}		
		return confirmed;
	}

	/**
	 * This method will be run after votes have been confirmed and stores the votes in the correct variables.
	 * @param president The vote for president
	 * @param vicepresident The vote for vice president
	 */
	private void recordVotes(int president, int vicePresident){
		myVoteForPresident=president;	
		if(president==1){
			votesCandidatePresident1++;
		}else if(president==2){
			votesCandidatePresident2++;
		}
		
		myVoteForVicePresident=vicePresident;	
		if(vicePresident==1){
			votesCandidateVicePresident1++;
		}else if(vicePresident==2){
			votesCandidateVicePresident2++;
		}
	}



}
