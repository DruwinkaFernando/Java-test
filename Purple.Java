class Parent{
  //attributes
  protected String firstname;
  protected String lastname;

  //parameterized Constructor
	public Parent(String firstname, String lastname)
		{this.firstname=firstname;
		this.lastname=lastname;
	}

//setters to firstname and lastname
	public void setName(String firstname, String lastname)
	{
  	  this.firstname=firstname;
  	  this.lastname=lastname;
	}
//methods
	public void PrintName(){
	  System.out.println(""+this.firstname + ""+this.lastname);
	}
}
class Child extends Parent{
  //attributes
  private String middlename;

  //parametrized Constructor
  public Child(String firstname,String middlename, String lastname )
  	
{
    super(firstname,lastname);
    this.middlename=middlename;
	}

  //setter to It
  public void setmiddlename(String middlename)
  {this.middlename=middlename;}

  public void printFullname()
  {System.out.println(""+ super.firstname +""+this.middlename +""+super.lastname);}
}

  class Purple
  {
    public static void main(String[]args)
    {
      Parent p1= new Parent("","");
      p1.setName("John","Noe");
      p1.PrintName();
      Child c1=new Child("", "","");
      c1.setName("Adini","Feriha");
      c1.setmiddlename("Koydum");
      c1.printFullname();
    }

  }






