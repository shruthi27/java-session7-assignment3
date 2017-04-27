
package substring;

public class WithoutBuiltInFunction 
{
	public static void main(String[] args)
	{
		String string ="sampletext";
		for(int x=1;x<=string.length();x++)
		{
			for (int y=0;y<string.length();y++)
			{
			int z= y+x;
			if(z<= string.length())
			{
				System.out.println(getSubstring(string,y,z));
				
			}
			
			}
			
		}
	}


public static String getSubstring(String text,int startPos,int endPos)

{
	String retString="";
	if((startPos>=0)&&(startPos<endPos)&&(endPos<=text.length()))

	{
		for(int i=startPos;i<endPos;i++)
		{
			retString=retString+text.charAt(i);
			
		}
		return retString;
		
	}
	else
		return "Enter valid start and end positions";
}

	
}
//output

s
a
m
p
l
e
t
e
x
t
sa
am
mp
pl
le
et
te
ex
xt
sam
amp
mpl
ple
let
ete
tex
ext
samp
ampl
mple
plet
lete
etex
text
sampl
ample
mplet
plete
letex
etext
sample
amplet
mplete
pletex
letext
samplet
amplete
mpletex
pletext
samplete
ampletex
mpletext
sampletex
ampletext
sampletext

