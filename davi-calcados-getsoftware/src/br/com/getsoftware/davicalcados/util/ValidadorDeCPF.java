package br.com.getsoftware.davicalcados.util;

public class ValidadorDeCPF {

     public static boolean validaCPF(String strCpf) {
        strCpf = strCpf.trim();

        if (strCpf.equals("000.000.000-00")
                || strCpf.equals("111.111.111-11")
                || strCpf.equals("222.222.222-22")
                || strCpf.equals("333.333.333-33")
                || strCpf.equals("444.444.444-44")
                || strCpf.equals("555.555.555-55")
                || strCpf.equals("666.666.666-66")
                || strCpf.equals("777.777.777-77")
                || strCpf.equals("888.888.888-88")
                || strCpf.equals("999.999.999-99")
                || !strCpf.contains(".")
                || !strCpf.contains("-")) {
            return false;

        } else {
            int d1, d2;
            int digito1, digito2, resto;
            int digitoCPF;
            String nDigResult;

            d1 = d2 = 0;
            digito1 = digito2 = resto = 0;

            strCpf = strCpf.replace(".", "").replace("-", "");

            for (int nCount = 1; nCount < strCpf.length() - 1; nCount++) {
                digitoCPF = Integer.valueOf(
                        strCpf.substring(nCount - 1, nCount)).intValue();

                d1 = d1 + (11 - nCount) * digitoCPF;

                d2 = d2 + (12 - nCount) * digitoCPF;
            }

            resto = (d1 % 11);

            if (resto < 2) {
                digito1 = 0;
            } else {
                digito1 = 11 - resto;
            }

            d2 += 2 * digito1;

            resto = (d2 % 11);

            if (resto < 2) {
                digito2 = 0;
            } else {
                digito2 = 11 - resto;
            }

            String nDigVerific = strCpf.substring(strCpf.length() - 2,
                    strCpf.length());

            nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

            return nDigVerific.equals(nDigResult);
        }
    }

}
