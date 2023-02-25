import java.util.Scanner;

public class Calculadora {
    
    public int somar(int i, int y){
        return i + y;
    }

    public int subtrair(int i, int y){
        return i - y;
    }

    public int multiplicar(int i, int y){
        return i * y;
    }

    public int divir(int i, int y){
        return i / y;
    }

    public static void abrirMenu(){
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0;
        String operacao = null;

        do {
            System.out.println("1 = soma");
            System.out.println("2 = sub");
            System.out.println("3 = mult");
            System.out.println("4 = div");
            System.out.println("0 = sair");
            System.out.println("digite a operação desejada: ");
            operacao = scanner.next();

            switch (operacao) {
                case ("1"):
                    System.out.println("denomindaor 1");
                    x = scanner.nextInt();
                    System.out.println("denomindaor 2");
                    y = scanner.nextInt();
                    System.out.println(somar(x, y));
                    break;
                case ("2"):
                    System.out.println("denomindaor 1");
                    x = scanner.nextInt();
                    System.out.println("denomindaor 2");
                    y = scanner.nextInt();
                    System.out.println(subtrair(x, y));
                    break;
                case ("3"):
                    System.out.println("denomindaor 1");
                    x = scanner.nextInt();
                    System.out.println("denomindaor 2");
                    y = scanner.nextInt();
                    System.out.println(multiplicar(x, y));
                    break;
                case ("4"):
                    System.out.println("denomindaor 1");
                    x = scanner.nextInt();
                    System.out.println("denomindaor 2");
                    y = scanner.nextInt();
                    System.out.println(divir(x, y));
                    break;
                case ("0"):
                    try {
                        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                        Process startProcess = pb.inheritIO().start();
                        startProcess.waitFor();

                    } catch (final Exception e) {
                        System.out.println("deu erro");
                    }
                    System.out.println("saiu!");
                    break;
                default:
                    // try
                    // {
                    // final String os = System.getProperty("os.name");

                    // if (os.contains("Windows"))
                    // {
                    // ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                    // Process startProcess = pb.inheritIO().start();
                    // startProcess.waitFor();
                    // }
                    // else
                    // {
                    // ProcessBuilder pb = new ProcessBuilder("clear");
                    // Process startProcess = pb.inheritIO().start();

                    // startProcess.waitFor();
                    // }
                    // }
                    // catch (final Exception e)
                    // {
                    // // Handle any exceptions.
                    // }
                    System.out.println("digite uma operacao valida");
                    break;
            }

        } while (!operacao.equals("0"));
    }

}
