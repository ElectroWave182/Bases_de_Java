class Verifications
{
public static void main(String[] args)
{
	String[] calculs = {"298+154=452", "647-24=623", "178+98=267"};
	String calcul;
	int oper;
	Integer rep;
	boolean verif;
	int tg;
	for(int i = 0; i < calculs.length; i++)
	{
		tg = 0;
		calcul = calculs[i];
		oper = calcul.indexOf('-');
		if(oper == -1)
		{
			String[] scal1 = {"", ""};
			String[] rpz = calcul.split("");
			for(String c: rpz)
			{
				if(c.equals("+"))
				{
					tg++;
				}
				else
				{
					scal1[tg] += c;
				}
			}
			String[] scal2 = scal1[1].split("=");
			rep = Integer.valueOf(scal1[0]) + Integer.valueOf(scal2[0]);
			verif = rep.equals(Integer.valueOf(scal2[1]));
		}
		else
		{
			String[] scal1 = calcul.split("-");
			String[] scal2 = scal1[1].split("=");
			rep = Integer.valueOf(scal1[0]) - Integer.valueOf(scal2[0]);
			verif = rep.equals(Integer.valueOf(scal2[1]));
		}
		if(verif)
		{
			calculs[i] += " (ok)";
		}
		else
		{
			calculs[i] += " (correction : " + rep + ")";
		}
		System.out.println(calculs[i]);
	}
}
}
