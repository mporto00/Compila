package syntacticTree;

import parser.Token;

public class ClassDeclNode extends GeneralNode {
	public Token name;
	public Token supername;
	public ClassBodyNode body;
	
	public ClassDeclNode(Token t1, Token t2, Token t3, ClassBodyNode c) {
		super(t1); // passa token de referencia para construtor da superclasse
		name = t2;
		supername = t3;
		body = c;
	}
}
