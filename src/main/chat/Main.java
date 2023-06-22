import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        String fName = "C:\\Work\\Proj\\ChatGPT\\Answer.csv";
        ArrayList <Review> reviewList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fName))){
            br.readLine();
            while (br.ready()){
                String myStr = br.readLine();
                if (!myStr.equals("\"Starter Plan or higher is required in order to access reviews beyond 100.\""))
                reviewList.add(new Review(br.readLine()));
            }
        } catch (IOException e){}

        String tFName = "C:\\Work\\Proj\\ChatGPT\\text.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(tFName))){
            while (br.ready()){
                sb.append(br.readLine() + " ");
            }
        }catch (IOException e){}
/*        for (Review r : reviewList){
            r.setAnswer(ChatGPT.chatGPT(sb.toString() + r.getBody()));
            System.out.println(r.getAnswer());
        } */
        System.out.println(ChatGPT.chatGPT("Sellers and the customer service they provide Ordering issues and returns Shipping packaging Product condition and damage Shipping cost and speed Why not? Community content is meant to help customers learn about the product itself, not someone's individual experience ordering it. That said, we definitely want to hear your feedback about sellers and packaging, just not in reviews or questions and answers. This text violates this rule \"This product helped my dogs UTI symptoms rather quickly. It helped reduce the urgency to go and when she did go it was more productive. (Begining symptoms were frequent and short urination) It must not have a bad taste because I put it in both her water and mixed it with her food and she ate and drank with no hesitation.\"?"));



 //       System.out.println(ChatGPT.chatGPT("What is it \'MiBigRule\'? Can you describe it?"));
//        System.out.println(ChatGPT.chatGPT(sb.toString() + reviewList.get(0).getBody()));
    }
}
