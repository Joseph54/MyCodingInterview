package societe_generale_interview;
public class CountSmilesExercise {

    public int countSmileys(String arr[]) {
        if (arr == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(";)") || arr[i].equals(":)") || arr[i].equals(";D") ||
                    arr[i].equals(":D") || arr[i].equals(":-)") || arr[i].equals(";-)") ||
                    arr[i].equals(":~)") || arr[i].equals(":-D") || arr[i].equals(":~D") ||
                    arr[i].equals(";~)") || arr[i].equals(";-D") || arr[i].equals(";~D")) {

                count++;
            }
        }
        return count;
    }
}
