//Questão 5
public class InversaoString {
    public static void main(String[] args) {
        String original = "ExemploString";
        char[] caracteres = original.toCharArray();
        int tamanho = caracteres.length;
        char[] invertido = new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            invertido[i] = caracteres[tamanho - 1 - i];
        }

        String resultado = new String(invertido);

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + resultado);
    }
}