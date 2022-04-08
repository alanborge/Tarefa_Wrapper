package br.com.Allaborges;

import java.util.Scanner;

/**
 * classe principal
 */
public class Principal {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Converssao_Tipo_Dados ctp = new Converssao_Tipo_Dados();

        System.out.println("informe o numero primitivo");
        ctp.getValidacao();
        ctp.setValidacao(input.nextInt());

        System.out.println("numero convertido em Wrapper: " + ctp.getValidacao());
        ctp.impressaoDiretaConversao();
    }
}
