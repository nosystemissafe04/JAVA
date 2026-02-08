class A
{
	int price;
	String model;
	void show()
	{
		System.out.println(this.price);
		System.out.println(this.model);
	}
	public String toString()
	{
           return "haha no overriding here";
	}
	public boolean equals(A specs)
	{
       //     if(this.price==specs.price && this.model==specs.model)
	 //   return true;
     	   // else 
	  //  return false;
	Boolean whatis=(this.price.equals(specs.price) && this.model.equals(specs.model))?true:false;
        return whatis;
	}
}
class hashcodeobj
{
	public static void main(String args[])
	{
         A obj=new A();
         obj.price=30000;
         obj.model="Dell latitude 8000";
         obj.show();
	 
	 A obj1=new A();
	 obj1.price=30000;
	 obj1.model="Dell latitude 800";

	 //System.out.println(obj);
	 System.out.println(obj.equals(obj1));
	}
}
