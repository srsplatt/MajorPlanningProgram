import java.util.Set;

public class Track {

	/*constructor */
	public Track(String name, Set<Course> requiredCourses, Set<ChoiceGroup> choiceGroups) {
		this.requiredCourses = requiredCourses;
		choosingFrom = choiceGroups;
		this.name = name;
	}
	
	/* methods */
	public Set<Course> getRequiredCourses() {
		return requiredCourses;
	}
	
	public Set<ChoiceGroup> getChoiceGroups(){
		return choosingFrom;
	}
	
	public String getName(){
		return name;
	}
	
	/* private instance variables */
	Set<Course> requiredCourses;
	Set<ChoiceGroup> choosingFrom;
	String name;
}
