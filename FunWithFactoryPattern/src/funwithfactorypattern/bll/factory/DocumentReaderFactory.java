/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfactorypattern.bll.factory;

import funwithfactorypattern.be.EReader;
import funwithfactorypattern.bll.readers.HTMLReader;
import funwithfactorypattern.bll.readers.IDocumentReader;
import funwithfactorypattern.bll.readers.PDFReader;
import funwithfactorypattern.bll.readers.TextFileReader;

public class DocumentReaderFactory implements IDocumentReaderFactory {

    @Override
    public IDocumentReader getReader(EReader protocol) {
        switch (protocol) {
            case TEXT:
                return new TextFileReader();
            case PDF:
                return new PDFReader();
            case HTML:
                return new HTMLReader();
            default:
                System.out.println("WTF!?");
        }
        return null;
    }

}
