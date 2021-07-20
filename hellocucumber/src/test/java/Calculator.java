        public class Calculator {
            public String getDisplay() {
                return display;
            }
            String display;
            public void add(int number1, int number2) {
                display = String.valueOf(number1 + number2);
            }
            public void div(int number1, int number2) {
                if(number2==0){
                    display = "cannot divide by 0!";
                }else
                {
                    display = String.valueOf(number1 / number2);
                }
            }
        }


