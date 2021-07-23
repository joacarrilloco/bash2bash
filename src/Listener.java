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
            System.out.print(".\\" + ctx.FILENAME().getText() + " ");
        }
        if(ctx.command() != null){
            System.out.print("'");
        }
    }

    @Override
    public void enterDashargs(b2bParser.DashargsContext ctx) {
        System.out.print("-");
        if(ctx.arg != null){
            System.out.print(ctx.arg.getText() + " ");
        }
    }


}
