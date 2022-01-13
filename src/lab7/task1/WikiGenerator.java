package lab7.task1;

import lab7.task1.document.DocumentVisitor;
import lab7.task1.document.DokuWikiVisitor;
import lab7.task1.document.MarkdownVisitor;
import lab7.task1.document.TextSegment;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        // TODO apply dokuwiki visitor on the text segments
        DokuWikiVisitor d = new DokuWikiVisitor();
        StringBuilder sb = new StringBuilder();
        for (TextSegment t : textSegments) {
            t.accept(d);
            sb.append(d.getDocument());
        }
        return sb;
    }

    public StringBuilder getMarkdownDocument() {
        // TODO apply Markdown visitor on the text segments
        MarkdownVisitor d = new MarkdownVisitor();
        StringBuilder sb = new StringBuilder();
        for (TextSegment t : textSegments) {
            t.accept(d);
            sb.append(d.getDocument());
        }
        return sb;
    }
}
