package document;

public class DocumentChecker {

    public static void main(String[] args) {

        //Polimorfizm - korzystamy z jednej klasy Document do stwotrzenia obiektów klasy ExcelDocument i PdfDocument,
        // alternatywnie można użyć Interfejsów
        Document excelDocumnet = new ExceclDocument();
        Document pdfDocumnet = new PdfDocument();

        excelDocumnet.getDescription();
        pdfDocumnet.getDescription();

        //użycie interfejsu Doc
        Doc csvDoc = new CsvDoc();
        csvDoc.getDocDescription();


    }
}
