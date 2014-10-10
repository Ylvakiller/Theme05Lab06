package lab6Elections;
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
	
	public void getAndConfirmVotes(){
		
	}
	
	private static void getAVote(){
		
	}
	
	private static void getVotes(){
		
	}
	
	private static void confirmVotes(){
		
	}
	
	private static void recordVotes(){
		
	}
	
	

}
