public class NinthGrader extends Student {
    public NinthGrader (String firstName, String lastName) {
        super(firstName, lastName, 2024);
    }
    public NinthGrader() {
        super("James", "D", 2024); 
    }
    public void doSomething() {
        System.out.println("I'm preparing for a test.");
    }
    public String toString() {
        String str = this.getFirstName() + " " + this.getLastName() + "," + this.getClassYear() + "Ninth Grader";
        return str;
    }
}