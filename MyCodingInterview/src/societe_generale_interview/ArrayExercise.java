package societe_generale_interview;
public class ArrayExercise {

    public char missingLetter(char arr[]){

        //we will assume for this exercise that we are in fact receiving only letters and not numbers or other characters

        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==1){
                //good do nothing
            }
            else{
                int missingIntegerVal=arr[i]+1;
                return ((char) missingIntegerVal);
            }
        }
        return ' ';
    }
}
