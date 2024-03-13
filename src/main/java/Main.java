public class Main {
    public static void main(String[] args) {
        
        int[] celsiusArray = new int[16];

    
        for (int i = 0, celsius = 0; i < celsiusArray.length; i++, celsius += 20) {
            celsiusArray[i] = celsius;
        }


        double[] fahrenheitArray = new double[celsiusArray.length];

      
        for (int i = 0; i < celsiusArray.length; i++) {
            fahrenheitArray[i] = celsiusToFahrenheit(celsiusArray[i]);
        }

     
        System.out.println("Stopnie Celsjusza | Stopnie Fahrenheita");
        System.out.println("---------------------------------------");
        for (int i = 0; i < celsiusArray.length; i++) {
            System.out.printf("%15d | %18.2f%n", celsiusArray[i], fahrenheitArray[i]);
        }
    }


    public static double celsiusToFahrenheit(int celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}