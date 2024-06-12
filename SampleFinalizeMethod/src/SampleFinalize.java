
public class SampleFinalize {

	public static void main(String[] args) {
		@Override
		protected void finalize() throws Trowable{
			System.out.println("Calling the finalize method");
		}
		
		SampleFinalize s = new SampleFinalize();
		// de-referring the object reference ,then the object will go to garbage
		// collection
		s = null;
	}

}
