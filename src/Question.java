public class Question {

    String[] q = new String[8];
    String[] a = new String[8];
    //String[] i = new String[8];

    //USER INPUT
    public Question() {
        makeQuestions();
        makeAnswers();
//      computeScore();
    }

    public void makeQuestions() {

        q[0] = "What is the only country whose national flag is not rectangular?\n" + "(a)Nepal\n(b)Japan\n(c)Brazil\n";
        q[1] = "Who directed the movie Jaws?\n"
                + "(a)Ron Howard\n(b)Woody Allen\n(c)Steven Spielberg\n";
        q[2] = "What is the area of an equilateral triangle with side length 4?\n"
                + "(a)16.5\n(b)4√2\n(c)4√3\n";
        q[3] = "How many students attend Berkeley High?\n" + "(a)1,800\n(b)3,400\n(c)4,100\n";
        q[4] = "What is the color of deoxygenated blood?\n" + "(a)white\n(b)blue\n(c)red\n";
        q[5] = "Who sends the most emails to the BHS student body on average per day?\n" + "(a)Mary Jacobs\n(b)Erin Schweng\n(c)Tammy Rose\n";
        q[6] = "What is (2*90)+(3*20)-100/2?\n" + "(a)188\n(b)190\n(c)225\n";
        q[7] = "Who invented the telephone?\n" + "(a)Alexander Hamilton\n(b)Thomas Jefferson\n(c)Alexander Graham Bell\n";

    }

    public void makeAnswers() {

        a[0] = "a";
        a[1] = "c";
        a[2] = "c";
        a[3] = "b";
        a[4] = "b";
        a[5] = "a";
        a[6] = "a";
        a[7] = "a";

    }

}
 