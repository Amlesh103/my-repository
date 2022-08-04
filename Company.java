//Author: Amlesh

class Employee
{
private int empid;
public void setEmpid(int empid)
{
this.empid=empid;
}
public int getEmpid()
{
return empid;
}

}

class Company
{
public static void main(String[] args)
{
Employee e= new Employee();
e.setEmpid(101);
System.out.println(e.getEmpid());
}
}

package qaproject;

public class Block {
	int width;
	int length;
	int height;
	int[] arr= {width, length, height};

	// int[] arr = {width, length, height};
	//{
	  //int arr[] = new int[]{width, length, height};
	  
	//}
	  public Block(int[] arr) {
		// TODO Auto-generated constructor stub
		  this.arr=arr;
	  }
		/*this.width = width;
	  this.length = length;
	  this.height = height;*/
	  //Block b = new Block();
	    int getWidth(int width){
	      	     
		return this.width=width;
	    }
	    public int getLength(int length)
	      {
	      return this.length=length;
	      }
	  public int getHeight(int height)
	    {
	    return this.height=height;
	  }
	  public int getVolume()
	    {
	    return width*length*height;
	  }
	  public int getSurfaceArea()
	    {
	    return 6*length*length;
	  }
	  }
