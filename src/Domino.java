public class Domino {
    private int top = 0;
    private int bottom = 0;
    public Domino(){
        top = 0;
        bottom = 0;
    }
    public Domino(int a, int b){
        top = a; bottom = b;
    }
    public int getBottom() { return bottom; }
    public int getTop() { return top; }
    public void setBottom(int a) {bottom = a; }
    public void setTop(int a) { top = a; }
    public String toString() { return top + "/" + bottom; }
    public void flip(){
        int a = top;
        top = bottom;
        bottom = a;
    }
    public void settle(){
        if(bottom < top){
            this.flip();
        }
    }
    public int compareTo(Domino other){
        int small; int big; int osmall; int obig;
        if(this.getBottom() < this.getTop()){
            small = this.getBottom();
            big = this.getTop();
        }
        else{
            small = this.getTop();
            big = this.getBottom();
        }
        if(other.getBottom() < other.getTop()){
            osmall = other.getBottom();
            obig = other.getTop();
        }
        else{
            obig = this.getBottom();
            osmall = this.getTop();
        }
        if(small > osmall){
            return 1;
        }
        else if(osmall > small){
            return -1;
        }
        else{
            if(big > obig){
                return 1;
            }
            else if(obig > big){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    public int compareToWeight(Domino other){
        if(this.getBottom() + this.getTop() > other.getBottom() + other.getTop()) { return 1; }
        if(this.getBottom() + this.getTop() < other.getBottom() + other.getTop()) { return -1; }
        return 0;
    }
    public boolean canConnect(Domino other){
        if(this.getBottom() == other.getBottom()){ return true; }
        if(this.getTop() == other.getBottom()){ return true; }
        if(this.getBottom() == other.getTop()){return true;}
        if(this.getTop() == other.getTop()){ return true; }
        return false;
    }
}