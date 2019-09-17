package societe_generale_interview;
import org.junit.Test;


import static org.junit.Assert.*;

public class ArrayExerciseTest {
    @Test
    public void findMissingCharacter(){
        char c1[]={'a','b','c','d','f' };
        char c2[]={'O','Q','R','S'};
        ArrayExercise arrayExercise= new ArrayExercise();
        assertEquals(arrayExercise.missingLetter(c1),'e');
        assertEquals(arrayExercise.missingLetter(c2),'P');


    }

}