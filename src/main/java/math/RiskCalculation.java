package math;

import MainClass.BodyCode;
public  class RiskCalculation {

        public  int number_types_attack = 1416;
        public  int number_of_devices = BodyCode.number;
        public int[] number_of_probabilities = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int probabilities_sum;


        public double[][][] RiskCalculationMatrix = new double [number_types_attack][number_of_devices][probabilities_sum];
        /*добавить защищённость сюда, описать в классах девайсов как отношение количества закрытых уязвимостей к количеству существующих всего*/
        /*Risk = Pk* u, Где pk = po * умноженный на остальные параметры (см главу 2) и подтягиваем эти параметры отттуда*/

        public void ProbSum() {
                for (int j = 0; j < 41; j++) {
                        probabilities_sum += number_of_probabilities[j];
                        j++;
                }
        }

}
