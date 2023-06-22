public class Review {
    private String dAte;
    private String Author;
    private String Title;
    private String Body;
    private String uRL;
    private String Answer;
    public Review (String quiere){
        this.dAte = quiere.split("\"")[1];
        this.Author = quiere.split ("\"")[3];
        this.Title = quiere.split ("\"")[9];
        this.Body = quiere.split ("\"")[11];
        this.uRL = quiere.split ("\"")[17];
    }
    public String simpleString (){
        return Author + " " + Body;
    }

    public String getdAte() {
        return dAte;
    }

    public void setdAte(String dAte) {
        this.dAte = dAte;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public String getuRL() {
        return uRL;
    }

    public void setuRL(String uRL) {
        this.uRL = uRL;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }
}
