package atelierdes;

public class De {
    private int num;
    private int nbFace;
    private int val;
    private boolean estTruque;
    
    public De (){
        num = 0;
        nbFace = 6;
        val = 0;
    }

    public De(int num, int nbFace, int val) {
        this.num = num;
        this.nbFace = nbFace;
        this.val = val;
        this.estTruque = false;
    }
    
    public De(int nbFace){
    this();
    this.nbFace = nbFace;
    
}   

    public int getNum() {
        return num;
    }

    public int getNbFace() {
        return nbFace;
    }

    public int getVal() {
        return val;
    }
    
    public void Lancer(){
        val = (int) Math.floor(6 * Math.random()) + 1;
        if(estTruque){
            
        }
        //System.out.println(val);
    }
    
    public String toString(){
        return "dé " + num + " : " + val;
    }
    
    public void piper(){
        estTruque = true;
        if (val == 1){
            val = 1;
        }
        else if ( val == 2){
            val = 2;
        }
        else if (val == 3){
            val = 2;
        }
        else if (val == 4){
            val = 4;
        }
        else if (val == 5){
            val = 4;
        }
        else if (val == 6){
            val = 1;
        }
        System.out.println("Dé " + num + " : " + val);
    }
}