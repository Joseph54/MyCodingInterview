package societe_generale_interview;
public class SumCubesExercise {


    public int sumCubes(int number){
        int sum=0;
        for(int i=1;i<=number;i++){
            sum=sum+i*i*i;
        }
        return sum;
    }
}
