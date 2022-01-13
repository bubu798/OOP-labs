package lab7.task1.document;

import javax.print.Doc;
import java.util.Locale;

public class MarkdownVisitor implements DocumentVisitor {

    private StringBuilder Document = new StringBuilder();
    @Override
    public void visit(ItalicTextSegment s) {
        Document.setLength(0);
        Document.append("*");
        Document.append(s.getContent());
        Document.append("*");

    }

    @Override
    public void visit(BoldTextSegment b) {
        Document.setLength(0);
        Document.append("**");
        Document.append(b.getContent());
        Document.append("**");
    }

    @Override
    public void visit(UrlSegment url) {
        Document.setLength(0);
        Document.append("[");
        Document.append(url.getDescription());
        Document.append("]");
        Document.append("(");
        Document.append(url.getUrl());
        Document.append(")");
    }

    @Override
    public void visit(PlainTextSegment plain) {
        Document.setLength(0);
        Document.append(plain.getContent());

    }

    @Override
    public StringBuilder getDocument() {

        return Document;
    }
}
