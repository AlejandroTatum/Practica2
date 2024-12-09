package EjerciciosUtilidad;
import java.text.DecimalFormat;
import java.util.Random;


public class Utilidades {
        public static boolean validate(String num){
            boolean band = true;
            if (num.charAt(0)== '-'){
                num = num.substring(1);
            }
            System.out.println(num);
            int cont_p = 0;
            for (int i = 0; i<num.length(); i++){
                if (!Character.isDigit(num.charAt(i)) && num.charAt(i)!='.'){
                    band = false;
                    break;
                } else if (num.charAt(i)=='.')
                cont_p++;
            } if (cont_p >= 2)
            band = false;
            return band; 
        }
        public static int transformStringInt(String num){
            int resp = 0;
            if (Utilidades.validate(num)){
                resp = Integer.parseInt(num);
            }
            return resp;
        }
        public static Double transformStringDouble(String num){
            double resp = 0;
            if (Utilidades.validate(num)){
                resp = Double.parseDouble(num);
            }
            return resp;
        }
        public static Float transformStringFloat(String num){
            float resp = 0;
            if (Utilidades.validate(num)){
                resp = Float.parseFloat(num);
                
            }
            return resp;
        }
        public static int generarNumeroRango(int minimo, int maximo){
            Random random = new Random();
            return minimo + random.nextInt((maximo+1)-minimo);
        }
        public static float generarNumeroRangoFloat(float minimo, float maximo){
            Random random = new Random();
            float rnd = random.nextFloat();
            return minimo + (maximo -minimo)*rnd;
            

        }
        
        public boolean Primo(int num) {
            int cont = 0;
            boolean primo = false;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    cont++;
                }
            }
            if (cont <= 2)
                primo = true;
            else
                primo = false;
            return primo;
        }
        public int contardigitos(String palabra) {
            int cont = 0;
            for (int i = 0; i < palabra.length(); i++) {
                int ascii = (int) palabra.charAt(i);
                if (ascii >= 48 && ascii <= 57) {
                    cont++;
                }
    
            }
            return cont;
        }
        public String darvuelta(String cadena) {
            String resp = "";
            for (int i = cadena.length() - 1; i >= 0; i--) {
                resp += cadena.charAt(i);
            }
            return resp;
        }
        public int Fact(int n){
            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
        public long Potenciar(int base, int exp) {
            long pot = 1;
            for (int i = 1; i <= exp; i++) {
                pot = base * pot;
            }
            return pot;
        }
        public String Summacoords(int num, int modulo, int angpolar) {
        DecimalFormat df = new DecimalFormat("#.00");
        double auxpol = 0;
        double angulof = 0;
        double auxrect1 = 0;
        double auxrect2 = 0;
        String result = "";
        auxrect1 = auxrect1 + modulo * (Math.cos(angpolar));
        auxrect2 = auxrect2 + modulo * (Math.sin(angpolar));
        auxpol = Math.sqrt(Math.pow(auxrect1, 2) + Math.pow(auxrect2, 2));
        angulof = Math.tan(auxrect2 / auxrect1);
        System.out.println("La suma de las coordenas rectangulas son x:" + df.format(auxrect1) + " y:" + df.format(auxrect2));
        System.out.println("La suma de las coordenadas polares es de: " + df.format(auxpol) + "m y "+ angulof + " grados");

        return result;

    }
    
    public static float redondear (float num){
        return Math.round(num * 100.0f) / 100.0f;


    }
}

