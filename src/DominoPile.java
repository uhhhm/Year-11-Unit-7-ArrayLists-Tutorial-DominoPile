import java.util.ArrayList;
public class DominoPile {
    private ArrayList<Domino> pile;   
    public DominoPile(){  pile = new ArrayList<Domino>(); }
    public ArrayList<Domino> getPile(){
        return pile;
    }
    public void newStack6(){
        for(int i = 0; i < 7; i++){
            for(int j = i; j < 7; j++){
                pile.add(new Domino(i, j));
            }
        }
    }
    public void shuffle(){
        Domino other;
        int random1;
        int random2;
        for(int i = 0; i < pile.size()*2; i++){
            random1 = (int) (Math.random()*pile.size());
            random2 = (int) (Math.random()*pile.size());
            while(random1 == random2){
                random1 = (int) (Math.random()*pile.size());
            }
            other = pile.get(random1);
            pile.set(random1, pile.get(random2));
            pile.set(random2, other);
        }
    }
}
