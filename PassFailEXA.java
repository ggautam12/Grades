public class PassFailExa extends PassFailActivity
{
private int numberOfQuestions;
private double pointsPerQuestion;
private int numberOfMissedQuestions;
public PassFailExa(int totalQuestions, int missedQuestions, double minimumPassing)
{
super(minimumPassing);
  
numberOfQuestions = totalQuestions;
numberOfMissedQuestions = missedQuestions;
pointsPerQuestion = 100.0 / totalQuestions;
  
double tempScore = 100.0 - (missedQuestions * pointsPerQuestion);
  
setScore(tempScore);
}
public double getPointsPerQuestion()
{
return pointsPerQuestion;
}
public int getNumberOfMissedQuestions()
{
return numberOfMissedQuestions;
}
} 