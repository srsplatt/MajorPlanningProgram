import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.lang.Integer;

import acm.util.ErrorException;

/*reads a major textfile and processes the info into returnable datasets */
public class Major {

	private static final String CHOICE_GROUP_DIVISOR = "- - -";
	private static final String TRACK_DIVISOR = "<><><><>";

	Major(String majorName) {
		String majorTextFile = majorName + ".txt";
		try {
			br = new BufferedReader(new FileReader(majorTextFile));

			while (true) {
				//processes required courses
				if (br.readLine() == "Required Courses:") {
					while(true) {
						Course requiredCourse = processCourse();
						requiredCourses.add(requiredCourse);
					}
				} else if(br.readLine() == "Choice Groups:") {
					//process choiceGroupsCategory - separate method
					while(true) {
						if(br.readLine() == CHOICE_GROUP_DIVISOR) {
							processChoiceGroup();
						}
					}
					//TO DO: deal w/bug that will arise when not dealing with last blank space
				} else if(br.readLine() == "Tracks:") {
					while (true) {
						//some way to handle divisors 
						processTrack();
					}
				}
			}
			//				AdvObject adventureObject = AdvObject.readObject(br);
			//				if(adventureObject==null) break; //means we've reached end of data file for objects
			//
			//				String objectName = adventureObject.getName();
			//				objectsMap.put(objectName, adventureObject);
			//
			//				objectsInGame.add(adventureObject.getName()); 
			//
			//				String objectRoomName = adventureObject.getInitialLocation();
			//				AdvRoom adventureRoom = roomsMap.get(objectRoomName);
			//				adventureRoom.addObject(adventureObject);



			br.close();
		} catch(IOException e) {
			throw new Exception(e);
		}
		
		/** private methods **/

		/* create course - includes HTML scraping*/
		private Course createCourse(String courseName) {
			//create dummy course just so the program will compile
			return course;
		}

		private Course processCourse() {
			String currentLine = br.readLine();
			if(currentLine == null) break;
			//read coursename as string
			String courseName = currentLine;
			//create course - includes HTML scraping
			Course course = createCourse(courseName);
			return course;
		}
		
		private void processChoiceGroup () {
			//gets the number
			String choosingNum = br.readLine();
			int choosingNumber = parseInt(choosingNumber);
			Set<Course> choiceGroupCourses;
			//reads courses
			while(true) { //IF BUGGY: check if this while loop is broken out of by break in passed in method
				Course choiceGroupCourse = processCourse();
				choiceGroupCourses.add(choiceGroupCourse);
			}
			ChoiceGroup choiceGroup = new ChoiceGroup(choosingNumber, choiceGroupCourses);
			choiceGroups.add(choiceGroup);
		}
		
		/**can't use current code from choice group processor directly because the it will add to the global required courses**/
		private void processTrack() { 
			//record name - maybe useful for graphics
			String name = br.readLine();
			//moves reader down a line in the file
			br.readLine();
			//handles everything inside one track processing loop
			while (true) {
				if (br.readLine() == "ChoiceGroups:") {
					//TODO: process required courses - will fix after debugging basic choicegroup method
				} else if(br.readLine() == "Required Courses:") {
					//TODO: process required courses -- will fix after debugging basic required courses method
				} else if(br.readLine() == TRACK_DIVISOR) {
					break;
				}
			}
			//TODO: update to create the track object that will get added to the global variable "tracks" set
		}

		/* returns required courses */
		public Set<Course> getRequiredCourses() {
			return requiredCourses;
		}

		/* returns choice groups */
		public Set<ChoiceGroup> getChoiceGroups() {
			return choiceGroups;
		}

		/* private instance variables */
		private Set<Course> requiredCourses;
		private Set<ChoiceGroup> choiceGroups;
		private BufferedReader br;
		private Set<Track> tracks;
	}
