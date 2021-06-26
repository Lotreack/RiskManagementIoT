package math;

import TestLotreack.BodyCode;
public  class RiskCalculation {

        public static int number_types_attack = 1416;
        public static int number_of_devices = BodyCode.number;
        public static int[] number_of_probabilities = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int proababilities_sum;


        public double[][][] RiskCalculationMatrix = new double [number_types_attack][number_of_devices][proababilities_sum];
        /*добавить защищённость сюда, описать в классах девайсов как отношение количества закрытых уязвимостей к количеству существующих всего*/
        /*Risk = Pk* u, Где pk = po * умноженный на остальные параметры (см главу 2) и подтягиваем эти параметры отттуда*/

        public void ProbSum() {
                for (int j = 0; j < 41; j++) {
                        proababilities_sum += number_of_probabilities[j];
                        j++;
                }
        }

}
