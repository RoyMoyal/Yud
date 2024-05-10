public class game {
    private String _nameGame;
    private int _numPlayers;
    private int _minAge;

    //בנאי לתכונות
    public game(String nameGame , int numPlayers , int minAge){
        _nameGame=nameGame;
        _numPlayers=numPlayers;
        _minAge=minAge;
    }

    //אימות גיל
    public String MinAgeChack(int minAge1){
        if (_minAge<minAge1)
            return("false");
        else
            return("true");
    }

    //בנאי העתקה
    public game(game other){
        _nameGame=other._nameGame;
        _numPlayers=other._numPlayers;
        _minAge=other._minAge;
    }

    //to string
    public String toString(){
        return ("name game :"+_nameGame+", num players :"+_numPlayers+", min age :"+_minAge);
    }

    public static void main(String[] args) {

    }
}

