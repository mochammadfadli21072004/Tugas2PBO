
package LatihanBingo;

public class Bingo {
    String name;
    
    public Bingo(String name) {
        this.name = name;
    };
    
    
    protected void song() {
        int lengthWord = name.split("").length;
        
        String newName = String.join("-", name.split(""));
//        String newName = name;
        
        String lirik = "There was a farmer who had a dog,\nAnd " + name + " was his name-o";
         
        for(int i = 0; i < lengthWord; i++) {
            System.out.println(lirik);
            repeatBingo(newName, 3);
            newName = replaceName(newName, i);
            System.out.println("");
        }
        
        System.out.println(lirik);
        repeatBingo(newName, 3);
    }
    
    private void repeatBingo(String name, int repeat) {
        for(int i = 0; i < repeat; i++) {
            System.out.println(name);
        }
        System.out.println("And " + this.name + " was his name-o.");
    };
    
    private String replaceName(String word, int idx) {
        
        String[] newWord = word.split("-");
        
        newWord[idx] = "(clap)";
        return String.join("-", newWord);
    }
}


