package constructors;

//adding comments to a file
//this class demonstrates how copy constructors are made 
public class CopyConstructor {

	private double real, imaginary;
	
	public CopyConstructor(double re, double im) {
		setReal(re);
		setImaginary(im);
	}
	
	public CopyConstructor(CopyConstructor c){
		System.out.println("Copy Constructor Called");
		setReal(c.getReal());
		setImaginary(c.getImaginary());
	}
	
	public String toString() {		//overrides toString object method 
		return "(" + real + " + " + imaginary + "i)";
	}
	
	public boolean equals(Object obj) {		//overrides equals method of object class
		if(obj == this) {
			return true;
		}
		
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		CopyConstructor copyConstructor = (CopyConstructor) obj;
		return (this.real == copyConstructor.real && this.imaginary == copyConstructor.imaginary);
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
}
