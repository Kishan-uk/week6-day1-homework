import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EightBallTest {

    private EightBall myAnswers;

    @Before
        public void before(){
            ArrayList<String> testAnswers = new ArrayList<>();
            testAnswers.add("Yes definitely");
            testAnswers.add("Don't count on it");
            testAnswers.add("Ask again later");
            this.myAnswers = new EightBall(testAnswers);
        }

        @Test
        public void canGetRandomAnswer(){
            ArrayList<String> copy = myAnswers.getAnswers();
            int randomAnswer = myAnswers.getRandomAnswer();
            assertTrue(copy.contains(randomAnswer));
        }


        @Test
        public void canAddAnswer(){
            myAnswers.addAnswer("Outlook not so good");
            assertEquals(4, myAnswers.getAnswerCount());
        }

        @Test
        public void canRemoveAnswer(){
            myAnswers.removeAnswer("Yes definitely");
            assertEquals(2, myAnswers.getAnswerCount());
        }

}
