import java.io.*;

/*
	We need a very specfic file like this
	#topic
	descriptio
				// here we need empty space
	#topic2
	descriptio2
*/

class Help{
	
	String helpfile;
	
	Help(String name){
		helpfile = name;
	}
	
	boolean helpOn(String what){
		int ch;
		String topic, info;
		try(BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))){
			do{
				ch = helpRdr.read();
				if(ch == '#'){
					topic = helpRdr.readLine();
					if(what.compareTo(topic) == 0){
						do{	
							info = helpRdr.readLine();
							if(info != null) {
								System.out.println(info);
							}
						} while((info != null) && (info.compareTo("") != 0));
						return true;
					}
				}
			} while(ch != -1);
			
		} catch (IOException exc){
			System.out.println("Error accessing help file 41");
			return false;
		}
		return false;
	}
	
	String getSelection(){
		String topic = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("About what would you like to know ?");
		
		try{
			topic = br.readLine();
		} catch (IOException exc){
			System.out.println("Error reading console");
		}
		return topic;
		
	}
}

class IOtst{
	public static void main(String args[]){
		System.out.println("Start");
		Help hp = new Help("help.txt");
		String topic = "";
		do{
			topic = hp.getSelection();
			if(!hp.helpOn(topic)){
				System.out.println("Topic not found");
			}
		} while (topic.compareTo("stop") != 0);
	}
}