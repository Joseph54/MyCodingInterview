package societe_generale_interview;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountSmilesExerciseTest {
    @Test
    public void testSmileys(){
        CountSmilesExercise countSmiles=new CountSmilesExercise();
        String twoSmiles[]={":)", ";(", ";}", ":-D"};
        String threeSmiles[]={";D", ":-(", ":-)", ";~)"};
        String oneSmile[]={";]", ":[", ";*" , ":$", ";-D"};
        assertEquals(countSmiles.countSmileys(twoSmiles),2);
        assertEquals(countSmiles.countSmileys(threeSmiles),3);
        assertEquals(countSmiles.countSmileys(oneSmile),1);
    }

}