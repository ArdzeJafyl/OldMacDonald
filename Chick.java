class Chick implements Animal 
{     
   	private String myType;     
   	private String mySound; 
   	private int dsd;     
   	public Chick(String type, String sound, String sound2){ 
   		dsd = (int)(Math.random()*1);
   		myType = type;
   		if(dsd == 1){
   			mySound = sound;
   		}else{
   			mySound = sound2;
   		}                      
    }         
    public String getSound(){return mySound;}     
    public String getType(){return myType;} 
}