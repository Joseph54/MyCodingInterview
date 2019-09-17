package societe_generale_interview;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumCubesExerciseTest {
    @Test
    public void validateCubeValues(){
        SumCubesExercise cubingSum=new SumCubesExercise();
        assertEquals(cubingSum.sumCubes(1),1);
        assertEquals(cubingSum.sumCubes(2),9);
        assertEquals(cubingSum.sumCubes(3),36);
        assertEquals(cubingSum.sumCubes(4),100);

    }

}