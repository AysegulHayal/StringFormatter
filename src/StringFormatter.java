public class StringFormatter {
    public static String formatString (String inputString){
        StringBuilder formattedString = new StringBuilder();
        int count =1;

        for (int i = 1; i < inputString.length() ; i++) {
            if (inputString.charAt(i) == inputString.charAt(i-1)){
                count++;

            }else{
                formattedString.append(inputString.charAt(i-1)).append(count);
                count=1;
            }
        }
        formattedString.append(inputString.charAt(inputString.length() - 1)).append(count);
        return formattedString.toString();
    }
    public static void main(String[] args) {
        String inputStr = "xxxxxyyyzzttttx";
        String result = formatString(inputStr);
        System.out.println(result);
    }
}
