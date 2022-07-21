import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		DataOutputStream dos = null;
		
		try {
			dos = new DataOutputStream(new FileOutputStream("d:\\WookEc\\filetest\\mydata.dat"));
			
			dos.writeInt(50);
			dos.writeDouble(123.123);
			dos.writeUTF("문자열");
			dos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream(new FileInputStream("d:\\WookEc\\filetest\\mydata.dat"));
			
			int valueInt = dis.readInt();
			double valueDouble = dis.readDouble();
			String valueString = dis.readUTF();
			
			System.out.println(valueInt);
			System.out.println(valueDouble);
			System.out.println(valueString);
			
			dis.readBoolean();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 끝까지 읽음");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
