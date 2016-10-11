
import java.util.ArrayList;
import java.util.Set;

import org.jgrapht.DirectedGraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

/*creates an instance of major plan class*/
public class MajorPlan {
	
	/* FUNCTIONALITY */
	//like the boggle board - is an object that major planning execution can call
	//takes in a list of desired majors from major planning execution
	//
	//interacts with the GUI
	
	DirectedGraph<Course,DefaultEdge> tears = createTestGraph();
	
	

	
	//Set<Course> lol = tears.vertexSet(); 
		
//	for (Course course: lol.vertexSet()) {
//		System.out.println(course.getCourseName());
//	}
	
	DirectedGraph <Course, DefaultEdge> createTestGraph() {
		//TODO: figure out how to correctly instantiate sets
		Set<Course> preReqs = new Set<Course>();
		Set<String> termsOffered = new Set<String>;
		termsOffered.add("spring");
		Course physics43 = new Course("physics 43", preReqs, termsOffered);
		DirectedGraph<Course,DefaultEdge> butts = new DefaultDirectedGraph<>(DefaultEdge.class);
		butts.addVertex(physics43);
		return butts;
		//butts.toString();
		
	}

}
