interface IResult
{
    public void showResult();
    public double showPercentage(int correctAnswers,int totalQuestions);
    public String showPerformance(double percentage);
}