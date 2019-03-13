package cours1.elacasse.com.exercicecours1;

public class Compare {

    public enum compareState{FIRST_BIGGER, EQUAL, SECOND_BIGGER};

    public compareState testNumber(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return compareState.FIRST_BIGGER;
        }else if (secondNumber > firstNumber){
            return compareState.SECOND_BIGGER;
        }else{
            return compareState.EQUAL;
        }
    }

}
