package hello;

public class RPS{
    private final String play;
    private final String computer;
    private final String result;
    
    public RPS(String play) {
            this.play = play;
            computer = this.computerPlay();
        if (!this.validate(play)) {
            this.result = "To play append a '?' to the url followed by 'play=' and either 'rock', 'paper', or 'scissors'. Good luck!";
        } else {
            this.result = this.calculate(computer);
        }
    }
    
    public Boolean validate(String play) {
        play = play.toLowerCase();
        if (play.equals("rock") || play.equals("paper") || play.equals("scissors")) {
            return true;
        } else {
            return false;   
        }
    }

    public String play() {
        return this.play;
    }
    
    public String computerPlay() {
        Integer num = (int)(Math.random() * ((3 - 1) + 1));
        String[] array = new String[] {"rock", "paper", "scissors"};
        return array[num];
    }
    
    
    public Boolean result(String computer) {
        if (this.play.equals("rock")) {
            return (computer.equals("scissors"));
        } else if (this.play.equals("paper")) {
            return (computer.equals("rock"));
        } else if (this.play.equals("scissors")) {
            return (computer.equals("paper"));   
        } else {
            return false;
        }
    }

    public String calculate(String computer) {

        if (this.play.equals(computer)) {
            return "Tie! Player: " + this.play + ". Computer: " + computer;
        } else if (this.result(computer)) {
            return "You Win! Player: " + this.play + ". Computer: " + computer;
        } else {
            return "You Lose! Player: " + this.play + ". Computer: " + computer;
        }
    }

    public String getResult() {
        return this.result;
    }   
}