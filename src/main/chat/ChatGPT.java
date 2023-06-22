import java.io.*;
import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
public class ChatGPT {
    public static void main(String[] args) {
        System.out.println(chatGPT("Who are you?"));

    }
    public static String chatGPT (String message){
        String url = "https://api.openai.com/v1/chat/completions";
        String apiKey = "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";
        String model = "gpt-3.5-turbo";

        try {
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", "Bearer " + apiKey);
            connection.setRequestProperty("Content-Type", "application/json");


            String body = "{\"model\": \"" + model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + message + "\"}]}";
            connection.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(body);
            writer.flush();
            writer.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();
            System.out.println(response);
            return (response.toString().split("\"content\":\"")[1].split("\"")[0]).substring(4);
        } catch (IOException e){
            throw new RuntimeException(e);
        }



    }
}