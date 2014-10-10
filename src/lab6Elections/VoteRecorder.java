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
	 * 
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
	 * @return true if succesful, false if the amount of votes was not equal to 0
	 */
	public static Boolean setCandidatesPresident(String candidate1, String candidate2){
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
	 * @return true if succesful, false if the amount of votes was not equal to 0 or the index was of a wrong format
	 */
	public static Boolean setCandidatesPresident(int index, String name){
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
	 * @return true if succesful, false if the amount of votes was not equal to 0
	 */
	public static Boolean setCandidatesPresident(String first1, String last1, String first2, String last2){
		if(votesCandidatePresident1==0&&votesCandidatePresident2==0){
			return false;
		}else{
			nameCandidatePresident1=first1+" " + last1;	//Add a space in between the first and last name
			nameCandidatePresident2=first2+" " + last2;
			return true;
		}
	}
	
	
	
	

}
