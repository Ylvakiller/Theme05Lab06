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
	 * The voteId, can be used to figure out what voter this is, defaults to the total amount of votes cast+1
	 */
	private int voteId;
	
	
	

}
