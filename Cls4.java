import java.io.*;



class Cls4 {
	
	
	
	public static void main(String [] args) 
	//throws IOException
	{
		FileInputStream fin = null;
		try{

			int fr;
			fin = new FileInputStream("test.txt"); // this opens a file for read
			
			// from the read it will take 10 inputs, or 10 bytes and then put them in array
			// from the array we will read them one by one
			
			System.out.println("Say something");
			byte data[] = new byte[10];
			System.in.read(data);
			System.out.println("You said");
			for(int i = 0; i <  data.length; i++){
				System.out.print((char) data[i]);
			}
			
			// lets use write, it is part of PrintStrem that is subclass of OutputStream
			int b = 'X';
			System.out.write('a');
			System.out.write('\n');
			
			// now lets connect to a file
			// FileInputStream(String fileName) throws FileNotFoundException 
			// but  FileNotFoundException is a subclass of IOException so i think no need to chase it
			
			
			do{
				fr = fin.read();
				if(fr != -1){System.out.print((char)fr);}	
				
			} while(fr != -1);
			
			fin.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Fail from IO");
		} finally {
			
			try{
				if(fin != null){fin.close();} //Ofcourse fin has to be instantiated before brackets
			} catch (IOException exc){
				System.out.println("File not closed");
			}
			
			System.out.println("Finaly out of try catch");
		}
		// ok so we have read a lot of the things in our file hehe
		// now lets write to it 
		
		
		
		// lets write down to a file and use try catch with resource
		//try(FileOutputStream inputHandler = new FileOutputStream("test.txt", true)){ // this var is final
		// for short
		// you an also use mmore then one resource to assign to try resource
		try(
			var inputHandler = new FileOutputStream("test.txt", true);
			var readHandler  = new FileInputStream("test.txt")
		){ // this var is final
			
			inputHandler.write('K'); // and now we write doen one cahracter // preferably 8 bit ahha
			
		}catch (IOException exc){
			// and now we do not need to close file by ourselfs
			System.out.println("IO exceotion occured during write");	
		}
		// now this code above was fast
		
		// writing bytes is not enought, we can also write down ints and doubles or similar
		
		try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("data.txt"))){
			System.out.println("Writing integer of value 5");
			dataOut.writeInt(5);
			System.out.println("Writing double of value 5.75");
			dataOut.writeDouble(5.75);
		}catch(IOException exc){} //file will close automaticaly
		
		
		try(DataInputStream dataIn = new DataInputStream(new FileInputStream("data.txt"))){
			System.out.println("Reading int that was first inserted - " + dataIn.readInt());
			System.out.println("Reading double that was inserted - " + dataIn.readDouble());
		}catch(IOException exc){}
		
		// there is also random access file class, that actualy usses 
		// this random access class can use seak to position its read position and to read from there
		// it implements DataInput and DataOutput so it has readInt writeInt and so on
		// lets demonstrate it

		double data[] = {1.934, 10.1, 123.56, 33.0};
		
		double d;
		
		try(RandomAccessFile raf = new RandomAccessFile("random.txt", "rw")){
			for(int i = 0; i < data.length; i++){
				System.out.println("Writing down " + data[i] + " at position " + i);
				raf.writeDouble(data[i]);
			}
			raf.seek(8); // you needd to jump by 8 sonce dpuble takes 8 bytes
			System.out.println("Value at position 1 is " + raf.readDouble());
		} catch (IOException ex){
			System.out.println("I am in exception ");
		}

		// now we would like to read characters
		// that is also important
		
		// in order to do so we will use BufferedReader - he supports BufferedInputStream
		// we are going to use it for Systtem.In and system in is byte stream
		// so we need a class called InputStreamReader and this class converts bytes to characters
		
		// lets demonstrate in the simplest form
		
		try{
			char c;
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			System.out.println("Enter something and . to stop ");
			
				
			do{
				c = (char) br.read();
				System.out.println(c);
			} while (c!='.');
			
		} catch (IOException ex){
			System.out.println("I am in exception ");
		}
		
		//example above has shown us how to use read from bffered reader it reads a char from inputHandler
		// now lets demonstrate the reading of a string
		
		try{
			String str;
			BufferedReader brStr = new BufferedReader( new InputStreamReader(System.in));
			System.out.println("Enter string a say stop to stop ");
	
			do{
				str = brStr.readLine();
				System.out.println(str);
			} while (!str.equals("stop"));
			
		} catch (IOException ex){
			System.out.println("I am in exception ");
		}
		
		// now we move to writing characters to a file, and reading them from a file
		
		String testStr;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text ('stop to quit').");
		
		try(FileWriter fw = new FileWriter("testFWriter.txt")){
			do{
				System.out.print(": ");
				testStr = br.readLine();
				if(testStr.compareTo("stop") == 0) break;
				testStr = testStr + "\r\n";
				fw.write(testStr);
			} while(testStr.compareTo("stop") != 0);
		}catch (IOException ex){
			System.out.println("I am in exception " + ex);
		}
		
		Strin readString;
		try(BufferedReader bReader = new BufferedReader(new FileReader("testFWriter.txt"))){
			while((readString = br.readLinr()) != null ){
				System.out.println(readString);
			}
		} catch (IOException ex){
			System.out.println("I am in exception " + ex);
		}
		
	}
}