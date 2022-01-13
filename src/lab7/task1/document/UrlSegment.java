package lab7.task1.document;


public class UrlSegment extends TextSegment implements Visitable {
    public String url;
    public String description;

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public UrlSegment(String url, String description) {
        super();
        //super();
        this.url = url;
        this.description = description;
    }


    @Override
    public void accept(DocumentVisitor doc) {
        doc.visit(this);
    }
}
