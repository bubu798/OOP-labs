package lab7.task1.document;

import javax.print.Doc;

public class DokuWikiVisitor implements DocumentVisitor {

    private StringBuilder Document = new StringBuilder();

    @Override
    public void visit(ItalicTextSegment s) {
        Document.setLength(0);
        Document.append("//");
        Document.append(s.getContent());
        Document.append("//");
    }

    @Override
    public void visit(BoldTextSegment b) {
        Document.setLength(0);
        Document.append("**");
        Document.append(b.getContent());
        Document.append("**");
    }

    @Override
    public void visit(UrlSegment u) {
        Document.setLength(0);
        Document.append("[[");
        Document.append(u.getUrl());
        Document.append(" | ");
        Document.append(u.getDescription());
        Document.append("]]");

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
