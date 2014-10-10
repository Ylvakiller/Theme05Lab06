package lab6Elections;

/*
 * Definition found on bb:
 * Elections: 
 * Write a program that will record the votes for one of two candidates by using the class 
 * VoteRecorder, which you will design and create. Vote Recorder will have static variables 
 * to keep track of the total votes for candidates and instance variables to keep track of 
 * the votes made by a single person. It will have the following attributes: 
 * 
 * • nameCandidatePresident1—a static string that holds the name of the first candidate for president 
 * • nameCandidatePresident2—a static string that holds the name of the second candidate for president 
 * • nameCandidateVicePresident1—a static string that holds the name of the first candidate for vice president 
 * • nameCandidateVicePresident2—a static string that holds the name of the second candidate for vice president 
 * 
 * • votesCandidatePresident1—a static integer that holds the number of votes for the first candidate for president 
 * • votesCandidatePresident2—a static integer that holds the number of votes for the second candidate for president 
 * • votesCandidateVicePresident1—a static integer that holds the number of votes for the first candidate for vice president 
 * • votesCandidateVicePresident2—a static integer that holds the number of votes for the second candidate for vice president 
 * 
 * • myVoteForPresident—an integer that holds the vote of a single individual for president (0 for no choice, 1 for the first candidate, and 2 for the second candidate) 
 * • myVoteForVicePresident—an integer that holds the vote of a single individual for vice president (0 for no choice, 1 for the first candidate, and 2 for the second candidate) 
 * 
 * In addition to appropriate constructors, VoteRecorder has the following methods: 
 * 
 * • setCandidatesPresident(String name1, String name2)—a static method that sets the names of the two candidates for president 
 * • setCandidatesPresident(int index, String name)—a static method that sets the name of one of the two candidates for president depending on the value of index 
 * • setCandidatesPresident(String first1, String last1, String first2, String last2)—a static method that sets the names of the two candidates for president by combining their first and last name 
 * • setCandidatesPresident(int index, String first, String last)—a static method that sets the of one of the two candidates for president depending on the value of index by combining their first and last name. 2 
 * • setCandidatesVicePresident(String name1, String name2)—a static method that sets the names of the two candidates for vice president 
 * 
 * • resetVotes—a static method that resets the vote counts to zero 
 * • getCurrentVotePresident—a static method that returns a string with the current total number of votes for both presidential candidates 
 * • getCurrentVoteVicePresident—a static method that returns a string with the current total number of votes for both vice presidential candidates 
 * 
 * • getAndConfirmVotes—a nonstatic method that gets an individual’s votes, confirms them, and then records them. 
 * • getAVote(String name1, String name2)—a private method that returns a vote choice for a single race from an individual (0 for no choice, 1 for the first candidate, and 2 for the second candidate) 
 * • getVotes—a private method that returns a vote choice for president and vice president from an individual 
 * • confirmVotes—a private method that displays a person’s vote for president and vice president, asks whether the voter is happy with these choices, and returns true or false according to a yes-or-no response 
 * • recordVotes—a private method that will add an individual’ svotes to the appropriate static variables
 * 
 * Create a program that will conduct an election. The candidates for president are Annie 
 * Kennedy and Bob Hope. The candidates for vice president are John McCain and Susan 
 * Bush. Use a loop to record the votes of many voters. Create a new VoteRecorder object 
 * for each voter. After all the voters are done, present the results. 
 * In addition, write a test program to test the various menthos for setting the names of 
 * the candidates for president.
 */

/*
 * My interpretation:
 * There will be one voteRecorder object that will keep track of all the votes for the complete race,
 * There will be multiple voteHolder objects, one for each voter, this holds a vote id number that is also tracked in the votereRorder class which is the number of voters that have already been passed.
 * In order to create a new vote an empty voteHolder will be created and certain methods will be run to get votes for both the president and the vice president.
 * 
 * All the setCandidate methods will be in the voteRecorder class. 
 * The static strings and static integers will be in the voteRecorder class
 * The resetVotes and getCurrentVote methods will be in the voteRecorder class
 * 
 * The recordVotes, confirmVotes, getVotes, getAndConfirmVotes and getAVote methods will be in the voteHolder class
 * In the voteHolder class there will be static variables that hold the voteID and the votes cast
 * 
 * Ones a vote has been cast and confirmed it cannot be changed
 */

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
