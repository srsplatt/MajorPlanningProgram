import java.util.Set;

public class ChoiceGroup {

	/*constructor */
	public ChoiceGroup(int choosing, Set<Course> choosingFrom) {
		chooseThisMany = choosing;
		coursesToChooseFrom = choosingFrom;
	}
	
	/* methods */
	public int getNumberChosing() {
		return chooseThisMany;
	}
	
	public Set<Course> coursesToChooseFrom() {
		return coursesToChooseFrom;
	}
	
	public void addCourse(Course course){
		coursesToChooseFrom.add(course);
	}
	
	/* private instance variables */
	private int chooseThisMany;
	private Set<Course> coursesToChooseFrom;
	
	
}
