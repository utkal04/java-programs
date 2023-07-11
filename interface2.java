interface iface1
{
static final int var1=10;
abstract void sum();
}

interface iface2
{
static final int var2=20;
abstract void product();
}

class calculation implements iface1,iface2
{
public void sum()
{
System.out.println("SUM	="+(var1+var2));
}
public void product()
{
System.out.println("PRODUCT ="+(var1*var2));
}
}

class f22
{
public static void main(String args[])
{
calculation obj1=new calculation();
obj1.sum();
obj1.product();
}
}