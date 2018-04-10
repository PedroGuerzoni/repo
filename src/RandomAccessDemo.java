import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] data = {1,2,3,4,5};
		
		try(RandomAccessFile raf = new RandomAccessFile("random.dat", "rw") ){
			
			for(double x:data)
			raf.writeDouble(x);
			
			for(int i = 0;i<data.length;i++) {
				raf.seek(8*i);
				System.out.println(raf.readDouble());
			}
			
		}catch(IOException e) {
			System.out.println(e.toString());
			
		}		
	}

}
