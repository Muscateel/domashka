package lab14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 1000.00 RUB, 50.50 RUB, 12.34 EU";

        String regexUSD = "(\\d+\\.\\d{2})\\sUSD";
        String regexRUB = "(\\d+\\.\\d{2})\\sRUB";
        String regexEU = "(\\d+\\.\\d{2})\\sEU";

        Pattern patternUSD = Pattern.compile(regexUSD);
        Pattern patternRUB = Pattern.compile(regexRUB);
        Pattern patternEU = Pattern.compile(regexEU);

        Matcher matcherUSD = patternUSD.matcher(text);
        Matcher matcherRUB = patternRUB.matcher(text);
        Matcher matcherEU = patternEU.matcher(text);

        while (matcherUSD.find()) {
            System.out.println("USD: " + matcherUSD.group(1));
        }

        while (matcherRUB.find()) {
            System.out.println("RUB: " + matcherRUB.group(1));
        }

        while (matcherEU.find()) {
            System.out.println("EU: " + matcherEU.group(1));
        }
    }
}