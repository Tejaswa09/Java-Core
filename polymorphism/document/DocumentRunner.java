package com.xworkz.polymorphism.document;

public class DocumentRunner {
    public static void main(String[] args) {
        System.out.println("Child Details:");
        PdfDocument pdf = new PdfDocument();
        pdf.fileType();
        pdf.size();
        pdf.readableOn();
        pdf.hasPasswordProtection();
        pdf.supportsEditing();
        System.out.println();

        System.out.println("Parent Details:");
        Document doc = new Document();
        doc.fileType();
        doc.size();
        doc.readableOn();
        doc.hasPasswordProtection();
        doc.supportsEditing();
        System.out.println();

        System.out.println("Child of Parent Type Details:");
        Document pdfAsDoc = new PdfDocument();
        pdfAsDoc.fileType();
        pdfAsDoc.size();
        pdfAsDoc.readableOn();
        pdfAsDoc.hasPasswordProtection();
        pdfAsDoc.supportsEditing();
    }
}
