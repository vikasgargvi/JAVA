public class Imag
{
    public float rp;
    public float ip;

    public Imag(float r, float i)
    {
	this.rp = r;
	this.ip = i;
    }

    public Imag add(Imag b)
    {
	float nrp = this.rp + b.rp;
	float nip = this.ip + b.ip;
	Imag sum = new Imag(nrp, nip);
	return sum;
    }

    public String toString()
    {
	String str = "(" + this.rp + " + " + this.ip + "i)";
	return str;
    }
}
