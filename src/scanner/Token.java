package scanner;

public class Token 
{
	private TokenType type;
	private String value;
	
	public Token(TokenType type, String value)
	{
		this.type = type;
		this.value = value;
	}
	
	public static TokenType getTokenType(String token)
	{
			
		if(token.length() > 2)
		{
			//NONTERMINALS
			if(token.charAt(0) == '<' && token.charAt(token.length() - 1) == '>')
				return TokenType.NONTERM;
			
			//SPECIAL CASE TERMINAL
			if(token.substring(0, 2).equals("\\\\"))
				return TokenType.COMMENTS;
		}	
			
		//TERMINALS
		if(token.equals("["))
			return TokenType.LEFTBRACKET;
		else if(token.equals("]"))
			return TokenType.RIGHTBRACKET;
		else if(token.equals("{"))
			return TokenType.LEFTCURLY;
		else if(token.equals("}"))
			return TokenType.RIGHTCURLY;
		else if(token.equals(","))
			return TokenType.COMMA;
		else if(token.equals(":"))
			return TokenType.COLON;
		else if(token.equals(";"))
			return TokenType.SEMICOLON;
		else if(token.equals("("))
			return TokenType.LEFTPAREN;
		else if(token.equals(")"))
			return TokenType.RIGHTPAREN;
		else if(token.equals("&"))
			return TokenType.AND;
		else if(token.equals("|"))
			return TokenType.OR;
		else if(token.equals("*"))
			return TokenType.MULT;
		else if(token.equals("/"))
			return TokenType.DIV;
		else if(token.equals("+"))
			return TokenType.ADD;
		else if(token.equals("-"))
			return TokenType.MINUS;
		else if(token.equals("%"))
			return TokenType.MOD;
		else if(token.equals("=="))
			return TokenType.EQUAL;
		else if(token.equals("<"))
			return TokenType.LESSER;
		else if(token.equals(">"))
			return TokenType.GREATER;
		else if(token.equals("<="))
			return TokenType.LESSEQ;
		else if(token.equals(">="))
			return TokenType.GREATEQ;
		else if(token.equals("!="))
			return TokenType.NOTEQUAL;
		else if(token.equals("="))
			return TokenType.ASSIGN;
		else if(token.equals("\""))
			return TokenType.DOUBLETICK;
		else if(token.equals("'"))
			return TokenType.SINGLETICK;
		else if(token.equals("."))
			return TokenType.PERIOD;
		else if(token.equals("$"))
			return TokenType.EXIT;
		else if(token.equals("NULL"))
			return TokenType.NULL;
		else if(token.equals("WORKSPACE"))
			return TokenType.WORKSPACE;
		else if(token.equals("ENDWORKSPACE"))
			return TokenType.ENDWORKSPACE;
		else if(token.equals("CLASS"))
			return TokenType.ENDCLASS;
		else if(token.equals("NEW"))
			return TokenType.NEW;
		else if(token.equals("ELSE"))
			return TokenType.ELSE;
		else if(token.equals(":ELSEIF"))
			return TokenType.ELSEIF;
		else if(token.equals("ENDELSE"))
			return TokenType.ENDELSE;
		else if(token.equals("ENDELSEIF"))
			return TokenType.ENDELSEIF;
		else if(token.equals("SET"))
			return TokenType.SET;
		else if(token.equals("GET"))
			return TokenType.GET;
		else if(token.equals("ENDSET"))
			return TokenType.ENDSET;
		else if(token.equals("ENDGET"))
			return TokenType.ENDGET;
		else if(token.equals("PROP"))
			return TokenType.PROP;
		else if(token.equals("ENDPROP"))
			return TokenType.ENDPROP;
		else if(token.equals("return"))
			return TokenType.RETURN;
		else if(token.equals("INT"))
			return TokenType.INT;
		else if(token.equals("DOUBLE"))
			return TokenType.DOUBLE;
		else if(token.equals("BYTE"))
			return TokenType.FLOAT;
		else if(token.equals("BYTE"))
			return TokenType.BYTE;
		else if(token.equals("STRING"))
			return TokenType.STRING;
		else if(token.equals("BOOL"))
			return TokenType.BOOL;
		else if(token.equals("private"))
			return TokenType.PRIVATE;
		else if(token.equals("static"))
			return TokenType.STATIC;
		else if(token.equals("public"))
			return TokenType.PUBLIC;
		else if(token.equals("protected"))
			return TokenType.PROTECTED;
		else if(token.equals("includes"))
			return TokenType.INCLUDES;
		else if(token.equals("implements"))
			return TokenType.IMPLEMENTS;
		else if(token.equals("CON"))
			return TokenType.CON;
		else if(token.equals("ENDCON"))
			return TokenType.ENDCON;
		else if(token.equals("void"))
			return TokenType.VOID;
		else if(token.equals("FUNC"))
			return TokenType.FUNC;
		else if(token.equals("ENDFUNC"))
			return TokenType.ENDFUNC;
		else if(token.equals("SWITCH"))
			return TokenType.SWITCH;
		else if(token.equals("CASE"))
			return TokenType.CASE;
		else if(token.equals("FOR"))
			return TokenType.FOR;
		else if(token.equals("ENDFOR"))
			return TokenType.ENDFOR;
		else if(token.equals("WHILE"))
			return TokenType.WHILE;
		else if(token.equals("ENDWHILE"))
			return TokenType.ENDWHILE;
		else if(token.equals("INTLIT"))
			return TokenType.INTLIT;
		else if(token.equals("STRLIT"))
			return TokenType.STRLIT;
		else if(token.equals("NIL"))
			return TokenType.NIL;
		else
			return TokenType.NONE;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public TokenType getType()
	{
		return type;
	}
}