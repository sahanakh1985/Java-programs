import java.security.DomainCombiner;

public class EligibilityChecker {
	void printEligibityToVote(Student s) {
		if (s.age>18) {
			System.out.println("Eligibility to vote");
		}else {
			System.out.println("Not eligible to vote");
		}
		
	}
	public static void main(String[] args) {
		EligibilityChecker e=new EligibilityChecker();
		e.printEligibityToVote(null);
		
	}

}
