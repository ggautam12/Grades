public class CourseGradeDemo
{
public static void main(String[] args)
{
GradedActivity aLab = new GradedActivity();
aLab.setScore(85);
PassFailExam aPassFailExa = new PassFailExa(20, 3, 70);
Essay anEssay = new Essay();
anEssay.setScore(25, 18, 17, 20);
FinalExam aFinalExa = new FinalExa(50, 10);
CourseGrades crcGrds = new CourseGrades();
crcGrds.setLab(aLab);
crcGrds.setPassFailExa(aPassFailExa);
crcGrds.setEssay(anEssay);
crcGrds.setFinalExa(aFinalExa);
System.out.println(crcGrds);
} 
} 