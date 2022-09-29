public class Student {

    /* Instance Variables */

    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    /* Constructor; see note below */

    public Student(String firstName, String lastName, int gradYear)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
    }

    /* Methods */

    // Sets gradYear to newGradYear
    public void updateGradYear(int newGradYear)
    {
        gradYear = newGradYear;
    }

    // Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
    public void addTestScore(double newTestScore)
    {
        accumulatedTestScores += newTestScore;
        testScoreCount ++;
    }

    // Returns the number of test scores that have been added
    public int getTestScoreCount()
    {
        return testScoreCount;
    }

    // Returns the Student’s average test score as the
// quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore()
    {
       return accumulatedTestScores / testScoreCount;
    }

    // this method prints all info of a Student object to the console
    public void printStudentInfo()
    {
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Graduation Year: " + gradYear);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Number of Tests Averaged: " + testScoreCount);
    }
}