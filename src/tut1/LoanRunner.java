package tut1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class LoanRunner {
	public static void main(String[] args) {
		
Loan loan1=new Loan(3,20,198000);
Loan loan2=new Loan(2,15,200000);
Loan loan3=new Loan(5,10,126000);
Loan loan4=new Loan(1,20,198000);
Loan loan5=new Loan(4.75,30,200000);
Loan loan6=new Loan();
Loan loan7=new Loan();

List<Loan> loans=new ArrayList<>();
List<Loan> loans2=new ArrayList<>();
loans2.add(loan6);
loans2.add(loan7);
loans.add(loan1);
loans.add(loan2);
loans.add(loan3);
loans.add(loan4);
loans.add(loan5);

//writer(loans);
//List<Loan> listt=reader("LoanFile.txt");
//for(Loan w:listt) {
//	System.out.println(w);
//}
	}
public static List<Loan> reader(String file) {
	List<Loan> list=new ArrayList<>();
	try(ObjectInputStream os=new ObjectInputStream(
			new FileInputStream(file))){
		
			while(true) {
				list.add((Loan) os.readObject());
			}
	}catch(EOFException e) {
		System.out.println("End of File reached.");
	}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
			
}
public static void writer(List<Loan> list) {
	try(ObjectOutputStream ob=
			new ObjectOutputStream(
					new FileOutputStream("LoanFile.txt",true))){
		System.out.println("Objects writing...");
		for(Loan w:list) {
			ob.writeObject(w);
		}

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
