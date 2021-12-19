public class FinalExa extends GradedActivity
{
private int numberOfQuestions;
private double pointsPerQuestion;
private int numberOfMissedQuestions;

public FinalExa(int totalQuestions, int missedQuestions)
{
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