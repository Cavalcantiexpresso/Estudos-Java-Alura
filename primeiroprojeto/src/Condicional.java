public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que Clintes estão curtindo!");
        }else {
            System.out.println("Filme retrô que vale apena assistir");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        }else {
            System.out.println("Deve pagar a Locação");
        }


    }
/*public class DesafioTemperatura {

        public static void main(String[] args) {
            double temperaturaEmCelsius = 30.4;
            double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

            String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

            System.out.println(mensagem);

            int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
            System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

        }

    }*/
}
