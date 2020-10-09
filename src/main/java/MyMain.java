public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int count = 0;
        for (int i = 0 ; i < 10000 ; i++){
            int count_6 = 0;
            for(int j =0; j < 6; j++){
                int rand = (int) (6*Math.random());
                if(rand ==5){
                    count_6++;
                }
            }
            if (count_6 == 0 ) count++;
        }
        return (1 - ((double) count)/10000)*100;

    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int count = 0;
        for (int i = 0 ; i < 10000 ; i++){
            int count_6 = 0;
            for(int j =0; j < 12; j++){
                int rand = (int) (6*Math.random());
                if(rand ==5){
                    count_6++;
                }
            }
            if (count_6 == 0 || count_6 == 1) count++;
        }
        return (1 - ((double) count)/10000) * 100;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int count = 0;
        for (int i = 0 ; i < 10000 ; i++){
            int count_6 = 0;
            for(int j =0; j < 18; j++){
                int rand = (int) (6*Math.random());
                if(rand==5){
                    count_6++;
                }
            }
            if (count_6 == 0 || count_6 == 1 ||count_6 == 2) count++;
        }
        double probability = 1 - (double) count/10000;
        return probability * 100;
    }


    public static void main(String[] args) {
       System.out.println(probabilityOneSix());
       System.out.println(probabilityTwoSixes());
       System.out.println(probabilityThreeSixes());
    }
}
