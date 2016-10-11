
import java.util.Set;


public class Course {

	/*constructor */
	public Course(String name, Set<Course> preReqs, Set<String> termsOffered) {
		courseName = name;
		preReqsNames = preReqs;
		termsOfferedNames = termsOffered;
	}
	
	/* methods */
	public String getCourseName() {
		return courseName;
	}
	
	public Set<Course> getPreReqs() {
		return preReqsNames;
	}
	
	public Set<String> getTermsOfferedNames() {
		return termsOfferedNames;
	}
	
	public void addPreReq(Course course) {
		preReqsNames.add(course);
	}
	
	/* private instance variables */
	private String courseName;
	private Set<Course> preReqsNames;
	private Set<String> termsOfferedNames;
	
}
