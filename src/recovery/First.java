package recovery;

import parser.*;

import java.util.*;


public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet methoddecl = new RecoverySet();
    static public final RecoverySet vardecl = new RecoverySet();
    static public final RecoverySet classlist = new RecoverySet();
    static public final RecoverySet constructdecl = new RecoverySet();
    static public final RecoverySet statlist = new RecoverySet();
    static public final RecoverySet program = classlist;

    static {
        methoddecl.add(new Integer(FunConstants.INT));
        methoddecl.add(new Integer(FunConstants.STRING));
        methoddecl.add(new Integer(FunConstants.IDENTIFIER));
        methoddecl.add(new Integer(FunConstants.CHAR));
        methoddecl.add(new Integer(FunConstants.FLOAT));

        vardecl.add(new Integer(FunConstants.INT));
        vardecl.add(new Integer(FunConstants.STRING));
        vardecl.add(new Integer(FunConstants.IDENTIFIER));
        vardecl.add(new Integer(FunConstants.CHAR));
        vardecl.add(new Integer(FunConstants.FLOAT));
        vardecl.add(new Integer(FunConstants.BOOLEAN));

        classlist.add(new Integer(FunConstants.CLASS));

        constructdecl.add(new Integer(FunConstants.CONSTRUCTOR));

        statlist.addAll(vardecl);
        statlist.add(new Integer(FunConstants.IDENTIFIER)); // first do atribstat
        statlist.add(new Integer(FunConstants.PRINT));
        statlist.add(new Integer(FunConstants.READ));
        statlist.add(new Integer(FunConstants.RETURN));
        statlist.add(new Integer(FunConstants.SUPER));
        statlist.add(new Integer(FunConstants.IF));
        statlist.add(new Integer(FunConstants.FOR));
        statlist.add(new Integer(FunConstants.LBRACE));
        statlist.add(new Integer(FunConstants.BREAK));
        statlist.add(new Integer(FunConstants.SEMICOLON));       
    }
}
