public class ReturnError {
    private int score;

    public ReturnError(int score) {
        this.score = score;
    }

    public String grade() {
        String gr = "";
        if (score >= 90) {
            gr = "A";
        } else if (score >= 80) {
            gr = "B";
        } else if (score >= 70) {
            gr = "C";
        } else if (score >= 60) {
            gr = "D";
        } else {
            gr = "f";
        }
        return gr;
    }
}
