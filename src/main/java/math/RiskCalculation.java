package math;

import MainClass.BodyCode;

public class RiskCalculation {



       public static  int[]  array_factorials = new int[BodyCode.number];


    int number_of_devices = BodyCode.number;
        public  int calculateFactorial(){
                int result = 1;
                for (int i = 1; i <= number_of_devices; i ++){
                        result = result*i;
                }
                return result;
        }


        public void calcfact(){
                for (int j = 0; j < BodyCode.number; j++){
                        array_factorials[j] = calculateFactorial();
                }
        }


        int submult = 1;
        public  int helper(){
              
                for (int i = 0; i <  BodyCode.number; i++) {
                        submult = submult * array_factorials[i];
                }
                return submult;
        }

        public  double get_risk_helper()
        {
                int factorial = array_factorials[array_factorials.length-1 ];
                double subfactorial = (helper() * 522);
                return   factorial/subfactorial;
        }
        /*добавить защищённость сюда, описать в классах девайсов как отношение количества закрытых уязвимостей к количеству существующих всего*/
        /*Risk = Pk* u, Где pk = po * умноженный на остальные параметры (см главу 2) и подтягиваем эти параметры отттуда*/











}


