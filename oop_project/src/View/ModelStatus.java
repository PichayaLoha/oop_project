package View;

public class ModelStatus {
    String lbText;
    int lbNum;

    public String getLbText() {
        return lbText;
    }

    public void setLbText(String lbText) {
        this.lbText = lbText;
    }

    public int getLbNum() {
        return lbNum;
    }

    public void setLbNum(int lbNum) {
        this.lbNum = lbNum;
    }

    public ModelStatus() {
    }

    public ModelStatus(String lbText, int lbNum) {
        this.lbText = lbText;
        this.lbNum = lbNum;
    }
}
