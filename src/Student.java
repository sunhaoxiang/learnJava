public class Student extends Person {

  private int score;

  public int getScore() {
    return this.score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void printScore() {
    System.out.println(this.getName() + "'s score is " + this.getScore());
  }
}
