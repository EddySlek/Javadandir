package javacourses.tecH.day35Lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming05 {

	public static void main(String[] args) {
	
		//creating objects:
		//Season, courseName, averageScore, numberOfStudents
		Course_POJO courseTurkishDay = new Course_POJO("Summer", "Turkish Day", 97, 128);
        Course_POJO courseTurkishNight = new Course_POJO("Winter", "Turkish Night", 98, 154);
        Course_POJO courseEnglishDay = new Course_POJO("Spring", "English Day", 95, 132);
        Course_POJO courseEnglishNight = new Course_POJO("Winter", "English Night", 93, 144);

        //In Functional programming, we need collections or list. That's why we create list:
        List<Course_POJO> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        
        System.out.println(CheckAvgScoreToBeGreaterThan91(coursesList, 91));
        System.out.println(checkAnyCourseNameContainsTurkish(coursesList));
        courseHasHighestAvg(coursesList);
        System.out.println(sortAvgAscSkipFirstTwo(coursesList));
        System.out.println(sortAvgAscGetThird(coursesList));

	}
	
    //1)Create a method to check if all average scores are greater than 91
	public static boolean CheckAvgScoreToBeGreaterThan91(List<Course_POJO> coursesList, double avg) {
		return coursesList.stream().allMatch(t->t.getAverageScore()>avg);	
	}
	
	
    //2)Create a method to check if at least one of the course names contains "Turkish" word
	public static boolean checkAnyCourseNameContainsTurkish(List<Course_POJO> coursesList) {		
		return coursesList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));		
	}

	
    //3)Create a method to print the course whose average score is the highest
	public static void courseHasHighestAvg(List<Course_POJO> coursesList) {		
		Course_POJO result = coursesList.stream().sorted(Comparator.comparing(Course_POJO::getAverageScore).reversed()).findFirst().get();
		System.out.println(result);		
	}
	
	
    //4)Sort the list elements according to the average score in ascending order and skip first 2 elements
	public static List<Course_POJO> sortAvgAscSkipFirstTwo(List<Course_POJO> coursesList){
		return coursesList.stream().sorted(Comparator.comparing(Course_POJO::getAverageScore)).skip(2).collect(Collectors.toList());
	}
	
	
	//5)Sort the list elements according to the average score in ascending order and print just 3rd one
	public static List<Course_POJO> sortAvgAscGetThird(List<Course_POJO> coursesList){		
		return coursesList.stream().sorted(Comparator.comparing(Course_POJO::getAverageScore)).skip(2).limit(1).collect(Collectors.toList());		
	}

}