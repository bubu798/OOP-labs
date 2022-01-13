package lab7.task1.document;

public class BoldTextSegment extends TextSegment implements Visitable {
    public BoldTextSegment(String content) {
        super(content);
    }

    @Override
    public void accept(DocumentVisitor doc) {
        doc.visit(this);
    }

}
