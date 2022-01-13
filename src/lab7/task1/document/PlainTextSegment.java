package lab7.task1.document;

public class PlainTextSegment extends TextSegment implements Visitable  {
    public PlainTextSegment(String content) {
        super(content);
    }
    @Override
    public void accept(DocumentVisitor doc) {
        doc.visit(this);
    }
}