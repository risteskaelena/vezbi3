package zadaca4;

import java.util.Random;

public class Brojac {
	
    public int frlanje;
    public int pismo=0;
    public int glava=0;
    
    public void brojac1(int frlanje){
        for(int i=0;i<this.frlanje;i++){
        	int rezultat = new Random().nextInt(2);
            if(rezultat==0) {
                this.pismo++;
            }
            else {
                this.glava++;
            }
        }
        System.out.println("parickata e frlena "+ this.frlanje + " pati");
        System.out.println("pismo: "+this.pismo);
        System.out.println("glava: "+this.glava);
    }
        
    public void reset(int pismo,int glava){
        this.pismo=0;
        this.glava=0;
    }
}

