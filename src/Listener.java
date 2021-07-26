public class Listener extends b2bBaseListener{

    @Override
    public void enterComments(b2bParser.CommentsContext ctx) {
        if(ctx.COMMENT() != null){
            System.out.println(ctx.COMMENT().getText());
        }
    }

    @Override
    public void enterComment_lines(b2bParser.Comment_linesContext ctx) {
        if(ctx.COMMENT_MUL() != null){
            System.out.print("<#");
            String toPrint = ctx.COMMENT_MUL().getText();
            System.out.print(toPrint.substring(5, toPrint.length() - 3));
        }
    }

    @Override
    public void exitComment_lines(b2bParser.Comment_linesContext ctx) {
        if(ctx.COMMENT_MUL() != null){
            System.out.println("#>");
        }
    }

    @Override
    public void enterDash(b2bParser.DashContext ctx) {
        System.out.print("powershell ");
        if(ctx.command() != null){
            System.out.print("'");
        }
    }

    @Override
    public void exitDash(b2bParser.DashContext ctx) {
        if(ctx.FILENAME() != null){
            System.out.println(".\\" + ctx.FILENAME().getText() + " ");
        }
        if(ctx.command() != null){
            System.out.println("'");
        }
    }

    @Override
    public void enterDashargs(b2bParser.DashargsContext ctx) {
        System.out.print("-");
        if(ctx.arg != null){
            System.out.print(ctx.arg.getText() + " ");
        }
    }

    @Override
    public void enterVar(b2bParser.VarContext ctx) {
        if(ctx.ID() != null){
            System.out.print("$" + ctx.ID().getText() + ctx.EQ().getText() + ctx.value().getText());
        }
    }

    @Override
    public void exitVar(b2bParser.VarContext ctx) {
        System.out.println();
    }

    @Override
    public void enterEcho(b2bParser.EchoContext ctx) {
        if(ctx.PR_echo() != null) {
            System.out.print(ctx.PR_echo().getText());
        }
    }

    @Override
    public void exitEcho(b2bParser.EchoContext ctx) {
        System.out.println();
    }

    @Override
    public void enterRead(b2bParser.ReadContext ctx) {
        if(ctx.ID() != null){
            System.out.print("$" + ctx.ID().getText() + "=read-host");
        }
    }

    @Override
    public void exitRead(b2bParser.ReadContext ctx) {
        System.out.println();
    }

    @Override
    public void enterB_if(b2bParser.B_ifContext ctx) {
        /*
        if(ctx.PR_if() != null){
            System.out.print("if (" + ctx.command(0).getText() + ")");
            if(ctx.PR_then(0) != null){
                System.out.print("{" + ctx.command(1).getText() + "}");
            }
        }
        if(ctx.PR_elif() != null){
            System.out.print("elseif (" + ctx.command(2).getText() + ")");
            if(ctx.PR_then(1) != null){
                System.out.print("{" + ctx.command(3).getText() + "}");
            }
        }
        if(ctx.PR_else() != null){
            System.out.print("else{" + ctx.command(4).getText() + "}");
        }
        */
    }

    @Override
    public void exitB_if(b2bParser.B_ifContext ctx) {
        System.out.println();
    }
}
