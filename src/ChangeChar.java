
public class ChangeChar {
	public String convertSlashes(String pathName)
	{
	StringBuffer sb = new StringBuffer ( pathName );

	for ( int i = 0; i < sb.length(); i++ )
	{
	char ch = sb.charAt ( i );
	if ( ch == '\\' )
	sb.setCharAt ( i, '/' );
	}

	return new String ( sb );
	}

	public static void main(String[] args)
	{
		ChangeChar changeChar = new ChangeChar();
		String s = changeChar.convertSlashes("C:\\java\\hsqldb\\doc\\images\\sqlDDL.gif");
		System.out.println(s);

	}
}
