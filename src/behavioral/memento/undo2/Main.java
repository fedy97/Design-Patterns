package behavioral.memento.undo2;

public class Main {
    public static void main(String[] args) {
        var doc = new Document();
        var history = new History();

        doc.setContent("content1");
        doc.setFontName("fontname1");
        doc.setFontSize(1);
        history.push(doc.createState());

        doc.setFontName("fontname2");
        history.push(doc.createState());

        doc.setFontSize(2);
        //last behavioral.state, do not push into history
        //history.push(doc.createState());

        System.out.println(doc.toString());

        doc.restoreState(history.pop());

        System.out.println(doc.toString());

        doc.restoreState(history.pop());

        System.out.println(doc.toString());
    }
}
