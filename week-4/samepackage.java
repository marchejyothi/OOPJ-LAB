package p1;
public class samepackage
{
	public samepackage()
	{
		protection p=new protection();
		System.out.println("samepackage constructor");
		System.out.println("n="+p.n);
		System.out.println("n_pro="+p.n_pro);
		System.out.println("n_pub="+p.n_pub);
	}
}