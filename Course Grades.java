public class CourseGrades
{
private GradedActivity[] grades;
private final int NUM_GRADES = 4;
public CourseGrades()
{
grades = new GradedActivity[NUM_GRADES];
}
public void setLab(GradedActivity aLab)
{
grades[0] = aLab;
}
public void setPassFailExa(PassFailExa aPassFailExa)
{
grades[1] = aPassFailExa;
}
public void setEssay(Essay anEssay)
{
grades[2] = anEssay;
}
public void setFinalExa(FinalExa aFinalExa)
{
grades[3] = aFinalExa;
}
public String toString()
{
String result = "";
  
result = "Lab Score: " + grades[0].getScore() + "\tGrade: " + grades[0].getGrade()
+ "\nPass/Fail Exa Score: " + grades[1].getScore() + "\tGrade: " + grades[1].getGrade()
+ "\nEssay Score: " + grades[2].getScore() + "\tGrade: " + grades[2].getGrade()
+ "\nFilan Exa Score: " + grades[3].getScore() + "\tGrade: " + grades[3].getGrade();
  
return result;
}
} 