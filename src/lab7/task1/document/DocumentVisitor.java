package lab7.task1.document;

public interface DocumentVisitor {
    public void visit(ItalicTextSegment s);
    public void visit(BoldTextSegment b);
    public void visit(UrlSegment url);
    public void visit(PlainTextSegment plain);

    public  StringBuilder getDocument();
}