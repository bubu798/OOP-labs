package lab7.task1.document;

public class ItalicTextSegment extends TextSegment implements Visitable  {
    public ItalicTextSegment(String content) {
        super(content);
    }
    @Override
    public void accept(DocumentVisitor doc) {
        doc.visit(this);
    }

}
